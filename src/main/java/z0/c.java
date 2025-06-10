package z0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends f1.e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f2384s;

    public c(BottomSheetBehavior bottomSheetBehavior) {
        this.f2384s = bottomSheetBehavior;
    }

    @Override // f1.e
    public final boolean K0(View view, int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.f2384s;
        int i3 = bottomSheetBehavior.L;
        if (i3 == 1 || bottomSheetBehavior.f587a0) {
            return false;
        }
        if (i3 == 3 && bottomSheetBehavior.Y == i2) {
            WeakReference weakReference = bottomSheetBehavior.V;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // f1.e
    public final int S() {
        BottomSheetBehavior bottomSheetBehavior = this.f2384s;
        return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
    }

    @Override // f1.e
    public final void n0(int i2) {
        if (i2 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f2384s;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.C(1);
            }
        }
    }

    @Override // f1.e
    public final void o0(View view, int i2, int i3) {
        this.f2384s.t(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    @Override // f1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r3.f2384s
            if (r1 >= 0) goto L1b
            boolean r5 = r3.f588b
            if (r5 == 0) goto Le
            goto Lc4
        Le:
            int r5 = r4.getTop()
            java.lang.System.currentTimeMillis()
            int r6 = r3.E
            if (r5 <= r6) goto Lc4
            goto Ld5
        L1b:
            boolean r1 = r3.I
            if (r1 == 0) goto L70
            boolean r1 = r3.D(r4, r6)
            if (r1 == 0) goto L70
            float r5 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r6)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L38
            int r5 = r3.f592d
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 > 0) goto L4c
        L38:
            int r5 = r4.getTop()
            int r6 = r3.T
            int r0 = r3.w()
            int r0 = r0 + r6
            int r0 = r0 / 2
            if (r5 <= r0) goto L49
            r5 = r2
            goto L4a
        L49:
            r5 = 0
        L4a:
            if (r5 == 0) goto L4f
        L4c:
            r5 = 5
            goto Ld8
        L4f:
            boolean r5 = r3.f588b
            if (r5 == 0) goto L55
            goto Lc4
        L55:
            int r5 = r4.getTop()
            int r6 = r3.w()
            int r5 = r5 - r6
            int r5 = java.lang.Math.abs(r5)
            int r6 = r4.getTop()
            int r0 = r3.E
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r5 >= r6) goto Ld5
            goto Lc4
        L70:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L9c
            float r5 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.abs(r6)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L81
            goto L9c
        L81:
            boolean r5 = r3.f588b
            if (r5 == 0) goto L86
            goto Ld7
        L86:
            int r5 = r4.getTop()
            int r6 = r3.E
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r3.G
            int r5 = r5 - r0
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto Ld7
            goto Ld5
        L9c:
            int r5 = r4.getTop()
            boolean r6 = r3.f588b
            if (r6 == 0) goto Lb6
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r3.G
            int r5 = r5 - r0
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto Ld7
            goto Lc4
        Lb6:
            int r6 = r3.E
            if (r5 >= r6) goto Lc6
            int r6 = r3.G
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r5 >= r6) goto Ld5
        Lc4:
            r5 = 3
            goto Ld8
        Lc6:
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r3.G
            int r5 = r5 - r0
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto Ld7
        Ld5:
            r5 = 6
            goto Ld8
        Ld7:
            r5 = 4
        Ld8:
            r3.getClass()
            r3.E(r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.c.p0(android.view.View, float, float):void");
    }

    @Override // f1.e
    public final int v(View view, int i2) {
        return view.getLeft();
    }

    @Override // f1.e
    public final int w(View view, int i2) {
        return f1.e.u(i2, this.f2384s.w(), S());
    }
}
