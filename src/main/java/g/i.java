package g;

import android.view.View;

/* loaded from: classes.dex */
public final class i extends a1 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f1083j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, View view) {
        super(view);
        this.f1083j = jVar;
    }

    @Override // g.a1
    public final f.n b() {
        f fVar = this.f1083j.f1100d.f1120r;
        if (fVar == null) {
            return null;
        }
        return fVar.a();
    }

    @Override // g.a1
    public final boolean c() {
        this.f1083j.f1100d.f();
        return true;
    }

    @Override // g.a1
    public final boolean d() {
        k kVar = this.f1083j.f1100d;
        if (kVar.f1122t != null) {
            return false;
        }
        kVar.e();
        return true;
    }
}
