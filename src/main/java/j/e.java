package j;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class e {
    public final LinkedHashMap a;

    /* renamed from: b, reason: collision with root package name */
    public int f1444b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1445c;

    /* renamed from: d, reason: collision with root package name */
    public int f1446d;

    /* renamed from: e, reason: collision with root package name */
    public int f1447e;

    public e(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1445c = i2;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.a.get(obj);
            if (obj2 != null) {
                this.f1446d++;
                return obj2;
            }
            this.f1447e++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L83
            monitor-enter(r2)
            int r0 = r2.f1444b     // Catch: java.lang.Throwable -> L80
            int r0 = r0 + 1
            r2.f1444b = r0     // Catch: java.lang.Throwable -> L80
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L17
            int r4 = r2.f1444b     // Catch: java.lang.Throwable -> L80
            int r4 = r4 + (-1)
            r2.f1444b = r4     // Catch: java.lang.Throwable -> L80
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            int r4 = r2.f1445c
        L1a:
            monitor-enter(r2)
            int r0 = r2.f1444b     // Catch: java.lang.Throwable -> L7d
            if (r0 < 0) goto L5e
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L2b
            int r0 = r2.f1444b     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L5e
        L2b:
            int r0 = r2.f1444b     // Catch: java.lang.Throwable -> L7d
            if (r0 <= r4) goto L5c
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L38
            goto L5c
        L38:
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L7d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L7d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L7d
            r0.getValue()     // Catch: java.lang.Throwable -> L7d
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L7d
            r0.remove(r1)     // Catch: java.lang.Throwable -> L7d
            int r0 = r2.f1444b     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + (-1)
            r2.f1444b = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            goto L1a
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            return r3
        L5e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L7d
            r4.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7d
            throw r3     // Catch: java.lang.Throwable -> L7d
        L7d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r3
        L80:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            throw r3
        L83:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "key == null || value == null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.e.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f1446d;
        i3 = this.f1447e + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1445c), Integer.valueOf(this.f1446d), Integer.valueOf(this.f1447e), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
