package m;

import java.util.ArrayList;
import n.l;

/* loaded from: classes.dex */
public class e {
    public final d A;
    public final d B;
    public final d C;
    public final d D;
    public final d E;
    public final d[] F;
    public final ArrayList G;
    public final boolean[] H;
    public e I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public Object U;
    public int V;
    public String W;
    public int X;
    public int Y;
    public final float[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public final e[] f1719a0;

    /* renamed from: b, reason: collision with root package name */
    public n.c f1720b;

    /* renamed from: b0, reason: collision with root package name */
    public final e[] f1721b0;

    /* renamed from: c, reason: collision with root package name */
    public n.c f1722c;

    /* renamed from: c0, reason: collision with root package name */
    public final int[] f1723c0;

    /* renamed from: x, reason: collision with root package name */
    public final d f1743x;

    /* renamed from: y, reason: collision with root package name */
    public final d f1744y;

    /* renamed from: z, reason: collision with root package name */
    public final d f1745z;
    public boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    public final n.j f1724d = new n.j(this);

    /* renamed from: e, reason: collision with root package name */
    public final l f1725e = new l(this);

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f1726f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1727g = {0, 0, 0, 0};

    /* renamed from: h, reason: collision with root package name */
    public int f1728h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f1729i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f1730j = 0;
    public int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f1731l = new int[2];

    /* renamed from: m, reason: collision with root package name */
    public int f1732m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f1733n = 0;

    /* renamed from: o, reason: collision with root package name */
    public float f1734o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public int f1735p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f1736q = 0;

    /* renamed from: r, reason: collision with root package name */
    public float f1737r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public int f1738s = -1;

    /* renamed from: t, reason: collision with root package name */
    public float f1739t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f1740u = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: v, reason: collision with root package name */
    public float f1741v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1742w = false;

    public e() {
        d dVar = new d(this, c.LEFT);
        this.f1743x = dVar;
        d dVar2 = new d(this, c.TOP);
        this.f1744y = dVar2;
        d dVar3 = new d(this, c.RIGHT);
        this.f1745z = dVar3;
        d dVar4 = new d(this, c.BOTTOM);
        this.A = dVar4;
        d dVar5 = new d(this, c.BASELINE);
        this.B = dVar5;
        d dVar6 = new d(this, c.CENTER_X);
        this.C = dVar6;
        d dVar7 = new d(this, c.CENTER_Y);
        this.D = dVar7;
        d dVar8 = new d(this, c.CENTER);
        this.E = dVar8;
        this.F = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = new boolean[2];
        this.f1723c0 = new int[]{1, 1};
        this.I = null;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        this.V = 0;
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = new float[]{-1.0f, -1.0f};
        this.f1719a0 = new e[]{null, null};
        this.f1721b0 = new e[]{null, null};
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public void A(l.f fVar) {
        int i2;
        int i3;
        fVar.getClass();
        int iN = l.f.n(this.f1743x);
        int iN2 = l.f.n(this.f1744y);
        int iN3 = l.f.n(this.f1745z);
        int iN4 = l.f.n(this.A);
        n.j jVar = this.f1724d;
        n.f fVar2 = jVar.f1843h;
        if (fVar2.f1832j) {
            n.f fVar3 = jVar.f1844i;
            if (fVar3.f1832j) {
                iN = fVar2.f1829g;
                iN3 = fVar3.f1829g;
            }
        }
        l lVar = this.f1725e;
        n.f fVar4 = lVar.f1843h;
        if (fVar4.f1832j) {
            n.f fVar5 = lVar.f1844i;
            if (fVar5.f1832j) {
                iN2 = fVar4.f1829g;
                iN4 = fVar5.f1829g;
            }
        }
        int i4 = iN4 - iN2;
        if (iN3 - iN < 0 || i4 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i5 = iN3 - iN;
        int i6 = iN4 - iN2;
        this.N = iN;
        this.O = iN2;
        if (this.V == 8) {
            this.J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.f1723c0;
        if (iArr[0] == 1 && i5 < (i3 = this.J)) {
            i5 = i3;
        }
        if (iArr[1] == 1 && i6 < (i2 = this.K)) {
            i6 = i2;
        }
        this.J = i5;
        this.K = i6;
        int i7 = this.R;
        if (i6 < i7) {
            this.K = i7;
        }
        int i8 = this.Q;
        if (i5 < i8) {
            this.J = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(l.f r54) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.e.b(l.f):void");
    }

    public boolean c() {
        return this.V != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0380 A[PHI: r2
  0x0380: PHI (r2v19 int) = (r2v18 int), (r2v23 int), (r2v23 int), (r2v23 int) binds: [B:233:0x0370, B:235:0x0376, B:236:0x0378, B:238:0x037c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(l.f r33, boolean r34, boolean r35, boolean r36, boolean r37, l.l r38, l.l r39, int r40, boolean r41, m.d r42, m.d r43, int r44, int r45, int r46, int r47, float r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.e.d(l.f, boolean, boolean, boolean, boolean, l.l, l.l, int, boolean, m.d, m.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x018e A[PHI: r10 r11
  0x018e: PHI (r10v2 m.d) = (r10v1 m.d), (r10v3 m.d) binds: [B:81:0x018c, B:72:0x0165] A[DONT_GENERATE, DONT_INLINE]
  0x018e: PHI (r11v3 m.d) = (r11v2 m.d), (r11v5 m.d) binds: [B:81:0x018c, B:72:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(m.c r11, m.e r12, m.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.e.e(m.c, m.e, m.c, int):void");
    }

    public final void f(d dVar, d dVar2, int i2) {
        if (dVar.f1713b == this) {
            e(dVar.f1714c, dVar2.f1713b, dVar2.f1714c, i2);
        }
    }

    public final void g(l.f fVar) {
        fVar.k(this.f1743x);
        fVar.k(this.f1744y);
        fVar.k(this.f1745z);
        fVar.k(this.A);
        if (this.P > 0) {
            fVar.k(this.B);
        }
    }

    public d h(c cVar) {
        switch (cVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f1743x;
            case 2:
                return this.f1744y;
            case 3:
                return this.f1745z;
            case 4:
                return this.A;
            case 5:
                return this.B;
            case 6:
                return this.E;
            case 7:
                return this.C;
            case 8:
                return this.D;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final int i(int i2) {
        int[] iArr = this.f1723c0;
        if (i2 == 0) {
            return iArr[0];
        }
        if (i2 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int j() {
        if (this.V == 8) {
            return 0;
        }
        return this.K;
    }

    public final e k(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.A).f1715d) != null && dVar2.f1715d == dVar) {
                return dVar2.f1713b;
            }
            return null;
        }
        d dVar3 = this.f1745z;
        d dVar4 = dVar3.f1715d;
        if (dVar4 == null || dVar4.f1715d != dVar3) {
            return null;
        }
        return dVar4.f1713b;
    }

    public final int l() {
        if (this.V == 8) {
            return 0;
        }
        return this.J;
    }

    public final int m() {
        e eVar = this.I;
        return (eVar == null || !(eVar instanceof f)) ? this.N : ((f) eVar).f1752j0 + this.N;
    }

    public final int n() {
        e eVar = this.I;
        return (eVar == null || !(eVar instanceof f)) ? this.O : ((f) eVar).f1753k0 + this.O;
    }

    public final void o(c cVar, e eVar, c cVar2, int i2, int i3) {
        h(cVar).b(eVar.h(cVar2), i2, i3, true);
    }

    public final boolean p(int i2) {
        d dVar;
        d dVar2;
        int i3 = i2 * 2;
        d[] dVarArr = this.F;
        d dVar3 = dVarArr[i3];
        d dVar4 = dVar3.f1715d;
        return (dVar4 == null || dVar4.f1715d == dVar3 || (dVar2 = (dVar = dVarArr[i3 + 1]).f1715d) == null || dVar2.f1715d != dVar) ? false : true;
    }

    public final boolean q() {
        d dVar = this.f1743x;
        d dVar2 = dVar.f1715d;
        if (dVar2 != null && dVar2.f1715d == dVar) {
            return true;
        }
        d dVar3 = this.f1745z;
        d dVar4 = dVar3.f1715d;
        return dVar4 != null && dVar4.f1715d == dVar3;
    }

    public final boolean r() {
        d dVar = this.f1744y;
        d dVar2 = dVar.f1715d;
        if (dVar2 != null && dVar2.f1715d == dVar) {
            return true;
        }
        d dVar3 = this.A;
        d dVar4 = dVar3.f1715d;
        return dVar4 != null && dVar4.f1715d == dVar3;
    }

    public void s() {
        this.f1743x.h();
        this.f1744y.h();
        this.f1745z.h();
        this.A.h();
        this.B.h();
        this.C.h();
        this.D.h();
        this.E.h();
        this.I = null;
        this.f1741v = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        int[] iArr = this.f1723c0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.U = null;
        this.V = 0;
        this.X = 0;
        this.Y = 0;
        float[] fArr = this.Z;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1728h = -1;
        this.f1729i = -1;
        int[] iArr2 = this.f1740u;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f1730j = 0;
        this.k = 0;
        this.f1734o = 1.0f;
        this.f1737r = 1.0f;
        this.f1733n = Integer.MAX_VALUE;
        this.f1736q = Integer.MAX_VALUE;
        this.f1732m = 0;
        this.f1735p = 0;
        this.f1738s = -1;
        this.f1739t = 1.0f;
        boolean[] zArr = this.f1726f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.H;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public final void t() {
        e eVar = this.I;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((d) arrayList.get(i2)).h();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.W != null) {
            str = "id: " + this.W + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.N);
        sb.append(", ");
        sb.append(this.O);
        sb.append(") - (");
        sb.append(this.J);
        sb.append(" x ");
        sb.append(this.K);
        sb.append(")");
        return sb.toString();
    }

    public void u(l.d dVar) {
        this.f1743x.i();
        this.f1744y.i();
        this.f1745z.i();
        this.A.i();
        this.B.i();
        this.E.i();
        this.C.i();
        this.D.i();
    }

    public final void v(int i2) {
        this.K = i2;
        int i3 = this.R;
        if (i2 < i3) {
            this.K = i3;
        }
    }

    public final void w(int i2) {
        this.f1723c0[0] = i2;
    }

    public final void x(int i2) {
        this.f1723c0[1] = i2;
    }

    public final void y(int i2) {
        this.J = i2;
        int i3 = this.Q;
        if (i2 < i3) {
            this.J = i3;
        }
    }

    public void z(boolean z2, boolean z3) {
        int i2;
        int i3;
        n.j jVar = this.f1724d;
        boolean z4 = z2 & jVar.f1842g;
        l lVar = this.f1725e;
        boolean z5 = z3 & lVar.f1842g;
        int i4 = jVar.f1843h.f1829g;
        int i5 = lVar.f1843h.f1829g;
        int i6 = jVar.f1844i.f1829g;
        int i7 = lVar.f1844i.f1829g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.N = i4;
        }
        if (z5) {
            this.O = i5;
        }
        if (this.V == 8) {
            this.J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.f1723c0;
        if (z4) {
            if (iArr[0] == 1 && i9 < (i3 = this.J)) {
                i9 = i3;
            }
            this.J = i9;
            int i11 = this.Q;
            if (i9 < i11) {
                this.J = i11;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i10 < (i2 = this.K)) {
                i10 = i2;
            }
            this.K = i10;
            int i12 = this.R;
            if (i10 < i12) {
                this.K = i12;
            }
        }
    }
}
