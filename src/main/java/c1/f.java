package c1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import e1.h;
import e1.i;
import i1.g;
import i1.j;
import i1.k;
import i1.m;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, h {
    public static final int[] G0 = {R.attr.state_enabled};
    public static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    public float A;
    public ColorStateList A0;
    public ColorStateList B;
    public WeakReference B0;
    public float C;
    public TextUtils.TruncateAt C0;
    public ColorStateList D;
    public boolean D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public boolean F0;
    public Drawable G;
    public ColorStateList H;
    public float I;
    public boolean J;
    public boolean K;
    public Drawable L;
    public RippleDrawable M;
    public ColorStateList N;
    public float O;
    public SpannableStringBuilder P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public w0.b U;
    public w0.b V;
    public float W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f544a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f545b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f546c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f547d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f548e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f549f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f550g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f551h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f552i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f553j0;

    /* renamed from: k0, reason: collision with root package name */
    public final i f554k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f555l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f556m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f557n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f558o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f559p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f560q0;
    public boolean r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f561s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f562t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f563u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f564v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f565w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f566x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f567x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f568y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f569y0;

    /* renamed from: z, reason: collision with root package name */
    public float f570z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f571z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = -1.0f;
        this.f549f0 = new Paint(1);
        this.f550g0 = new Paint.FontMetrics();
        this.f551h0 = new RectF();
        this.f552i0 = new PointF();
        this.f553j0 = new Path();
        this.f562t0 = 255;
        this.f567x0 = PorterDuff.Mode.SRC_IN;
        this.B0 = new WeakReference(null);
        h(context);
        this.f548e0 = context;
        i iVar = new i(this);
        this.f554k0 = iVar;
        this.E = "";
        iVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = G0;
        setState(iArr);
        if (!Arrays.equals(this.f569y0, iArr)) {
            this.f569y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.D0 = true;
        H0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f2) {
        if (this.A != f2) {
            this.A = f2;
            k kVar = this.a.a;
            kVar.getClass();
            j jVar = new j(kVar);
            jVar.f1378e = new i1.a(f2);
            jVar.f1379f = new i1.a(f2);
            jVar.f1380g = new i1.a(f2);
            jVar.f1381h = new i1.a(f2);
            setShapeAppearanceModel(new k(jVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof v.e;
            drawable2 = drawable3;
            if (z2) {
                ((v.f) ((v.e) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fP = p();
            this.G = drawable != null ? drawable.mutate() : null;
            float fP2 = p();
            U(drawable2);
            if (S()) {
                n(this.G);
            }
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.I != f2) {
            float fP = p();
            this.I = f2;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (S()) {
                v.b.h(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.F != z2) {
            boolean zS = S();
            this.F = z2;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    n(this.G);
                } else {
                    U(this.G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.F0) {
                i1.f fVar = this.a;
                if (fVar.f1337d != colorStateList) {
                    fVar.f1337d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.C != f2) {
            this.C = f2;
            this.f549f0.setStrokeWidth(f2);
            if (this.F0) {
                this.a.k = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof v.e;
            drawable2 = drawable3;
            if (z2) {
                ((v.f) ((v.e) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fQ = q();
            this.L = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.D;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.M = new RippleDrawable(colorStateListValueOf, this.L, H0);
            float fQ2 = q();
            U(drawable2);
            if (T()) {
                n(this.L);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public final void I(float f2) {
        if (this.f546c0 != f2) {
            this.f546c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.O != f2) {
            this.O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f545b0 != f2) {
            this.f545b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (T()) {
                v.b.h(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.K != z2) {
            boolean zT = T();
            this.K = z2;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    n(this.L);
                } else {
                    U(this.L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.Y != f2) {
            float fP = p();
            this.Y = f2;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.X != f2) {
            float fP = p();
            this.X = f2;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (!this.f571z0) {
                colorStateList = null;
            } else if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.A0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void Q(f1.d dVar) {
        i iVar = this.f554k0;
        if (iVar.f867f != dVar) {
            iVar.f867f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.a;
                Context context = this.f548e0;
                b bVar = iVar.f863b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f866e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.f865d = true;
            }
            h hVar2 = (h) iVar.f866e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.R && this.S != null && this.r0;
    }

    public final boolean S() {
        return this.F && this.G != null;
    }

    public final boolean T() {
        return this.K && this.L != null;
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2;
        RectF rectF;
        int i3;
        int i4;
        int i5;
        RectF rectF2;
        float f2;
        int iSave;
        float f3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.f562t0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i2 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2) : 0;
        boolean z2 = this.F0;
        Paint paint = this.f549f0;
        RectF rectF3 = this.f551h0;
        if (!z2) {
            paint.setColor(this.f555l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.F0) {
            paint.setColor(this.f556m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f563u0;
            if (colorFilter == null) {
                colorFilter = this.f564v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.F0) {
            super.draw(canvas);
        }
        if (this.C > 0.0f && !this.F0) {
            paint.setColor(this.f558o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.F0) {
                ColorFilter colorFilter2 = this.f563u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f564v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f4 = bounds.left;
            float f5 = this.C / 2.0f;
            rectF3.set(f4 + f5, bounds.top + f5, bounds.right - f5, bounds.bottom - f5);
            float f6 = this.A - (this.C / 2.0f);
            canvas.drawRoundRect(rectF3, f6, f6, paint);
        }
        paint.setColor(this.f559p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.F0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f553j0;
            m mVar = this.f1370r;
            i1.f fVar = this.a;
            mVar.a(fVar.a, fVar.f1343j, rectF4, this.f1369q, path);
            e(canvas, paint, path, this.a.a, g());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.G.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (R()) {
            o(bounds, rectF3);
            float f9 = rectF3.left;
            float f10 = rectF3.top;
            canvas.translate(f9, f10);
            this.S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.S.draw(canvas);
            canvas.translate(-f9, -f10);
        }
        if (!this.D0 || this.E == null) {
            rectF = rectF3;
            i3 = iSaveLayerAlpha;
            i4 = 255;
            i5 = 0;
        } else {
            PointF pointF = this.f552i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.E;
            i iVar = this.f554k0;
            if (charSequence != null) {
                float fP = p() + this.W + this.Z;
                if (v.c.a(this) == 0) {
                    pointF.x = bounds.left + fP;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fP;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = iVar.a;
                Paint.FontMetrics fontMetrics = this.f550g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.E != null) {
                float fP2 = p() + this.W + this.Z;
                float fQ = q() + this.f547d0 + this.f544a0;
                if (v.c.a(this) == 0) {
                    rectF3.left = bounds.left + fP2;
                    f3 = bounds.right - fQ;
                } else {
                    rectF3.left = bounds.left + fQ;
                    f3 = bounds.right - fP2;
                }
                rectF3.right = f3;
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            f1.d dVar = iVar.f867f;
            TextPaint textPaint2 = iVar.a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f867f.e(this.f548e0, textPaint2, iVar.f863b);
            }
            textPaint2.setTextAlign(align);
            String string = this.E.toString();
            if (iVar.f865d) {
                float fMeasureText = string != null ? textPaint2.measureText((CharSequence) string, 0, string.length()) : 0.0f;
                iVar.f864c = fMeasureText;
                iVar.f865d = false;
                f2 = fMeasureText;
            } else {
                f2 = iVar.f864c;
            }
            boolean z3 = Math.round(f2) > Math.round(rectF3.width());
            if (z3) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.E;
            if (z3 && this.C0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.C0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f11 = pointF.x;
            float f12 = pointF.y;
            rectF = rectF3;
            i3 = iSaveLayerAlpha;
            i4 = 255;
            i5 = 0;
            canvas.drawText(charSequence2, 0, length, f11, f12, textPaint2);
            if (z3) {
                canvas.restoreToCount(iSave);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f13 = this.f547d0 + this.f546c0;
                if (v.c.a(this) == 0) {
                    float f14 = bounds.right - f13;
                    rectF2 = rectF;
                    rectF2.right = f14;
                    rectF2.left = f14 - this.O;
                } else {
                    rectF2 = rectF;
                    float f15 = bounds.left + f13;
                    rectF2.left = f15;
                    rectF2.right = f15 + this.O;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f16 = this.O;
                float f17 = fExactCenterY - (f16 / 2.0f);
                rectF2.top = f17;
                rectF2.bottom = f17 + f16;
            } else {
                rectF2 = rectF;
            }
            float f18 = rectF2.left;
            float f19 = rectF2.top;
            canvas.translate(f18, f19);
            this.L.setBounds(i5, i5, (int) rectF2.width(), (int) rectF2.height());
            this.M.setBounds(this.L.getBounds());
            this.M.jumpToCurrentState();
            this.M.draw(canvas);
            canvas.translate(-f18, -f19);
        }
        if (this.f562t0 < i4) {
            canvas.restoreToCount(i3);
        }
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f562t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f563u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f570z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fMeasureText;
        float fP = p() + this.W + this.Z;
        String string = this.E.toString();
        i iVar = this.f554k0;
        if (iVar.f865d) {
            fMeasureText = string == null ? 0.0f : iVar.a.measureText((CharSequence) string, 0, string.length());
            iVar.f864c = fMeasureText;
            iVar.f865d = false;
        } else {
            fMeasureText = iVar.f864c;
        }
        return Math.min(Math.round(q() + fMeasureText + fP + this.f544a0 + this.f547d0), this.E0);
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f570z, this.A);
        } else {
            outline.setRoundRect(bounds, this.A);
        }
        outline.setAlpha(this.f562t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f566x) || s(this.f568y) || s(this.B)) {
            return true;
        }
        if (this.f571z0 && s(this.A0)) {
            return true;
        }
        f1.d dVar = this.f554k0.f867f;
        if ((dVar == null || (colorStateList = dVar.f1022j) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.R && this.S != null && this.Q) || t(this.G) || t(this.S) || s(this.f565w0);
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        v.c.b(drawable, v.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f569y0);
            }
            v.b.h(drawable, this.N);
            return;
        }
        Drawable drawable2 = this.G;
        if (drawable == drawable2 && this.J) {
            v.b.h(drawable2, this.H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.W + this.X;
            Drawable drawable = this.r0 ? this.S : this.G;
            float intrinsicWidth = this.I;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (v.c.a(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + intrinsicWidth;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - intrinsicWidth;
            }
            Drawable drawable2 = this.r0 ? this.S : this.G;
            float f5 = this.I;
            if (f5 <= 0.0f && drawable2 != null) {
                float fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f548e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
                f5 = fCeil;
            }
            float fExactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + f5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (S()) {
            zOnLayoutDirectionChanged |= v.c.b(this.G, i2);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= v.c.b(this.S, i2);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= v.c.b(this.L, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (S()) {
            zOnLevelChange |= this.G.setLevel(i2);
        }
        if (R()) {
            zOnLevelChange |= this.S.setLevel(i2);
        }
        if (T()) {
            zOnLevelChange |= this.L.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f569y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f2 = this.X;
        Drawable drawable = this.r0 ? this.S : this.G;
        float intrinsicWidth = this.I;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f2 + this.Y;
    }

    public final float q() {
        if (T()) {
            return this.f545b0 + this.O + this.f546c0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.F0 ? this.a.a.f1388e.a(g()) : this.A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f562t0 != i2) {
            this.f562t0 = i2;
            invalidateSelf();
        }
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f563u0 != colorFilter) {
            this.f563u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f565w0 != colorStateList) {
            this.f565w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f567x0 != mode) {
            this.f567x0 = mode;
            ColorStateList colorStateList = this.f565w0;
            this.f564v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.B0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f652p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f566x;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f555l0) : 0);
        boolean state = true;
        if (this.f555l0 != iC) {
            this.f555l0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f568y;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f556m0) : 0);
        if (this.f556m0 != iC2) {
            this.f556m0 = iC2;
            zOnStateChange = true;
        }
        int iB = u.a.b(iC2, iC);
        if ((this.f557n0 != iB) | (this.a.f1336c == null)) {
            this.f557n0 = iB;
            j(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.B;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f558o0) : 0;
        if (this.f558o0 != colorForState) {
            this.f558o0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.A0 == null || !f1.e.D0(iArr)) ? 0 : this.A0.getColorForState(iArr, this.f559p0);
        if (this.f559p0 != colorForState2) {
            this.f559p0 = colorForState2;
            if (this.f571z0) {
                zOnStateChange = true;
            }
        }
        f1.d dVar = this.f554k0.f867f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f1022j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f560q0);
        if (this.f560q0 != colorForState3) {
            this.f560q0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z2 = false;
        } else {
            for (int i2 : state2) {
                if (i2 == 16842912) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z4 = z2 && this.Q;
        if (this.r0 == z4 || this.S == null) {
            z3 = false;
        } else {
            float fP = p();
            this.r0 = z4;
            if (fP != p()) {
                zOnStateChange = true;
                z3 = true;
            } else {
                z3 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f565w0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f561s0) : 0;
        if (this.f561s0 != colorForState4) {
            this.f561s0 = colorForState4;
            ColorStateList colorStateList6 = this.f565w0;
            PorterDuff.Mode mode = this.f567x0;
            this.f564v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (t(this.G)) {
            state |= this.G.setState(iArr);
        }
        if (t(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (t(this.L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.L.setState(iArr3);
        }
        if (t(this.M)) {
            state |= this.M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z3) {
            u();
        }
        return state;
    }

    public final void w(boolean z2) {
        if (this.Q != z2) {
            this.Q = z2;
            float fP = p();
            if (!z2 && this.r0) {
                this.r0 = false;
            }
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.S != drawable) {
            float fP = p();
            this.S = drawable;
            float fP2 = p();
            U(this.S);
            n(this.S);
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (this.R && this.S != null && this.Q) {
                v.b.h(this.S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.R != z2) {
            boolean zR = R();
            this.R = z2;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    n(this.S);
                } else {
                    U(this.S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
