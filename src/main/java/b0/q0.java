package b0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class q0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f498c;

    /* renamed from: d, reason: collision with root package name */
    public u.c f499d;

    public q0(x0 x0Var, WindowInsets windowInsets) {
        super(x0Var);
        this.f499d = null;
        this.f498c = windowInsets;
    }

    @Override // b0.v0
    public final u.c h() {
        if (this.f499d == null) {
            WindowInsets windowInsets = this.f498c;
            this.f499d = u.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f499d;
    }

    @Override // b0.v0
    public boolean k() {
        return this.f498c.isRound();
    }

    @Override // b0.v0
    public void l(u.c[] cVarArr) {
    }

    @Override // b0.v0
    public void m(x0 x0Var) {
    }
}
