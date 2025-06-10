package androidx.emoji2.text;

/* loaded from: classes.dex */
public final class p {
    public int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f267b;

    /* renamed from: c, reason: collision with root package name */
    public t f268c;

    /* renamed from: d, reason: collision with root package name */
    public t f269d;

    /* renamed from: e, reason: collision with root package name */
    public int f270e;

    /* renamed from: f, reason: collision with root package name */
    public int f271f;

    public p(t tVar) {
        this.f267b = tVar;
        this.f268c = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(int r5) {
        /*
            r4 = this;
            androidx.emoji2.text.t r0 = r4.f268c
            android.util.SparseArray r0 = r0.a
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            java.lang.Object r0 = r0.get(r5)
            androidx.emoji2.text.t r0 = (androidx.emoji2.text.t) r0
        Le:
            int r1 = r4.a
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L1e
            if (r0 != 0) goto L17
            goto L58
        L17:
            r4.a = r3
            r4.f268c = r0
            r4.f271f = r2
            goto L3c
        L1e:
            if (r0 == 0) goto L28
            r4.f268c = r0
            int r0 = r4.f271f
            int r0 = r0 + r2
            r4.f271f = r0
            goto L3c
        L28:
            r0 = 65038(0xfe0e, float:9.1138E-41)
            r1 = 0
            if (r5 != r0) goto L30
            r0 = r2
            goto L31
        L30:
            r0 = r1
        L31:
            if (r0 == 0) goto L34
            goto L58
        L34:
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r5 != r0) goto L3a
            r1 = r2
        L3a:
            if (r1 == 0) goto L3e
        L3c:
            r2 = r3
            goto L5b
        L3e:
            androidx.emoji2.text.t r0 = r4.f268c
            androidx.emoji2.text.o r1 = r0.f283b
            if (r1 == 0) goto L58
            int r1 = r4.f271f
            if (r1 != r2) goto L50
            boolean r0 = r4.c()
            if (r0 == 0) goto L58
            androidx.emoji2.text.t r0 = r4.f268c
        L50:
            r4.f269d = r0
            r4.b()
            r0 = 3
            r2 = r0
            goto L5b
        L58:
            r4.b()
        L5b:
            r4.f270e = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.p.a(int):int");
    }

    public final void b() {
        this.a = 1;
        this.f268c = this.f267b;
        this.f271f = 0;
    }

    public final boolean c() {
        j0.a aVarC = this.f268c.f283b.c();
        int iA = aVarC.a(6);
        if ((iA == 0 || aVarC.f1467b.get(iA + aVarC.a) == 0) ? false : true) {
            return true;
        }
        return this.f270e == 65039;
    }
}
