package p0;

import i.g;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class a implements c {
    public final LinkedHashSet a;

    public a(d dVar) {
        Object obj;
        f1.e.r(dVar, "registry");
        this.a = new LinkedHashSet();
        g gVar = dVar.a;
        i.c cVarA = gVar.a("androidx.savedstate.Restarter");
        if (cVarA != null) {
            obj = cVarA.f1301b;
        } else {
            i.c cVar = new i.c("androidx.savedstate.Restarter", this);
            gVar.f1309d++;
            i.c cVar2 = gVar.f1307b;
            if (cVar2 == null) {
                gVar.a = cVar;
            } else {
                cVar2.f1302c = cVar;
                cVar.f1303d = cVar2;
            }
            gVar.f1307b = cVar;
            obj = null;
        }
        if (!(((c) obj) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }
}
