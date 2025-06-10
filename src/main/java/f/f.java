package f;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.f0;
import b0.o0;
import b0.v0;
import b0.x0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import g.j0;
import g.l1;
import g.q2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class f implements l1, r, j, j0, b0.l, c0.t, a1.a {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f875b;

    public f(int i2) {
        this.a = i2;
        if (i2 == 11) {
            this.f875b = new o0();
            return;
        }
        if (i2 == 13) {
            this.f875b = new c0.j(this);
        } else if (i2 != 20) {
            this.f875b = new ConcurrentHashMap();
        } else {
            this.f875b = new HashMap();
        }
    }

    @Override // f.r
    public final void a(l lVar, boolean z2) {
        if (lVar instanceof w) {
            lVar.j().c(false);
        }
        r rVar = ((g.k) this.f875b).f1108e;
        if (rVar != null) {
            rVar.a(lVar, z2);
        }
    }

    @Override // g.j0
    public void b(int i2) {
    }

    @Override // c0.t
    public final boolean c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f875b;
        boolean z2 = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        int[] iArr = f0.a;
        boolean z3 = b0.s.d(view) == 1;
        int i2 = swipeDismissBehavior.f582d;
        if ((i2 == 0 && z3) || (i2 == 1 && !z3)) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        swipeDismissBehavior.getClass();
        return true;
    }

    @Override // f.r
    public final boolean d(l lVar) {
        Object obj = this.f875b;
        if (lVar == ((g.k) obj).f1106c) {
            return false;
        }
        ((w) lVar).f980w.getClass();
        ((g.k) obj).getClass();
        r rVar = ((g.k) obj).f1108e;
        if (rVar != null) {
            return rVar.d(lVar);
        }
        return false;
    }

    @Override // f.j
    public final void e() {
        g.n nVar = ((ActionMenuView) this.f875b).f107z;
        if (nVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((q2) nVar).a.G.f1077b).iterator();
            if (it.hasNext()) {
                androidx.activity.result.a.d(it.next());
                throw null;
            }
        }
    }

    @Override // f.j
    public final void f(l lVar) {
        j jVar = ((ActionMenuView) this.f875b).f102u;
        if (jVar != null) {
            jVar.f(lVar);
        }
    }

    @Override // b0.l
    public final x0 g(View view, x0 x0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f875b;
        if (!a0.b.a(coordinatorLayout.f199n, x0Var)) {
            coordinatorLayout.f199n = x0Var;
            boolean z2 = x0Var.b() > 0;
            coordinatorLayout.f200o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            v0 v0Var = x0Var.a;
            if (!v0Var.j()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    int[] iArr = f0.a;
                    if (b0.r.b(childAt) && ((q.d) childAt.getLayoutParams()).a != null && v0Var.j()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return x0Var;
    }

    @Override // g.l1
    public final void h(l lVar, m mVar) {
        h hVar = (h) this.f875b;
        hVar.f883g.removeCallbacksAndMessages(null);
        int size = hVar.f885i.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (lVar == ((g) hVar.f885i.get(i2)).f876b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        hVar.f883g.postAtTime(new e(this, i3 < hVar.f885i.size() ? (g) hVar.f885i.get(i3) : null, mVar, lVar, 0), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // g.l1
    public final void i(l lVar, MenuItem menuItem) {
        ((h) this.f875b).f883g.removeCallbacksAndMessages(lVar);
    }

    @Override // g.j0
    public void j(int i2) {
    }

    public c0.g k(int i2) {
        return null;
    }

    public c0.g l(int i2) {
        return null;
    }

    public final int m() {
        int iN = n();
        Object obj = this.f875b;
        return Math.max(0, (iN - ((SideSheetBehavior) obj).f684l) - ((SideSheetBehavior) obj).f686n);
    }

    public final int n() {
        return ((SideSheetBehavior) this.f875b).f685m;
    }

    public boolean o(int i2, int i3, Bundle bundle) {
        return false;
    }

    public final long p() {
        return ((ByteBuffer) this.f875b).getInt() & 4294967295L;
    }

    public final void q(int i2) {
        Object obj = this.f875b;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i2);
    }

    public final String toString() {
        switch (this.a) {
            case 10:
                return "ContentInfoCompat{" + ((ContentInfo) this.f875b) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(int i2, Object obj) {
        this.a = i2;
        this.f875b = obj;
    }

    public f(TextView textView) {
        this.a = 19;
        if (textView == null) {
            throw new NullPointerException("textView cannot be null");
        }
        this.f875b = new k0.i(textView);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(25, materialButtonToggleGroup);
        this.a = 25;
    }

    public f(SideSheetBehavior sideSheetBehavior) {
        this.a = 29;
        this.f875b = sideSheetBehavior;
    }

    public f(f1.e eVar) {
        this.a = 6;
        this.f875b = eVar;
    }

    public f(ByteBuffer byteBuffer) {
        this.a = 18;
        this.f875b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
