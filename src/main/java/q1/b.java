package q1;

import f1.e;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b {
    public void a(Throwable th, Throwable th2) {
        e.r(th, "cause");
        e.r(th2, "exception");
        Method method = a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public v1.e b() {
        return new v1.c();
    }
}
