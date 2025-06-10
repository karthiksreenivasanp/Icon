package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.f0;
import b0.r;
import com.nothing.icon.R;
import f1.e;
import g.d3;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f64b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f66d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f67e;

    /* renamed from: f, reason: collision with root package name */
    public View f68f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f69g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f70h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f71i;

    /* renamed from: j, reason: collision with root package name */
    public final int f72j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f73l;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.f460d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : e.M(context, resourceId);
        int[] iArr = f0.a;
        r.q(this, drawable);
        this.f72j = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.k = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.a = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int e(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f69g == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f69g = linearLayout;
            this.f70h = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f71i = (TextView) this.f69g.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f72j;
            if (i2 != 0) {
                this.f70h.setTextAppearance(getContext(), i2);
            }
            int i3 = this.k;
            if (i3 != 0) {
                this.f71i.setTextAppearance(getContext(), i3);
            }
        }
        this.f70h.setText(this.f66d);
        this.f71i.setText(this.f67e);
        boolean z2 = !TextUtils.isEmpty(this.f66d);
        boolean z3 = !TextUtils.isEmpty(this.f67e);
        int i4 = 0;
        this.f71i.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.f69g;
        if (!z2 && !z3) {
            i4 = 8;
        }
        linearLayout2.setVisibility(i4);
        if (this.f69g.getParent() == null) {
            addView(this.f69g);
        }
    }

    @Override // android.view.View
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, b.a.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f65c = false;
        }
        if (!this.f65c) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f65c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f65c = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f64b = false;
        }
        if (!this.f64b) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f64b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f64b = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.a;
    }

    public CharSequence getSubtitle() {
        return this.f67e;
    }

    public CharSequence getTitle() {
        return this.f66d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean zA = d3.a(this);
        int paddingRight = zA ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f69g;
        if (linearLayout != null && this.f68f == null && linearLayout.getVisibility() != 8) {
            paddingRight += e(this.f69g, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view = this.f68f;
        if (view != null) {
            e(view, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (zA) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.a;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f69g;
        if (linearLayout != null && this.f68f == null) {
            if (this.f73l) {
                this.f69g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f69g.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f69g.setVisibility(z2 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, (paddingLeft - linearLayout.getMeasuredWidth()) - 0);
            }
        }
        View view = this.f68f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f68f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.a <= 0) {
            int childCount = getChildCount();
            size2 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > size2) {
                    size2 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setContentHeight(int i2) {
        this.a = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f68f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f68f = view;
        if (view != null && (linearLayout = this.f69g) != null) {
            removeView(linearLayout);
            this.f69g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f67e = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f66d = charSequence;
        a();
        f0.g(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f73l) {
            requestLayout();
        }
        this.f73l = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
