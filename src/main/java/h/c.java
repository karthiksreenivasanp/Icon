package h;

import android.os.Looper;
import f1.e;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: s, reason: collision with root package name */
    public final Object f1287s = new Object();

    public c() {
        Executors.newFixedThreadPool(4, new b());
    }

    public final boolean N0() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
