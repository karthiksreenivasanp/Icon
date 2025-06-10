package m;

/* loaded from: classes.dex */
public final class g {
    public int a;

    /* renamed from: d, reason: collision with root package name */
    public d f1762d;

    /* renamed from: e, reason: collision with root package name */
    public d f1763e;

    /* renamed from: f, reason: collision with root package name */
    public d f1764f;

    /* renamed from: g, reason: collision with root package name */
    public d f1765g;

    /* renamed from: h, reason: collision with root package name */
    public int f1766h;

    /* renamed from: i, reason: collision with root package name */
    public int f1767i;

    /* renamed from: j, reason: collision with root package name */
    public int f1768j;
    public int k;

    /* renamed from: q, reason: collision with root package name */
    public int f1774q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f1775r;

    /* renamed from: b, reason: collision with root package name */
    public e f1760b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f1761c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f1769l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1770m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f1771n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f1772o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f1773p = 0;

    public g(h hVar, int i2, d dVar, d dVar2, d dVar3, d dVar4, int i3) {
        this.f1775r = hVar;
        this.f1766h = 0;
        this.f1767i = 0;
        this.f1768j = 0;
        this.k = 0;
        this.f1774q = 0;
        this.a = i2;
        this.f1762d = dVar;
        this.f1763e = dVar2;
        this.f1764f = dVar3;
        this.f1765g = dVar4;
        this.f1766h = hVar.f1780j0;
        this.f1767i = hVar.f1776f0;
        this.f1768j = hVar.f1781k0;
        this.k = hVar.f1777g0;
        this.f1774q = i3;
    }

    public final void a(e eVar) {
        int i2 = this.a;
        h hVar = this.f1775r;
        if (i2 == 0) {
            int iC = hVar.C(eVar, this.f1774q);
            if (eVar.f1723c0[0] == 3) {
                this.f1773p++;
                iC = 0;
            }
            this.f1769l = iC + (eVar.V != 8 ? hVar.C0 : 0) + this.f1769l;
            int iB = hVar.B(eVar, this.f1774q);
            if (this.f1760b == null || this.f1761c < iB) {
                this.f1760b = eVar;
                this.f1761c = iB;
                this.f1770m = iB;
            }
        } else {
            int iC2 = hVar.C(eVar, this.f1774q);
            int iB2 = hVar.B(eVar, this.f1774q);
            if (eVar.f1723c0[1] == 3) {
                this.f1773p++;
                iB2 = 0;
            }
            this.f1770m = iB2 + (eVar.V != 8 ? hVar.D0 : 0) + this.f1770m;
            if (this.f1760b == null || this.f1761c < iC2) {
                this.f1760b = eVar;
                this.f1761c = iC2;
                this.f1769l = iC2;
            }
        }
        this.f1772o++;
    }

