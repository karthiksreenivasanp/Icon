package n;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e {
    public final m.f a;

    /* renamed from: d, reason: collision with root package name */
    public final m.f f1819d;

    /* renamed from: f, reason: collision with root package name */
    public o.e f1821f;

    /* renamed from: g, reason: collision with root package name */
    public final b f1822g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1823h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1817b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1818c = true;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1820e = new ArrayList();

    public e(m.f fVar) {
        new ArrayList();
        this.f1821f = null;
        this.f1822g = new b();
        this.f1823h = new ArrayList();
        this.a = fVar;
        this.f1819d = fVar;
    }

    public final void a(f fVar, int i2, int i3, ArrayList arrayList, k kVar) {
        m mVar = fVar.f1826d;
        if (mVar.f1838c == null) {
            m.f fVar2 = this.a;
            if (mVar == fVar2.f1724d || mVar == fVar2.f1725e) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar);
                arrayList.add(kVar);
            }
            mVar.f1838c = kVar;
            kVar.f1835b.add(mVar);
            f fVar3 = mVar.f1843h;
            Iterator it = fVar3.k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, arrayList, kVar);
                }
            }
            f fVar4 = mVar.f1844i;
            Iterator it2 = fVar4.k.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, arrayList, kVar);
                }
            }
            if (i2 == 1 && (mVar instanceof l)) {
                Iterator it3 = ((l) mVar).k.k.iterator();
                while (it3.hasNext()) {
                    d dVar3 = (d) it3.next();
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, arrayList, kVar);
                    }
                }
            }
            Iterator it4 = fVar3.f1833l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i2, 0, arrayList, kVar);
            }
            Iterator it5 = fVar4.f1833l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i2, 1, arrayList, kVar);
            }
            if (i2 == 1 && (mVar instanceof l)) {
                Iterator it6 = ((l) mVar).k.f1833l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i2, 2, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01df A[PHI: r2 r4
  0x01df: PHI (r2v11 int) = (r2v10 int), (r2v20 int), (r2v10 int) binds: [B:99:0x0157, B:127:0x01d4, B:102:0x015c] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r4v17 int) = (r4v16 int), (r4v25 int), (r4v16 int) binds: [B:99:0x0157, B:127:0x01d4, B:102:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5 A[PHI: r0
  0x00b5: PHI (r0v13 int) = (r0v8 int), (r0v47 int) binds: [B:64:0x00b1, B:58:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(m.f r18) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.e.b(m.f):void");
    }

    public final void c() {
        d hVar;
        ArrayList arrayList = this.f1820e;
        arrayList.clear();
        m.f fVar = this.f1819d;
        fVar.f1724d.f();
        l lVar = fVar.f1725e;
        lVar.f();
        arrayList.add(fVar.f1724d);
        arrayList.add(lVar);
        Iterator it = fVar.f1746d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            m.e eVar = (m.e) it.next();
            if (eVar instanceof m.i) {
                hVar = new h(eVar);
            } else {
                if (eVar.q()) {
                    if (eVar.f1720b == null) {
                        eVar.f1720b = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f1720b);
                } else {
                    arrayList.add(eVar.f1724d);
                }
                if (eVar.r()) {
                    if (eVar.f1722c == null) {
                        eVar.f1722c = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f1722c);
                } else {
                    arrayList.add(eVar.f1725e);
                }
                if (eVar instanceof m.k) {
                    hVar = new i(eVar);
                }
            }
            arrayList.add(hVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f1837b != fVar) {
                mVar.d();
            }
        }
        ArrayList arrayList2 = this.f1823h;
        arrayList2.clear();
        m.f fVar2 = this.a;
        e(fVar2.f1724d, 0, arrayList2);
        e(fVar2.f1725e, 1, arrayList2);
        this.f1817b = false;
    }

    public final int d(m.f fVar, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long j2;
        long j3;
        long jB;
        float f2;
        m.f fVar2 = fVar;
        ArrayList arrayList2 = this.f1823h;
        int size = arrayList2.size();
        int i5 = 0;
        long j4 = 0;
        long jMax = 0;
        while (i5 < size) {
            m mVar = ((k) arrayList2.get(i5)).a;
            if (!(mVar instanceof c) ? !(i2 != 0 ? (mVar instanceof l) : (mVar instanceof j)) : ((c) mVar).f1841f != i2) {
                f fVar3 = (i2 == 0 ? fVar2.f1724d : fVar2.f1725e).f1843h;
                f fVar4 = (i2 == 0 ? fVar2.f1724d : fVar2.f1725e).f1844i;
                boolean zContains = mVar.f1843h.f1833l.contains(fVar3);
                f fVar5 = mVar.f1844i;
                boolean zContains2 = fVar5.f1833l.contains(fVar4);
                long j5 = mVar.j();
                f fVar6 = mVar.f1843h;
                if (zContains && zContains2) {
                    long jB2 = k.b(fVar6, j4);
                    arrayList = arrayList2;
                    long jA = k.a(fVar5, j4);
                    long j6 = jB2 - j5;
                    int i6 = fVar5.f1828f;
                    i3 = size;
                    i4 = i5;
                    if (j6 >= (-i6)) {
                        j6 += i6;
                    }
                    long j7 = fVar6.f1828f;
                    long j8 = ((-jA) - j5) - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    m.e eVar = mVar.f1837b;
                    if (i2 == 0) {
                        f2 = eVar.S;
                    } else if (i2 == 1) {
                        f2 = eVar.T;
                    } else {
                        eVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j6 / (1.0f - f2)) + (j8 / f2)) : 0L;
                    j2 = (fVar6.f1828f + ((((long) ((f3 * f2) + 0.5f)) + j5) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - fVar5.f1828f;
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    i4 = i5;
                    if (zContains) {
                        jB = k.b(fVar6, fVar6.f1828f);
                        j3 = fVar6.f1828f + j5;
                    } else if (zContains2) {
                        j3 = (-fVar5.f1828f) + j5;
                        jB = -k.a(fVar5, fVar5.f1828f);
                    } else {
                        j2 = (mVar.j() + fVar6.f1828f) - fVar5.f1828f;
                    }
                    j2 = Math.max(jB, j3);
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                j2 = j4;
            }
            jMax = Math.max(jMax, j2);
            i5 = i4 + 1;
            arrayList2 = arrayList;
            fVar2 = fVar;
            size = i3;
            j4 = 0;
        }
        return (int) jMax;
    }

    public final void e(m mVar, int i2, ArrayList arrayList) {
        f fVar;
        f fVar2;
        f fVar3;
        Iterator it = mVar.f1843h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = mVar.f1844i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                fVar3 = (f) dVar;
            } else if (dVar instanceof m) {
                fVar3 = ((m) dVar).f1843h;
            }
            a(fVar3, i2, 0, arrayList, null);
        }
        Iterator it2 = fVar.k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                fVar2 = (f) dVar2;
            } else if (dVar2 instanceof m) {
                fVar2 = ((m) dVar2).f1844i;
            }
            a(fVar2, i2, 1, arrayList, null);
        }
        if (i2 == 1) {
            Iterator it3 = ((l) mVar).k.k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(m.e eVar, int i2, int i3, int i4, int i5) {
        b bVar = this.f1822g;
        bVar.a = i2;
        bVar.f1807b = i4;
        bVar.f1808c = i3;
        bVar.f1809d = i5;
        this.f1821f.a(eVar, bVar);
        eVar.y(bVar.f1810e);
        eVar.v(bVar.f1811f);
        eVar.f1742w = bVar.f1813h;
        int i6 = bVar.f1812g;
        eVar.P = i6;
        eVar.f1742w = i6 > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r10 == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r8 == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        r2.f1834m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r2.d(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r15 = this;
            m.f r0 = r15.a
            java.util.ArrayList r0 = r0.f1746d0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r0.next()
            m.e r1 = (m.e) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.f1723c0
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f1730j
            int r4 = r1.k
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            n.j r12 = r1.f1724d
            n.g r4 = r12.f1840e
            boolean r5 = r4.f1832j
            n.l r13 = r1.f1725e
            n.g r6 = r13.f1840e
            boolean r7 = r6.f1832j
            r14 = 1
            if (r5 == 0) goto L55
            if (r7 == 0) goto L55
            int r5 = r4.f1829g
            int r7 = r6.f1829g
            r6 = 1
            r2 = r15
            r3 = r1
            r4 = r6
            r2.f(r3, r4, r5, r6, r7)
            goto L8a
        L55:
            if (r5 == 0) goto L6d
            if (r3 == 0) goto L6d
            int r5 = r4.f1829g
            int r7 = r6.f1829g
            r4 = 1
            r6 = 2
            r2 = r15
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            n.g r2 = r13.f1840e
            int r3 = r1.j()
            if (r10 != r11) goto L87
            goto L84
        L6d:
            if (r7 == 0) goto L8c
            if (r2 == 0) goto L8c
            int r5 = r4.f1829g
            int r7 = r6.f1829g
            r4 = 2
            r2 = r15
            r3 = r1
            r6 = r14
            r2.f(r3, r4, r5, r6, r7)
            n.g r2 = r12.f1840e
            int r3 = r1.l()
            if (r8 != r11) goto L87
        L84:
            r2.f1834m = r3
            goto L8c
        L87:
            r2.d(r3)
        L8a:
            r1.a = r9
        L8c:
            boolean r2 = r1.a
            if (r2 == 0) goto L8
            n.a r2 = r13.f1836l
            if (r2 == 0) goto L8
            int r1 = r1.P
            r2.d(r1)
            goto L8
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.e.g():void");
    }
}
