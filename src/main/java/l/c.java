package l;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public b f1543d;
    public l a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f1541b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1542c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1544e = false;

    public c() {
    }

    public final void a(f fVar, int i2) {
        this.f1543d.d(fVar.j(i2), 1.0f);
        this.f1543d.d(fVar.j(i2), -1.0f);
    }

    public final void b(l lVar, l lVar2, l lVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f1541b = i2;
        }
        if (z2) {
            this.f1543d.d(lVar, 1.0f);
            this.f1543d.d(lVar2, -1.0f);
            this.f1543d.d(lVar3, -1.0f);
        } else {
            this.f1543d.d(lVar, -1.0f);
            this.f1543d.d(lVar2, 1.0f);
            this.f1543d.d(lVar3, 1.0f);
        }
    }

    public final void c(l lVar, l lVar2, l lVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f1541b = i2;
        }
        if (z2) {
            this.f1543d.d(lVar, 1.0f);
            this.f1543d.d(lVar2, -1.0f);
            this.f1543d.d(lVar3, 1.0f);
        } else {
            this.f1543d.d(lVar, -1.0f);
            this.f1543d.d(lVar2, 1.0f);
            this.f1543d.d(lVar3, -1.0f);
        }
    }

    public l d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final l e(boolean[] zArr, l lVar) {
        int i2;
        int iK = this.f1543d.k();
        l lVar2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < iK; i3++) {
            float fA = this.f1543d.a(i3);
            if (fA < 0.0f) {
                l lVarC = this.f1543d.c(i3);
                if ((zArr == null || !zArr[lVarC.f1571b]) && lVarC != lVar && (((i2 = lVarC.f1580l) == 3 || i2 == 4) && fA < f2)) {
                    f2 = fA;
                    lVar2 = lVarC;
                }
            }
        }
        return lVar2;
    }

    public final void f(l lVar) {
        l lVar2 = this.a;
        if (lVar2 != null) {
            this.f1543d.d(lVar2, -1.0f);
            this.a = null;
        }
        float fG = this.f1543d.g(lVar, true) * (-1.0f);
        this.a = lVar;
        if (fG == 1.0f) {
            return;
        }
        this.f1541b /= fG;
        this.f1543d.i(fG);
    }

    public final void g() {
        this.a = null;
        this.f1543d.clear();
        this.f1541b = 0.0f;
        this.f1544e = false;
    }

    public final void h(l lVar, boolean z2) {
        if (lVar.f1575f) {
            float f2 = this.f1543d.f(lVar);
            this.f1541b = (lVar.f1574e * f2) + this.f1541b;
            this.f1543d.g(lVar, z2);
            if (z2) {
                lVar.b(this);
            }
        }
    }

    public void i(c cVar, boolean z2) {
        float fE = this.f1543d.e(cVar, z2);
        this.f1541b = (cVar.f1541b * fE) + this.f1541b;
        if (z2) {
            cVar.a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            l.l r0 = r9.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            l.l r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f1541b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f1541b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L45
        L44:
            r1 = r4
        L45:
            l.b r5 = r9.f1543d
            int r5 = r5.k()
        L4b:
            if (r4 >= r5) goto Lbd
            l.b r6 = r9.f1543d
            l.l r6 = r6.c(r4)
            if (r6 != 0) goto L56
            goto Lba
        L56:
            l.b r7 = r9.f1543d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L61
            goto Lba
        L61:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L76
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L96
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L8c
        L76:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            if (r8 <= 0) goto L8a
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L96
        L8a:
            java.lang.String r0 = " - "
        L8c:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L96:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Laf
        La2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Laf:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r3
        Lba:
            int r4 = r4 + 1
            goto L4b
        Lbd:
            if (r1 != 0) goto Ld0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "0.0"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.toString():java.lang.String");
    }

    public c(d dVar) {
        this.f1543d = new a(this, dVar);
    }
}
