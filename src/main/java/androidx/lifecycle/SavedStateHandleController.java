package androidx.lifecycle;

/* loaded from: classes.dex */
final class SavedStateHandleController implements n {
    public boolean a;

    @Override // androidx.lifecycle.n
    public final void b(p pVar, j jVar) {
        if (jVar == j.ON_DESTROY) {
            this.a = false;
            pVar.c().c(this);
        }
    }
}
