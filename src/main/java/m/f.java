package m;

import g.f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import l.l;
import n.m;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: j0, reason: collision with root package name */
    public int f1752j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f1753k0;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f1746d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final f2 f1747e0 = new f2(this);

    /* renamed from: f0, reason: collision with root package name */
    public final n.e f1748f0 = new n.e(this);

    /* renamed from: g0, reason: collision with root package name */
    public o.e f1749g0 = null;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1750h0 = false;

    /* renamed from: i0, reason: collision with root package name */
    public final l.f f1751i0 = new l.f();

    /* renamed from: l0, reason: collision with root package name */
    public int f1754l0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1755m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public b[] f1756n0 = new b[4];

    /* renamed from: o0, reason: collision with root package name */
    public b[] f1757o0 = new b[4];

    /* renamed from: p0, reason: collision with root package name */
    public int f1758p0 = 263;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f1759q0 = false;
    public boolean r0 = false;

    public final void B(e eVar, int i2) {
        if (i2 == 0) {
            int i3 = this.f1754l0 + 1;
            b[] bVarArr = this.f1757o0;
            if (i3 >= bVarArr.length) {
                this.f1757o0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f1757o0;
            int i4 = this.f1754l0;
            bVarArr2[i4] = new b(eVar, 0, this.f1750h0);
            this.f1754l0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f1755m0 + 1;
            b[] bVarArr3 = this.f1756n0;
            if (i5 >= bVarArr3.length) {
                this.f1756n0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f1756n0;
            int i6 = this.f1755m0;
            bVarArr4[i6] = new b(eVar, 1, this.f1750h0);
            this.f1755m0 = i6 + 1;
        }
    }

    public final void C(l.f fVar) {
        b(fVar);
        int size = this.f1746d0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = (e) this.f1746d0.get(i2);
            boolean[] zArr = eVar.H;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = (e) this.f1746d0.get(i3);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i4 = 0; i4 < aVar.f1802e0; i4++) {
                        e eVar3 = aVar.f1801d0[i4];
                        int i5 = aVar.f1687f0;
                        if (i5 == 0 || i5 == 1) {
                            eVar3.H[0] = true;
                        } else if (i5 == 2 || i5 == 3) {
                            eVar3.H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = (e) this.f1746d0.get(i6);
            eVar4.getClass();
            if ((eVar4 instanceof h) || (eVar4 instanceof i)) {
                eVar4.b(fVar);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            e eVar5 = (e) this.f1746d0.get(i7);
            if (eVar5 instanceof f) {
                int[] iArr = eVar5.f1723c0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                if (i8 == 2) {
                    eVar5.w(1);
                }
                if (i9 == 2) {
                    eVar5.x(1);
                }
                eVar5.b(fVar);
                if (i8 == 2) {
                    eVar5.w(i8);
                }
                if (i9 == 2) {
                    eVar5.x(i9);
                }
            } else {
                eVar5.f1728h = -1;
                eVar5.f1729i = -1;
                int[] iArr2 = this.f1723c0;
                int i10 = iArr2[0];
                int[] iArr3 = eVar5.f1723c0;
                if (i10 != 2 && iArr3[0] == 4) {
                    d dVar = eVar5.f1743x;
                    int i11 = dVar.f1716e;
                    int iL = l();
                    d dVar2 = eVar5.f1745z;
                    int i12 = iL - dVar2.f1716e;
                    dVar.f1718g = fVar.k(dVar);
                    dVar2.f1718g = fVar.k(dVar2);
                    fVar.d(dVar.f1718g, i11);
                    fVar.d(dVar2.f1718g, i12);
                    eVar5.f1728h = 2;
                    eVar5.N = i11;
                    int i13 = i12 - i11;
                    eVar5.J = i13;
                    int i14 = eVar5.Q;
                    if (i13 < i14) {
                        eVar5.J = i14;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    d dVar3 = eVar5.f1744y;
                    int i15 = dVar3.f1716e;
                    int iJ = j();
                    d dVar4 = eVar5.A;
                    int i16 = iJ - dVar4.f1716e;
                    dVar3.f1718g = fVar.k(dVar3);
                    dVar4.f1718g = fVar.k(dVar4);
                    fVar.d(dVar3.f1718g, i15);
                    fVar.d(dVar4.f1718g, i16);
                    if (eVar5.P > 0 || eVar5.V == 8) {
                        d dVar5 = eVar5.B;
                        l lVarK = fVar.k(dVar5);
                        dVar5.f1718g = lVarK;
                        fVar.d(lVarK, eVar5.P + i15);
                    }
                    eVar5.f1729i = 2;
                    eVar5.O = i15;
                    int i17 = i16 - i15;
                    eVar5.K = i17;
                    int i18 = eVar5.R;
                    if (i17 < i18) {
                        eVar5.K = i18;
                    }
                }
                if (!((eVar5 instanceof h) || (eVar5 instanceof i))) {
                    eVar5.b(fVar);
                }
            }
        }
        if (this.f1754l0 > 0) {
            f1.e.d(this, fVar, 0);
        }
        if (this.f1755m0 > 0) {
            f1.e.d(this, fVar, 1);
        }
    }

    public final boolean D(int i2, boolean z2) {
        n.g gVar;
        int i3;
        boolean z3;
        n.g gVar2;
        int iJ;
        boolean z4 = true;
        boolean z5 = z2 & true;
        n.e eVar = this.f1748f0;
        f fVar = eVar.a;
        int i4 = fVar.i(0);
        int i5 = fVar.i(1);
        int iM = fVar.m();
        int iN = fVar.n();
        ArrayList arrayList = eVar.f1820e;
        n.j jVar = fVar.f1724d;
        n.l lVar = fVar.f1725e;
        if (z5 && (i4 == 2 || i5 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f1841f == i2 && !mVar.k()) {
                    z5 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z5 && i4 == 2) {
                    fVar.w(1);
                    fVar.y(eVar.d(fVar, 0));
                    gVar2 = jVar.f1840e;
                    iJ = fVar.l();
                    gVar2.d(iJ);
                }
            } else if (z5 && i5 == 2) {
                fVar.x(1);
                fVar.v(eVar.d(fVar, 1));
                gVar2 = lVar.f1840e;
                iJ = fVar.j();
                gVar2.d(iJ);
            }
        }
        int[] iArr = fVar.f1723c0;
        if (i2 == 0) {
            int i6 = iArr[0];
            if (i6 == 1 || i6 == 4) {
                int iL = fVar.l() + iM;
                jVar.f1844i.d(iL);
                gVar = jVar.f1840e;
                i3 = iL - iM;
                gVar.d(i3);
                z3 = true;
            }
            z3 = false;
        } else {
            int i7 = iArr[1];
            if (i7 == 1 || i7 == 4) {
                int iJ2 = fVar.j() + iN;
                lVar.f1844i.d(iJ2);
                gVar = lVar.f1840e;
                i3 = iJ2 - iN;
                gVar.d(i3);
                z3 = true;
            }
            z3 = false;
        }
        eVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f1841f == i2 && (mVar2.f1837b != fVar || mVar2.f1842g)) {
                mVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (mVar3.f1841f == i2 && (z3 || mVar3.f1837b != fVar)) {
                if (!mVar3.f1843h.f1832j || !mVar3.f1844i.f1832j || (!(mVar3 instanceof n.c) && !mVar3.f1840e.f1832j)) {
                    z4 = false;
                    break;
                }
            }
        }
        fVar.w(i4);
        fVar.x(i5);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0202 A[Catch: Exception -> 0x0186, TRY_LEAVE, TryCatch #3 {Exception -> 0x0186, blocks: (B:112:0x018c, B:103:0x016f, B:108:0x0183, B:116:0x019e, B:123:0x01c3, B:125:0x01de, B:130:0x01f2, B:131:0x01fe, B:133:0x0202), top: B:208:0x018c }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.E():void");
    }

    @Override // m.e
    public final void s() {
        this.f1751i0.r();
        this.f1752j0 = 0;
        this.f1753k0 = 0;
        this.f1746d0.clear();
        super.s();
    }

    @Override // m.e
    public final void u(l.d dVar) {
        super.u(dVar);
        int size = this.f1746d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((e) this.f1746d0.get(i2)).u(dVar);
        }
    }

    @Override // m.e
    public final void z(boolean z2, boolean z3) {
        super.z(z2, z3);
        int size = this.f1746d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((e) this.f1746d0.get(i2)).z(z2, z3);
        }
    }
}
