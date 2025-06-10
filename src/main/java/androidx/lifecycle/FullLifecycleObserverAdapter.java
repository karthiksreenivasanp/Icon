package androidx.lifecycle;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements n {
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public final n f358b;

    public FullLifecycleObserverAdapter(d dVar, n nVar) {
        this.a = dVar;
        this.f358b = nVar;
    }

    @Override // androidx.lifecycle.n
    public final void b(p pVar, j jVar) {
        int i2 = f.a[jVar.ordinal()];
        d dVar = this.a;
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                dVar.getClass();
                break;
            case 3:
                dVar.a();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.f358b;
        if (nVar != null) {
            nVar.b(pVar, jVar);
        }
    }
}
