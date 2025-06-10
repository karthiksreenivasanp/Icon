package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class q {
    public k a;

    /* renamed from: b, reason: collision with root package name */
    public final n f370b;

    public q(o oVar, k kVar) {
        n reflectiveGenericLifecycleObserver;
        HashMap map = s.a;
        boolean z2 = oVar instanceof n;
        boolean z3 = oVar instanceof d;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((d) oVar, (n) oVar);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((d) oVar, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (n) oVar;
        } else {
            Class<?> cls = oVar.getClass();
            if (s.c(cls) == 2) {
                List list = (List) s.f379b.get(cls);
                if (list.size() == 1) {
                    s.a((Constructor) list.get(0), oVar);
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver();
                } else {
                    g[] gVarArr = new g[list.size()];
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        s.a((Constructor) list.get(i2), oVar);
                        gVarArr[i2] = null;
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(oVar);
            }
        }
        this.f370b = reflectiveGenericLifecycleObserver;
        this.a = kVar;
    }

    public final void a(p pVar, j jVar) {
        k kVarA = jVar.a();
        k kVar = this.a;
        if (kVarA.compareTo(kVar) < 0) {
            kVar = kVarA;
        }
        this.a = kVar;
        this.f370b.b(pVar, jVar);
        this.a = kVarA;
    }
}
