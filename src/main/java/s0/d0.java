package s0;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class d0 implements e0 {
    public final WindowId a;

    public d0(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d0) && ((d0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
