package m;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends k {
    public e[] N0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1776f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public int f1777g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public int f1778h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1779i0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public int f1780j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    public int f1781k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1782l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    public int f1783m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1784n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    public final n.b f1785o0 = new n.b();

    /* renamed from: p0, reason: collision with root package name */
    public o.e f1786p0 = null;

    /* renamed from: q0, reason: collision with root package name */
    public int f1787q0 = -1;
    public int r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f1788s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public int f1789t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public int f1790u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    public int f1791v0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    public float f1792w0 = 0.5f;

    /* renamed from: x0, reason: collision with root package name */
    public float f1793x0 = 0.5f;

    /* renamed from: y0, reason: collision with root package name */
    public float f1794y0 = 0.5f;

    /* renamed from: z0, reason: collision with root package name */
    public float f1795z0 = 0.5f;
    public float A0 = 0.5f;
    public float B0 = 0.5f;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 2;
    public int F0 = 2;
    public int G0 = 0;
    public int H0 = -1;
    public int I0 = 0;
    public final ArrayList J0 = new ArrayList();
    public e[] K0 = null;
    public e[] L0 = null;
    public int[] M0 = null;
    public int O0 = 0;

    public final int B(e eVar, int i2) {
        if (eVar == null) {
            return 0;
        }
        int[] iArr = eVar.f1723c0;
        if (iArr[1] == 3) {
            int i3 = eVar.k;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (eVar.f1737r * i2);
                if (i4 != eVar.j()) {
                    D(eVar, iArr[0], eVar.l(), 1, i4);
                }
                return i4;
            }
            if (i3 == 1) {
                return eVar.j();
            }
            if (i3 == 3) {
                return (int) ((eVar.l() * eVar.L) + 0.5f);
            }
        }
        return eVar.j();
    }

    public final int C(e eVar, int i2) {
        if (eVar == null) {
            return 0;
        }
        int[] iArr = eVar.f1723c0;
        if (iArr[0] == 3) {
            int i3 = eVar.f1730j;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (eVar.f1734o * i2);
                if (i4 != eVar.l()) {
                    D(eVar, 1, i4, iArr[1], eVar.j());
                }
                return i4;
            }
            if (i3 == 1) {
                return eVar.l();
            }
            if (i3 == 3) {
                return (int) ((eVar.j() * eVar.L) + 0.5f);
            }
        }
        return eVar.l();
    }

    public final void D(e eVar, int i2, int i3, int i4, int i5) {
        o.e eVar2;
        e eVar3;
        while (true) {
            eVar2 = this.f1786p0;
            if (eVar2 != null || (eVar3 = this.I) == null) {
                break;
            } else {
                this.f1786p0 = ((f) eVar3).f1749g0;
            }
        }
        n.b bVar = this.f1785o0;
        bVar.a = i2;
        bVar.f1807b = i4;
        bVar.f1808c = i3;
        bVar.f1809d = i5;
        eVar2.a(eVar, bVar);
        eVar.y(bVar.f1810e);
        eVar.v(bVar.f1811f);
        eVar.f1742w = bVar.f1813h;
        int i6 = bVar.f1812g;
        eVar.P = i6;
        eVar.f1742w = i6 > 0;
    }

    @Override // m.k, m.j
    public final void a() {
        for (int i2 = 0; i2 < this.f1802e0; i2++) {
            e eVar = this.f1801d0[i2];
        }
    }

    @Override // m.e
    public final void b(l.f fVar) {
        e eVar;
        super.b(fVar);
        e eVar2 = this.I;
        boolean z2 = eVar2 != null ? ((f) eVar2).f1750h0 : false;
        int i2 = this.G0;
        ArrayList arrayList = this.J0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((g) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 == 2 && this.M0 != null && this.L0 != null && this.K0 != null) {
                for (int i4 = 0; i4 < this.O0; i4++) {
                    this.N0[i4].t();
                }
                int[] iArr = this.M0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                e eVar3 = null;
                for (int i7 = 0; i7 < i5; i7++) {
                    e eVar4 = this.L0[z2 ? (i5 - i7) - 1 : i7];
                    if (eVar4 != null && eVar4.V != 8) {
                        d dVar = eVar4.f1743x;
                        if (i7 == 0) {
                            eVar4.f(dVar, this.f1743x, this.f1780j0);
                            eVar4.X = this.f1787q0;
                            eVar4.S = this.f1792w0;
                        }
                        if (i7 == i5 - 1) {
                            eVar4.f(eVar4.f1745z, this.f1745z, this.f1781k0);
                        }
                        if (i7 > 0) {
                            eVar4.f(dVar, eVar3.f1745z, this.C0);
                            eVar3.f(eVar3.f1745z, dVar, 0);
                        }
                        eVar3 = eVar4;
                    }
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    e eVar5 = this.K0[i8];
                    if (eVar5 != null && eVar5.V != 8) {
                        d dVar2 = eVar5.f1744y;
                        if (i8 == 0) {
                            eVar5.f(dVar2, this.f1744y, this.f1776f0);
                            eVar5.Y = this.r0;
                            eVar5.T = this.f1793x0;
                        }
                        if (i8 == i6 - 1) {
                            eVar5.f(eVar5.A, this.A, this.f1777g0);
                        }
                        if (i8 > 0) {
                            eVar5.f(dVar2, eVar3.A, this.D0);
                            eVar3.f(eVar3.A, dVar2, 0);
                        }
                        eVar3 = eVar5;
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.I0 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        e[] eVarArr = this.N0;
                        if (i11 < eVarArr.length && (eVar = eVarArr[i11]) != null && eVar.V != 8) {
                            e eVar6 = this.L0[i9];
                            e eVar7 = this.K0[i10];
                            if (eVar != eVar6) {
                                eVar.f(eVar.f1743x, eVar6.f1743x, 0);
                                eVar.f(eVar.f1745z, eVar6.f1745z, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.f(eVar.f1744y, eVar7.f1744y, 0);
                                eVar.f(eVar.A, eVar7.A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z2, true);
        }
        this.f1782l0 = false;
    }
}
