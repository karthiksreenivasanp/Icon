package androidx.fragment.app;

import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {
    public final /* synthetic */ p a;

    public /* synthetic */ m(p pVar, int i2) {
        this.a = pVar;
    }

    public final void a(k kVar, f1.e eVar) {
        synchronized (eVar) {
            eVar.getClass();
        }
        Map map = this.a.f329e;
        HashSet hashSet = (HashSet) map.get(kVar);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            map.remove(kVar);
            if (kVar.a >= 5) {
                return;
            }
            kVar.g();
            throw null;
        }
    }
}
