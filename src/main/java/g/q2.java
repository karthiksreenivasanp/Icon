package g;

import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class q2 implements n, f.j {
    public final /* synthetic */ Toolbar a;

    public /* synthetic */ q2(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // f.j
    public final void e() {
        this.a.getClass();
    }

    @Override // f.j
    public final void f(f.l lVar) {
        Toolbar toolbar = this.a;
        k kVar = toolbar.a.f100s;
        boolean z2 = false;
        if (kVar != null) {
            f fVar = kVar.f1120r;
            if (fVar != null && fVar.b()) {
                z2 = true;
            }
        }
        if (z2) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.G.f1077b).iterator();
        if (it.hasNext()) {
            androidx.activity.result.a.d(it.next());
            throw null;
        }
    }
}
