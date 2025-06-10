package z;

import androidx.lifecycle.o;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class f {
    public final Object a;

    public f() {
        this.a = new AtomicReference();
    }

    public abstract boolean a();

    public final boolean b(CharSequence charSequence, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        e eVar = (e) this.a;
        if (eVar == null) {
            return a();
        }
        int iA = eVar.a(charSequence, i2);
        if (iA == 0) {
            return true;
        }
        if (iA != 1) {
            return a();
        }
        return false;
    }

    public abstract void c(o oVar);

    public f(p1.e eVar) {
        this.a = eVar;
    }
}
