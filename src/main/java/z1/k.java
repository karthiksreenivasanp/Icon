package z1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class k extends l implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2401b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_queue");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    static {
        AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_delayed");
    }

    @Override // z1.c
    public final void a(p1.i iVar, Runnable runnable) {
        d(runnable);
    }

    public void d(Runnable runnable) {
        boolean z2;
        while (true) {
            Object obj = this._queue;
            z2 = false;
            if (this._isCompleted != 0) {
                break;
            }
            if (obj == null) {
                if (f2401b.compareAndSet(this, null, runnable)) {
                    break;
                }
            } else if (obj instanceof b2.d) {
                b2.d dVar = (b2.d) obj;
                int iA = dVar.a(runnable);
                if (iA == 0) {
                    break;
                }
                if (iA == 1) {
                    f2401b.compareAndSet(this, obj, dVar.e());
                } else if (iA == 2) {
                    break;
                }
            } else {
                if (obj == f1.e.f1041r) {
                    break;
                }
                b2.d dVar2 = new b2.d(8, true);
                dVar2.a((Runnable) obj);
                dVar2.a(runnable);
                if (f2401b.compareAndSet(this, obj, dVar2)) {
                    break;
                }
            }
        }
        z2 = true;
        if (!z2) {
            f.f2399c.d(runnable);
            return;
        }
        Thread threadC = c();
        if (Thread.currentThread() != threadC) {
            LockSupport.unpark(threadC);
        }
    }

    public final boolean e() {
        androidx.activity.result.a.d(this._delayed);
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        return obj instanceof b2.d ? ((b2.d) obj).d() : obj == f1.e.f1041r;
    }

    public final long f() {
        Runnable runnable;
        androidx.activity.result.a.d(this._delayed);
        while (true) {
            Object obj = this._queue;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof b2.d)) {
                if (obj == f1.e.f1041r) {
                    break;
                }
                if (f2401b.compareAndSet(this, obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                b2.d dVar = (b2.d) obj;
                Object objF = dVar.f();
                if (objF != b2.d.f511g) {
                    runnable = (Runnable) objF;
                    break;
                }
                f2401b.compareAndSet(this, obj, dVar.e());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        Object obj2 = this._queue;
        if (obj2 == null) {
            androidx.activity.result.a.d(this._delayed);
        } else if (obj2 instanceof b2.d) {
            if (!((b2.d) obj2).d()) {
                return 0L;
            }
            androidx.activity.result.a.d(this._delayed);
        } else if (obj2 != f1.e.f1041r) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    public final void g() {
        this._queue = null;
        this._delayed = null;
    }
}
