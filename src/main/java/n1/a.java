package n1;

import f1.e;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a implements Serializable {
    public final Throwable a;

    public a(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (e.f(this.a, ((a) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
