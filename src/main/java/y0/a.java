package y0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f1.e;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: s, reason: collision with root package name */
    public int f2361s;

    /* renamed from: t, reason: collision with root package name */
    public int f2362t = -1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f2363u;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2363u = swipeDismissBehavior;
    }

    @Override // f1.e
    public final boolean K0(View view, int i2) {
        int i3 = this.f2362t;
        return (i3 == -1 || i3 == i2) && this.f2363u.r(view);
    }

    @Override // f1.e
    public final int R(View view) {
        return view.getWidth();
    }

    @Override // f1.e
    public final void m0(View view, int i2) {
        this.f2362t = i2;
        this.f2361s = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f2363u;
            swipeDismissBehavior.f581c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f581c = false;
        }
    }

    @Override // f1.e
    public final void n0(int i2) {
        this.f2363u.getClass();
    }

    @Override // f1.e
    public final void o0(View view, int i2, int i3) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f2363u;
        float f2 = width * swipeDismissBehavior.f584f;
        float width2 = view.getWidth() * swipeDismissBehavior.f585g;
        float fAbs = Math.abs(i2 - this.f2361s);
        if (fAbs <= f2) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // f1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f2362t = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f2363u
            r4 = 0
            if (r1 == 0) goto L39
            int[] r5 = b0.f0.a
            int r5 = b0.s.d(r9)
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f582d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L54
            goto L52
        L2a:
            if (r1 <= 0) goto L54
            goto L52
        L2d:
            if (r6 != r2) goto L54
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L54
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L54
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f2361s
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f583e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L54
        L52:
            r1 = r2
            goto L55
        L54:
            r1 = r4
        L55:
            if (r1 == 0) goto L6b
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L66
            int r10 = r9.getLeft()
            int r0 = r8.f2361s
            if (r10 >= r0) goto L64
            goto L66
        L64:
            int r0 = r0 + r11
            goto L6e
        L66:
            int r8 = r8.f2361s
            int r0 = r8 - r11
            goto L6e
        L6b:
            int r0 = r8.f2361s
            r2 = r4
        L6e:
            i0.d r8 = r3.a
            int r10 = r9.getTop()
            boolean r8 = r8.q(r0, r10)
            if (r8 == 0) goto L84
            y0.b r8 = new y0.b
            r8.<init>(r3, r9, r2)
            int[] r10 = b0.f0.a
            b0.r.m(r9, r8)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.p0(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    @Override // f1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v(android.view.View r5, int r6) {
        /*
            r4 = this;
            int[] r0 = b0.f0.a
            int r0 = b0.s.d(r5)
            r1 = 1
            if (r0 != r1) goto Lb
            r0 = r1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r4.f2363u
            int r2 = r2.f582d
            if (r2 != 0) goto L15
            if (r0 == 0) goto L19
            goto L21
        L15:
            if (r2 != r1) goto L2f
            if (r0 == 0) goto L21
        L19:
            int r4 = r4.f2361s
            int r5 = r5.getWidth()
            int r5 = r5 + r4
            goto L3e
        L21:
            int r0 = r4.f2361s
            int r5 = r5.getWidth()
            int r5 = r0 - r5
            int r4 = r4.f2361s
            r3 = r5
            r5 = r4
            r4 = r3
            goto L3e
        L2f:
            int r0 = r4.f2361s
            int r1 = r5.getWidth()
            int r0 = r0 - r1
            int r4 = r4.f2361s
            int r5 = r5.getWidth()
            int r5 = r5 + r4
            r4 = r0
        L3e:
            int r4 = java.lang.Math.max(r4, r6)
            int r4 = java.lang.Math.min(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.v(android.view.View, int):int");
    }

    @Override // f1.e
    public final int w(View view, int i2) {
        return view.getTop();
    }
}
