package n;

/* loaded from: classes.dex */
public abstract class m implements d {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public m.e f1837b;

    /* renamed from: c, reason: collision with root package name */
    public k f1838c;

    /* renamed from: d, reason: collision with root package name */
    public int f1839d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1840e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f1841f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1842g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f1843h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f1844i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f1845j = 1;

    public m(m.e eVar) {
        this.f1837b = eVar;
    }

    public static void b(f fVar, f fVar2, int i2) {
        fVar.f1833l.add(fVar2);
        fVar.f1828f = i2;
        fVar2.k.add(fVar);
    }

    public static f h(m.d dVar) {
        m mVar;
        m mVar2;
        m.d dVar2 = dVar.f1715d;
        if (dVar2 == null) {
            return null;
        }
        int iOrdinal = dVar2.f1714c.ordinal();
        m.e eVar = dVar2.f1713b;
        if (iOrdinal == 1) {
            mVar = eVar.f1724d;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    mVar2 = eVar.f1724d;
                } else {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            return null;
                        }
                        return eVar.f1725e.k;
                    }
                    mVar2 = eVar.f1725e;
                }
                return mVar2.f1844i;
            }
            mVar = eVar.f1725e;
        }
        return mVar.f1843h;
    }

    public static f i(m.d dVar, int i2) {
        m.d dVar2 = dVar.f1715d;
        if (dVar2 == null) {
            return null;
        }
        m.e eVar = dVar2.f1713b;
        m mVar = i2 == 0 ? eVar.f1724d : eVar.f1725e;
        int iOrdinal = dVar2.f1714c.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return mVar.f1843h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return mVar.f1844i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f1833l.add(fVar2);
        fVar.f1833l.add(this.f1840e);
        fVar.f1830h = i2;
        fVar.f1831i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int iMax;
        m.e eVar = this.f1837b;
        if (i3 == 0) {
            int i4 = eVar.f1733n;
            iMax = Math.max(eVar.f1732m, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        } else {
            int i5 = eVar.f1736q;
            iMax = Math.max(eVar.f1735p, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.f1840e.f1832j) {
            return r2.f1829g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(m.d dVar, m.d dVar2, int i2) {
        int i3;
        int iG;
        f fVarH = h(dVar);
        f fVarH2 = h(dVar2);
        if (fVarH.f1832j && fVarH2.f1832j) {
            int iC = dVar.c() + fVarH.f1829g;
            int iC2 = fVarH2.f1829g - dVar2.c();
            int i4 = iC2 - iC;
            g gVar = this.f1840e;
            if (!gVar.f1832j && this.f1839d == 3) {
                int i5 = this.a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        iG = Math.min(g(gVar.f1834m, i2), i4);
                    } else if (i5 == 2) {
                        m.e eVar = this.f1837b;
                        m.e eVar2 = eVar.I;
                        if (eVar2 != null) {
                            if ((i2 == 0 ? eVar2.f1724d : eVar2.f1725e).f1840e.f1832j) {
                                i3 = (int) ((r6.f1829g * (i2 == 0 ? eVar.f1734o : eVar.f1737r)) + 0.5f);
                            }
                        }
                    } else if (i5 == 3) {
                        m.e eVar3 = this.f1837b;
                        m mVar = eVar3.f1724d;
                        int i6 = mVar.f1839d;
                        m mVar2 = eVar3.f1725e;
                        if (i6 != 3 || mVar.a != 3 || mVar2.f1839d != 3 || mVar2.a != 3) {
                            if (i2 == 0) {
                                mVar = mVar2;
                            }
                            if (mVar.f1840e.f1832j) {
                                float f2 = eVar3.L;
                                iG = i2 == 1 ? (int) ((r6.f1829g / f2) + 0.5f) : (int) ((f2 * r6.f1829g) + 0.5f);
                            }
                        }
                    }
                    gVar.d(iG);
                } else {
                    i3 = i4;
                }
                iG = g(i3, i2);
                gVar.d(iG);
            }
            if (gVar.f1832j) {
                int i7 = gVar.f1829g;
                f fVar = this.f1844i;
                f fVar2 = this.f1843h;
                if (i7 == i4) {
                    fVar2.d(iC);
                    fVar.d(iC2);
                    return;
                }
                m.e eVar4 = this.f1837b;
                float f3 = i2 == 0 ? eVar4.S : eVar4.T;
                if (fVarH == fVarH2) {
                    iC = fVarH.f1829g;
                    iC2 = fVarH2.f1829g;
                    f3 = 0.5f;
                }
                fVar2.d((int) ((((iC2 - iC) - i7) * f3) + iC + 0.5f));
                fVar.d(fVar2.f1829g + gVar.f1829g);
            }
        }
    }
}
