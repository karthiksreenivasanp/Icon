package androidx.savedstate;

import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
public final class Recreator implements n {
    @Override // androidx.lifecycle.n
    public final void b(p pVar, j jVar) {
        if (jVar != j.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        pVar.c().c(this);
        throw null;
    }
}
