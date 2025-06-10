package z1;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    public static final List a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [y1.a] */
    static {
        Iterator itG = androidx.activity.result.a.g();
        f1.e.r(itG, "<this>");
        y1.d dVar = new y1.d(itG);
        if (!(dVar instanceof y1.a)) {
            dVar = new y1.a(dVar);
        }
        a = y1.c.N0(dVar);
    }

    public static final void a(Throwable th) {
        Throwable runtimeException;
        p1.j jVar = p1.j.a;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).handleException(jVar, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    f1.e.c(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            f1.e.c(th, new i());
        } catch (Throwable unused) {
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
