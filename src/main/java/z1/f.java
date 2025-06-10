package z1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class f extends k implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: c, reason: collision with root package name */
    public static final f f2399c = new f();

    /* renamed from: d, reason: collision with root package name */
    public static final long f2400d;
    private static volatile int debugStatus;

    static {
        Long l2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f2400d = timeUnit.toNanos(l2.longValue());
    }

    @Override // z1.l
    public final Thread c() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // z1.k
    public final void d(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.d(runnable);
    }

    public final synchronized void h() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            g();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        o.a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    z2 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z2 = true;
                }
            }
            if (!z2) {
                _thread = null;
                h();
                if (e()) {
                    return;
                }
                c();
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jF = f();
                if (jF == Long.MAX_VALUE) {
                    long jNanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f2400d + jNanoTime;
                    }
                    long j3 = j2 - jNanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        h();
                        if (e()) {
                            return;
                        }
                        c();
                        return;
                    }
                    if (jF > j3) {
                        jF = j3;
                    }
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (jF > 0) {
                    int i3 = debugStatus;
                    if (i3 == 2 || i3 == 3) {
                        _thread = null;
                        h();
                        if (e()) {
                            return;
                        }
                        c();
                        return;
                    }
                    LockSupport.parkNanos(this, jF);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            h();
            if (!e()) {
                c();
            }
            throw th;
        }
    }
}
