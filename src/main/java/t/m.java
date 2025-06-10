package t;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2264c;

    public /* synthetic */ m(int i2, int i3, Object obj) {
        this.a = i3;
        this.f2264c = obj;
        this.f2263b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        int i3 = this.f2263b;
        Object obj = this.f2264c;
        switch (i2) {
            case 0:
                ((f1.e) obj).i0(i3);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f687o.get();
                if (view != null) {
                    sideSheetBehavior.s(view, i3, false);
                    break;
                }
                break;
        }
    }
}
