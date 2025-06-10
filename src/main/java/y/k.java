package y;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class k implements ThreadFactory {
    public final String a = "fonts-androidx";

    /* renamed from: b, reason: collision with root package name */
    public final int f2360b = 10;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new j(runnable, this.a, this.f2360b);
    }
}
