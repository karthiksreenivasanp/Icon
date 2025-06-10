package y;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h {
    public static final j.e a = new j.e(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2353b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2354c;

    /* renamed from: d, reason: collision with root package name */
    public static final j.k f2355d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2353b = threadPoolExecutor;
        f2354c = new Object();
        f2355d = new j.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y.g a(java.lang.String r7, android.content.Context r8, g.p r9, int r10) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            j.e r0 = y.h.a
            java.lang.Object r1 = r0.a(r7)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            y.g r7 = new y.g
            r7.<init>(r1)
            return r7
        L10:
            o0.j0 r9 = f1.e.O(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r9.f2028b
            int r9 = r9.a
            if (r9 == 0) goto L21
            if (r9 == r1) goto L1f
            goto L37
        L1f:
            r9 = -2
            goto L40
        L21:
            r9 = r3
            y.i[] r9 = (y.i[]) r9
            if (r9 == 0) goto L3f
            int r4 = r9.length
            if (r4 != 0) goto L2a
            goto L3f
        L2a:
            int r1 = r9.length
            r4 = 0
            r5 = r4
        L2d:
            if (r5 >= r1) goto L3e
            r6 = r9[r5]
            int r6 = r6.f2359e
            if (r6 == 0) goto L3b
            if (r6 >= 0) goto L39
        L37:
            r9 = r2
            goto L40
        L39:
            r9 = r6
            goto L40
        L3b:
            int r5 = r5 + 1
            goto L2d
        L3e:
            r1 = r4
        L3f:
            r9 = r1
        L40:
            if (r9 == 0) goto L48
            y.g r7 = new y.g
            r7.<init>(r9)
            return r7
        L48:
            y.i[] r3 = (y.i[]) r3
            u.h r9 = u.g.a
            android.graphics.Typeface r8 = r9.r(r8, r3, r10)
            if (r8 == 0) goto L5b
            r0.b(r7, r8)
            y.g r7 = new y.g
            r7.<init>(r8)
            return r7
        L5b:
            y.g r7 = new y.g
            r7.<init>(r2)
            return r7
        L61:
            y.g r7 = new y.g
            r8 = -1
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y.h.a(java.lang.String, android.content.Context, g.p, int):y.g");
    }
}
