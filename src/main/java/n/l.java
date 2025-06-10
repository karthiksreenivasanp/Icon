package n;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends m {
    public final f k;

    /* renamed from: l, reason: collision with root package name */
    public a f1836l;

    public l(m.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.k = fVar;
        this.f1836l = null;
        this.f1843h.f1827e = 6;
        this.f1844i.f1827e = 7;
        fVar.f1827e = 8;
        this.f1841f = 1;
    }

    @Override // n.d
    public final void a(d dVar) {
        float f2;
        int i2;
        if (l.k.a(this.f1845j) == 3) {
            m.e eVar = this.f1837b;
            l(eVar.f1744y, eVar.A, 1);
            return;
        }
        g gVar = this.f1840e;
        if (gVar.f1825c && !gVar.f1832j && this.f1839d == 3) {
            m.e eVar2 = this.f1837b;
            int i3 = eVar2.k;
            if (i3 == 2) {
                m.e eVar3 = eVar2.I;
                if (eVar3 != null) {
                    if (eVar3.f1725e.f1840e.f1832j) {
                        f2 = r5.f1829g * eVar2.f1737r;
                        i2 = (int) (f2 + 0.5f);
                    }
                }
            } else if (i3 == 3) {
                if (eVar2.f1724d.f1840e.f1832j) {
                    int i4 = eVar2.M;
                    if (i4 == -1) {
                        f2 = r5.f1829g / eVar2.L;
                        i2 = (int) (f2 + 0.5f);
                    } else if (i4 != 0) {
                        if (i4 != 1) {
                            i2 = 0;
                        }
                        f2 = r5.f1829g / eVar2.L;
                        i2 = (int) (f2 + 0.5f);
                    } else {
                        f2 = r5.f1829g * eVar2.L;
                        i2 = (int) (f2 + 0.5f);
                    }
                }
            }
            gVar.d(i2);
        }
        f fVar = this.f1843h;
        if (fVar.f1825c) {
            f fVar2 = this.f1844i;
            if (fVar2.f1825c) {
                if (fVar.f1832j && fVar2.f1832j && gVar.f1832j) {
                    return;
                }
                boolean z2 = gVar.f1832j;
                ArrayList arrayList = fVar.f1833l;
                ArrayList arrayList2 = fVar2.f1833l;
                if (!z2 && this.f1839d == 3) {
                    m.e eVar4 = this.f1837b;
                    if (eVar4.f1730j == 0 && !eVar4.r()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i5 = fVar3.f1829g + fVar.f1828f;
                        int i6 = fVar4.f1829g + fVar2.f1828f;
                        fVar.d(i5);
                        fVar2.d(i6);
                        gVar.d(i6 - i5);
                        return;
                    }
                }
                if (!gVar.f1832j && this.f1839d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i7 = (((f) arrayList2.get(0)).f1829g + fVar2.f1828f) - (fVar5.f1829g + fVar.f1828f);
                    int i8 = gVar.f1834m;
                    if (i7 < i8) {
                        gVar.d(i7);
                    } else {
                        gVar.d(i8);
                    }
                }
                if (gVar.f1832j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i9 = fVar6.f1829g;
                    int i10 = fVar.f1828f + i9;
                    int i11 = fVar7.f1829g;
                    int i12 = fVar2.f1828f + i11;
                    float f3 = this.f1837b.T;
                    if (fVar6 == fVar7) {
                        f3 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    fVar.d((int) ((((i11 - i9) - gVar.f1829g) * f3) + i9 + 0.5f));
                    fVar2.d(fVar.f1829g + gVar.f1829g);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0303 A[PHI: r0
  0x0303: PHI (r0v21 n.j) = (r0v14 n.j), (r0v32 n.j) binds: [B:147:0x0301, B:121:0x028a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // n.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.l.d():void");
    }

    @Override // n.m
    public final void e() {
        f fVar = this.f1843h;
        if (fVar.f1832j) {
            this.f1837b.O = fVar.f1829g;
        }
    }

    @Override // n.m
    public final void f() {
        this.f1838c = null;
        this.f1843h.c();
        this.f1844i.c();
        this.k.c();
        this.f1840e.c();
        this.f1842g = false;
    }

    @Override // n.m
    public final boolean k() {
        return this.f1839d != 3 || this.f1837b.k == 0;
    }

    public final void m() {
        this.f1842g = false;
        f fVar = this.f1843h;
        fVar.c();
        fVar.f1832j = false;
        f fVar2 = this.f1844i;
        fVar2.c();
        fVar2.f1832j = false;
        f fVar3 = this.k;
        fVar3.c();
        fVar3.f1832j = false;
        this.f1840e.f1832j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f1837b.W;
    }
}
