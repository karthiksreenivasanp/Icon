package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i0 {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public n2 f1084b;

    /* renamed from: c, reason: collision with root package name */
    public n2 f1085c;

    /* renamed from: d, reason: collision with root package name */
    public n2 f1086d;

    /* renamed from: e, reason: collision with root package name */
    public n2 f1087e;

    /* renamed from: f, reason: collision with root package name */
    public n2 f1088f;

    /* renamed from: g, reason: collision with root package name */
    public n2 f1089g;

    /* renamed from: h, reason: collision with root package name */
    public n2 f1090h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f1091i;

    /* renamed from: j, reason: collision with root package name */
    public int f1092j = 0;
    public int k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f1093l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1094m;

    public i0(TextView textView) {
        this.a = textView;
        this.f1091i = new p0(textView);
    }

    public static n2 c(Context context, u uVar, int i2) {
        ColorStateList colorStateListH;
        synchronized (uVar) {
            colorStateListH = uVar.a.h(context, i2);
        }
        if (colorStateListH == null) {
            return null;
        }
        n2 n2Var = new n2(0);
        n2Var.f1178b = true;
        n2Var.f1179c = colorStateListH;
        return n2Var;
    }

    public final void a(Drawable drawable, n2 n2Var) {
        if (drawable == null || n2Var == null) {
            return;
        }
        u.e(drawable, n2Var, this.a.getDrawableState());
    }

    public final void b() {
        n2 n2Var = this.f1084b;
        TextView textView = this.a;
        if (n2Var != null || this.f1085c != null || this.f1086d != null || this.f1087e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f1084b);
            a(compoundDrawables[1], this.f1085c);
            a(compoundDrawables[2], this.f1086d);
            a(compoundDrawables[3], this.f1087e);
        }
        if (this.f1088f == null && this.f1089g == null) {
            return;
        }
        Drawable[] drawableArrA = e0.a(textView);
        a(drawableArrA[0], this.f1088f);
        a(drawableArrA[2], this.f1089g);
    }

    public final ColorStateList d() {
        n2 n2Var = this.f1090h;
        if (n2Var != null) {
            return (ColorStateList) n2Var.f1179c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        n2 n2Var = this.f1090h;
        if (n2Var != null) {
            return (PorterDuff.Mode) n2Var.f1180d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        String strI;
        String strI2;
        boolean zA;
        boolean z2;
        int i3;
        Drawable drawableB;
        int i4;
        int i5;
        int i6;
        int resourceId;
        TextView textView = this.a;
        Context context = textView.getContext();
        u uVarA = u.a();
        int[] iArr = b.a.f462f;
        f2 f2VarM = f2.m(context, attributeSet, iArr, i2);
        Context context2 = textView.getContext();
        TypedArray typedArray = (TypedArray) f2VarM.f1077b;
        int[] iArr2 = b0.f0.a;
        b0.c0.c(textView, context2, iArr, attributeSet, typedArray, i2, 0);
        int iH = f2VarM.h(0, -1);
        if (f2VarM.k(3)) {
            this.f1084b = c(context, uVarA, f2VarM.h(3, 0));
        }
        if (f2VarM.k(1)) {
            this.f1085c = c(context, uVarA, f2VarM.h(1, 0));
        }
        if (f2VarM.k(4)) {
            this.f1086d = c(context, uVarA, f2VarM.h(4, 0));
        }
        if (f2VarM.k(2)) {
            this.f1087e = c(context, uVarA, f2VarM.h(2, 0));
        }
        if (f2VarM.k(5)) {
            this.f1088f = c(context, uVarA, f2VarM.h(5, 0));
        }
        if (f2VarM.k(6)) {
            this.f1089g = c(context, uVarA, f2VarM.h(6, 0));
        }
        f2VarM.n();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr3 = b.a.f474s;
        if (iH != -1) {
            f2 f2Var = new f2(context, context.obtainStyledAttributes(iH, iArr3));
            if (z3 || !f2Var.k(14)) {
                zA = false;
                z2 = false;
            } else {
                zA = f2Var.a(14, false);
                z2 = true;
            }
            j(context, f2Var);
            strI = f2Var.k(15) ? f2Var.i(15) : null;
            strI2 = f2Var.k(13) ? f2Var.i(13) : null;
            f2Var.n();
        } else {
            strI = null;
            strI2 = null;
            zA = false;
            z2 = false;
        }
        f2 f2Var2 = new f2(context, context.obtainStyledAttributes(attributeSet, iArr3, i2, 0));
        if (!z3 && f2Var2.k(14)) {
            zA = f2Var2.a(14, false);
            z2 = true;
        }
        if (f2Var2.k(15)) {
            strI = f2Var2.i(15);
        }
        if (f2Var2.k(13)) {
            strI2 = f2Var2.i(13);
        }
        String str = strI2;
        if (f2Var2.k(0) && f2Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, f2Var2);
        f2Var2.n();
        if (!z3 && z2) {
            textView.setAllCaps(zA);
        }
        Typeface typeface = this.f1093l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.f1092j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            g0.d(textView, str);
        }
        if (strI != null) {
            f0.b(textView, f0.a(strI));
        }
        int[] iArr4 = b.a.f463g;
        p0 p0Var = this.f1091i;
        Context context3 = p0Var.f1197i;
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr4, i2, 0);
        TextView textView2 = p0Var.f1196h;
        b0.c0.c(textView2, textView2.getContext(), iArr4, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            p0Var.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr5 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr5[i7] = typedArrayObtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                p0Var.f1194f = p0.a(iArr5);
                p0Var.c();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!p0Var.d()) {
            p0Var.a = 0;
        } else if (p0Var.a == 1) {
            if (!p0Var.f1195g) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                p0Var.e(dimension2, dimension3, dimension);
            }
            p0Var.b();
        }
        int i8 = d3.a;
        if (p0Var.a != 0) {
            int[] iArr6 = p0Var.f1194f;
            if (iArr6.length > 0) {
                if (g0.a(textView) != -1.0f) {
                    g0.b(textView, Math.round(p0Var.f1192d), Math.round(p0Var.f1193e), Math.round(p0Var.f1191c), 0);
                } else {
                    g0.c(textView, iArr6, 0);
                }
            }
        }
        f2 f2Var3 = new f2(context, context.obtainStyledAttributes(attributeSet, iArr4));
        int iH2 = f2Var3.h(8, -1);
        if (iH2 != -1) {
            drawableB = uVarA.b(context, iH2);
            i3 = 13;
        } else {
            i3 = 13;
            drawableB = null;
        }
        int iH3 = f2Var3.h(i3, -1);
        Drawable drawableB2 = iH3 != -1 ? uVarA.b(context, iH3) : null;
        int iH4 = f2Var3.h(9, -1);
        Drawable drawableB3 = iH4 != -1 ? uVarA.b(context, iH4) : null;
        int iH5 = f2Var3.h(6, -1);
        Drawable drawableB4 = iH5 != -1 ? uVarA.b(context, iH5) : null;
        int iH6 = f2Var3.h(10, -1);
        Drawable drawableB5 = iH6 != -1 ? uVarA.b(context, iH6) : null;
        int iH7 = f2Var3.h(7, -1);
        Drawable drawableB6 = iH7 != -1 ? uVarA.b(context, iH7) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = e0.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            e0.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = e0.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                e0.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (f2Var3.k(11)) {
            f0.q.f(textView, f2Var3.b(11));
        }
        if (f2Var3.k(12)) {
            i4 = -1;
            f0.q.g(textView, s0.a(f2Var3.g(12, -1), null));
        } else {
            i4 = -1;
        }
        int iD = f2Var3.d(15, i4);
        int iD2 = f2Var3.d(18, i4);
        int iD3 = f2Var3.d(19, i4);
        f2Var3.n();
        if (iD != i4) {
            f1.e.n(iD);
            f0.r.c(textView, iD);
        }
        if (iD2 != i4) {
            f1.e.n(iD2);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i9 = f0.o.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (iD2 > Math.abs(i9)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), iD2 - i9);
            }
            i5 = -1;
        } else {
            i5 = i4;
        }
        if (iD3 != i5) {
            f1.e.n(iD3);
            if (iD3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(iD3 - r0, 1.0f);
            }
        }
    }

    public final void g(Context context, int i2) {
        String strI;
        f2 f2Var = new f2(context, context.obtainStyledAttributes(i2, b.a.f474s));
        boolean zK = f2Var.k(14);
        TextView textView = this.a;
        if (zK) {
            textView.setAllCaps(f2Var.a(14, false));
        }
        if (f2Var.k(0) && f2Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, f2Var);
        if (f2Var.k(13) && (strI = f2Var.i(13)) != null) {
            g0.d(textView, strI);
        }
        f2Var.n();
        Typeface typeface = this.f1093l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1092j);
        }
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1090h == null) {
            this.f1090h = new n2(0);
        }
        n2 n2Var = this.f1090h;
        n2Var.f1179c = colorStateList;
        n2Var.f1178b = colorStateList != null;
        this.f1084b = n2Var;
        this.f1085c = n2Var;
        this.f1086d = n2Var;
        this.f1087e = n2Var;
        this.f1088f = n2Var;
        this.f1089g = n2Var;
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1090h == null) {
            this.f1090h = new n2(0);
        }
        n2 n2Var = this.f1090h;
        n2Var.f1180d = mode;
        n2Var.a = mode != null;
        this.f1084b = n2Var;
        this.f1085c = n2Var;
        this.f1086d = n2Var;
        this.f1087e = n2Var;
        this.f1088f = n2Var;
        this.f1089g = n2Var;
    }

    public final void j(Context context, f2 f2Var) {
        String strI;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f1092j = f2Var.g(2, this.f1092j);
        int iG = f2Var.g(11, -1);
        this.k = iG;
        if (iG != -1) {
            this.f1092j = (this.f1092j & 2) | 0;
        }
        if (!f2Var.k(10) && !f2Var.k(12)) {
            if (f2Var.k(1)) {
                this.f1094m = false;
                int iG2 = f2Var.g(1, 1);
                if (iG2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iG2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iG2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1093l = typeface;
                return;
            }
            return;
        }
        this.f1093l = null;
        int i2 = f2Var.k(12) ? 12 : 10;
        int i3 = this.k;
        int i4 = this.f1092j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceF = f2Var.f(i2, this.f1092j, new c0(this, i3, i4, new WeakReference(this.a)));
                if (typefaceF != null) {
                    if (this.k != -1) {
                        typefaceF = h0.a(Typeface.create(typefaceF, 0), this.k, (this.f1092j & 2) != 0);
                    }
                    this.f1093l = typefaceF;
                }
                this.f1094m = this.f1093l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1093l != null || (strI = f2Var.i(i2)) == null) {
            return;
        }
        if (this.k != -1) {
            typefaceCreate = h0.a(Typeface.create(strI, 0), this.k, (this.f1092j & 2) != 0);
        } else {
            typefaceCreate = Typeface.create(strI, this.f1092j);
        }
        this.f1093l = typefaceCreate;
    }
}
