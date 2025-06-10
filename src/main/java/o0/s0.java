package o0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s0 {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2096b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2097c;

    /* renamed from: d, reason: collision with root package name */
    public int f2098d;

    /* renamed from: e, reason: collision with root package name */
    public int f2099e;

    /* renamed from: f, reason: collision with root package name */
    public r0 f2100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2101g;

    public s0(RecyclerView recyclerView) {
        this.f2101g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.f2096b = null;
        this.f2097c = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f2098d = 2;
        this.f2099e = 2;
    }

    public final void a(z0 z0Var, boolean z2) {
        RecyclerView.e(z0Var);
        RecyclerView recyclerView = this.f2101g;
        b1 b1Var = recyclerView.f415d0;
        if (b1Var != null) {
            a1 a1Var = b1Var.f1983e;
            boolean z3 = a1Var instanceof a1;
            z0Var.getClass();
            b0.f0.f(null, z3 ? (b0.c) a1Var.f1978e.remove(null) : null);
        }
        if (z2 && recyclerView.W != null) {
            recyclerView.f416e.g(z0Var);
        }
        z0Var.f2152g = null;
        r0 r0VarC = c();
        r0VarC.getClass();
        z0Var.getClass();
        ArrayList arrayList = r0VarC.a(0).a;
        if (((q0) r0VarC.a.get(0)).f2084b <= arrayList.size()) {
            return;
        }
        z0Var.l();
        arrayList.add(z0Var);
    }

    public final int b(int i2) {
        RecyclerView recyclerView = this.f2101g;
        if (i2 >= 0 && i2 < recyclerView.W.a()) {
            return !recyclerView.W.f2123f ? i2 : recyclerView.f412c.a(i2, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.W.a() + recyclerView.p());
    }

    public final r0 c() {
        if (this.f2100f == null) {
            this.f2100f = new r0();
        }
        return this.f2100f;
    }

    public final View d(int i2) {
        j(i2, Long.MAX_VALUE).getClass();
        return null;
    }

    public final void e() {
        ArrayList arrayList = this.f2097c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                int[] iArr = RecyclerView.f406k0;
                q qVar = this.f2101g.V;
                qVar.getClass();
                qVar.f2083c = 0;
                return;
            }
            f(size);
        }
    }

    public final void f(int i2) {
        ArrayList arrayList = this.f2097c;
        a((z0) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    public final void g(View view) {
        z0 z0VarV = RecyclerView.v(view);
        boolean zK = z0VarV.k();
        RecyclerView recyclerView = this.f2101g;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (z0VarV.j()) {
            z0VarV.f2148c.k(z0VarV);
        } else if (z0VarV.o()) {
            z0VarV.f2147b &= -33;
        }
        h(z0VarV);
        if (recyclerView.F == null || z0VarV.h()) {
            return;
        }
        recyclerView.F.c(z0VarV);
    }

    public final void h(z0 z0Var) {
        boolean zJ = z0Var.j();
        z0Var.getClass();
        if (!zJ) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(z0Var.j());
        sb.append(" isAttached:");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.view.View r6) {
        /*
            r5 = this;
            o0.z0 r6 = androidx.recyclerview.widget.RecyclerView.v(r6)
            int r0 = r6.f2147b
            r1 = r0 & 12
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = r3
        Lf:
            androidx.recyclerview.widget.RecyclerView r4 = r5.f2101g
            if (r1 != 0) goto L5b
            r0 = r0 & 2
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r3
        L1a:
            if (r0 == 0) goto L5b
            o0.h0 r0 = r4.F
            if (r0 == 0) goto L45
            java.util.List r1 = r6.d()
            o0.k r0 = (o0.k) r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3f
            boolean r0 = r0.f2031g
            if (r0 == 0) goto L39
            boolean r0 = r6.g()
            if (r0 == 0) goto L37
            goto L39
        L37:
            r0 = r3
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 == 0) goto L3d
            goto L3f
        L3d:
            r0 = r3
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            if (r0 == 0) goto L49
            goto L5b
        L49:
            java.util.ArrayList r0 = r5.f2096b
            if (r0 != 0) goto L54
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f2096b = r0
        L54:
            r6.f2148c = r5
            r6.f2149d = r2
            java.util.ArrayList r5 = r5.f2096b
            goto L73
        L5b:
            boolean r0 = r6.g()
            if (r0 == 0) goto L6d
            boolean r0 = r6.i()
            if (r0 == 0) goto L68
            goto L6d
        L68:
            r4.getClass()
            r5 = 0
            throw r5
        L6d:
            r6.f2148c = r5
            r6.f2149d = r3
            java.util.ArrayList r5 = r5.a
        L73:
            r5.add(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.s0.i(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o0.z0 j(int r17, long r18) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.s0.j(int, long):o0.z0");
    }

    public final void k(z0 z0Var) {
        (z0Var.f2149d ? this.f2096b : this.a).remove(z0Var);
        z0Var.f2148c = null;
        z0Var.f2149d = false;
        z0Var.f2147b &= -33;
    }

    public final void l() {
        l0 l0Var = this.f2101g.f426j;
        this.f2099e = this.f2098d + 0;
        ArrayList arrayList = this.f2097c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f2099e) {
                return;
            } else {
                f(size);
            }
        }
    }
}
