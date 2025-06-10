package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements n {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final a f359b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.f359b = c.f362c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.n
    public final void b(p pVar, j jVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f359b.a;
        List list = (List) map.get(jVar);
        Object obj = this.a;
        a.a(list, pVar, jVar, obj);
        a.a((List) map.get(j.ON_ANY), pVar, jVar, obj);
    }
}
