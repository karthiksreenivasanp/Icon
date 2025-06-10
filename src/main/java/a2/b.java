package a2;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class b {
    private static volatile Choreographer choreographer;

    static {
        Object aVar;
        try {
            aVar = new a(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            aVar = new n1.a(th);
        }
        if (aVar instanceof n1.a) {
            aVar = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (objInvoke != null) {
            return (Handler) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
