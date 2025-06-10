package g;

import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1080c;

    public /* synthetic */ h(int i2, Object obj, Object obj2) {
        this.a = i2;
        this.f1080c = obj;
        this.f1079b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.j jVar;
        int i2 = this.a;
        Object obj = this.f1079b;
        switch (i2) {
            case 0:
                k kVar = (k) this.f1080c;
                f.l lVar = kVar.f1106c;
                if (lVar != null && (jVar = lVar.f911e) != null) {
                    jVar.f(lVar);
                }
                ActionMenuView actionMenuView = kVar.f1110g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    f fVar = (f) obj;
                    boolean z2 = true;
                    if (!fVar.b()) {
                        if (fVar.f954f == null) {
                            z2 = false;
                        } else {
                            fVar.d(0, 0, false, false);
                        }
                    }
                    if (z2) {
                        kVar.f1120r = fVar;
                    }
                }
                kVar.f1122t = null;
                break;
            case 1:
                androidx.fragment.app.v.a((ArrayList) obj, 4);
                break;
            default:
                ((androidx.fragment.app.d) obj).x();
                break;
        }
    }
}
