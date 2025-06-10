package b0;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f503b = u0.f501f;
    public final v0 a;

    public x0() {
        this.a = new v0(this);
    }

    public static x0 d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        x0 x0Var = new x0(windowInsets);
        if (view != null) {
            int[] iArr = f0.a;
            if (u.b(view)) {
                x0 x0VarA = y.a(view);
                v0 v0Var = x0Var.a;
                v0Var.m(x0VarA);
                v0Var.d(view.getRootView());
            }
        }
        return x0Var;
    }

    public final u.c a(int i2) {
        return this.a.f(i2);
    }

    public final int b() {
        return this.a.h().f2277b;
    }

    public final WindowInsets c() {
        v0 v0Var = this.a;
        if (v0Var instanceof q0) {
            return ((q0) v0Var).f498c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        return a0.b.a(this.a, ((x0) obj).a);
    }

    public final int hashCode() {
        v0 v0Var = this.a;
        if (v0Var == null) {
            return 0;
        }
        return v0Var.hashCode();
    }

    public x0(WindowInsets windowInsets) {
        this.a = new u0(this, windowInsets);
    }
}
