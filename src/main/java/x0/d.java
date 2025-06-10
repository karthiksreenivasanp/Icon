package x0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class d extends q.a {
    public e a;

    /* renamed from: b, reason: collision with root package name */
    public int f2332b;

    public d() {
        this.f2332b = 0;
    }

    @Override // q.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        r(coordinatorLayout, view, i2);
        if (this.a == null) {
            this.a = new e(view);
        }
        e eVar = this.a;
        View view2 = eVar.a;
        eVar.f2333b = view2.getTop();
        eVar.f2334c = view2.getLeft();
        this.a.a();
        int i3 = this.f2332b;
        if (i3 == 0) {
            return true;
        }
        e eVar2 = this.a;
        if (eVar2.f2335d != i3) {
            eVar2.f2335d = i3;
            eVar2.a();
        }
        this.f2332b = 0;
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.q(view, i2);
    }

    public d(int i2) {
        super(0);
        this.f2332b = 0;
    }
}
