package n;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends m {
    public i(m.e eVar) {
        super(eVar);
    }

    @Override // n.d
    public final void a(d dVar) {
        m.a aVar = (m.a) this.f1837b;
        int i2 = aVar.f1687f0;
        f fVar = this.f1843h;
        Iterator it = fVar.f1833l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((f) it.next()).f1829g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            fVar.d(i4 + aVar.f1689h0);
        } else {
            fVar.d(i3 + aVar.f1689h0);
        }
    }

    @Override // n.m
    public final void d() {
        m mVar;
        m.e eVar = this.f1837b;
        if (eVar instanceof m.a) {
            f fVar = this.f1843h;
            fVar.f1824b = true;
            m.a aVar = (m.a) eVar;
            int i2 = aVar.f1687f0;
            boolean z2 = aVar.f1688g0;
            ArrayList arrayList = fVar.f1833l;
            int i3 = 0;
            if (i2 == 0) {
                fVar.f1827e = 4;
                while (i3 < aVar.f1802e0) {
                    m.e eVar2 = aVar.f1801d0[i3];
                    if (z2 || eVar2.V != 8) {
                        f fVar2 = eVar2.f1724d.f1843h;
                        fVar2.k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i3++;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        fVar.f1827e = 6;
                        while (i3 < aVar.f1802e0) {
                            m.e eVar3 = aVar.f1801d0[i3];
                            if (z2 || eVar3.V != 8) {
                                f fVar3 = eVar3.f1725e.f1843h;
                                fVar3.k.add(fVar);
                                arrayList.add(fVar3);
                            }
                            i3++;
                        }
                    } else {
                        if (i2 != 3) {
                            return;
                        }
                        fVar.f1827e = 7;
                        while (i3 < aVar.f1802e0) {
                            m.e eVar4 = aVar.f1801d0[i3];
                            if (z2 || eVar4.V != 8) {
                                f fVar4 = eVar4.f1725e.f1844i;
                                fVar4.k.add(fVar);
                                arrayList.add(fVar4);
                            }
                            i3++;
                        }
                    }
                    m(this.f1837b.f1725e.f1843h);
                    mVar = this.f1837b.f1725e;
                    m(mVar.f1844i);
                }
                fVar.f1827e = 5;
                while (i3 < aVar.f1802e0) {
                    m.e eVar5 = aVar.f1801d0[i3];
                    if (z2 || eVar5.V != 8) {
                        f fVar5 = eVar5.f1724d.f1844i;
                        fVar5.k.add(fVar);
                        arrayList.add(fVar5);
                    }
                    i3++;
                }
            }
            m(this.f1837b.f1724d.f1843h);
            mVar = this.f1837b.f1724d;
            m(mVar.f1844i);
        }
    }

    @Override // n.m
    public final void e() {
        m.e eVar = this.f1837b;
        if (eVar instanceof m.a) {
            int i2 = ((m.a) eVar).f1687f0;
            f fVar = this.f1843h;
            if (i2 == 0 || i2 == 1) {
                eVar.N = fVar.f1829g;
            } else {
                eVar.O = fVar.f1829g;
            }
        }
    }

    @Override // n.m
    public final void f() {
        this.f1838c = null;
        this.f1843h.c();
    }

    @Override // n.m
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f1843h;
        fVar2.k.add(fVar);
        fVar.f1833l.add(fVar2);
    }
}
