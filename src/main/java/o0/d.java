package o0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {
    public final d0 a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1986b = new c();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1987c = new ArrayList();

    public d(d0 d0Var) {
        this.a = d0Var;
    }

    public final void a(View view, int i2, boolean z2) {
        d0 d0Var = this.a;
        int iA = i2 < 0 ? d0Var.a() : f(i2);
        this.f1986b.e(iA, z2);
        if (z2) {
            i(view);
        }
        d0Var.a.addView(view, iA);
        RecyclerView.v(view);
    }

    public final void b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        d0 d0Var = this.a;
        int iA = i2 < 0 ? d0Var.a() : f(i2);
        this.f1986b.e(iA, z2);
        if (z2) {
            i(view);
        }
        d0Var.getClass();
        z0 z0VarV = RecyclerView.v(view);
        RecyclerView recyclerView = d0Var.a;
        if (z0VarV != null) {
            if (!z0VarV.k() && !z0VarV.n()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + z0VarV + recyclerView.p());
            }
            z0VarV.f2147b &= -257;
        }
        recyclerView.attachViewToParent(view, iA, layoutParams);
    }

    public final void c(int i2) {
        z0 z0VarV;
        int iF = f(i2);
        this.f1986b.f(iF);
        d0 d0Var = this.a;
        View childAt = d0Var.a.getChildAt(iF);
        RecyclerView recyclerView = d0Var.a;
        if (childAt != null && (z0VarV = RecyclerView.v(childAt)) != null) {
            if (z0VarV.k() && !z0VarV.n()) {
                throw new IllegalArgumentException("called detach on an already detached child " + z0VarV + recyclerView.p());
            }
            z0VarV.b(256);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i2) {
        return this.a.a.getChildAt(f(i2));
    }

    public final int e() {
        return this.a.a() - this.f1987c.size();
    }

    public final int f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int iA = this.a.a();
        int i3 = i2;
        while (i3 < iA) {
            c cVar = this.f1986b;
            int iB = i2 - (i3 - cVar.b(i3));
            if (iB == 0) {
                while (cVar.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iB;
        }
        return -1;
    }

    public final View g(int i2) {
        return this.a.a.getChildAt(i2);
    }

    public final int h() {
        return this.a.a();
    }

    public final void i(View view) {
        this.f1987c.add(view);
        d0 d0Var = this.a;
        d0Var.getClass();
        z0 z0VarV = RecyclerView.v(view);
        if (z0VarV != null) {
            int iC = z0VarV.f2151f;
            z0VarV.getClass();
            if (iC == -1) {
                int[] iArr = b0.f0.a;
                iC = b0.r.c(null);
            }
            z0VarV.f2150e = iC;
            RecyclerView recyclerView = d0Var.a;
            if (recyclerView.f441y > 0) {
                z0VarV.f2151f = 4;
                recyclerView.f425i0.add(z0VarV);
            } else {
                int[] iArr2 = b0.f0.a;
                b0.r.s(null, 4);
            }
        }
    }

    public final boolean j(View view) {
        return this.f1987c.contains(view);
    }

    public final void k(View view) {
        if (this.f1987c.remove(view)) {
            d0 d0Var = this.a;
            d0Var.getClass();
            z0 z0VarV = RecyclerView.v(view);
            if (z0VarV != null) {
                int i2 = z0VarV.f2150e;
                RecyclerView recyclerView = d0Var.a;
                if (recyclerView.f441y > 0) {
                    z0VarV.f2151f = i2;
                    recyclerView.f425i0.add(z0VarV);
                } else {
                    int[] iArr = b0.f0.a;
                    z0VarV.getClass();
                    b0.r.s(null, i2);
                }
                z0VarV.f2150e = 0;
            }
        }
    }

    public final String toString() {
        return this.f1986b.toString() + ", hidden list:" + this.f1987c.size();
    }
}
