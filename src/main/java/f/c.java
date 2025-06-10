package f;

import android.view.View;
import android.view.ViewTreeObserver;
import g.q1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f869b;

    public /* synthetic */ c(n nVar, int i2) {
        this.a = i2;
        this.f869b = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i2 = this.a;
        n nVar = this.f869b;
        switch (i2) {
            case 0:
                h hVar = (h) nVar;
                if (hVar.d()) {
                    ArrayList arrayList = hVar.f885i;
                    if (arrayList.size() > 0 && !((g) arrayList.get(0)).a.f1144u) {
                        View view = hVar.f891p;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((g) it.next()).a.f();
                            }
                            break;
                        } else {
                            hVar.j();
                            break;
                        }
                    }
                }
                break;
            default:
                v vVar = (v) nVar;
                if (vVar.d()) {
                    q1 q1Var = vVar.f967i;
                    if (!q1Var.f1144u) {
                        View view2 = vVar.f971n;
                        if (view2 != null && view2.isShown()) {
                            q1Var.f();
                            break;
                        } else {
                            vVar.j();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
