package f;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import b0.f0;
import com.nothing.icon.R;
import g.m1;
import g.q1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h extends n implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f879c;

    /* renamed from: d, reason: collision with root package name */
    public final int f880d;

    /* renamed from: e, reason: collision with root package name */
    public final int f881e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f882f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f883g;

    /* renamed from: j, reason: collision with root package name */
    public final c f886j;
    public final d k;

    /* renamed from: l, reason: collision with root package name */
    public final f f887l;

    /* renamed from: o, reason: collision with root package name */
    public View f890o;

    /* renamed from: p, reason: collision with root package name */
    public View f891p;

    /* renamed from: q, reason: collision with root package name */
    public int f892q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f893r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f894s;

    /* renamed from: t, reason: collision with root package name */
    public int f895t;

    /* renamed from: u, reason: collision with root package name */
    public int f896u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f898w;

    /* renamed from: x, reason: collision with root package name */
    public r f899x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f900y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f901z;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f884h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f885i = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public int f888m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f889n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f897v = false;

    public h(Context context, View view, int i2, int i3, boolean z2) {
        this.f886j = new c(this, i);
        this.k = new d(i, this);
        this.f887l = new f(i, this);
        this.f878b = context;
        this.f890o = view;
        this.f880d = i2;
        this.f881e = i3;
        this.f882f = z2;
        int[] iArr = f0.a;
        this.f892q = b0.s.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f879c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f883g = new Handler();
    }

    @Override // f.s
    public final void a(l lVar, boolean z2) {
        int i2;
        ArrayList arrayList = this.f885i;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (lVar == ((g) arrayList.get(i3)).f876b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            ((g) arrayList.get(i4)).f876b.c(false);
        }
        g gVar = (g) arrayList.remove(i3);
        CopyOnWriteArrayList copyOnWriteArrayList = gVar.f876b.f923r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s sVar = (s) weakReference.get();
            if (sVar == null || sVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.A;
        q1 q1Var = gVar.a;
        if (z3) {
            m1.b(q1Var.f1145v, null);
            q1Var.f1145v.setAnimationStyle(0);
        }
        q1Var.j();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i2 = ((g) arrayList.get(size2 - 1)).f877c;
        } else {
            View view = this.f890o;
            int[] iArr = f0.a;
            i2 = b0.s.d(view) == 1 ? 0 : 1;
        }
        this.f892q = i2;
        if (size2 != 0) {
            if (z2) {
                ((g) arrayList.get(0)).f876b.c(false);
                return;
            }
            return;
        }
        j();
        r rVar = this.f899x;
        if (rVar != null) {
            rVar.a(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f900y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f900y.removeGlobalOnLayoutListener(this.f886j);
            }
            this.f900y = null;
        }
        this.f891p.removeOnAttachStateChangeListener(this.k);
        this.f901z.onDismiss();
    }

    @Override // f.s
    public final void b() {
        Iterator it = this.f885i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((g) it.next()).a.f1127c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // f.u
    public final boolean d() {
        ArrayList arrayList = this.f885i;
        return arrayList.size() > 0 && ((g) arrayList.get(0)).a.d();
    }

    @Override // f.u
    public final ListView e() {
        ArrayList arrayList = this.f885i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((g) arrayList.get(arrayList.size() - 1)).a.f1127c;
    }

    @Override // f.u
    public final void f() {
        if (d()) {
            return;
        }
        ArrayList arrayList = this.f884h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((l) it.next());
        }
        arrayList.clear();
        View view = this.f890o;
        this.f891p = view;
        if (view != null) {
            boolean z2 = this.f900y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f900y = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f886j);
            }
            this.f891p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // f.s
    public final boolean g() {
        return false;
    }

    @Override // f.u
    public final void j() {
        ArrayList arrayList = this.f885i;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        g[] gVarArr = (g[]) arrayList.toArray(new g[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            g gVar = gVarArr[size];
            if (gVar.a.d()) {
                gVar.a.j();
            }
        }
    }

    @Override // f.s
    public final void k(r rVar) {
        this.f899x = rVar;
    }

    @Override // f.s
    public final boolean l(w wVar) {
        Iterator it = this.f885i.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (wVar == gVar.f876b) {
                gVar.a.f1127c.requestFocus();
                return true;
            }
        }
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        m(wVar);
        r rVar = this.f899x;
        if (rVar != null) {
            rVar.d(wVar);
        }
        return true;
    }

    @Override // f.n
    public final void m(l lVar) {
        lVar.b(this, this.f878b);
        if (d()) {
            w(lVar);
        } else {
            this.f884h.add(lVar);
        }
    }

    @Override // f.n
    public final void o(View view) {
        if (this.f890o != view) {
            this.f890o = view;
            int i2 = this.f888m;
            int[] iArr = f0.a;
            this.f889n = Gravity.getAbsoluteGravity(i2, b0.s.d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        g gVar;
        ArrayList arrayList = this.f885i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = (g) arrayList.get(i2);
            if (!gVar.a.d()) {
                break;
            } else {
                i2++;
            }
        }
        if (gVar != null) {
            gVar.f876b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        j();
        return true;
    }

    @Override // f.n
    public final void p(boolean z2) {
        this.f897v = z2;
    }

    @Override // f.n
    public final void q(int i2) {
        if (this.f888m != i2) {
            this.f888m = i2;
            View view = this.f890o;
            int[] iArr = f0.a;
            this.f889n = Gravity.getAbsoluteGravity(i2, b0.s.d(view));
        }
    }

    @Override // f.n
    public final void r(int i2) {
        this.f893r = true;
        this.f895t = i2;
    }

    @Override // f.n
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f901z = onDismissListener;
    }

    @Override // f.n
    public final void t(boolean z2) {
        this.f898w = z2;
    }

    @Override // f.n
    public final void u(int i2) {
        this.f894s = true;
        this.f896u = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(f.l r18) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.w(f.l):void");
    }
}
