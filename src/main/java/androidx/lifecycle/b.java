package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f361b;

    public b(int i2, Method method) throws SecurityException {
        this.a = i2;
        this.f361b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.f361b.getName().equals(bVar.f361b.getName());
    }

    public final int hashCode() {
        return this.f361b.getName().hashCode() + (this.a * 31);
    }
}
