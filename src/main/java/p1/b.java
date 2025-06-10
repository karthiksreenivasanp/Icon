package p1;

import z1.m;

/* loaded from: classes.dex */
public abstract class b implements h {
    public final t1.a a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2157b;

    public b(h hVar, z1.a aVar) {
        f1.e.r(hVar, "baseKey");
        this.a = aVar;
        this.f2157b = hVar instanceof b ? ((b) hVar).f2157b : hVar;
    }

    public final z1.c a(g gVar) {
        f1.e.r(gVar, "element");
        switch (((z1.a) this.a).a) {
            case 0:
                if (gVar instanceof z1.c) {
                    return (z1.c) gVar;
                }
                return null;
            default:
                if (gVar instanceof m) {
                    return (m) gVar;
                }
                return null;
        }
    }
}
