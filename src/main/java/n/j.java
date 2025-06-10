package n;

/* loaded from: classes.dex */
public final class j extends m {
    public static final int[] k = new int[2];

    public j(m.e eVar) {
        super(eVar);
        this.f1843h.f1827e = 4;
        this.f1844i.f1827e = 5;
        this.f1841f = 0;
    }

    public static void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0226, code lost:
    
        if (r3 != 1) goto L126;
     */
    @Override // n.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n.d r24) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.j.a(n.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    @Override // n.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.j.d():void");
    }

    @Override // n.m
    public final void e() {
        f fVar = this.f1843h;
        if (fVar.f1832j) {
            this.f1837b.N = fVar.f1829g;
        }
    }

    @Override // n.m
    public final void f() {
        this.f1838c = null;
        this.f1843h.c();
        this.f1844i.c();
        this.f1840e.c();
        this.f1842g = false;
    }

    @Override // n.m
    public final boolean k() {
        return this.f1839d != 3 || this.f1837b.f1730j == 0;
    }

    public final void n() {
        this.f1842g = false;
        f fVar = this.f1843h;
        fVar.c();
        fVar.f1832j = false;
        f fVar2 = this.f1844i;
        fVar2.c();
        fVar2.f1832j = false;
        this.f1840e.f1832j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f1837b.W;
    }
}
