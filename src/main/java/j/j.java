package j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class j {
    public g a;

    /* renamed from: b, reason: collision with root package name */
    public g f1456b;

    /* renamed from: c, reason: collision with root package name */
    public i f1457c;

    public static boolean g(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean h(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i2, int i3);

    public abstract b c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract void f(int i2);

    public final Object[] i(int i2, Object[] objArr) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i3 = 0; i3 < iD; i3++) {
            objArr[i3] = b(i3, i2);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }
}
