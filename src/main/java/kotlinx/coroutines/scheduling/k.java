package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {
    public static final long a = f1.e.G0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1521b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1522c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f1523d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f1524e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f1525f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f1526g;

    static {
        int i2 = b2.h.a;
        if (i2 < 2) {
            i2 = 2;
        }
        f1521b = f1.e.H0("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        f1522c = f1.e.H0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f1523d = TimeUnit.SECONDS.toNanos(f1.e.G0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1524e = f.f1517s;
        f1525f = new i(0);
        f1526g = new i(1);
    }
}
