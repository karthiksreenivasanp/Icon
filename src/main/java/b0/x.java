package b0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public abstract class x {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static x0 b(View view, x0 x0Var, Rect rect) {
        WindowInsets windowInsetsC = x0Var.c();
        if (windowInsetsC != null) {
            return x0.d(view, view.computeSystemWindowInsets(windowInsetsC, rect));
        }
        rect.setEmpty();
        return x0Var;
    }

    public static boolean c(View view, float f2, float f3, boolean z2) {
        return view.dispatchNestedFling(f2, f3, z2);
    }

    public static boolean d(View view, float f2, float f3) {
        return view.dispatchNestedPreFling(f2, f3);
    }

    public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static x0 j(View view) throws IllegalAccessException, IllegalArgumentException {
        if (m0.f492d && view.isAttachedToWindow()) {
            try {
                Object obj = m0.a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) m0.f490b.get(obj);
                    Rect rect2 = (Rect) m0.f491c.get(obj);
                    if (rect != null && rect2 != null) {
                        Object obj2 = new f.f(11).f875b;
                        ((p0) obj2).d(u.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        ((p0) obj2).f(u.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        x0 x0VarB = ((p0) obj2).b();
                        x0VarB.a.m(x0VarB);
                        x0VarB.a.d(view.getRootView());
                        return x0VarB;
                    }
                }
            } catch (IllegalAccessException e2) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f2) {
        view.setElevation(f2);
    }

    public static void t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    public static void u(View view, l lVar) {
        if (lVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new w(view, lVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void x(View view, float f2) {
        view.setZ(f2);
    }

    public static boolean y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
