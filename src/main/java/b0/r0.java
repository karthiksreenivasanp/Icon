package b0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class r0 extends q0 {

    /* renamed from: e, reason: collision with root package name */
    public u.c f500e;

    public r0(x0 x0Var, WindowInsets windowInsets) {
        super(x0Var, windowInsets);
        this.f500e = null;
    }

    @Override // b0.v0
    public x0 b() {
        return x0.d(null, this.f498c.consumeStableInsets());
    }

    @Override // b0.v0
    public x0 c() {
        return x0.d(null, this.f498c.consumeSystemWindowInsets());
    }

    @Override // b0.v0
    public final u.c g() {
        if (this.f500e == null) {
            WindowInsets windowInsets = this.f498c;
            this.f500e = u.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f500e;
    }

    @Override // b0.v0
    public boolean j() {
        return this.f498c.isConsumed();
    }
}
