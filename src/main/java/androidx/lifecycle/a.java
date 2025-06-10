package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f360b;

    public a(HashMap map) {
        this.f360b = map;
        for (Map.Entry entry : map.entrySet()) {
            j jVar = (j) entry.getValue();
            List arrayList = (List) this.a.get(jVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(jVar, arrayList);
            }
            arrayList.add((b) entry.getKey());
        }
    }

    public static void a(List list, p pVar, j jVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                bVar.getClass();
                try {
                    int i2 = bVar.a;
                    Method method = bVar.f361b;
                    if (i2 == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i2 == 1) {
                        method.invoke(obj, pVar);
                    } else if (i2 == 2) {
                        method.invoke(obj, pVar, jVar);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
