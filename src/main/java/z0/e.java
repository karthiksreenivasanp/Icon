package z0;

import android.view.View;
import b0.f0;
import b0.r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2390b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2391c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f2392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q.a f2393e;

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.f2393e = bottomSheetBehavior;
        this.f2392d = new d.a(7, this);
    }

    public final void a(int i2) {
        int i3 = this.a;
        Runnable runnable = this.f2392d;
        q.a aVar = this.f2393e;
        switch (i3) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f2390b = i2;
                    if (!this.f2391c) {
                        View view = (View) bottomSheetBehavior.U.get();
                        int[] iArr = f0.a;
                        r.m(view, runnable);
                        this.f2391c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) aVar;
                WeakReference weakReference2 = sideSheetBehavior.f687o;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f2390b = i2;
                    if (!this.f2391c) {
                        View view2 = (View) sideSheetBehavior.f687o.get();
                        int[] iArr2 = f0.a;
                        r.m(view2, runnable);
                        this.f2391c = true;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this(bottomSheetBehavior);
        this.a = 0;
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.f2393e = sideSheetBehavior;
        this.f2392d = new j1.d(0, this);
    }
}
