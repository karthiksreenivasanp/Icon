package f0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f989r = ViewConfiguration.getTapTimeout();
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f990b;

    /* renamed from: c, reason: collision with root package name */
    public final View f991c;

    /* renamed from: d, reason: collision with root package name */
    public d.a f992d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f993e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f994f;

    /* renamed from: g, reason: collision with root package name */
    public int f995g;

    /* renamed from: h, reason: collision with root package name */
    public int f996h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f997i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f998j;
    public final float[] k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f999l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1000m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1001n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1002o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1003p;

    /* renamed from: q, reason: collision with root package name */
    public final ListView f1004q;

    public g(ListView listView) {
        a aVar = new a();
        this.a = aVar;
        this.f990b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f993e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f994f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f997i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f998j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.f991c = listView;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f995g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f996h = f989r;
        aVar.a = 500;
        aVar.f981b = 500;
        this.f1004q = listView;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f993e
            r0 = r0[r7]
            float[] r1 = r3.f994f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f990b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f997i
            r0 = r0[r7]
            float[] r1 = r3.f998j
            r1 = r1[r7]
            float[] r3 = r3.k
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = b(r4, r1, r3)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r2 = -r3
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g.a(float, float, float, int):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f995g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (this.f1002o && i2 == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f1003p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r10.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 == r3) goto L16
            r4 = 2
            if (r0 == r4) goto L1e
            if (r0 == r2) goto L16
            goto L7b
        L16:
            r8.e()
            goto L7b
        L1a:
            r8.f1001n = r3
            r8.f999l = r1
        L1e:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r8.f991c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            f0.a r10 = r8.a
            r10.f982c = r0
            r10.f983d = r9
            boolean r9 = r8.f1002o
            if (r9 != 0) goto L7b
            boolean r9 = r8.f()
            if (r9 == 0) goto L7b
            d.a r9 = r8.f992d
            if (r9 != 0) goto L5f
            d.a r9 = new d.a
            r9.<init>(r2, r8)
            r8.f992d = r9
        L5f:
            r8.f1002o = r3
            r8.f1000m = r3
            boolean r9 = r8.f999l
            if (r9 != 0) goto L74
            int r9 = r8.f996h
            if (r9 <= 0) goto L74
            d.a r10 = r8.f992d
            long r6 = (long) r9
            int[] r9 = b0.f0.a
            b0.r.n(r5, r10, r6)
            goto L79
        L74:
            d.a r9 = r8.f992d
            r9.run()
        L79:
            r8.f999l = r3
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i2 = 0;
        if (this.f1000m) {
            this.f1002o = false;
            return;
        }
        a aVar = this.a;
        aVar.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - aVar.f984e);
        int i4 = aVar.f981b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f988i = i2;
        aVar.f987h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f986g = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r7 = this;
            f0.a r0 = r7.a
            float r1 = r0.f983d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f982c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L50
            android.widget.ListView r7 = r7.f1004q
            int r2 = r7.getCount()
            r3 = 1
            if (r2 != 0) goto L1c
            goto L4b
        L1c:
            int r4 = r7.getChildCount()
            int r5 = r7.getFirstVisiblePosition()
            int r6 = r5 + r4
            if (r1 <= 0) goto L3a
            if (r6 < r2) goto L49
            int r4 = r4 - r3
            android.view.View r1 = r7.getChildAt(r4)
            int r1 = r1.getBottom()
            int r7 = r7.getHeight()
            if (r1 > r7) goto L49
            goto L4b
        L3a:
            if (r1 >= 0) goto L4b
            if (r5 > 0) goto L49
            android.view.View r7 = r7.getChildAt(r0)
            int r7 = r7.getTop()
            if (r7 < 0) goto L49
            goto L4b
        L49:
            r7 = r3
            goto L4c
        L4b:
            r7 = r0
        L4c:
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            r0 = r3
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g.f():boolean");
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
