package b0;

import android.view.KeyEvent;
import android.view.View;
import com.nothing.icon.R;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b0 {
    public static void a(View view, e0 e0Var) {
        j.k kVar = (j.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null) {
            kVar = new j.k();
            view.setTag(R.id.tag_unhandled_key_listeners, kVar);
        }
        Objects.requireNonNull(e0Var);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: b0.a0
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                throw null;
            }
        };
        kVar.put(e0Var, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, e0 e0Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        j.k kVar = (j.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(e0Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
