package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements n {
    public static int a;

    @Override // androidx.lifecycle.n
    public final void b(p pVar, j jVar) throws SecurityException {
        if (jVar != j.ON_DESTROY) {
            return;
        }
        if (a == 0) {
            try {
                a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (a == 1) {
            throw null;
        }
    }
}
