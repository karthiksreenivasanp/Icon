package o;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class h {
    public final SparseArray a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f1904b = new SparseArray();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(android.content.Context r8, int r9) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r7 = this;
            r7.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r7.a = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r7.f1904b = r0
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r1 = 0
        L1e:
            r2 = 1
            if (r0 == r2) goto Lbd
            if (r0 == 0) goto Lab
            r3 = 2
            if (r0 == r3) goto L28
            goto Lae
        L28:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L5e;
                case 80204913: goto L54;
                case 1382829617: goto L4a;
                case 1657696882: goto L40;
                case 1901439077: goto L36;
                default: goto L35;
            }     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
        L35:
            goto L68
        L36:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            if (r4 == 0) goto L68
            r4 = r6
            goto L69
        L40:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            if (r4 == 0) goto L68
            r4 = 0
            goto L69
        L4a:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            if (r4 == 0) goto L68
            r4 = r2
            goto L69
        L54:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            if (r4 == 0) goto L68
            r4 = r3
            goto L69
        L5e:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            if (r4 == 0) goto L68
            r4 = r5
            goto L69
        L68:
            r4 = -1
        L69:
            if (r4 == 0) goto Lae
            if (r4 == r2) goto Lae
            if (r4 == r3) goto L9d
            if (r4 == r6) goto L8e
            if (r4 == r5) goto L8a
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r3.<init>()     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r3.append(r0)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            android.util.Log.v(r2, r0)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            goto Lae
        L8a:
            r7.a(r8, r9)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            goto Lae
        L8e:
            o.g r0 = new o.g     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            if (r1 == 0) goto Lae
            java.lang.Object r2 = r1.f1898c     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r2.add(r0)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            goto Lae
        L9d:
            o.f r0 = new o.f     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            android.util.SparseArray r1 = r7.a     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            int r2 = r0.a     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r1.put(r2, r0)     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            r1 = r0
            goto Lae
        Lab:
            r9.getName()     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
        Lae:
            int r0 = r9.next()     // Catch: java.io.IOException -> Lb4 org.xmlpull.v1.XmlPullParserException -> Lb9
            goto L1e
        Lb4:
            r7 = move-exception
            r7.printStackTrace()
            goto Lbd
        Lb9:
            r7 = move-exception
            r7.printStackTrace()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.<init>(android.content.Context, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ce, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r13, android.content.res.XmlResourceParser r14) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
