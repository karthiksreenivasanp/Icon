package e1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import g.c1;

/* loaded from: classes.dex */
public abstract class d extends c1 {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f847p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f848q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f849r;

    /* renamed from: s, reason: collision with root package name */
    public int f850s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f851t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f852u;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f848q = new Rect();
        this.f849r = new Rect();
        this.f850s = 119;
        this.f851t = true;
        this.f852u = false;
        TypedArray typedArrayF0 = f1.e.f0(context, attributeSet, v0.a.f2296g, 0, 0, new int[0]);
        this.f850s = typedArrayF0.getInt(1, this.f850s);
        Drawable drawable = typedArrayF0.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f851t = typedArrayF0.getBoolean(2, true);
        typedArrayF0.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f847p;
        if (drawable != null) {
            if (this.f852u) {
                this.f852u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f851t;
                Rect rect = this.f848q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i2 = this.f850s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f849r;
                Gravity.apply(i2, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f847p;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f847p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f847p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f847p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f850s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f847p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // g.c1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.f852u = z2 | this.f852u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f852u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f847p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f847p);
            }
            this.f847p = drawable;
            this.f852u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f850s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.f850s != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f850s = i2;
            if (i2 == 119 && this.f847p != null) {
                this.f847p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f847p;
    }
}
