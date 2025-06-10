package z1;

/* loaded from: classes.dex */
public abstract class c extends p1.a implements p1.f {
    public static final b a = new b(0);

    public c() {
        super(p1.e.a);
    }

    public abstract void a(p1.i iVar, Runnable runnable);

    public boolean b() {
        return !(this instanceof p);
    }

    @Override // p1.a, p1.i
    public final p1.g get(p1.h hVar) {
        f1.e.r(hVar, "key");
        if (hVar instanceof p1.b) {
            p1.b bVar = (p1.b) hVar;
            p1.h key = getKey();
            f1.e.r(key, "key");
            if (!(key == bVar || bVar.f2157b == key)) {
                return null;
            }
            this = bVar.a(this);
            if (!(this instanceof p1.g)) {
                return null;
            }
        } else if (p1.e.a != hVar) {
            this = null;
        }
        return this;
    }

    @Override // p1.a, p1.i
    public final p1.i minusKey(p1.h hVar) {
        f1.e.r(hVar, "key");
        boolean z2 = hVar instanceof p1.b;
        p1.j jVar = p1.j.a;
        if (z2) {
            p1.b bVar = (p1.b) hVar;
            p1.h key = getKey();
            f1.e.r(key, "key");
            if (!(key == bVar || bVar.f2157b == key) || bVar.a(this) == null) {
                return this;
            }
        } else if (p1.e.a != hVar) {
            return this;
        }
        return jVar;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
