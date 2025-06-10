package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f362c = new c();
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f363b = new HashMap();

    public static void c(HashMap map, b bVar, j jVar, Class cls) {
        j jVar2 = (j) map.get(bVar);
        if (jVar2 == null || jVar == jVar2) {
            if (jVar2 == null) {
                map.put(bVar, jVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f361b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + jVar2 + ", new value " + jVar);
    }

    public final a a(Class cls, Method[] methodArr) throws SecurityException {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).f360b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f360b.entrySet()) {
                c(map, (b) entry.getKey(), (j) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            u uVar = (u) method.getAnnotation(u.class);
            if (uVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(p.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                j jVarValue = uVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(j.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (jVarValue != j.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(map, new b(i2, method), jVarValue, cls);
                z2 = true;
            }
        }
        a aVar = new a(map);
        this.a.put(cls, aVar);
        this.f363b.put(cls, Boolean.valueOf(z2));
        return aVar;
    }

    public final a b(Class cls) {
        a aVar = (a) this.a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }
}
