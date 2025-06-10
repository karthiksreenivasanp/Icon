package k1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b0.f0;
import b0.r;
import b0.v;
import b0.x;
import com.nothing.icon.R;
import i1.g;
import i1.k;

/* loaded from: classes.dex */
public abstract class d extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final c f1490i = new c();
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public int f1491b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1492c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1493d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1495f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1496g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1497h;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(f1.e.L0(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, v0.a.f2305q);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            int[] iArr = f0.a;
            x.s(this, dimensionPixelSize);
        }
        this.f1491b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.a = new k(k.b(context2, attributeSet, 0, 0));
        }
        this.f1492c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(f1.e.J(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(f1.e.r0(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1493d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f1494e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1495f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f1490i);
        setFocusable(true);
        if (getBackground() == null) {
            int iZ = f1.e.Z(f1.e.I(this, R.attr.colorSurface), f1.e.I(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            k kVar = this.a;
            if (kVar != null) {
                int i2 = e.a;
                g gVar = new g(kVar);
                gVar.j(ColorStateList.valueOf(iZ));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i3 = e.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iZ);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f1496g;
            if (colorStateList != null) {
                v.b.h(gradientDrawable, colorStateList);
            }
            int[] iArr2 = f0.a;
            r.q(this, gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(e eVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f1493d;
    }

    public int getAnimationMode() {
        return this.f1491b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1492c;
    }

    public int getMaxInlineActionWidth() {
        return this.f1495f;
    }

    public int getMaxWidth() {
        return this.f1494e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int[] iArr = f0.a;
        v.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f1494e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f1491b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1496g != null) {
            drawable = drawable.mutate();
            v.b.h(drawable, this.f1496g);
            v.b.i(drawable, this.f1497h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1496g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            v.b.h(drawableMutate, colorStateList);
            v.b.i(drawableMutate, this.f1497h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1497h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            v.b.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f1490i);
        super.setOnClickListener(onClickListener);
    }
}
