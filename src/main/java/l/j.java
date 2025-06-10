package l;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: f, reason: collision with root package name */
    public l[] f1567f;

    /* renamed from: g, reason: collision with root package name */
    public l[] f1568g;

    /* renamed from: h, reason: collision with root package name */
    public int f1569h;

    /* renamed from: i, reason: collision with root package name */
    public final i f1570i;

    public j(d dVar) {
        super(dVar);
        this.f1567f = new l[128];
        this.f1568g = new l[128];
        this.f1569h = 0;
        this.f1570i = new i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    @Override // l.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l.l d(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f1569h
            if (r2 >= r4) goto L57
            l.l[] r4 = r11.f1567f
            r5 = r4[r2]
            int r6 = r5.f1571b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            l.i r6 = r11.f1570i
            r6.a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L36
        L1c:
            if (r7 < 0) goto L32
            l.l r4 = r6.a
            float[] r4 = r4.f1577h
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r7 = r7 + (-1)
            goto L1c
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r7 < 0) goto L50
            float[] r8 = r4.f1577h
            r8 = r8[r7]
            l.l r9 = r6.a
            float[] r9 = r9.f1577h
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r7 = r7 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r5 = r1
        L51:
            if (r5 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r11 = 0
            return r11
        L5b:
            l.l[] r11 = r11.f1567f
            r11 = r11[r3]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.j.d(boolean[]):l.l");
    }

    @Override // l.c
    public final void i(c cVar, boolean z2) {
        boolean z3;
        l lVar = cVar.a;
        if (lVar == null) {
            return;
        }
        b bVar = cVar.f1543d;
        int iK = bVar.k();
        for (int i2 = 0; i2 < iK; i2++) {
            l lVarC = bVar.c(i2);
            float fA = bVar.a(i2);
            i iVar = this.f1570i;
            iVar.a = lVarC;
            boolean z4 = lVarC.a;
            float[] fArr = lVar.f1577h;
            if (z4) {
                boolean z5 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = iVar.a.f1577h;
                    float f2 = (fArr[i3] * fA) + fArr2[i3];
                    fArr2[i3] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        iVar.a.f1577h[i3] = 0.0f;
                    } else {
                        z5 = false;
                    }
                }
                if (z5) {
                    iVar.f1566b.k(iVar.a);
                }
                z3 = false;
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f3 = fArr[i4];
                    if (f3 != 0.0f) {
                        float f4 = f3 * fA;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        iVar.a.f1577h[i4] = f4;
                    } else {
                        iVar.a.f1577h[i4] = 0.0f;
                    }
                }
                z3 = true;
            }
            if (z3) {
                j(lVarC);
            }
            this.f1541b = (cVar.f1541b * fA) + this.f1541b;
        }
        k(lVar);
    }

    public final void j(l lVar) {
        int i2;
        int i3 = this.f1569h + 1;
        l[] lVarArr = this.f1567f;
        if (i3 > lVarArr.length) {
            l[] lVarArr2 = (l[]) Arrays.copyOf(lVarArr, lVarArr.length * 2);
            this.f1567f = lVarArr2;
            this.f1568g = (l[]) Arrays.copyOf(lVarArr2, lVarArr2.length * 2);
        }
        l[] lVarArr3 = this.f1567f;
        int i4 = this.f1569h;
        lVarArr3[i4] = lVar;
        int i5 = i4 + 1;
        this.f1569h = i5;
        if (i5 > 1 && lVarArr3[i5 - 1].f1571b > lVar.f1571b) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i2 = this.f1569h;
                if (i7 >= i2) {
                    break;
                }
                this.f1568g[i7] = this.f1567f[i7];
                i7++;
            }
            Arrays.sort(this.f1568g, 0, i2, new h(i6, this));
            while (i6 < this.f1569h) {
                this.f1567f[i6] = this.f1568g[i6];
                i6++;
            }
        }
        lVar.a = true;
        lVar.a(this);
    }

    public final void k(l lVar) {
        int i2 = 0;
        while (i2 < this.f1569h) {
            if (this.f1567f[i2] == lVar) {
                while (true) {
                    int i3 = this.f1569h;
                    if (i2 >= i3 - 1) {
                        this.f1569h = i3 - 1;
                        lVar.a = false;
                        return;
                    } else {
                        l[] lVarArr = this.f1567f;
                        int i4 = i2 + 1;
                        lVarArr[i2] = lVarArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // l.c
    public final String toString() {
        String str = " goal -> (" + this.f1541b + ") : ";
        for (int i2 = 0; i2 < this.f1569h; i2++) {
            l lVar = this.f1567f[i2];
            i iVar = this.f1570i;
            iVar.a = lVar;
            str = str + iVar + " ";
        }
        return str;
    }
}
