package m;

import java.util.ArrayList;
import l.l;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: d0, reason: collision with root package name */
    public float f1796d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f1797e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f1798f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public d f1799g0 = this.f1744y;

    /* renamed from: h0, reason: collision with root package name */
    public int f1800h0 = 0;

    public i() {
        this.G.clear();
        this.G.add(this.f1799g0);
        int length = this.F.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.F[i2] = this.f1799g0;
        }
    }

    @Override // m.e
    public final void A(l.f fVar) {
        if (this.I == null) {
            return;
        }
        d dVar = this.f1799g0;
        fVar.getClass();
        int iN = l.f.n(dVar);
        if (this.f1800h0 == 1) {
            this.N = iN;
            this.O = 0;
            v(this.I.j());
            y(0);
            return;
        }
        this.N = 0;
        this.O = iN;
        y(this.I.l());
        v(0);
    }

    public final void B(int i2) {
        if (this.f1800h0 == i2) {
            return;
        }
        this.f1800h0 = i2;
        ArrayList arrayList = this.G;
        arrayList.clear();
        this.f1799g0 = this.f1800h0 == 1 ? this.f1743x : this.f1744y;
        arrayList.add(this.f1799g0);
        d[] dVarArr = this.F;
        int length = dVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            dVarArr[i3] = this.f1799g0;
        }
    }

    @Override // m.e
    public final void b(l.f fVar) {
        f fVar2 = (f) this.I;
        if (fVar2 == null) {
            return;
        }
        d dVarH = fVar2.h(c.LEFT);
        d dVarH2 = fVar2.h(c.RIGHT);
        e eVar = this.I;
        boolean z2 = eVar != null && eVar.f1723c0[0] == 2;
        if (this.f1800h0 == 0) {
            dVarH = fVar2.h(c.TOP);
            dVarH2 = fVar2.h(c.BOTTOM);
            e eVar2 = this.I;
            z2 = eVar2 != null && eVar2.f1723c0[1] == 2;
        }
        if (this.f1797e0 != -1) {
            l lVarK = fVar.k(this.f1799g0);
            fVar.e(lVarK, fVar.k(dVarH), this.f1797e0, 8);
            if (z2) {
                fVar.f(fVar.k(dVarH2), lVarK, 0, 5);
                return;
            }
            return;
        }
        if (this.f1798f0 != -1) {
            l lVarK2 = fVar.k(this.f1799g0);
            l lVarK3 = fVar.k(dVarH2);
            fVar.e(lVarK2, lVarK3, -this.f1798f0, 8);
            if (z2) {
                fVar.f(lVarK2, fVar.k(dVarH), 0, 5);
                fVar.f(lVarK3, lVarK2, 0, 5);
                return;
            }
            return;
        }
        if (this.f1796d0 != -1.0f) {
            l lVarK4 = fVar.k(this.f1799g0);
            l lVarK5 = fVar.k(dVarH2);
            float f2 = this.f1796d0;
            l.c cVarL = fVar.l();
            cVarL.f1543d.d(lVarK4, -1.0f);
            cVarL.f1543d.d(lVarK5, f2);
            fVar.c(cVarL);
        }
    }

    @Override // m.e
    public final boolean c() {
        return true;
    }

    @Override // m.e
    public final d h(c cVar) {
        switch (cVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f1800h0 == 1) {
                    return this.f1799g0;
                }
                break;
            case 2:
            case 4:
                if (this.f1800h0 == 0) {
                    return this.f1799g0;
                }
                break;
        }
        throw new AssertionError(cVar.name());
    }
}
