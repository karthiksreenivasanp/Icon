package u1;

/* loaded from: classes.dex */
public abstract class b {
    public static final c a;

    static {
        c cVar = null;
        try {
            cVar = (c) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (cVar == null) {
            cVar = new c();
        }
        a = cVar;
    }
}
