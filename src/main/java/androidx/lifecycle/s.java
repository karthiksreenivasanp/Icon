package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class s {
    public static final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f379b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            androidx.activity.result.a.d(constructor.newInstance(obj));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.lang.Class r12) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.s.c(java.lang.Class):int");
    }
}
