package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements n {
    @Override // androidx.lifecycle.n
    public final void b(p pVar, j jVar) {
        if (jVar == j.ON_CREATE) {
            pVar.c().c(this);
            throw null;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + jVar).toString());
    }
}
