package q0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.nothing.icon.R;
import f1.e;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f2180d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2181e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2183c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2182b = new HashSet();
    public final HashMap a = new HashMap();

    public a(Context context) {
        this.f2183c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f2180d == null) {
            synchronized (f2181e) {
                if (f2180d == null) {
                    f2180d = new a(context);
                }
            }
        }
        return f2180d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f2183c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f2182b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new c(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        boolean zBooleanValue;
        Object objB;
        if (e.f1026b == null) {
            zBooleanValue = Trace.isEnabled();
        } else {
            try {
                if (e.f1026b == null) {
                    e.a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    e.f1026b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) e.f1026b.invoke(null, Long.valueOf(e.a))).booleanValue();
            } catch (Exception e2) {
                if (e2 instanceof InvocationTargetException) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                zBooleanValue = false;
            }
        }
        if (zBooleanValue) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        HashMap map = this.a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f2183c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th) {
                throw new c(th);
            }
        }
        return objB;
    }
}
