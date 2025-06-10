package androidx.activity;

import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements n {
    @Override // androidx.lifecycle.n
    public final void b(p pVar, j jVar) {
        if (jVar == j.ON_START) {
            throw null;
        }
        if (jVar != j.ON_STOP && jVar == j.ON_DESTROY) {
            throw null;
        }
    }
}
