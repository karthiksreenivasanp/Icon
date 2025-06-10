package b0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class n0 extends p0 {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsets.Builder f494b;

    public n0() {
        this.f494b = new WindowInsets.Builder();
    }

    @Override // b0.p0
    public x0 b() {
        a();
        x0 x0VarD = x0.d(null, this.f494b.build());
        x0VarD.a.l(null);
        return x0VarD;
    }

    @Override // b0.p0
    public void c(u.c cVar) {
        this.f494b.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // b0.p0
    public void d(u.c cVar) {
        this.f494b.setStableInsets(cVar.d());
    }

    @Override // b0.p0
    public void e(u.c cVar) {
        this.f494b.setSystemGestureInsets(cVar.d());
    }

    @Override // b0.p0
    public void f(u.c cVar) {
        this.f494b.setSystemWindowInsets(cVar.d());
    }

    @Override // b0.p0
    public void g(u.c cVar) {
        this.f494b.setTappableElementInsets(cVar.d());
    }

    public n0(x0 x0Var) {
        super(x0Var);
        WindowInsets windowInsetsC = x0Var.c();
        this.f494b = windowInsetsC != null ? new WindowInsets.Builder(windowInsetsC) : new WindowInsets.Builder();
    }
}
