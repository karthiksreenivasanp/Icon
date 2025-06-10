package g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class w0 extends Drawable implements Drawable.Callback {
    public Drawable a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1245b;

    public w0(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f1245b = true;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void setTintList(ColorStateList colorStateList) {
        v.b.h(this.a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void setTintMode(PorterDuff.Mode mode) {
        v.b.i(this.a, mode);
    }

    public final boolean C(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.a.setVisible(z2, z3);
    }

    public final void a(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1245b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int[] getState() {
        return this.a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final boolean isAutoMirrored() {
        return v.a.d(this.a);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final boolean isStateful() {
        return this.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final boolean onLevelChange(int i2) {
        return this.a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void setAlpha(int i2) {
        this.a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void setAutoMirrored(boolean z2) {
        v.a.e(this.a, z2);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void setChangingConfigurations(int i2) {
        this.a.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        if (this.f1245b) {
            w(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        if (this.f1245b) {
            x(i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f1245b) {
            return y(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        if (this.f1245b) {
            return C(z2, z3);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void setDither(boolean z2) {
        this.a.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void setFilterBitmap(boolean z2) {
        this.a.setFilterBitmap(z2);
    }

    public final void w(float f2, float f3) {
        v.b.e(this.a, f2, f3);
    }

    public final void x(int i2, int i3, int i4, int i5) {
        v.b.f(this.a, i2, i3, i4, i5);
    }

    public final boolean y(int[] iArr) {
        return this.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void setTint(int i2) {
        v.b.g(this.a, i2);
    }
}
