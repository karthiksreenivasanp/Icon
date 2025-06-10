package z1;

/* loaded from: classes.dex */
public abstract class g {
    public static final /* synthetic */ int a = 0;

    static {
        String property;
        int i2 = b2.h.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null ? false : Boolean.parseBoolean(property)) {
            kotlinx.coroutines.scheduling.c cVar = j.a;
            p1.g gVar = b2.f.a;
            a2.a aVar = ((a2.a) gVar).f27e;
            if (gVar instanceof h) {
                return;
            }
        }
        f fVar = f.f2399c;
    }
}
