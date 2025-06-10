package s0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public final View f2245b;
    public final HashMap a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2246c = new ArrayList();

    public t(View view) {
        this.f2245b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2245b == tVar.f2245b && this.a.equals(tVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.f2245b.hashCode() * 31);
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2245b + "\n") + "    values:";
        HashMap map = this.a;
        for (String str2 : map.keySet()) {
            str = str + "    " + str2 + ": " + map.get(str2) + "\n";
        }
        return str;
    }
}
