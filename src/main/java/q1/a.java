package q1;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {
    public static final Method a;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    static {
        /*
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.reflect.Method[] r1 = r0.getMethods()
            java.lang.String r2 = "throwableMethods"
            f1.e.q(r1, r2)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Le:
            r5 = 0
            if (r4 >= r2) goto L3d
            r6 = r1[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "addSuppressed"
            boolean r7 = f1.e.f(r7, r8)
            if (r7 == 0) goto L35
            java.lang.Class[] r7 = r6.getParameterTypes()
            java.lang.String r8 = "it.parameterTypes"
            f1.e.q(r7, r8)
            int r8 = r7.length
            r9 = 1
            if (r8 != r9) goto L2e
            r5 = r7[r3]
        L2e:
            boolean r5 = f1.e.f(r5, r0)
            if (r5 == 0) goto L35
            goto L36
        L35:
            r9 = r3
        L36:
            if (r9 == 0) goto L3a
            r5 = r6
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto Le
        L3d:
            q1.a.a = r5
            int r0 = r1.length
        L40:
            if (r3 >= r0) goto L54
            r2 = r1[r3]
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "getSuppressed"
            boolean r2 = f1.e.f(r2, r4)
            if (r2 == 0) goto L51
            goto L54
        L51:
            int r3 = r3 + 1
            goto L40
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.a.<clinit>():void");
    }
}
