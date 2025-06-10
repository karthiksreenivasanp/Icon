package m;

import l.l;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: f0, reason: collision with root package name */
    public int f1687f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1688g0 = true;

    /* renamed from: h0, reason: collision with root package name */
    public int f1689h0 = 0;

    @Override // m.e
    public final void b(l.f fVar) {
        boolean z2;
        l lVar;
        d dVar;
        int i2;
        int i3;
        d[] dVarArr = this.F;
        d dVar2 = this.f1743x;
        dVarArr[0] = dVar2;
        int i4 = 2;
        d dVar3 = this.f1744y;
        dVarArr[2] = dVar3;
        d dVar4 = this.f1745z;
        dVarArr[1] = dVar4;
        d dVar5 = this.A;
        dVarArr[3] = dVar5;
        for (d dVar6 : dVarArr) {
            dVar6.f1718g = fVar.k(dVar6);
        }
        int i5 = this.f1687f0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        d dVar7 = dVarArr[i5];
        for (int i6 = 0; i6 < this.f1802e0; i6++) {
            e eVar = this.f1801d0[i6];
            if ((this.f1688g0 || eVar.c()) && ((((i3 = this.f1687f0) == 0 || i3 == 1) && eVar.f1723c0[0] == 3 && eVar.f1743x.f1715d != null && eVar.f1745z.f1715d != null) || ((i3 == 2 || i3 == 3) && eVar.f1723c0[1] == 3 && eVar.f1744y.f1715d != null && eVar.A.f1715d != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = dVar2.e() || dVar4.e();
        boolean z4 = dVar3.e() || dVar5.e();
        int i7 = !(!z2 && (((i2 = this.f1687f0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f1802e0) {
            e eVar2 = this.f1801d0[i8];
            if (this.f1688g0 || eVar2.c()) {
                l lVarK = fVar.k(eVar2.F[this.f1687f0]);
                int i9 = this.f1687f0;
                d dVar8 = eVar2.F[i9];
                dVar8.f1718g = lVarK;
                d dVar9 = dVar8.f1715d;
                int i10 = (dVar9 == null || dVar9.f1713b != this) ? 0 : dVar8.f1716e + 0;
                if (i9 == 0 || i9 == i4) {
                    l lVar2 = dVar7.f1718g;
                    int i11 = this.f1689h0 - i10;
                    l.c cVarL = fVar.l();
                    l lVarM = fVar.m();
                    lVarM.f1573d = 0;
                    cVarL.c(lVar2, lVarK, lVarM, i11);
                    fVar.c(cVarL);
                } else {
                    l lVar3 = dVar7.f1718g;
                    int i12 = this.f1689h0 + i10;
                    l.c cVarL2 = fVar.l();
                    l lVarM2 = fVar.m();
                    lVarM2.f1573d = 0;
                    cVarL2.b(lVar3, lVarK, lVarM2, i12);
                    fVar.c(cVarL2);
                }
                fVar.e(dVar7.f1718g, lVarK, this.f1689h0 + i10, i7);
            }
            i8++;
            i4 = 2;
        }
        int i13 = this.f1687f0;
        if (i13 == 0) {
            fVar.e(dVar4.f1718g, dVar2.f1718g, 0, 8);
            fVar.e(dVar2.f1718g, this.I.f1745z.f1718g, 0, 4);
            lVar = dVar2.f1718g;
            dVar = this.I.f1743x;
        } else if (i13 == 1) {
            fVar.e(dVar2.f1718g, dVar4.f1718g, 0, 8);
            fVar.e(dVar2.f1718g, this.I.f1743x.f1718g, 0, 4);
            lVar = dVar2.f1718g;
            dVar = this.I.f1745z;
        } else if (i13 == 2) {
            fVar.e(dVar5.f1718g, dVar3.f1718g, 0, 8);
            fVar.e(dVar3.f1718g, this.I.A.f1718g, 0, 4);
            lVar = dVar3.f1718g;
            dVar = this.I.f1744y;
        } else {
            if (i13 != 3) {
                return;
            }
            fVar.e(dVar3.f1718g, dVar5.f1718g, 0, 8);
            fVar.e(dVar3.f1718g, this.I.f1744y.f1718g, 0, 4);
            lVar = dVar3.f1718g;
            dVar = this.I.A;
        }
        fVar.e(lVar, dVar.f1718g, 0, 0);
    }

    @Override // m.e
    public final boolean c() {
        return true;
    }

    @Override // m.e
    public final String toString() {
        String str = "[Barrier] " + this.W + " {";
        for (int i2 = 0; i2 < this.f1802e0; i2++) {
            e eVar = this.f1801d0[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + eVar.W;
        }
        return str + "}";
    }
}
