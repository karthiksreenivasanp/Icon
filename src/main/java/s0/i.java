package s0;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i extends n {

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f2211y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x, reason: collision with root package name */
    public int f2212x;

    public i() {
        this.f2212x = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r0.f2197e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r0.f2195c == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s0.c0 H(s0.t r8, s0.t r9) {
        /*
            s0.c0 r0 = new s0.c0
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.f2194b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f2195c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2197e = r6
            goto L33
        L2f:
            r0.f2195c = r4
            r0.f2197e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2196d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2198f = r2
            goto L56
        L52:
            r0.f2196d = r4
            r0.f2198f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L7a
            if (r9 == 0) goto L7a
            int r8 = r0.f2195c
            int r9 = r0.f2196d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f2197e
            android.view.ViewGroup r4 = r0.f2198f
            if (r3 != r4) goto L68
            goto L8d
        L68:
            if (r8 == r9) goto L70
            if (r8 != 0) goto L6d
            goto L89
        L6d:
            if (r9 != 0) goto L8d
            goto L80
        L70:
            android.view.ViewGroup r8 = r0.f2198f
            if (r8 != 0) goto L75
            goto L89
        L75:
            android.view.ViewGroup r8 = r0.f2197e
            if (r8 != 0) goto L8d
            goto L80
        L7a:
            if (r8 != 0) goto L83
            int r8 = r0.f2196d
            if (r8 != 0) goto L83
        L80:
            r0.f2194b = r2
            goto L8b
        L83:
            if (r9 != 0) goto L8d
            int r8 = r0.f2195c
            if (r8 != 0) goto L8d
        L89:
            r0.f2194b = r1
        L8b:
            r0.a = r2
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.i.H(s0.t, s0.t):s0.c0");
    }

    public final void F(t tVar) {
        View view = tVar.f2245b;
        int visibility = view.getVisibility();
        HashMap map = tVar.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public final ObjectAnimator G(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        c cVar = u.a;
        view.setTransitionAlpha(f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, u.a, f3);
        objectAnimatorOfFloat.addListener(new o0.n(view));
        a(new h(0, this, view));
        return objectAnimatorOfFloat;
    }

    @Override // s0.n
    public final void c(t tVar) {
        F(tVar);
    }

    @Override // s0.n
    public final void f(t tVar) {
        F(tVar);
        HashMap map = tVar.a;
        c cVar = u.a;
        map.put("android:fade:transitionAlpha", Float.valueOf(tVar.f2245b.getTransitionAlpha()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (H(m(r3, false), p(r3, false)).a != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c5  */
    @Override // s0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator j(android.view.ViewGroup r21, s0.t r22, s0.t r23) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.i.j(android.view.ViewGroup, s0.t, s0.t):android.animation.Animator");
    }

    @Override // s0.n
    public final /* bridge */ /* synthetic */ String[] o() {
        return f2211y;
    }

    @Override // s0.n
    public final boolean q(t tVar, t tVar2) {
        if ((tVar != null || tVar2 != null) && (tVar == null || tVar2 == null || tVar2.a.containsKey("android:visibility:visibility") == tVar.a.containsKey("android:visibility:visibility"))) {
            c0 c0VarH = H(tVar, tVar2);
            if (c0VarH.a && (c0VarH.f2195c == 0 || c0VarH.f2196d == 0)) {
                return true;
            }
        }
        return false;
    }

    public i(int i2) {
        this.f2212x = 3;
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f2212x = i2;
    }
}
