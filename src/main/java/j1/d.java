package j1;

import com.google.android.material.sidesheet.SideSheetBehavior;
import l1.l;
import z0.e;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1473b;

    public /* synthetic */ d(int i2, Object obj) {
        this.a = i2;
        this.f1473b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        Object obj = this.f1473b;
        switch (i2) {
            case 0:
                e eVar = (e) obj;
                eVar.f2391c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f2393e;
                i0.d dVar = sideSheetBehavior.f682i;
                if (dVar != null && dVar.g()) {
                    eVar.a(eVar.f2390b);
                    break;
                } else if (sideSheetBehavior.f681h == 2) {
                    sideSheetBehavior.r(eVar.f2390b);
                    break;
                }
                break;
            case 1:
                ((l1.e) obj).t(true);
                break;
            default:
                l lVar = (l) obj;
                boolean zIsPopupShowing = lVar.f1609h.isPopupShowing();
                lVar.t(zIsPopupShowing);
                lVar.f1613m = zIsPopupShowing;
                break;
        }
    }
}
