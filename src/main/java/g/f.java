package g;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class f extends f.q {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1075m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f1076n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context, f.l lVar, j jVar) {
        super(context, lVar, jVar, true);
        this.f1076n = kVar;
        this.f955g = 8388613;
        f.f fVar = kVar.f1124v;
        this.f957i = fVar;
        f.n nVar = this.f958j;
        if (nVar != null) {
            nVar.k(fVar);
        }
    }

    @Override // f.q
    public final void c() {
        int i2 = this.f1075m;
        k kVar = this.f1076n;
        switch (i2) {
            case 0:
                kVar.f1121s = null;
                super.c();
                break;
            default:
                f.l lVar = kVar.f1106c;
                if (lVar != null) {
                    lVar.c(true);
                }
                kVar.f1120r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context, f.w wVar, View view) {
        super(context, wVar, view, false);
        this.f1076n = kVar;
        if (!wVar.f980w.c()) {
            View view2 = kVar.f1111h;
            this.f954f = view2 == null ? kVar.f1110g : view2;
        }
        f.f fVar = kVar.f1124v;
        this.f957i = fVar;
        f.n nVar = this.f958j;
        if (nVar != null) {
            nVar.k(fVar);
        }
    }
}
