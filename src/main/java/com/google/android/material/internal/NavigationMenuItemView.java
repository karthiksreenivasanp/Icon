package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b0.f0;
import b0.r;
import e1.d;
import f.m;
import f.t;
import f0.p;
import g.a3;
import g.b1;
import t.h;
import t.n;
import v.b;
import x0.a;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements t {
    public static final int[] F = {R.attr.state_checked};
    public m A;
    public ColorStateList B;
    public boolean C;
    public Drawable D;
    public final a E;

    /* renamed from: v, reason: collision with root package name */
    public int f670v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f671w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f672x;

    /* renamed from: y, reason: collision with root package name */
    public final CheckedTextView f673y;

    /* renamed from: z, reason: collision with root package name */
    public FrameLayout f674z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(3, this);
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.nothing.icon.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.nothing.icon.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.nothing.icon.R.id.design_menu_item_text);
        this.f673y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        f0.f(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f674z == null) {
                this.f674z = (FrameLayout) ((ViewStub) findViewById(com.nothing.icon.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f674z.removeAllViews();
            this.f674z.addView(view);
        }
    }

    @Override // f.t
    public final void c(m mVar) {
        b1 b1Var;
        int i2;
        StateListDrawable stateListDrawable;
        this.A = mVar;
        int i3 = mVar.a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(mVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.nothing.icon.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            int[] iArr = f0.a;
            r.q(this, stateListDrawable);
        }
        setCheckable(mVar.isCheckable());
        setChecked(mVar.isChecked());
        setEnabled(mVar.isEnabled());
        setTitle(mVar.f929e);
        setIcon(mVar.getIcon());
        setActionView(mVar.getActionView());
        setContentDescription(mVar.f940q);
        a3.a(this, mVar.f941r);
        m mVar2 = this.A;
        boolean z2 = mVar2.f929e == null && mVar2.getIcon() == null && this.A.getActionView() != null;
        CheckedTextView checkedTextView = this.f673y;
        if (z2) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f674z;
            if (frameLayout == null) {
                return;
            }
            b1Var = (b1) frameLayout.getLayoutParams();
            i2 = -1;
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f674z;
            if (frameLayout2 == null) {
                return;
            }
            b1Var = (b1) frameLayout2.getLayoutParams();
            i2 = -2;
        }
        ((LinearLayout.LayoutParams) b1Var).width = i2;
        this.f674z.setLayoutParams(b1Var);
    }

    @Override // f.t
    public m getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        m mVar = this.A;
        if (mVar != null && mVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f672x != z2) {
            this.f672x = z2;
            this.E.h(this.f673y, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f673y;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z2 ? 1 : 0);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.B);
            }
            int i2 = this.f670v;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f671w) {
            if (this.D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = n.a;
                Drawable drawableA = h.a(resources, com.nothing.icon.R.drawable.navigation_empty_icon, theme);
                this.D = drawableA;
                if (drawableA != null) {
                    int i3 = this.f670v;
                    drawableA.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.D;
        }
        p.e(this.f673y, drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f673y.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f670v = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.C = colorStateList != null;
        m mVar = this.A;
        if (mVar != null) {
            setIcon(mVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f673y.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f671w = z2;
    }

    public void setTextAppearance(int i2) {
        this.f673y.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f673y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f673y.setText(charSequence);
    }
}
