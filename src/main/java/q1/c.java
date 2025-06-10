package q1;

import f1.e;

/* loaded from: classes.dex */
public abstract class c {
    public static final b a;

    static {
        b bVar;
        Object objNewInstance;
        try {
            objNewInstance = s1.b.class.newInstance();
            e.q(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
        } catch (ClassNotFoundException unused) {
            Object objNewInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            e.q(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    bVar = (b) objNewInstance2;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader2 = b.class.getClassLoader();
                    if (e.f(classLoader, classLoader2)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e2);
                }
            } catch (ClassNotFoundException unused2) {
                Object objNewInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                e.q(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    bVar = (b) objNewInstance3;
                } catch (ClassCastException e3) {
                    ClassLoader classLoader3 = objNewInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = b.class.getClassLoader();
                    if (e.f(classLoader3, classLoader4)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e3);
                }
            }
        }
        try {
            try {
                bVar = (b) objNewInstance;
            } catch (ClassNotFoundException unused3) {
                Object objNewInstance4 = r1.b.class.newInstance();
                e.q(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        bVar = (b) objNewInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader5 = objNewInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = b.class.getClassLoader();
                        if (e.f(classLoader5, classLoader6)) {
                            throw e4;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e4);
                    }
                } catch (ClassNotFoundException unused4) {
                    bVar = new b();
                }
            }
            a = bVar;
        } catch (ClassCastException e5) {
            ClassLoader classLoader7 = objNewInstance.getClass().getClassLoader();
            ClassLoader classLoader8 = b.class.getClassLoader();
            if (e.f(classLoader7, classLoader8)) {
                throw e5;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e5);
        }
    }
}
