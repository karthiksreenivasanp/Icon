package b2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new d(8, false);

    public final boolean a(Object obj) {
        while (true) {
            d dVar = (d) this._cur;
            int iA = dVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                a.compareAndSet(this, dVar, dVar.e());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            d dVar = (d) this._cur;
            if (dVar.b()) {
                return;
            } else {
                a.compareAndSet(this, dVar, dVar.e());
            }
        }
    }

    public final int c() {
        return ((d) this._cur).c();
    }

    public final Object d() {
        while (true) {
            d dVar = (d) this._cur;
            Object objF = dVar.f();
            if (objF != d.f511g) {
                return objF;
            }
            a.compareAndSet(this, dVar, dVar.e());
        }
    }
}
