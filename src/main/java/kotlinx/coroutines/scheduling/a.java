package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1498h = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
    public final m a;

    /* renamed from: b, reason: collision with root package name */
    public int f1499b;

    /* renamed from: c, reason: collision with root package name */
    public long f1500c;

    /* renamed from: d, reason: collision with root package name */
    public long f1501d;

    /* renamed from: e, reason: collision with root package name */
    public int f1502e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1504g;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    volatile /* synthetic */ int workerCtl;

    public a(b bVar, int i2) {
        this.f1504g = bVar;
        this.f1504g = bVar;
        setDaemon(true);
        this.a = new m();
        this.f1499b = 4;
        this.workerCtl = 0;
        this.nextParkedWorker = b.k;
        this.f1502e = v1.e.a.a();
        f(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.scheduling.h a(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.f1499b
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7
            goto L2e
        L7:
            kotlinx.coroutines.scheduling.b r0 = r9.f1504g
        L9:
            long r5 = r0.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r5
            r7 = 42
            long r3 = r3 >> r7
            int r3 = (int) r3
            if (r3 != 0) goto L19
            r0 = r2
            goto L2a
        L19:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r7 = r5 - r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.b.f1506i
            r4 = r0
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto L9
            r0 = r1
        L2a:
            if (r0 == 0) goto L30
            r9.f1499b = r1
        L2e:
            r0 = r1
            goto L31
        L30:
            r0 = r2
        L31:
            r3 = 0
            if (r0 == 0) goto L77
            if (r10 == 0) goto L6c
            kotlinx.coroutines.scheduling.b r10 = r9.f1504g
            int r10 = r10.a
            int r10 = r10 * 2
            int r10 = r9.d(r10)
            if (r10 != 0) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 == 0) goto L4c
            kotlinx.coroutines.scheduling.h r10 = r9.e()
            if (r10 != 0) goto L76
        L4c:
            kotlinx.coroutines.scheduling.m r10 = r9.a
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.m.f1528b
            java.lang.Object r0 = r0.getAndSet(r10, r3)
            kotlinx.coroutines.scheduling.h r0 = (kotlinx.coroutines.scheduling.h) r0
            if (r0 != 0) goto L60
            kotlinx.coroutines.scheduling.h r10 = r10.d()
            goto L61
        L60:
            r10 = r0
        L61:
            if (r10 != 0) goto L76
            if (r1 != 0) goto L72
            kotlinx.coroutines.scheduling.h r10 = r9.e()
            if (r10 != 0) goto L76
            goto L72
        L6c:
            kotlinx.coroutines.scheduling.h r10 = r9.e()
            if (r10 != 0) goto L76
        L72:
            kotlinx.coroutines.scheduling.h r10 = r9.i(r2)
        L76:
            return r10
        L77:
            if (r10 == 0) goto L8e
            kotlinx.coroutines.scheduling.m r10 = r9.a
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.m.f1528b
            java.lang.Object r0 = r0.getAndSet(r10, r3)
            kotlinx.coroutines.scheduling.h r0 = (kotlinx.coroutines.scheduling.h) r0
            if (r0 != 0) goto L8c
            kotlinx.coroutines.scheduling.h r0 = r10.d()
        L8c:
            if (r0 != 0) goto L99
        L8e:
            kotlinx.coroutines.scheduling.b r10 = r9.f1504g
            kotlinx.coroutines.scheduling.e r10 = r10.f1512f
            java.lang.Object r10 = r10.d()
            r0 = r10
            kotlinx.coroutines.scheduling.h r0 = (kotlinx.coroutines.scheduling.h) r0
        L99:
            if (r0 != 0) goto L9f
            kotlinx.coroutines.scheduling.h r0 = r9.i(r1)
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.a(boolean):kotlinx.coroutines.scheduling.h");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f1502e;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1502e = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
    }

    public final h e() {
        e eVar;
        int iD = d(2);
        b bVar = this.f1504g;
        if (iD == 0) {
            h hVar = (h) bVar.f1511e.d();
            if (hVar != null) {
                return hVar;
            }
            eVar = bVar.f1512f;
        } else {
            h hVar2 = (h) bVar.f1512f.d();
            if (hVar2 != null) {
                return hVar2;
            }
            eVar = bVar.f1511e;
        }
        return (h) eVar.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1504g.f1510d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1499b;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f1506i.addAndGet(this.f1504g, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1499b = i2;
        }
        return z2;
    }

    public final h i(boolean z2) {
        long jF;
        int i2 = (int) (this.f1504g.controlState & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        b bVar = this.f1504g;
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            i3++;
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            a aVar = (a) bVar.f1513g.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = this.a;
                m mVar2 = aVar.a;
                if (z2) {
                    jF = mVar.e(mVar2);
                } else {
                    mVar.getClass();
                    h hVarD = mVar2.d();
                    if (hVarD != null) {
                        mVar.a(hVarD, false);
                        jF = -1;
                    } else {
                        jF = mVar.f(mVar2, false);
                    }
                }
                if (jF == -1) {
                    m mVar3 = this.a;
                    mVar3.getClass();
                    h hVar = (h) m.f1528b.getAndSet(mVar3, null);
                    return hVar == null ? mVar3.d() : hVar;
                }
                if (jF > 0) {
                    jMin = Math.min(jMin, jF);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f1501d = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x014c, code lost:
    
        h(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014f, code lost:
    
        return;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.run():void");
    }
}
