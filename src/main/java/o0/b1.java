package o0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b1 extends b0.c {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1982d;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f1983e;

    public b1(RecyclerView recyclerView) {
        this.f1982d = recyclerView;
        a1 a1Var = this.f1983e;
        this.f1983e = a1Var == null ? new a1(this) : a1Var;
    }

    @Override // b0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f1982d;
            boolean z2 = true;
            if (recyclerView.f432p && !recyclerView.f439w) {
                if (!(recyclerView.f412c.f1979b.size() > 0)) {
                    z2 = false;
                }
            }
            if (z2) {
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) view;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().I(accessibilityEvent);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // b0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r7, c0.g r8) {
        /*
            r6 = this;
            android.view.View$AccessibilityDelegate r0 = r6.a
            android.view.accessibility.AccessibilityNodeInfo r1 = r8.a
            r0.onInitializeAccessibilityNodeInfo(r7, r1)
            androidx.recyclerview.widget.RecyclerView r6 = r6.f1982d
            boolean r7 = r6.f432p
            r0 = 1
            r2 = 0
            if (r7 == 0) goto L25
            boolean r7 = r6.f439w
            if (r7 != 0) goto L25
            o0.b r7 = r6.f412c
            java.util.ArrayList r7 = r7.f1979b
            int r7 = r7.size()
            if (r7 <= 0) goto L1f
            r7 = r0
            goto L20
        L1f:
            r7 = r2
        L20:
            if (r7 == 0) goto L23
            goto L25
        L23:
            r7 = r2
            goto L26
        L25:
            r7 = r0
        L26:
            if (r7 != 0) goto L76
            o0.l0 r7 = r6.getLayoutManager()
            if (r7 == 0) goto L76
            o0.l0 r6 = r6.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r7 = r6.f2046b
            o0.s0 r3 = r7.a
            r4 = -1
            boolean r5 = r7.canScrollVertically(r4)
            if (r5 != 0) goto L45
            androidx.recyclerview.widget.RecyclerView r5 = r6.f2046b
            boolean r4 = r5.canScrollHorizontally(r4)
            if (r4 == 0) goto L4d
        L45:
            r4 = 8192(0x2000, float:1.148E-41)
            r8.a(r4)
            r1.setScrollable(r0)
        L4d:
            androidx.recyclerview.widget.RecyclerView r4 = r6.f2046b
            boolean r4 = r4.canScrollVertically(r0)
            if (r4 != 0) goto L5d
            androidx.recyclerview.widget.RecyclerView r4 = r6.f2046b
            boolean r4 = r4.canScrollHorizontally(r0)
            if (r4 == 0) goto L65
        L5d:
            r4 = 4096(0x1000, float:5.74E-42)
            r8.a(r4)
            r1.setScrollable(r0)
        L65:
            o0.w0 r7 = r7.W
            int r8 = r6.A(r3, r7)
            int r6 = r6.s(r3, r7)
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r6 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r8, r6, r2, r2)
            r1.setCollectionInfo(r6)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.b1.d(android.view.View, c0.g):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[PHI: r3
  0x0096: PHI (r3v13 int) = (r3v9 int), (r3v17 int) binds: [B:37:0x0087, B:30:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r3, int r4, android.os.Bundle r5) {
        /*
            r2 = this;
            boolean r3 = super.g(r3, r4, r5)
            r5 = 1
            if (r3 == 0) goto L8
            return r5
        L8:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f1982d
            boolean r3 = r2.f432p
            r0 = 0
            if (r3 == 0) goto L25
            boolean r3 = r2.f439w
            if (r3 != 0) goto L25
            o0.b r3 = r2.f412c
            java.util.ArrayList r3 = r3.f1979b
            int r3 = r3.size()
            if (r3 <= 0) goto L1f
            r3 = r5
            goto L20
        L1f:
            r3 = r0
        L20:
            if (r3 == 0) goto L23
            goto L25
        L23:
            r3 = r0
            goto L26
        L25:
            r3 = r5
        L26:
            if (r3 != 0) goto La3
            o0.l0 r3 = r2.getLayoutManager()
            if (r3 == 0) goto La3
            o0.l0 r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r2.f2046b
            o0.s0 r1 = r3.a
            r1 = 4096(0x1000, float:5.74E-42)
            if (r4 == r1) goto L6d
            r1 = 8192(0x2000, float:1.148E-41)
            if (r4 == r1) goto L41
            r3 = r0
            r4 = r3
            goto L97
        L41:
            r4 = -1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L56
            int r3 = r2.f2054j
            int r1 = r2.x()
            int r3 = r3 - r1
            int r1 = r2.u()
            int r3 = r3 - r1
            int r3 = -r3
            goto L57
        L56:
            r3 = r0
        L57:
            androidx.recyclerview.widget.RecyclerView r1 = r2.f2046b
            boolean r4 = r1.canScrollHorizontally(r4)
            if (r4 == 0) goto L96
            int r4 = r2.f2053i
            int r1 = r2.v()
            int r4 = r4 - r1
            int r1 = r2.w()
            int r4 = r4 - r1
            int r4 = -r4
            goto L97
        L6d:
            boolean r3 = r3.canScrollVertically(r5)
            if (r3 == 0) goto L80
            int r3 = r2.f2054j
            int r4 = r2.x()
            int r3 = r3 - r4
            int r4 = r2.u()
            int r3 = r3 - r4
            goto L81
        L80:
            r3 = r0
        L81:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f2046b
            boolean r4 = r4.canScrollHorizontally(r5)
            if (r4 == 0) goto L96
            int r4 = r2.f2053i
            int r1 = r2.v()
            int r4 = r4 - r1
            int r1 = r2.w()
            int r4 = r4 - r1
            goto L97
        L96:
            r4 = r0
        L97:
            if (r3 != 0) goto L9d
            if (r4 != 0) goto L9d
            r5 = r0
            goto La2
        L9d:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f2046b
            r2.H(r4, r3, r5)
        La2:
            return r5
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.b1.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
