package o0;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b0 {
    public final l0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1981b = new Rect();

    public b0(l0 l0Var) {
        this.a = l0Var;
    }

    public static a0 a(l0 l0Var, int i2) {
        if (i2 == 0) {
            return new a0(l0Var, 0);
        }
        int i3 = 1;
        if (i2 == 1) {
            return new a0(l0Var, i3);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j(View view);

    public abstract int k(View view);

    public abstract void l(int i2);
}
