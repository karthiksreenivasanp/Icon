package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends z.f {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f373d;

    /* renamed from: b, reason: collision with root package name */
    public i.a f371b = new i.a();

    /* renamed from: e, reason: collision with root package name */
    public int f374e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f375f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f376g = false;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f377h = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public k f372c = k.INITIALIZED;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f378i = true;

    public r(p pVar) {
        this.f373d = new WeakReference(pVar);
    }

    @Override // z.f
    public final void c(o oVar) {
        f("removeObserver");
        this.f371b.b(oVar);
    }

    public final void d(o oVar) {
        p pVar;
        f("addObserver");
        k kVar = this.f372c;
        k kVar2 = k.DESTROYED;
        if (kVar != kVar2) {
            kVar2 = k.INITIALIZED;
        }
        q qVar = new q(oVar, kVar2);
        if (((q) this.f371b.c(oVar, qVar)) == null && (pVar = (p) this.f373d.get()) != null) {
            boolean z2 = this.f374e != 0 || this.f375f;
            k kVarE = e(oVar);
            this.f374e++;
            while (qVar.a.compareTo(kVarE) < 0 && this.f371b.f1299e.containsKey(oVar)) {
                k kVar3 = qVar.a;
                ArrayList arrayList = this.f377h;
                arrayList.add(kVar3);
                int iOrdinal = qVar.a.ordinal();
                j jVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : j.ON_RESUME : j.ON_START : j.ON_CREATE;
                if (jVar == null) {
                    throw new IllegalStateException("no event up from " + qVar.a);
                }
                qVar.a(pVar, jVar);
                arrayList.remove(arrayList.size() - 1);
                kVarE = e(oVar);
            }
            if (!z2) {
                h();
            }
            this.f374e--;
        }
    }

    public final k e(o oVar) {
        i.a aVar = this.f371b;
        i.c cVar = aVar.f1299e.containsKey(oVar) ? ((i.c) aVar.f1299e.get(oVar)).f1303d : null;
        k kVar = cVar != null ? ((q) cVar.f1301b).a : null;
        ArrayList arrayList = this.f377h;
        k kVar2 = arrayList.isEmpty() ? null : (k) arrayList.get(arrayList.size() - 1);
        k kVar3 = this.f372c;
        if (kVar == null || kVar.compareTo(kVar3) >= 0) {
            kVar = kVar3;
        }
        return (kVar2 == null || kVar2.compareTo(kVar) >= 0) ? kVar : kVar2;
    }

    public final void f(String str) {
        if (this.f378i) {
            if (h.a.f1285t == null) {
                synchronized (h.a.class) {
                    if (h.a.f1285t == null) {
                        h.a.f1285t = new h.a();
                    }
                }
            }
            if (h.a.f1285t.N0()) {
                return;
            }
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    public final void g(j jVar) {
        f("handleLifecycleEvent");
        k kVarA = jVar.a();
        k kVar = this.f372c;
        if (kVar == kVarA) {
            return;
        }
        k kVar2 = k.INITIALIZED;
        k kVar3 = k.DESTROYED;
        if (kVar == kVar2 && kVarA == kVar3) {
            throw new IllegalStateException("no event down from " + this.f372c);
        }
        this.f372c = kVarA;
        if (this.f375f || this.f374e != 0) {
            this.f376g = true;
            return;
        }
        this.f375f = true;
        h();
        this.f375f = false;
        if (this.f372c == kVar3) {
            this.f371b = new i.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0057, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f7, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.r.h():void");
    }
}
