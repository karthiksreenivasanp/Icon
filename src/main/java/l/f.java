package l;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: o, reason: collision with root package name */
    public static int f1549o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f1550p = true;

    /* renamed from: b, reason: collision with root package name */
    public final j f1551b;

    /* renamed from: e, reason: collision with root package name */
    public c[] f1554e;
    public final d k;

    /* renamed from: n, reason: collision with root package name */
    public c f1562n;
    public int a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1552c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f1553d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1555f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f1556g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f1557h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f1558i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f1559j = 32;

    /* renamed from: l, reason: collision with root package name */
    public l[] f1560l = new l[f1549o];

    /* renamed from: m, reason: collision with root package name */
    public int f1561m = 0;

    public f() {
        this.f1554e = null;
        this.f1554e = new c[32];
        q();
        d dVar = new d(0);
        this.k = dVar;
        this.f1551b = new j(dVar);
        this.f1562n = f1550p ? new e(dVar) : new c(dVar);
    }

    public static int n(m.d dVar) {
        l lVar = dVar.f1718g;
        if (lVar != null) {
            return (int) (lVar.f1574e + 0.5f);
        }
        return 0;
    }

    public final l a(int i2) {
        l lVar = (l) ((g) this.k.f1547c).a();
        if (lVar == null) {
            lVar = new l(i2);
        } else {
            lVar.c();
        }
        lVar.f1580l = i2;
        int i3 = this.f1561m;
        int i4 = f1549o;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f1549o = i5;
            this.f1560l = (l[]) Arrays.copyOf(this.f1560l, i5);
        }
        l[] lVarArr = this.f1560l;
        int i6 = this.f1561m;
        this.f1561m = i6 + 1;
        lVarArr[i6] = lVar;
        return lVar;
    }

    public final void b(l lVar, l lVar2, int i2, float f2, l lVar3, l lVar4, int i3, int i4) {
        int i5;
        float f3;
        c cVarL = l();
        if (lVar2 == lVar3) {
            cVarL.f1543d.d(lVar, 1.0f);
            cVarL.f1543d.d(lVar4, 1.0f);
            cVarL.f1543d.d(lVar2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                cVarL.f1543d.d(lVar, 1.0f);
                cVarL.f1543d.d(lVar2, -1.0f);
                cVarL.f1543d.d(lVar3, -1.0f);
                cVarL.f1543d.d(lVar4, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    i5 = (-i2) + i3;
                    f3 = i5;
                }
            } else if (f2 <= 0.0f) {
                cVarL.f1543d.d(lVar, -1.0f);
                cVarL.f1543d.d(lVar2, 1.0f);
                f3 = i2;
            } else if (f2 >= 1.0f) {
                cVarL.f1543d.d(lVar4, -1.0f);
                cVarL.f1543d.d(lVar3, 1.0f);
                i5 = -i3;
                f3 = i5;
            } else {
                float f4 = 1.0f - f2;
                cVarL.f1543d.d(lVar, f4 * 1.0f);
                cVarL.f1543d.d(lVar2, f4 * (-1.0f));
                cVarL.f1543d.d(lVar3, (-1.0f) * f2);
                cVarL.f1543d.d(lVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    cVarL.f1541b = (i3 * f2) + ((-i2) * f4);
                }
            }
            cVarL.f1541b = f3;
        }
        if (i4 != 8) {
            cVarL.a(this, i4);
        }
        c(cVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(l.c r17) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.c(l.c):void");
    }

    public final void d(l lVar, int i2) {
        c cVarL;
        b bVar;
        float f2;
        int i3 = lVar.f1572c;
        if (i3 == -1) {
            lVar.f1574e = i2;
            lVar.f1575f = true;
            int i4 = lVar.f1579j;
            for (int i5 = 0; i5 < i4; i5++) {
                lVar.f1578i[i5].h(lVar, false);
            }
            lVar.f1579j = 0;
            return;
        }
        if (i3 != -1) {
            c cVar = this.f1554e[i3];
            if (!cVar.f1544e) {
                if (cVar.f1543d.k() == 0) {
                    cVar.f1544e = true;
                } else {
                    cVarL = l();
                    if (i2 < 0) {
                        cVarL.f1541b = i2 * (-1);
                        bVar = cVarL.f1543d;
                        f2 = 1.0f;
                    } else {
                        cVarL.f1541b = i2;
                        bVar = cVarL.f1543d;
                        f2 = -1.0f;
                    }
                    bVar.d(lVar, f2);
                }
            }
            cVar.f1541b = i2;
            return;
        }
        cVarL = l();
        cVarL.a = lVar;
        float f3 = i2;
        lVar.f1574e = f3;
        cVarL.f1541b = f3;
        cVarL.f1544e = true;
        c(cVarL);
    }

    public final void e(l lVar, l lVar2, int i2, int i3) {
        boolean z2 = false;
        if (i3 == 8 && lVar2.f1575f && lVar.f1572c == -1) {
            lVar.f1574e = lVar2.f1574e + i2;
            lVar.f1575f = true;
            int i4 = lVar.f1579j;
            for (int i5 = 0; i5 < i4; i5++) {
                lVar.f1578i[i5].h(lVar, false);
            }
            lVar.f1579j = 0;
            return;
        }
        c cVarL = l();
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            cVarL.f1541b = i2;
        }
        if (z2) {
            cVarL.f1543d.d(lVar, 1.0f);
            cVarL.f1543d.d(lVar2, -1.0f);
        } else {
            cVarL.f1543d.d(lVar, -1.0f);
            cVarL.f1543d.d(lVar2, 1.0f);
        }
        if (i3 != 8) {
            cVarL.a(this, i3);
        }
        c(cVarL);
    }

    public final void f(l lVar, l lVar2, int i2, int i3) {
        c cVarL = l();
        l lVarM = m();
        lVarM.f1573d = 0;
        cVarL.b(lVar, lVar2, lVarM, i2);
        if (i3 != 8) {
            cVarL.f1543d.d(j(i3), (int) (cVarL.f1543d.f(lVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void g(l lVar, l lVar2, int i2, int i3) {
        c cVarL = l();
        l lVarM = m();
        lVarM.f1573d = 0;
        cVarL.c(lVar, lVar2, lVarM, i2);
        if (i3 != 8) {
            cVarL.f1543d.d(j(i3), (int) (cVarL.f1543d.f(lVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void h(l lVar, l lVar2, l lVar3, l lVar4, float f2) {
        c cVarL = l();
        cVarL.f1543d.d(lVar, -1.0f);
        cVarL.f1543d.d(lVar2, 1.0f);
        cVarL.f1543d.d(lVar3, f2);
        cVarL.f1543d.d(lVar4, -f2);
        c(cVarL);
    }

    public final void i(c cVar) {
        c cVar2;
        Object obj;
        boolean z2 = f1550p;
        d dVar = this.k;
        if (z2) {
            cVar2 = this.f1554e[this.f1558i];
            if (cVar2 != null) {
                obj = dVar.a;
                ((g) obj).b(cVar2);
            }
        } else {
            cVar2 = this.f1554e[this.f1558i];
            if (cVar2 != null) {
                obj = dVar.f1546b;
                ((g) obj).b(cVar2);
            }
        }
        c[] cVarArr = this.f1554e;
        int i2 = this.f1558i;
        cVarArr[i2] = cVar;
        l lVar = cVar.a;
        lVar.f1572c = i2;
        this.f1558i = i2 + 1;
        lVar.d(cVar);
    }

    public final l j(int i2) {
        if (this.f1557h + 1 >= this.f1553d) {
            o();
        }
        l lVarA = a(4);
        int i3 = this.a + 1;
        this.a = i3;
        this.f1557h++;
        lVarA.f1571b = i3;
        lVarA.f1573d = i2;
        ((l[]) this.k.f1548d)[i3] = lVarA;
        j jVar = this.f1551b;
        jVar.f1570i.a = lVarA;
        float[] fArr = lVarA.f1577h;
        Arrays.fill(fArr, 0.0f);
        fArr[lVarA.f1573d] = 1.0f;
        jVar.j(lVarA);
        return lVarA;
    }

    public final l k(Object obj) {
        l lVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1557h + 1 >= this.f1553d) {
            o();
        }
        if (obj instanceof m.d) {
            m.d dVar = (m.d) obj;
            lVar = dVar.f1718g;
            if (lVar == null) {
                dVar.i();
                lVar = dVar.f1718g;
            }
            int i2 = lVar.f1571b;
            d dVar2 = this.k;
            if (i2 == -1 || i2 > this.a || ((l[]) dVar2.f1548d)[i2] == null) {
                if (i2 != -1) {
                    lVar.c();
                }
                int i3 = this.a + 1;
                this.a = i3;
                this.f1557h++;
                lVar.f1571b = i3;
                lVar.f1580l = 1;
                ((l[]) dVar2.f1548d)[i3] = lVar;
            }
        }
        return lVar;
    }

    public final c l() {
        c cVar;
        boolean z2 = f1550p;
        d dVar = this.k;
        if (z2) {
            cVar = (c) ((g) dVar.a).a();
            if (cVar == null) {
                return new e(dVar);
            }
        } else {
            cVar = (c) ((g) dVar.f1546b).a();
            if (cVar == null) {
                return new c(dVar);
            }
        }
        cVar.g();
        return cVar;
    }

    public final l m() {
        if (this.f1557h + 1 >= this.f1553d) {
            o();
        }
        l lVarA = a(3);
        int i2 = this.a + 1;
        this.a = i2;
        this.f1557h++;
        lVarA.f1571b = i2;
        ((l[]) this.k.f1548d)[i2] = lVarA;
        return lVarA;
    }

    public final void o() {
        int i2 = this.f1552c * 2;
        this.f1552c = i2;
        this.f1554e = (c[]) Arrays.copyOf(this.f1554e, i2);
        d dVar = this.k;
        dVar.f1548d = (l[]) Arrays.copyOf((l[]) dVar.f1548d, this.f1552c);
        int i3 = this.f1552c;
        this.f1556g = new boolean[i3];
        this.f1553d = i3;
        this.f1559j = i3;
    }

    public final void p(c cVar) {
        for (int i2 = 0; i2 < this.f1557h; i2++) {
            this.f1556g[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f1557h * 2) {
                return;
            }
            l lVar = cVar.a;
            if (lVar != null) {
                this.f1556g[lVar.f1571b] = true;
            }
            l lVarD = cVar.d(this.f1556g);
            if (lVarD != null) {
                boolean[] zArr = this.f1556g;
                int i4 = lVarD.f1571b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (lVarD != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f1558i; i6++) {
                    c cVar2 = this.f1554e[i6];
                    if (cVar2.a.f1580l != 1 && !cVar2.f1544e && cVar2.f1543d.h(lVarD)) {
                        float f3 = cVar2.f1543d.f(lVarD);
                        if (f3 < 0.0f) {
                            float f4 = (-cVar2.f1541b) / f3;
                            if (f4 < f2) {
                                i5 = i6;
                                f2 = f4;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    c cVar3 = this.f1554e[i5];
                    cVar3.a.f1572c = -1;
                    cVar3.f(lVarD);
                    l lVar2 = cVar3.a;
                    lVar2.f1572c = i5;
                    lVar2.d(cVar3);
                }
            } else {
                z2 = true;
            }
        }
    }

    public final void q() {
        boolean z2 = f1550p;
        d dVar = this.k;
        int i2 = 0;
        if (z2) {
            while (true) {
                c[] cVarArr = this.f1554e;
                if (i2 >= cVarArr.length) {
                    return;
                }
                c cVar = cVarArr[i2];
                if (cVar != null) {
                    ((g) dVar.a).b(cVar);
                }
                this.f1554e[i2] = null;
                i2++;
            }
        } else {
            while (true) {
                c[] cVarArr2 = this.f1554e;
                if (i2 >= cVarArr2.length) {
                    return;
                }
                c cVar2 = cVarArr2[i2];
                if (cVar2 != null) {
                    ((g) dVar.f1546b).b(cVar2);
                }
                this.f1554e[i2] = null;
                i2++;
            }
        }
    }

    public final void r() {
        d dVar;
        int i2 = 0;
        while (true) {
            dVar = this.k;
            l[] lVarArr = (l[]) dVar.f1548d;
            if (i2 >= lVarArr.length) {
                break;
            }
            l lVar = lVarArr[i2];
            if (lVar != null) {
                lVar.c();
            }
            i2++;
        }
        g gVar = (g) dVar.f1547c;
        l[] lVarArr2 = this.f1560l;
        int length = this.f1561m;
        gVar.getClass();
        if (length > lVarArr2.length) {
            length = lVarArr2.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            l lVar2 = lVarArr2[i3];
            int i4 = gVar.f1564c;
            Object[] objArr = gVar.f1563b;
            if (i4 < objArr.length) {
                objArr[i4] = lVar2;
                gVar.f1564c = i4 + 1;
            }
        }
        this.f1561m = 0;
        Arrays.fill((l[]) dVar.f1548d, (Object) null);
        this.a = 0;
        j jVar = this.f1551b;
        jVar.f1569h = 0;
        jVar.f1541b = 0.0f;
        this.f1557h = 1;
        for (int i5 = 0; i5 < this.f1558i; i5++) {
            this.f1554e[i5].getClass();
        }
        q();
        this.f1558i = 0;
        this.f1562n = f1550p ? new e(dVar) : new c(dVar);
    }
}
