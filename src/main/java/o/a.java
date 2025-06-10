package o;

/* loaded from: classes.dex */
public final class a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1846b;

    /* renamed from: c, reason: collision with root package name */
    public float f1847c;

    /* renamed from: d, reason: collision with root package name */
    public String f1848d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1849e;

    /* renamed from: f, reason: collision with root package name */
    public int f1850f;

    public a(String str, int i2, Object obj) {
        this.a = i2;
        b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[PHI: r9
  0x0055: PHI (r9v3 int) = (r9v0 int), (r9v1 int) binds: [B:15:0x0053, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r13, android.content.res.XmlResourceParser r14, java.util.HashMap r15) {
        /*
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r14)
            int[] r0 = o.r.f1967c
            android.content.res.TypedArray r14 = r13.obtainStyledAttributes(r14, r0)
            int r0 = r14.getIndexCount()
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r3 = r2
        L13:
            if (r4 >= r0) goto Lab
            int r6 = r14.getIndex(r4)
            r7 = 1
            if (r6 != 0) goto L45
            java.lang.String r2 = r14.getString(r6)
            if (r2 == 0) goto La7
            int r6 = r2.length()
            if (r6 <= 0) goto La7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            char r8 = r2.charAt(r1)
            char r8 = java.lang.Character.toUpperCase(r8)
            r6.append(r8)
            java.lang.String r2 = r2.substring(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto La7
        L45:
            r8 = 6
            if (r6 != r7) goto L52
            boolean r3 = r14.getBoolean(r6, r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = r8
            goto La7
        L52:
            r9 = 3
            if (r6 != r9) goto L57
        L55:
            r7 = r9
            goto L5c
        L57:
            r9 = 4
            r10 = 2
            if (r6 != r10) goto L61
            goto L55
        L5c:
            int r3 = r14.getColor(r6, r1)
            goto L98
        L61:
            r11 = 7
            r12 = 0
            if (r6 != r11) goto L76
            float r3 = r14.getDimension(r6, r12)
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r7, r3, r5)
            goto L7c
        L76:
            if (r6 != r9) goto L82
            float r3 = r14.getDimension(r6, r12)
        L7c:
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r5 = r11
            goto La7
        L82:
            r9 = 5
            if (r6 != r9) goto L91
            r3 = 2143289344(0x7fc00000, float:NaN)
            float r3 = r14.getFloat(r6, r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r5 = r10
            goto La7
        L91:
            if (r6 != r8) goto L9e
            r3 = -1
            int r3 = r14.getInteger(r6, r3)
        L98:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = r7
            goto La7
        L9e:
            r7 = 8
            if (r6 != r7) goto La7
            java.lang.String r3 = r14.getString(r6)
            r5 = r9
        La7:
            int r4 = r4 + 1
            goto L13
        Lab:
            if (r2 == 0) goto Lb7
            if (r3 == 0) goto Lb7
            o.a r13 = new o.a
            r13.<init>(r2, r5, r3)
            r15.put(r2, r13)
        Lb7:
            r14.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a.a(android.content.Context, android.content.res.XmlResourceParser, java.util.HashMap):void");
    }

    public final void b(Object obj) {
        switch (l.k.a(this.a)) {
            case 0:
                this.f1846b = ((Integer) obj).intValue();
                break;
            case 1:
            case 6:
                this.f1847c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f1850f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f1848d = (String) obj;
                break;
            case 5:
                this.f1849e = ((Boolean) obj).booleanValue();
                break;
        }
    }

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.a = aVar.a;
        b(obj);
    }
}
