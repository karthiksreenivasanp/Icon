package b0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class s0 extends r0 {
    public s0(x0 x0Var, WindowInsets windowInsets) {
        super(x0Var, windowInsets);
    }

    @Override // b0.v0
    public x0 a() {
        return x0.d(null, this.f498c.consumeDisplayCutout());
    }

    @Override // b0.v0
    public d e() {
        DisplayCutout displayCutout = this.f498c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new d(displayCutout);
    }

    @Override // b0.v0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (Objects.equals(this.f498c, s0Var.f498c)) {
            s0Var.getClass();
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // b0.v0
    public int hashCode() {
        return this.f498c.hashCode();
    }
}