    public final void b(int i2, boolean z2, boolean z3) {
        h hVar;
        int i3;
        int i4;
        int i5;
        e eVar;
        int i6;
        d dVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.f1772o;
        int i12 = 0;
        while (true) {
            hVar = this.f1775r;
            if (i12 >= i11 || (i10 = this.f1771n + i12) >= hVar.O0) {
                break;
            }
            e eVar2 = hVar.N0[i10];
            if (eVar2 != null) {
                eVar2.t();
            }
            i12++;
        }
        if (i11 == 0 || this.f1760b == null) {
            return;
        }
        boolean z4 = z3 && i2 == 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = this.f1771n + (z2 ? (i11 - 1) - i15 : i15);
            if (i16 >= hVar.O0) {
                break;
            }
            if (hVar.N0[i16].V == 0) {
                if (i13 == -1) {
                    i13 = i15;
                }
                i14 = i15;
            }
        }
        if (this.a != 0) {
            e eVar3 = this.f1760b;
            eVar3.X = hVar.f1787q0;
            int i17 = this.f1766h;
            if (i2 > 0) {
                i17 += hVar.C0;
            }
            d dVar2 = eVar3.f1745z;
            d dVar3 = eVar3.f1743x;
            if (z2) {
                dVar2.a(this.f1764f, i17);
                if (z3) {
                    dVar3.a(this.f1762d, this.f1768j);
                }
                if (i2 > 0) {
                    this.f1764f.f1713b.f1743x.a(dVar2, 0);
                }
            } else {
                dVar3.a(this.f1762d, i17);
                if (z3) {
                    dVar2.a(this.f1764f, this.f1768j);
                }
                if (i2 > 0) {
                    this.f1762d.f1713b.f1745z.a(dVar3, 0);
                }
            }
            int i18 = 0;
            e eVar4 = null;
            while (i18 < i11) {
                int i19 = this.f1771n + i18;
                if (i19 >= hVar.O0) {
                    return;
                }
                e eVar5 = hVar.N0[i19];
                if (i18 == 0) {
                    eVar5.f(eVar5.f1744y, this.f1763e, this.f1767i);
                    int i20 = hVar.r0;
                    float f2 = hVar.f1793x0;
                    if (this.f1771n == 0) {
                        int i21 = hVar.f1789t0;
                        i5 = -1;
                        if (i21 != -1) {
                            f2 = hVar.f1795z0;
                        }
                        i20 = i21;
                        eVar5.Y = i20;
                        eVar5.T = f2;
                    } else {
                        i5 = -1;
                    }
                    if (z3 && (i21 = hVar.f1791v0) != i5) {
                        f2 = hVar.B0;
                        i20 = i21;
                    }
                    eVar5.Y = i20;
                    eVar5.T = f2;
                }
                if (i18 == i11 - 1) {
                    eVar5.f(eVar5.A, this.f1765g, this.k);
                }
                if (eVar4 != null) {
                    d dVar4 = eVar5.f1744y;
                    int i22 = hVar.D0;
                    d dVar5 = eVar4.A;
                    dVar4.a(dVar5, i22);
                    d dVar6 = eVar5.f1744y;
                    if (i18 == i13) {
                        int i23 = this.f1767i;
                        if (dVar6.f()) {
                            dVar6.f1717f = i23;
                        }
                    }
                    dVar5.a(dVar6, 0);
                    if (i18 == i14 + 1) {
                        int i24 = this.k;
                        if (dVar5.f()) {
                            dVar5.f1717f = i24;
                        }
                    }
                }
                if (eVar5 != eVar3) {
                    if (z2) {
                        int i25 = hVar.E0;
                        if (i25 == 0) {
                            i4 = 0;
                        } else if (i25 == 1) {
                            eVar5.f1743x.a(dVar3, 0);
                        } else if (i25 == 2) {
                            i4 = 0;
                            eVar5.f1743x.a(dVar3, 0);
                        }
                        eVar5.f1745z.a(dVar2, i4);
                    } else {
                        int i26 = hVar.E0;
                        if (i26 != 0) {
                            if (i26 == 1) {
                                i3 = 0;
                            } else if (i26 == 2) {
                                d dVar7 = eVar5.f1743x;
                                if (z4) {
                                    dVar7.a(this.f1762d, this.f1766h);
                                    eVar5.f1745z.a(this.f1764f, this.f1768j);
                                } else {
                                    i3 = 0;
                                    dVar7.a(dVar3, 0);
                                }
                            }
                            eVar5.f1745z.a(dVar2, i3);
                        } else {
                            eVar5.f1743x.a(dVar3, 0);
                        }
                    }
                }
                i18++;
                eVar4 = eVar5;
            }
            return;
        }
        e eVar6 = this.f1760b;
        eVar6.Y = hVar.r0;
        int i27 = this.f1767i;
        if (i2 > 0) {
            i27 += hVar.D0;
        }
        d dVar8 = this.f1763e;
        d dVar9 = eVar6.f1744y;
        dVar9.a(dVar8, i27);
        d dVar10 = eVar6.A;
        if (z3) {
            dVar10.a(this.f1765g, this.k);
        }
        if (i2 > 0) {
            this.f1763e.f1713b.A.a(dVar9, 0);
        }
        if (hVar.F0 != 3 || eVar6.f1742w) {
            eVar = eVar6;
        } else {
            for (int i28 = 0; i28 < i11; i28++) {
                int i29 = this.f1771n + (z2 ? (i11 - 1) - i28 : i28);
                if (i29 >= hVar.O0) {
                    break;
                }
                eVar = hVar.N0[i29];
                if (eVar.f1742w) {
                    break;
                }
            }
            eVar = eVar6;
        }
        int i30 = 0;
        e eVar7 = null;
        while (i30 < i11) {
            int i31 = z2 ? (i11 - 1) - i30 : i30;
            int i32 = this.f1771n + i31;
            if (i32 >= hVar.O0) {
                return;
            }
            e eVar8 = hVar.N0[i32];
            if (i30 == 0) {
                eVar8.f(eVar8.f1743x, this.f1762d, this.f1766h);
            }
            if (i31 == 0) {
                int i33 = hVar.f1787q0;
                float f3 = hVar.f1792w0;
                if (this.f1771n == 0) {
                    int i34 = hVar.f1788s0;
                    i7 = i33;
                    i8 = -1;
                    if (i34 != -1) {
                        f3 = hVar.f1794y0;
                    }
                    i9 = i34;
                    eVar8.X = i9;
                    eVar8.S = f3;
                } else {
                    i7 = i33;
                    i8 = -1;
                }
                if (!z3 || (i34 = hVar.f1790u0) == i8) {
                    i9 = i7;
                    eVar8.X = i9;
                    eVar8.S = f3;
                } else {
                    f3 = hVar.A0;
                    i9 = i34;
                    eVar8.X = i9;
                    eVar8.S = f3;
                }
            }
            if (i30 == i11 - 1) {
                eVar8.f(eVar8.f1745z, this.f1764f, this.f1768j);
            }
            if (eVar7 != null) {
                d dVar11 = eVar8.f1743x;
                int i35 = hVar.C0;
                d dVar12 = eVar7.f1745z;
                dVar11.a(dVar12, i35);
                d dVar13 = eVar8.f1743x;
                if (i30 == i13) {
                    int i36 = this.f1766h;
                    if (dVar13.f()) {
                        dVar13.f1717f = i36;
                    }
                }
                dVar12.a(dVar13, 0);
                if (i30 == i14 + 1) {
                    int i37 = this.f1768j;
                    if (dVar12.f()) {
                        dVar12.f1717f = i37;
                    }
                }
            }
            if (eVar8 != eVar6) {
                int i38 = hVar.F0;
                if (i38 == 3 && eVar.f1742w && eVar8 != eVar && eVar8.f1742w) {
                    eVar8.B.a(eVar.B, 0);
                } else if (i38 != 0) {
                    if (i38 != 1) {
                        d dVar14 = eVar8.f1744y;
                        dVar = eVar8.A;
                        if (z4) {
                            dVar14.a(this.f1763e, this.f1767i);
                            dVar.a(this.f1765g, this.k);
                        } else {
                            i6 = 0;
                            dVar14.a(dVar9, 0);
                        }
                    } else {
                        i6 = 0;
                        dVar = eVar8.A;
                    }
                    dVar.a(dVar10, i6);
                } else {
                    eVar8.f1744y.a(dVar9, 0);
                }
            }
            i30++;
            eVar7 = eVar8;
        }
    }

    public final int c() {
        return this.a == 1 ? this.f1770m - this.f1775r.D0 : this.f1770m;
    }

    public final int d() {
        return this.a == 0 ? this.f1769l - this.f1775r.C0 : this.f1769l;
    }

    public final void e(int i2, d dVar, d dVar2, d dVar3, d dVar4, int i3, int i4, int i5, int i6, int i7) {
        this.a = i2;
        this.f1762d = dVar;
        this.f1763e = dVar2;
        this.f1764f = dVar3;
        this.f1765g = dVar4;
        this.f1766h = i3;
        this.f1767i = i4;
        this.f1768j = i5;
        this.k = i6;
        this.f1774q = i7;
    }
}
