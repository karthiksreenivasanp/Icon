package p1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {
    public static final j a = new j();

    @Override // p1.i
    public final Object fold(Object obj, t1.b bVar) {
        return obj;
    }

    @Override // p1.i
    public final g get(h hVar) {
        f1.e.r(hVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p1.i
    public final i minusKey(h hVar) {
        f1.e.r(hVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
