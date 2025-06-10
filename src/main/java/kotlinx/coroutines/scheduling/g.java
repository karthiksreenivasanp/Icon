package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends z1.m {

    /* renamed from: b, reason: collision with root package name */
    public final b f1518b;

    public g(int i2, int i3, long j2) {
        this.f1518b = new b(i2, i3, j2, "DefaultDispatcher");
    }

    @Override // z1.c
    public final void a(p1.i iVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1505h;
        this.f1518b.b(runnable, k.f1525f, false);
    }
}
