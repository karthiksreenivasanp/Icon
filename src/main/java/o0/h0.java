package o0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h0 {
    public d0 a = null;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2022b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final long f2023c = 120;

    /* renamed from: d, reason: collision with root package name */
    public final long f2024d = 120;

    /* renamed from: e, reason: collision with root package name */
    public final long f2025e = 250;

    /* renamed from: f, reason: collision with root package name */
    public final long f2026f = 250;

    public static void a(z0 z0Var) {
        RecyclerView recyclerView;
        int i2 = z0Var.f2147b & 14;
        if (z0Var.g() || (i2 & 4) != 0 || (recyclerView = z0Var.f2152g) == null) {
            return;
        }
        recyclerView.t(z0Var);
    }

    public final void b(z0 z0Var) {
        d0 d0Var = this.a;
        if (d0Var != null) {
            boolean z2 = true;
            z0Var.m(true);
            z0Var.getClass();
            z0Var.getClass();
            if ((z0Var.f2147b & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = d0Var.a;
            recyclerView.I();
            d dVar = recyclerView.f414d;
            d0 d0Var2 = dVar.a;
            RecyclerView recyclerView2 = d0Var2.a;
            z0Var.getClass();
            int iIndexOfChild = recyclerView2.indexOfChild(null);
            if (iIndexOfChild == -1) {
                dVar.k(null);
            } else {
                c cVar = dVar.f1986b;
                if (cVar.d(iIndexOfChild)) {
                    cVar.f(iIndexOfChild);
                    dVar.k(null);
                    d0Var2.b(iIndexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                z0 z0VarV = RecyclerView.v(null);
                s0 s0Var = recyclerView.a;
                s0Var.k(z0VarV);
                s0Var.h(z0VarV);
            }
            recyclerView.J(!z2);
            if (z2 || !z0Var.k()) {
                return;
            }
            recyclerView.removeDetachedView(null, false);
        }
    }

    public abstract void c(z0 z0Var);

    public abstract void d();

    public abstract boolean e();
}
