package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1508b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1509c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f1510d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1511e;

    /* renamed from: f, reason: collision with root package name */
    public final e f1512f;

    /* renamed from: g, reason: collision with root package name */
    public final b2.g f1513g;
    private volatile /* synthetic */ long parkedWorkersStack;
    public static final k1.b k = new k1.b("NOT_IN_STACK");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1505h = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1506i = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1507j = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    public b(int i2, int i3, long j2, String str) {
        this.a = i2;
        this.f1508b = i3;
        this.f1509c = j2;
        this.f1510d = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f1511e = new e();
        this.f1512f = new e();
        this.parkedWorkersStack = 0L;
        this.f1513g = new b2.g(i2 + 1);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f1513g) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 >= this.a) {
                return 0;
            }
            if (i2 >= this.f1508b) {
                return 0;
            }
            int i4 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i4 > 0 && this.f1513g.b(i4) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            a aVar = new a(this, i4);
            this.f1513g.c(i4, aVar);
            if (!(i4 == ((int) (2097151 & f1506i.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            aVar.start();
            return i3 + 1;
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z2) {
        h jVar;
        h hVarA;
        int i2;
        k.f1524e.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.a = jNanoTime;
            jVar.f1519b = iVar;
        } else {
            jVar = new j(runnable, jNanoTime, iVar);
        }
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = null;
        a aVar2 = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar2 != null && f1.e.f(aVar2.f1504g, this)) {
            aVar = aVar2;
        }
        if (aVar == null || (i2 = aVar.f1499b) == 5 || (jVar.f1519b.a == 0 && i2 == 2)) {
            hVarA = jVar;
        } else {
            aVar.f1503f = true;
            hVarA = aVar.a.a(jVar, z2);
        }
        if (hVarA != null) {
            if (!(hVarA.f1519b.a == 1 ? this.f1512f : this.f1511e).a(hVarA)) {
                throw new RejectedExecutionException(f1.e.F0(" was terminated", this.f1510d));
            }
        }
        boolean z3 = z2 && aVar != null;
        if (jVar.f1519b.a == 0) {
            if (z3 || g() || f(this.controlState)) {
                return;
            }
            g();
            return;
        }
        long jAddAndGet = f1506i.addAndGet(this, 2097152L);
        if (z3 || g() || f(jAddAndGet)) {
            return;
        }
        g();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean c() {
        return this._isTerminated;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i2;
        boolean z2;
        if (f1507j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !f1.e.f(aVar.f1504g, this)) {
                aVar = null;
            }
            synchronized (this.f1513g) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    Object objB = this.f1513g.b(i3);
                    if (objB == null) {
                        NullPointerException nullPointerException = new NullPointerException();
                        f1.e.A0(nullPointerException);
                        throw nullPointerException;
                    }
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.a;
                        e eVar = this.f1512f;
                        mVar.getClass();
                        h hVar = (h) m.f1528b.getAndSet(mVar, null);
                        if (hVar != null) {
                            eVar.a(hVar);
                        }
                        do {
                            h hVarD = mVar.d();
                            if (hVarD == null) {
                                z2 = false;
                            } else {
                                eVar.a(hVarD);
                                z2 = true;
                            }
                        } while (z2);
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            this.f1512f.b();
            this.f1511e.b();
            while (true) {
                h hVarA = aVar == null ? null : aVar.a(true);
                if (hVarA == null && (hVarA = (h) this.f1511e.d()) == null && (hVarA = (h) this.f1512f.d()) == null) {
                    break;
                }
                try {
                    ((j) hVarA).run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void d(a aVar) {
        long j2;
        int iB;
        if (aVar.c() != k) {
            return;
        }
        do {
            j2 = this.parkedWorkersStack;
            iB = aVar.b();
            aVar.g(this.f1513g.b((int) (2097151 & j2)));
        } while (!f1505h.compareAndSet(this, j2, iB | ((2097152 + j2) & (-2097152))));
    }

    public final void e(a aVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    a aVar2 = aVar;
                    while (true) {
                        Object objC = aVar2.c();
                        if (objC == k) {
                            i4 = -1;
                            break;
                        }
                        if (objC == null) {
                            i4 = 0;
                            break;
                        }
                        aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i4 = iB;
                            break;
                        }
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0 && f1505h.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f1525f, false);
    }

    public final boolean f(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.a;
        if (i2 < i3) {
            int iA = a();
            if (iA == 1 && i3 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        k1.b bVar;
        int iB;
        while (true) {
            long j2 = this.parkedWorkersStack;
            a aVar = (a) this.f1513g.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                a aVar2 = aVar;
                while (true) {
                    Object objC = aVar2.c();
                    bVar = k;
                    if (objC == bVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                }
                if (iB >= 0 && f1505h.compareAndSet(this, j2, iB | j3)) {
                    aVar.g(bVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1498h.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        char c2;
        ArrayList arrayList = new ArrayList();
        int iA = this.f1513g.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i7 < iA) {
            int i8 = i7 + 1;
            a aVar = (a) this.f1513g.b(i7);
            if (aVar != null) {
                int iC = aVar.a.c();
                int iA2 = l.k.a(aVar.f1499b);
                if (iA2 == 0) {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(iC);
                    c2 = 'c';
                } else if (iA2 == 1) {
                    i3++;
                    sb = new StringBuilder();
                    sb.append(iC);
                    c2 = 'b';
                } else if (iA2 == 2) {
                    i4++;
                } else if (iA2 == 3) {
                    i5++;
                    if (iC > 0) {
                        sb = new StringBuilder();
                        sb.append(iC);
                        c2 = 'd';
                    }
                } else if (iA2 == 4) {
                    i6++;
                }
                sb.append(c2);
                arrayList.add(sb.toString());
            }
            i7 = i8;
        }
        long j2 = this.controlState;
        return this.f1510d + '@' + Integer.toHexString(System.identityHashCode(this)) + "[Pool Size {core = " + this.a + ", max = " + this.f1508b + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f1511e.c() + ", global blocking queue size = " + this.f1512f.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.a - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }
}
