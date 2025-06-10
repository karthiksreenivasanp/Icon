package e1;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import b0.f0;
import b0.r;
import b0.s;

/* loaded from: classes.dex */
public final class b {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;
    public final View a;

    /* renamed from: a0, reason: collision with root package name */
    public float f816a0;

    /* renamed from: b, reason: collision with root package name */
    public float f817b;

    /* renamed from: b0, reason: collision with root package name */
    public float f818b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f819c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f820c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f821d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f823e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f830j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public float f831l;

    /* renamed from: m, reason: collision with root package name */
    public float f832m;

    /* renamed from: n, reason: collision with root package name */
    public float f833n;

    /* renamed from: o, reason: collision with root package name */
    public float f834o;

    /* renamed from: p, reason: collision with root package name */
    public float f835p;

    /* renamed from: q, reason: collision with root package name */
    public float f836q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f837r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f838s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f839t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f840u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f841v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f842w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f843x;

    /* renamed from: y, reason: collision with root package name */
    public f1.a f844y;

    /* renamed from: f, reason: collision with root package name */
    public int f825f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f827g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f828h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f829i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f845z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f822d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f824e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f826f0 = 1;

    public b(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f821d = new Rect();
        this.f819c = new Rect();
        this.f823e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i3) * f2) + (Color.alpha(i2) * f3)), Math.round((Color.red(i3) * f2) + (Color.red(i2) * f3)), Math.round((Color.green(i3) * f2) + (Color.green(i2) * f3)), Math.round((Color.blue(i3) * f2) + (Color.blue(i2) * f3)));
    }

    public static float f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        LinearInterpolator linearInterpolator = w0.a.a;
        return ((f3 - f2) * f4) + f2;
    }

    public final boolean b(CharSequence charSequence) {
        int[] iArr = f0.a;
        boolean z2 = s.d(this.a) == 1;
        if (this.D) {
            return (z2 ? z.h.f2381d : z.h.f2380c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        StaticLayout staticLayoutA;
        Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float fWidth = this.f821d.width();
        float fWidth2 = this.f819c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.f829i;
            f4 = this.V;
            this.F = 1.0f;
            typeface = this.f837r;
        } else {
            float f5 = this.f828h;
            float f6 = this.W;
            Typeface typeface2 = this.f840u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.f828h, this.f829i, f2, this.Q) / this.f828h;
            }
            float f7 = this.f829i / this.f828h;
            fWidth = (!z2 && fWidth2 * f7 > fWidth) ? Math.min(fWidth / f7, fWidth2) : fWidth2;
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (fWidth > 0.0f) {
            boolean z4 = this.G != f3;
            boolean z5 = this.X != f4;
            boolean z6 = this.f843x != typeface;
            StaticLayout staticLayout = this.Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.M;
            this.G = f3;
            this.X = f4;
            this.f843x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.B == null || z3) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f843x);
            textPaint.setLetterSpacing(this.X);
            boolean zB = b(this.A);
            this.C = zB;
            int i2 = this.f822d0;
            if (!(i2 > 1 && !zB)) {
                i2 = 1;
            }
            try {
                if (i2 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f825f, zB ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        boolean z8 = this.C;
                        if (absoluteGravity != 5) {
                            if (z8) {
                            }
                        } else {
                            alignment = z8 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                g gVar = new g(this.A, textPaint, (int) fWidth);
                gVar.f862l = this.f845z;
                gVar.k = zB;
                gVar.f856e = alignment;
                gVar.f861j = false;
                gVar.f857f = i2;
                float f8 = this.f824e0;
                gVar.f858g = 0.0f;
                gVar.f859h = f8;
                gVar.f860i = this.f826f0;
                staticLayoutA = gVar.a();
            } catch (f e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayoutA = null;
            }
            staticLayoutA.getClass();
            this.Y = staticLayoutA;
            this.B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f829i);
        textPaint.setTypeface(this.f837r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        Typeface typeface = this.f839t;
        if (typeface != null) {
            this.f838s = f1.e.c0(configuration, typeface);
        }
        Typeface typeface2 = this.f842w;
        if (typeface2 != null) {
            this.f841v = f1.e.c0(configuration, typeface2);
        }
        Typeface typeface3 = this.f838s;
        if (typeface3 == null) {
            typeface3 = this.f839t;
        }
        this.f837r = typeface3;
        Typeface typeface4 = this.f841v;
        if (typeface4 == null) {
            typeface4 = this.f842w;
        }
        this.f840u = typeface4;
        h(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r17) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b.h(boolean):void");
    }

    public final void i(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.f830j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.f830j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        f1.a aVar = this.f844y;
        if (aVar != null) {
            aVar.f1007u = true;
        }
        if (this.f839t == typeface) {
            return false;
        }
        this.f839t = typeface;
        Typeface typefaceC0 = f1.e.c0(this.a.getContext().getResources().getConfiguration(), typeface);
        this.f838s = typefaceC0;
        if (typefaceC0 == null) {
            typefaceC0 = this.f839t;
        }
        this.f837r = typefaceC0;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f817b) {
            this.f817b = f2;
            float f3 = this.f819c.left;
            Rect rect = this.f821d;
            float f4 = f(f3, rect.left, f2, this.P);
            RectF rectF = this.f823e;
            rectF.left = f4;
            rectF.top = f(this.f831l, this.f832m, f2, this.P);
            rectF.right = f(r1.right, rect.right, f2, this.P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.P);
            this.f835p = f(this.f833n, this.f834o, f2, this.P);
            this.f836q = f(this.f831l, this.f832m, f2, this.P);
            l(f2);
            m0.b bVar = w0.a.f2312b;
            this.f816a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, bVar);
            int[] iArr = f0.a;
            View view = this.a;
            r.k(view);
            this.f818b0 = f(1.0f, 0.0f, f2, bVar);
            r.k(view);
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.f830j;
            TextPaint textPaint = this.N;
            textPaint.setColor(colorStateList != colorStateList2 ? a(e(colorStateList2), e(this.k), f2) : e(colorStateList));
            float f5 = this.V;
            float f6 = this.W;
            if (f5 != f6) {
                f5 = f(f6, f5, f2, bVar);
            }
            textPaint.setLetterSpacing(f5);
            this.H = f(0.0f, this.R, f2, null);
            this.I = f(0.0f, this.S, f2, null);
            this.J = f(0.0f, this.T, f2, null);
            int iA = a(e(null), e(this.U), f2);
            this.K = iA;
            textPaint.setShadowLayer(this.H, this.I, this.J, iA);
            r.k(view);
        }
    }

    public final void l(float f2) {
        c(f2, false);
        int[] iArr = f0.a;
        r.k(this.a);
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean zJ = j(typeface);
        if (this.f842w != typeface) {
            this.f842w = typeface;
            Typeface typefaceC0 = f1.e.c0(this.a.getContext().getResources().getConfiguration(), typeface);
            this.f841v = typefaceC0;
            if (typefaceC0 == null) {
                typefaceC0 = this.f842w;
            }
            this.f840u = typefaceC0;
            z2 = true;
        } else {
            z2 = false;
        }
        if (zJ || z2) {
            h(false);
        }
    }
}
