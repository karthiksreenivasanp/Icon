package s0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends o {
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2199b;

    public e(ViewGroup viewGroup) {
        this.f2199b = viewGroup;
    }

    @Override // s0.o, s0.m
    public final void a() {
        this.f2199b.suppressLayout(false);
        this.a = true;
    }

    @Override // s0.o, s0.m
    public final void b() {
        this.f2199b.suppressLayout(false);
    }

    @Override // s0.m
    public final void c(n nVar) {
        if (!this.a) {
            this.f2199b.suppressLayout(false);
        }
        nVar.u(this);
    }

    @Override // s0.o, s0.m
    public final void e() {
        this.f2199b.suppressLayout(true);
    }
}
