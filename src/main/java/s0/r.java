package s0;

/* loaded from: classes.dex */
public final class r extends o {
    public final s a;

    public r(s sVar) {
        this.a = sVar;
    }

    @Override // s0.m
    public final void c(n nVar) {
        s sVar = this.a;
        int i2 = sVar.f2244z - 1;
        sVar.f2244z = i2;
        if (i2 == 0) {
            sVar.A = false;
            sVar.l();
        }
        nVar.u(this);
    }

    @Override // s0.o, s0.m
    public final void d() {
        s sVar = this.a;
        if (sVar.A) {
            return;
        }
        sVar.D();
        sVar.A = true;
    }
}
