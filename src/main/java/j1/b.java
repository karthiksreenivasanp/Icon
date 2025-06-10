package j1;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import f.f;
import f1.e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f1471s;

    public b(SideSheetBehavior sideSheetBehavior) {
        this.f1471s = sideSheetBehavior;
    }

    @Override // f1.e
    public final boolean K0(View view, int i2) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f1471s;
        return (sideSheetBehavior.f681h == 1 || (weakReference = sideSheetBehavior.f687o) == null || weakReference.get() != view) ? false : true;
    }

    @Override // f1.e
    public final int R(View view) {
        return this.f1471s.f685m;
    }

    @Override // f1.e
    public final void n0(int i2) {
        if (i2 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f1471s;
            if (sideSheetBehavior.f680g) {
                sideSheetBehavior.r(1);
            }
        }
    }

    @Override // f1.e
    public final void o0(View view, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f1471s;
        WeakReference weakReference = sideSheetBehavior.f688p;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            f fVar = sideSheetBehavior.a;
            int left = view.getLeft();
            view.getRight();
            int i4 = ((SideSheetBehavior) fVar.f875b).f685m;
            if (left <= i4) {
                marginLayoutParams.rightMargin = i4 - left;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f692t;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        f fVar2 = sideSheetBehavior.a;
        fVar2.n();
        fVar2.m();
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            androidx.activity.result.a.d(it.next());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // f1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r5 = r5.f1471s
            f.f r0 = r5.a
            r0.getClass()
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r3 = 1
            if (r2 >= 0) goto Lf
            goto L8a
        Lf:
            int r2 = r6.getRight()
            float r2 = (float) r2
            java.lang.Object r4 = r0.f875b
            com.google.android.material.sidesheet.SideSheetBehavior r4 = (com.google.android.material.sidesheet.SideSheetBehavior) r4
            float r4 = r4.k
            float r4 = r4 * r7
            float r4 = r4 + r2
            float r2 = java.lang.Math.abs(r4)
            r4 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 0
            if (r2 <= 0) goto L29
            r2 = r3
            goto L2a
        L29:
            r2 = r4
        L2a:
            if (r2 == 0) goto L5e
            float r7 = java.lang.Math.abs(r7)
            float r1 = java.lang.Math.abs(r8)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L3a
            r7 = r3
            goto L3b
        L3a:
            r7 = r4
        L3b:
            if (r7 == 0) goto L46
            r7 = 500(0x1f4, float:7.0E-43)
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 <= 0) goto L46
            r7 = r3
            goto L47
        L46:
            r7 = r4
        L47:
            if (r7 != 0) goto L8c
            int r7 = r6.getLeft()
            int r8 = r0.n()
            int r0 = r0.m()
            int r8 = r8 - r0
            int r8 = r8 / 2
            if (r7 <= r8) goto L5b
            r4 = r3
        L5b:
            if (r4 == 0) goto L8a
            goto L8c
        L5e:
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L71
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L6f
            r4 = r3
        L6f:
            if (r4 != 0) goto L8c
        L71:
            int r7 = r6.getLeft()
            int r8 = r0.m()
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r0.n()
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L8c
        L8a:
            r7 = 3
            goto L8d
        L8c:
            r7 = 5
        L8d:
            r5.s(r6, r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.b.p0(android.view.View, float, float):void");
    }

    @Override // f1.e
    public final int v(View view, int i2) {
        SideSheetBehavior sideSheetBehavior = this.f1471s;
        return e.u(i2, sideSheetBehavior.a.m(), sideSheetBehavior.f685m);
    }

    @Override // f1.e
    public final int w(View view, int i2) {
        return view.getTop();
    }
}
