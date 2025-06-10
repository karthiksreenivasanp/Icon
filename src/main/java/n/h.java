package n;

/* loaded from: classes.dex */
public final class h extends m {
    public h(m.e eVar) {
        super(eVar);
        eVar.f1724d.f();
        eVar.f1725e.f();
        this.f1841f = ((m.i) eVar).f1800h0;
    }

    @Override // n.d
    public final void a(d dVar) {
        f fVar = this.f1843h;
        if (fVar.f1825c && !fVar.f1832j) {
            fVar.d((int) ((((f) fVar.f1833l.get(0)).f1829g * ((m.i) this.f1837b).f1796d0) + 0.5f));
        }
    }

    @Override // n.m
    public final void d() {
        m mVar;
        m.e eVar = this.f1837b;
        m.i iVar = (m.i) eVar;
        int i2 = iVar.f1797e0;
        int i3 = iVar.f1798f0;
        int i4 = iVar.f1800h0;
        f fVar = this.f1843h;
        if (i4 == 1) {
            if (i2 != -1) {
                fVar.f1833l.add(eVar.I.f1724d.f1843h);
                this.f1837b.I.f1724d.f1843h.k.add(fVar);
                fVar.f1828f = i2;
            } else if (i3 != -1) {
                fVar.f1833l.add(eVar.I.f1724d.f1844i);
                this.f1837b.I.f1724d.f1844i.k.add(fVar);
                fVar.f1828f = -i3;
            } else {
                fVar.f1824b = true;
                fVar.f1833l.add(eVar.I.f1724d.f1844i);
                this.f1837b.I.f1724d.f1844i.k.add(fVar);
            }
            m(this.f1837b.f1724d.f1843h);
            mVar = this.f1837b.f1724d;
        } else {
            if (i2 != -1) {
                fVar.f1833l.add(eVar.I.f1725e.f1843h);
                this.f1837b.I.f1725e.f1843h.k.add(fVar);
                fVar.f1828f = i2;
            } else if (i3 != -1) {
                fVar.f1833l.add(eVar.I.f1725e.f1844i);
                this.f1837b.I.f1725e.f1844i.k.add(fVar);
                fVar.f1828f = -i3;
            } else {
                fVar.f1824b = true;
                fVar.f1833l.add(eVar.I.f1725e.f1844i);
                this.f1837b.I.f1725e.f1844i.k.add(fVar);
            }
            m(this.f1837b.f1725e.f1843h);
            mVar = this.f1837b.f1725e;
        }
        m(mVar.f1844i);
    }

    @Override // n.m
    public final void e() {
        m.e eVar = this.f1837b;
        int i2 = ((m.i) eVar).f1800h0;
        int i3 = this.f1843h.f1829g;
        if (i2 == 1) {
            eVar.N = i3;
        } else {
            eVar.O = i3;
        }
    }

    @Override // n.m
    public final void f() {
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
