package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends z1.m implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final c f1514b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final b2.a f1515c;

    static {
        l lVar = l.f1527b;
        int i2 = b2.h.a;
        if (64 >= i2) {
            i2 = 64;
        }
        int iH0 = f1.e.H0("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (!(iH0 >= 1)) {
            throw new IllegalArgumentException(f1.e.F0(Integer.valueOf(iH0), "Expected positive parallelism level, but got ").toString());
        }
        f1515c = new b2.a(lVar, iH0);
    }

    @Override // z1.c
    public final void a(p1.i iVar, Runnable runnable) {
        f1515c.a(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(p1.j.a, runnable);
    }

    @Override // z1.c
    public final String toString() {
        return "Dispatchers.IO";
    }
}
