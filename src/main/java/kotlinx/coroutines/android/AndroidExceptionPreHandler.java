package kotlinx.coroutines.android;

import androidx.annotation.Keep;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p1.a;
import p1.e;
import p1.i;
import z1.d;

@Keep
/* loaded from: classes.dex */
public final class AndroidExceptionPreHandler extends a implements d {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(e.f2162c);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z2 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z2 = true;
                }
            }
            if (z2) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // z1.d
    public void handleException(i iVar, Throwable th) {
    }
}
