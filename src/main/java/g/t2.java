package g;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t2 {
    public static OnBackInvokedDispatcher a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(final Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new OnBackInvokedCallback() { // from class: g.s2
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                runnable.run();
            }
        };
    }

    public static void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
