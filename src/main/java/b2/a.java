package b2;

import kotlinx.coroutines.scheduling.l;
import p1.i;

/* loaded from: classes.dex */
public final class a extends z1.c implements Runnable, z1.h {

    /* renamed from: b, reason: collision with root package name */
    public final z1.c f505b;

    /* renamed from: c, reason: collision with root package name */
    public final int f506c;

    /* renamed from: d, reason: collision with root package name */
    public final b f507d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f508e;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public a(l lVar, int i2) {
        this.f505b = lVar;
        this.f506c = i2;
        if ((lVar instanceof z1.h ? (z1.h) lVar : null) == null) {
            int i3 = z1.g.a;
        }
        this.f507d = new b();
        this.f508e = new Object();
    }

    @Override // z1.c
    public final void a(i iVar, Runnable runnable) {
        this.f507d.a(runnable);
        boolean z2 = true;
        if (this.runningWorkers >= this.f506c) {
            return;
        }
        synchronized (this.f508e) {
            if (this.runningWorkers >= this.f506c) {
                z2 = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (z2) {
            this.f505b.a(this, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        r0 = r2.f508e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        r2.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r2.f507d.c() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r2.runningWorkers++;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r2 = this;
        L0:
            r0 = 0
        L1:
            b2.b r1 = r2.f507d
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L27
            r1.run()     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r1 = move-exception
            z1.e.a(r1)
        L13:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            z1.c r1 = r2.f505b
            boolean r1 = r1.b()
            if (r1 == 0) goto L1
            z1.c r0 = r2.f505b
            r0.a(r2, r2)
            return
        L27:
            java.lang.Object r0 = r2.f508e
            monitor-enter(r0)
            int r1 = r2.runningWorkers     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + (-1)
            r2.runningWorkers = r1     // Catch: java.lang.Throwable -> L42
            b2.b r1 = r2.f507d     // Catch: java.lang.Throwable -> L42
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L3a
            monitor-exit(r0)
            return
        L3a:
            int r1 = r2.runningWorkers     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + 1
            r2.runningWorkers = r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            goto L0
        L42:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.run():void");
    }
}
