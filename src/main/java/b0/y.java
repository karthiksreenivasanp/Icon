package b0;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class y {
    public static x0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        x0 x0VarD = x0.d(null, rootWindowInsets);
        v0 v0Var = x0VarD.a;
        v0Var.m(x0VarD);
        v0Var.d(view.getRootView());
        return x0VarD;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
