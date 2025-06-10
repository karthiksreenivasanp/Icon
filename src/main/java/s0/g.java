package s0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import b0.f0;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends n {
    public static final c A;
    public static final c B;
    public static final c C;

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f2206x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y, reason: collision with root package name */
    public static final c f2207y;

    /* renamed from: z, reason: collision with root package name */
    public static final c f2208z;

    static {
        new b();
        f2207y = new c(PointF.class, "topLeft", 0);
        f2208z = new c(PointF.class, "bottomRight", 1);
        A = new c(PointF.class, "bottomRight", 2);
        B = new c(PointF.class, "topLeft", 3);
        C = new c(PointF.class, "position", 4);
    }

    public final void F(t tVar) {
        int[] iArr = f0.a;
        View view = tVar.f2245b;
        if (!b0.u.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = tVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // s0.n
    public final void c(t tVar) {
        F(tVar);
    }

    @Override // s0.n
    public final void f(t tVar) {
        F(tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    @Override // s0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator j(android.view.ViewGroup r19, s0.t r20, s0.t r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.j(android.view.ViewGroup, s0.t, s0.t):android.animation.Animator");
    }

    @Override // s0.n
    public final String[] o() {
        return f2206x;
    }
}
