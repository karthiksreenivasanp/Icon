package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.a;
import f.b;
import f.k;
import f.m;
import f.t;
import g.a3;
import g.l;
import g.l0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends l0 implements t, View.OnClickListener, l {

    /* renamed from: g, reason: collision with root package name */
    public m f31g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f32h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f33i;

    /* renamed from: j, reason: collision with root package name */
    public k f34j;
    public a k;

    /* renamed from: l, reason: collision with root package name */
    public b f35l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f36m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f37n;

    /* renamed from: o, reason: collision with root package name */
    public final int f38o;

    /* renamed from: p, reason: collision with root package name */
    public int f39p;

    /* renamed from: q, reason: collision with root package name */
    public final int f40q;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f36m = q();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.f459c, 0, 0);
        this.f38o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f40q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f39p = -1;
        setSaveEnabled(false);
    }

    @Override // g.l
    public final boolean a() {
        return p() && this.f31g.getIcon() == null;
    }

    @Override // g.l
    public final boolean b() {
        return p();
    }

    @Override // f.t
    public final void c(m mVar) {
        this.f31g = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.getTitleCondensed());
        setId(mVar.a);
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.k == null) {
            this.k = new a(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // f.t
    public m getItemData() {
        return this.f31g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f34j;
        if (kVar != null) {
            kVar.a(this.f31g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f36m = q();
        r();
    }

    @Override // g.l0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean zP = p();
        if (zP && (i4 = this.f39p) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f38o;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (zP || this.f33i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f33i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f31g.hasSubMenu() && (aVar = this.k) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean q() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void r() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f32h);
        if (this.f33i != null) {
            if (!((this.f31g.f948y & 4) == 4) || (!this.f36m && !this.f37n)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f32h : null);
        CharSequence charSequence = this.f31g.f940q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z4 ? null : this.f31g.f929e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f31g.f941r;
        if (TextUtils.isEmpty(charSequence2)) {
            a3.a(this, z4 ? null : this.f31g.f929e);
        } else {
            a3.a(this, charSequence2);
        }
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f37n != z2) {
            this.f37n = z2;
            m mVar = this.f31g;
            if (mVar != null) {
                f.l lVar = mVar.f937n;
                lVar.k = true;
                lVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f33i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f40q;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        r();
    }

    public void setItemInvoker(k kVar) {
        this.f34j = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f39p = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f35l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f32h = charSequence;
        r();
    }
}
