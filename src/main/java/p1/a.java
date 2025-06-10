package p1;

/* loaded from: classes.dex */
public abstract class a implements g {
    private final h key;

    public a(h hVar) {
        this.key = hVar;
    }

    @Override // p1.i
    public <R> R fold(R r2, t1.b bVar) {
        f1.e.r(bVar, "operation");
        return (R) ((c) bVar).a(r2, this);
    }

    @Override // p1.i
    public <E extends g> E get(h hVar) {
        f1.e.r(hVar, "key");
        if (f1.e.f(getKey(), hVar)) {
            return this;
        }
        return null;
    }

    @Override // p1.g
    public h getKey() {
        return this.key;
    }

    @Override // p1.i
    public i minusKey(h hVar) {
        f1.e.r(hVar, "key");
        return f1.e.f(getKey(), hVar) ? j.a : this;
    }

    public i plus(i iVar) {
        f1.e.r(iVar, "context");
        return iVar == j.a ? this : (i) iVar.fold(this, c.f2159c);
    }
}
