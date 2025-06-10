package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1528b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1529c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1530d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1531e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final h a(h hVar, boolean z2) {
        if (z2) {
            return b(hVar);
        }
        h hVar2 = (h) f1528b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (hVar.f1519b.a == 1) {
            f1531e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return hVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.a.get(i2) != null) {
            Thread.yield();
        }
        this.a.lazySet(i2, hVar);
        f1529c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final h d() {
        h hVar;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f1530d.compareAndSet(this, i2, i2 + 1) && (hVar = (h) this.a.getAndSet(i3, null)) != null) {
                if (hVar.f1519b.a == 1) {
                    f1531e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return f(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(kotlinx.coroutines.scheduling.m r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.a
        L6:
            r3 = 1
            if (r0 == r1) goto L38
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 != 0) goto L10
            goto L38
        L10:
            java.lang.Object r5 = r2.get(r4)
            kotlinx.coroutines.scheduling.h r5 = (kotlinx.coroutines.scheduling.h) r5
            if (r5 == 0) goto L35
            kotlinx.coroutines.scheduling.i r6 = r5.f1519b
            int r6 = r6.a
            r7 = 0
            if (r6 != r3) goto L20
            goto L21
        L20:
            r3 = r7
        L21:
            if (r3 == 0) goto L35
            r3 = 0
            boolean r3 = r2.compareAndSet(r4, r5, r3)
            if (r3 == 0) goto L35
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.m.f1531e
            r0.decrementAndGet(r9)
            r8.a(r5, r7)
            r8 = -1
            return r8
        L35:
            int r0 = r0 + 1
            goto L6
        L38:
            long r8 = r8.f(r9, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.m.e(kotlinx.coroutines.scheduling.m):long");
    }

    public final long f(m mVar, boolean z2) {
        h hVar;
        do {
            hVar = (h) mVar.lastScheduledTask;
            if (hVar == null) {
                return -2L;
            }
            if (z2) {
                if (!(hVar.f1519b.a == 1)) {
                    return -2L;
                }
            }
            k.f1524e.getClass();
            long jNanoTime = System.nanoTime() - hVar.a;
            long j2 = k.a;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
        } while (!f1528b.compareAndSet(mVar, hVar, null));
        a(hVar, false);
        return -1L;
    }
}
