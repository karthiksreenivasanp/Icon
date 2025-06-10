package i0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import b0.f0;
import f1.e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: v, reason: collision with root package name */
    public static final c f1314v = new c(0);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1315b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1317d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1318e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1319f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1320g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1321h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1322i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1323j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1324l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1325m;

    /* renamed from: n, reason: collision with root package name */
    public final float f1326n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1327o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f1328p;

    /* renamed from: q, reason: collision with root package name */
    public final e f1329q;

    /* renamed from: r, reason: collision with root package name */
    public View f1330r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1331s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f1332t;

    /* renamed from: c, reason: collision with root package name */
    public int f1316c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final d.a f1333u = new d.a(4, this);

    public d(Context context, ViewGroup viewGroup, e eVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1332t = viewGroup;
        this.f1329q = eVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1327o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1315b = viewConfiguration.getScaledTouchSlop();
        this.f1325m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1326n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1328p = new OverScroller(context, f1314v);
    }

    public final void a() {
        this.f1316c = -1;
        float[] fArr = this.f1317d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1318e, 0.0f);
            Arrays.fill(this.f1319f, 0.0f);
            Arrays.fill(this.f1320g, 0.0f);
            Arrays.fill(this.f1321h, 0);
            Arrays.fill(this.f1322i, 0);
            Arrays.fill(this.f1323j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.f1324l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1324l = null;
        }
    }

    public final void b(View view, int i2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1332t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1330r = view;
        this.f1316c = i2;
        this.f1329q.m0(view, i2);
        p(1);
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        if ((this.f1321h[i2] & i3) != i3 || (0 & i3) == 0 || (this.f1323j[i2] & i3) == i3 || (this.f1322i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f1315b;
        if (fAbs <= i4 && fAbs2 <= i4) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f1329q.getClass();
        }
        return (this.f1322i[i2] & i3) == 0 && fAbs > ((float) this.f1315b);
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        e eVar = this.f1329q;
        boolean z2 = eVar.R(view) > 0;
        boolean z3 = eVar.S() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f1315b) : z3 && Math.abs(f3) > ((float) this.f1315b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i2 = this.f1315b;
        return f4 > ((float) (i2 * i2));
    }

    public final void e(int i2) {
        float[] fArr = this.f1317d;
        if (fArr != null) {
            int i3 = this.k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f1318e[i2] = 0.0f;
                this.f1319f[i2] = 0.0f;
                this.f1320g[i2] = 0.0f;
                this.f1321h[i2] = 0;
                this.f1322i[i2] = 0;
                this.f1323j[i2] = 0;
                this.k = (~i4) & i3;
            }
        }
    }

    public final int f(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f1332t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.f1328p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1330r.getLeft();
            int top = currY - this.f1330r.getTop();
            if (left != 0) {
                View view = this.f1330r;
                int[] iArr = f0.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1330r;
                int[] iArr2 = f0.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1329q.o0(this.f1330r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f1332t.post(this.f1333u);
            }
        }
        return this.a == 2;
    }

    public final View h(int i2, int i3) {
        ViewGroup viewGroup = this.f1332t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1329q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f1330r.getLeft();
        int top = this.f1330r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        OverScroller overScroller = this.f1328p;
        int i8 = 0;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f1330r;
        int i9 = (int) this.f1326n;
        int i10 = (int) this.f1325m;
        int iAbs = Math.abs(i4);
        if (iAbs < i9) {
            i4 = 0;
        } else if (iAbs > i10) {
            i4 = i4 > 0 ? i10 : -i10;
        }
        int iAbs2 = Math.abs(i5);
        if (iAbs2 < i9) {
            i5 = i8;
        } else if (iAbs2 > i10) {
            if (i5 > 0) {
                i5 = i10;
            } else {
                i8 = -i10;
                i5 = i8;
            }
        }
        int iAbs3 = Math.abs(i6);
        int iAbs4 = Math.abs(i7);
        int iAbs5 = Math.abs(i4);
        int iAbs6 = Math.abs(i5);
        int i11 = iAbs5 + iAbs6;
        int i12 = iAbs3 + iAbs4;
        if (i4 != 0) {
            f2 = iAbs5;
            f3 = i11;
        } else {
            f2 = iAbs3;
            f3 = i12;
        }
        float f6 = f2 / f3;
        if (i5 != 0) {
            f4 = iAbs6;
            f5 = i11;
        } else {
            f4 = iAbs4;
            f5 = i12;
        }
        float f7 = f4 / f5;
        e eVar = this.f1329q;
        overScroller.startScroll(left, top, i6, i7, (int) ((f(i7, i5, eVar.S()) * f7) + (f(i6, i4, eVar.R(view)) * f6)));
        p(2);
        return true;
    }

    public final boolean j(int i2) {
        if ((this.k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1324l == null) {
            this.f1324l = VelocityTracker.obtain();
        }
        this.f1324l.addMovement(motionEvent);
        int i3 = 0;
        e eVar = this.f1329q;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (j(pointerId)) {
                                float x2 = motionEvent.getX(i3);
                                float y2 = motionEvent.getY(i3);
                                float f2 = x2 - this.f1317d[pointerId];
                                float f3 = y2 - this.f1318e[pointerId];
                                m(f2, f3, pointerId);
                                if (this.a != 1) {
                                    View viewH = h((int) x2, (int) y2);
                                    if (d(viewH, f2, f3) && s(viewH, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else {
                        if (!j(this.f1316c)) {
                            return;
                        }
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1316c);
                        float x3 = motionEvent.getX(iFindPointerIndex);
                        float y3 = motionEvent.getY(iFindPointerIndex);
                        float[] fArr = this.f1319f;
                        int i4 = this.f1316c;
                        int i5 = (int) (x3 - fArr[i4]);
                        int i6 = (int) (y3 - this.f1320g[i4]);
                        int left = this.f1330r.getLeft() + i5;
                        int top = this.f1330r.getTop() + i6;
                        int left2 = this.f1330r.getLeft();
                        int top2 = this.f1330r.getTop();
                        if (i5 != 0) {
                            left = eVar.v(this.f1330r, left);
                            int[] iArr = f0.a;
                            this.f1330r.offsetLeftAndRight(left - left2);
                        }
                        if (i6 != 0) {
                            top = eVar.w(this.f1330r, top);
                            int[] iArr2 = f0.a;
                            this.f1330r.offsetTopAndBottom(top - top2);
                        }
                        if (i5 != 0 || i6 != 0) {
                            eVar.o0(this.f1330r, left, top);
                        }
                    }
                    o(motionEvent);
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (this.a == 1 && pointerId2 == this.f1316c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId3 = motionEvent.getPointerId(i3);
                                if (pointerId3 != this.f1316c) {
                                    View viewH2 = h((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view = this.f1330r;
                                    if (viewH2 == view && s(view, pointerId3)) {
                                        i2 = this.f1316c;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                l();
                            }
                        }
                        e(pointerId2);
                        return;
                    }
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    n(x4, y4, pointerId4);
                    if (this.a != 0) {
                        int i7 = (int) x4;
                        int i8 = (int) y4;
                        View view2 = this.f1330r;
                        if (view2 != null && i7 >= view2.getLeft() && i7 < view2.getRight() && i8 >= view2.getTop() && i8 < view2.getBottom()) {
                            i3 = 1;
                        }
                        if (i3 != 0) {
                            s(this.f1330r, pointerId4);
                            return;
                        }
                        return;
                    }
                    s(h((int) x4, (int) y4), pointerId4);
                    if ((this.f1321h[pointerId4] & 0) == 0) {
                        return;
                    }
                } else if (this.a == 1) {
                    this.f1331s = true;
                    eVar.p0(this.f1330r, 0.0f, 0.0f);
                    this.f1331s = false;
                    if (this.a == 1) {
                        p(0);
                    }
                }
            } else if (this.a == 1) {
                l();
            }
            a();
            return;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View viewH3 = h((int) x5, (int) y5);
        n(x5, y5, pointerId5);
        s(viewH3, pointerId5);
        if ((this.f1321h[pointerId5] & 0) == 0) {
            return;
        }
        eVar.getClass();
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f1324l;
        float f2 = this.f1325m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f1324l.getXVelocity(this.f1316c);
        float fAbs = Math.abs(xVelocity);
        float f3 = this.f1326n;
        float f4 = 0.0f;
        if (fAbs < f3) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f1324l.getYVelocity(this.f1316c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f3) {
            if (fAbs2 > f2) {
                if (yVelocity <= 0.0f) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f1331s = true;
        this.f1329q.p0(this.f1330r, xVelocity, f4);
        this.f1331s = false;
        if (this.a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void m(float f2, float f3, int i2) {
        boolean zC = c(f2, f3, i2, 1);
        boolean z2 = zC;
        if (c(f3, f2, i2, 4)) {
            z2 = (zC ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (c(f2, f3, i2, 2)) {
            z3 = (z2 ? 1 : 0) | 2;
        }
        ?? r0 = z3;
        if (c(f3, f2, i2, 8)) {
            r0 = (z3 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.f1322i;
            iArr[i2] = iArr[i2] | r0;
            this.f1329q.getClass();
        }
    }

    public final void n(float f2, float f3, int i2) {
        float[] fArr = this.f1317d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1318e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1319f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1320g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1321h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1322i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1323j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1317d = fArr2;
            this.f1318e = fArr3;
            this.f1319f = fArr4;
            this.f1320g = fArr5;
            this.f1321h = iArr;
            this.f1322i = iArr2;
            this.f1323j = iArr3;
        }
        float[] fArr9 = this.f1317d;
        this.f1319f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f1318e;
        this.f1320g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f1321h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        ViewGroup viewGroup = this.f1332t;
        int left = viewGroup.getLeft();
        int i6 = this.f1327o;
        int i7 = i4 < left + i6 ? 1 : 0;
        if (i5 < viewGroup.getTop() + i6) {
            i7 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i7 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i7 |= 8;
        }
        iArr7[i2] = i7;
        this.k |= 1 << i2;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (j(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f1319f[pointerId] = x2;
                this.f1320g[pointerId] = y2;
            }
        }
    }

    public final void p(int i2) {
        this.f1332t.removeCallbacks(this.f1333u);
        if (this.a != i2) {
            this.a = i2;
            this.f1329q.n0(i2);
            if (this.a == 0) {
                this.f1330r = null;
            }
        }
    }

    public final boolean q(int i2, int i3) {
        if (this.f1331s) {
            return i(i2, i3, (int) this.f1324l.getXVelocity(this.f1316c), (int) this.f1324l.getYVelocity(this.f1316c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.d.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i2) {
        if (view == this.f1330r && this.f1316c == i2) {
            return true;
        }
        if (view == null || !this.f1329q.K0(view, i2)) {
            return false;
        }
        this.f1316c = i2;
        b(view, i2);
        return true;
    }
}
