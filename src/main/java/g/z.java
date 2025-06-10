package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class z implements c0.t {
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f1263b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1264c;

    public z(ImageView imageView) {
        this.f1263b = imageView;
    }

    public final void a() {
        n2 n2Var;
        ImageView imageView = (ImageView) this.f1263b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int i2 = s0.a;
        }
        if (drawable == null || (n2Var = (n2) this.f1264c) == null) {
            return;
        }
        u.e(drawable, n2Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i2) {
        int iH;
        View view = this.f1263b;
        ImageView imageView = (ImageView) view;
        Context context = imageView.getContext();
        int[] iArr = b.a.f461e;
        f2 f2VarM = f2.m(context, attributeSet, iArr, i2);
        Context context2 = imageView.getContext();
        TypedArray typedArray = (TypedArray) f2VarM.f1077b;
        int[] iArr2 = b0.f0.a;
        b0.c0.c(imageView, context2, iArr, attributeSet, typedArray, i2, 0);
        try {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null && (iH = f2VarM.h(1, -1)) != -1 && (drawable = f1.e.M(((ImageView) view).getContext(), iH)) != null) {
                ((ImageView) view).setImageDrawable(drawable);
            }
            if (drawable != null) {
                int i3 = s0.a;
            }
            if (f2VarM.k(2)) {
                f0.f.c((ImageView) view, f2VarM.b(2));
            }
            if (f2VarM.k(3)) {
                f0.f.d((ImageView) view, s0.a(f2VarM.g(3, -1), null));
            }
        } finally {
            f2VarM.n();
        }
    }

    @Override // c0.t
    public final boolean c(View view) {
        throw null;
    }

    public final void d(int i2) {
        Drawable drawableM;
        ImageView imageView = (ImageView) this.f1263b;
        if (i2 != 0) {
            drawableM = f1.e.M(imageView.getContext(), i2);
            if (drawableM != null) {
                int i3 = s0.a;
            }
        } else {
            drawableM = null;
        }
        imageView.setImageDrawable(drawableM);
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (((n2) this.f1264c) == null) {
            this.f1264c = new n2(0);
        }
        n2 n2Var = (n2) this.f1264c;
        n2Var.f1179c = colorStateList;
        n2Var.f1178b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (((n2) this.f1264c) == null) {
            this.f1264c = new n2(0);
        }
        n2 n2Var = (n2) this.f1264c;
        n2Var.f1180d = mode;
        n2Var.a = true;
        a();
    }
}
