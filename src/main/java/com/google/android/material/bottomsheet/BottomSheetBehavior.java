package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.c0;
import b0.f0;
import b0.x;
import c0.f;
import com.nothing.icon.R;
import i0.d;
import i1.g;
import i1.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import o0.j0;
import q.a;
import z0.c;
import z0.e;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final e A;
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public d M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;
    public int a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f587a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f588b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f589b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f590c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f591c0;

    /* renamed from: d, reason: collision with root package name */
    public int f592d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f593d0;

    /* renamed from: e, reason: collision with root package name */
    public int f594e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f595f;

    /* renamed from: g, reason: collision with root package name */
    public int f596g;

    /* renamed from: h, reason: collision with root package name */
    public final int f597h;

    /* renamed from: i, reason: collision with root package name */
    public g f598i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f599j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f600l;

    /* renamed from: m, reason: collision with root package name */
    public int f601m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f602n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f603o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f604p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f605q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f606r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f607s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f608t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f609u;

    /* renamed from: v, reason: collision with root package name */
    public int f610v;

    /* renamed from: w, reason: collision with root package name */
    public int f611w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f612x;

    /* renamed from: y, reason: collision with root package name */
    public final k f613y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f614z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.f588b = true;
        this.k = -1;
        this.f600l = -1;
        this.A = new e(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f591c0 = new SparseIntArray();
        this.f593d0 = new c(this);
    }

    public static View u(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = f0.a;
        if (x.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View viewU = u(viewGroup.getChildAt(i2));
                if (viewU != null) {
                    return viewU;
                }
            }
        }
        return null;
    }

    public final void A(int i2) {
        boolean z2 = false;
        if (i2 == -1) {
            if (!this.f595f) {
                this.f595f = true;
                z2 = true;
            }
        } else if (this.f595f || this.f594e != i2) {
            this.f595f = false;
            this.f594e = Math.max(0, i2);
            z2 = true;
        }
        if (z2) {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L71
            r1 = 2
            if (r5 != r1) goto L8
            goto L71
        L8:
            boolean r2 = r4.I
            if (r2 != 0) goto L23
            r2 = 5
            if (r5 != r2) goto L23
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot set state: "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "BottomSheetBehavior"
            android.util.Log.w(r5, r4)
            return
        L23:
            r2 = 6
            if (r5 != r2) goto L34
            boolean r2 = r4.f588b
            if (r2 == 0) goto L34
            int r2 = r4.x(r5)
            int r3 = r4.D
            if (r2 > r3) goto L34
            r2 = 3
            goto L35
        L34:
            r2 = r5
        L35:
            java.lang.ref.WeakReference r3 = r4.U
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L40
            goto L6d
        L40:
            java.lang.ref.WeakReference r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            y.b r3 = new y.b
            r3.<init>(r4, r5, r2, r1)
            android.view.ViewParent r4 = r5.getParent()
            if (r4 == 0) goto L62
            boolean r4 = r4.isLayoutRequested()
            if (r4 == 0) goto L62
            int[] r4 = b0.f0.a
            boolean r4 = b0.u.b(r5)
            if (r4 == 0) goto L62
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L69
            r5.post(r3)
            goto L70
        L69:
            r3.run()
            goto L70
        L6d:
            r4.C(r5)
        L70:
            return
        L71:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "STATE_"
            r1.<init>(r2)
            if (r5 != r0) goto L7f
            java.lang.String r5 = "DRAGGING"
            goto L81
        L7f:
            java.lang.String r5 = "SETTLING"
        L81:
            r1.append(r5)
            java.lang.String r5 = " should not be set externally."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.B(int):void");
    }

    public final void C(int i2) {
        if (this.L == i2) {
            return;
        }
        this.L = i2;
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            H(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            H(false);
        }
        G(i2, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            androidx.activity.result.a.d(arrayList.get(0));
            throw null;
        }
    }

    public final boolean D(View view, float f2) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f2 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) s()) > 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.view.View r5, int r6, boolean r7) {
        /*
            r4 = this;
            int r0 = r4.x(r6)
            i0.d r1 = r4.M
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r7 == 0) goto L17
            int r5 = r5.getLeft()
            boolean r5 = r1.q(r5, r0)
            if (r5 == 0) goto L34
            goto L33
        L17:
            int r7 = r5.getLeft()
            r1.f1330r = r5
            r5 = -1
            r1.f1316c = r5
            boolean r5 = r1.i(r7, r0, r2, r2)
            if (r5 != 0) goto L31
            int r7 = r1.a
            if (r7 != 0) goto L31
            android.view.View r7 = r1.f1330r
            if (r7 == 0) goto L31
            r7 = 0
            r1.f1330r = r7
        L31:
            if (r5 == 0) goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L43
            r5 = 2
            r4.C(r5)
            r4.G(r6, r3)
            z0.e r4 = r4.A
            r4.a(r6)
            goto L46
        L43:
            r4.C(r6)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() throws Resources.NotFoundException {
        View view;
        int i2;
        f fVar;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        f0.d(view, 524288);
        f0.c(view, 0);
        f0.d(view, 262144);
        f0.c(view, 0);
        f0.d(view, 1048576);
        f0.c(view, 0);
        SparseIntArray sparseIntArray = this.f591c0;
        int i3 = sparseIntArray.get(0, -1);
        if (i3 != -1) {
            f0.d(view, i3);
            f0.c(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f588b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            j0 j0Var = new j0(this, 6);
            ArrayList arrayListB = f0.b(view);
            int i4 = 0;
            while (true) {
                if (i4 >= arrayListB.size()) {
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int[] iArr = f0.a;
                        if (i5 >= iArr.length || i6 != -1) {
                            break;
                        }
                        int i7 = iArr[i5];
                        boolean z2 = true;
                        for (int i8 = 0; i8 < arrayListB.size(); i8++) {
                            z2 &= ((f) arrayListB.get(i8)).a() != i7;
                        }
                        if (z2) {
                            i6 = i7;
                        }
                        i5++;
                    }
                    iA = i6;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f) arrayListB.get(i4)).a).getLabel())) {
                        iA = ((f) arrayListB.get(i4)).a();
                        break;
                    }
                    i4++;
                }
            }
            if (iA != -1) {
                f fVar2 = new f(null, iA, string, j0Var, null);
                View.AccessibilityDelegate accessibilityDelegateA = c0.a(view);
                b0.c cVar = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof b0.a ? ((b0.a) accessibilityDelegateA).a : new b0.c(accessibilityDelegateA);
                if (cVar == null) {
                    cVar = new b0.c();
                }
                f0.f(view, cVar);
                f0.d(view, fVar2.a());
                f0.b(view).add(fVar2);
                f0.c(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I && this.L != 5) {
            y(view, f.f522j, 5);
        }
        int i9 = this.L;
        if (i9 == 3) {
            i2 = this.f588b ? 4 : 6;
            fVar = f.f521i;
        } else {
            if (i9 != 4) {
                if (i9 != 6) {
                    return;
                }
                y(view, f.f521i, 4);
                y(view, f.f520h, 3);
                return;
            }
            i2 = this.f588b ? 3 : 6;
            fVar = f.f520h;
        }
        y(view, fVar, i2);
    }

    public final void G(int i2, boolean z2) {
        float f2;
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z3 = this.L == 3 && (this.f612x || w() == 0);
        if (this.f614z == z3 || this.f598i == null) {
            return;
        }
        this.f614z = z3;
        if (z2 && (valueAnimator = this.B) != null) {
            if (valueAnimator.isRunning()) {
                this.B.reverse();
                return;
            }
            f2 = z3 ? 0.0f : 1.0f;
            this.B.setFloatValues(1.0f - f2, f2);
            this.B.start();
            return;
        }
        ValueAnimator valueAnimator2 = this.B;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.B.cancel();
        }
        g gVar = this.f598i;
        f2 = this.f614z ? 0.0f : 1.0f;
        i1.f fVar = gVar.a;
        if (fVar.f1343j != f2) {
            fVar.f1343j = f2;
            gVar.f1358e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f589b0 != null) {
                    return;
                } else {
                    this.f589b0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.U.get() && z2) {
                    this.f589b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f589b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.U != null) {
            r();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // q.a
    public final void c(q.d dVar) {
        this.U = null;
        this.M = null;
    }

    @Override // q.a
    public final void e() {
        this.U = null;
        this.M = null;
    }

    @Override // q.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f587a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.o(view, x2, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f587a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (dVar = this.M) != null && dVar.r(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(((float) this.Z) - motionEvent.getY()) <= ((float) this.M.f1315b)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    @Override // q.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, int r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // q.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(v(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.k, marginLayoutParams.width), v(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f600l, marginLayoutParams.height));
        return true;
    }

    @Override // q.a
    public final boolean i(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // q.a
    public final void j(View view, View view2, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < w()) {
                int iW = top - w();
                iArr[1] = iW;
                int[] iArr2 = f0.a;
                view.offsetTopAndBottom(-iW);
                i4 = 3;
                C(i4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                int i6 = -i2;
                int[] iArr3 = f0.a;
                view.offsetTopAndBottom(i6);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i7 = this.G;
            if (i5 > i7 && !this.I) {
                int i8 = top - i7;
                iArr[1] = i8;
                int[] iArr4 = f0.a;
                view.offsetTopAndBottom(-i8);
                i4 = 4;
                C(i4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                int i62 = -i2;
                int[] iArr32 = f0.a;
                view.offsetTopAndBottom(i62);
                C(1);
            }
        }
        t(view.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // q.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }

    @Override // q.a
    public final void m(View view, Parcelable parcelable) {
        z0.d dVar = (z0.d) parcelable;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f594e = dVar.f2386d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f588b = dVar.f2387e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.I = dVar.f2388f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.J = dVar.f2389g;
            }
        }
        int i3 = dVar.f2385c;
        if (i3 == 1 || i3 == 2) {
            this.L = 4;
        } else {
            this.L = i3;
        }
    }

    @Override // q.a
    public final Parcelable n(View view) {
        return new z0.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // q.a
    public final boolean o(View view, int i2, int i3) {
        this.O = 0;
        this.P = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    @Override // q.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            int r5 = r3.getTop()
            int r0 = r2.w()
            r1 = 3
            if (r5 != r0) goto Lf
            r2.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r5 = r2.V
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r5.get()
            if (r4 != r5) goto Lb4
            boolean r4 = r2.P
            if (r4 != 0) goto L1f
            goto Lb4
        L1f:
            int r4 = r2.O
            if (r4 <= 0) goto L33
            boolean r4 = r2.f588b
            if (r4 == 0) goto L29
            goto Lae
        L29:
            int r4 = r3.getTop()
            int r5 = r2.E
            if (r4 <= r5) goto Lae
            goto Lab
        L33:
            boolean r4 = r2.I
            if (r4 == 0) goto L54
            android.view.VelocityTracker r4 = r2.X
            if (r4 != 0) goto L3d
            r4 = 0
            goto L4c
        L3d:
            r5 = 1000(0x3e8, float:1.401E-42)
            float r0 = r2.f590c
            r4.computeCurrentVelocity(r5, r0)
            android.view.VelocityTracker r4 = r2.X
            int r5 = r2.Y
            float r4 = r4.getYVelocity(r5)
        L4c:
            boolean r4 = r2.D(r3, r4)
            if (r4 == 0) goto L54
            r1 = 5
            goto Lae
        L54:
            int r4 = r2.O
            if (r4 != 0) goto L91
            int r4 = r3.getTop()
            boolean r5 = r2.f588b
            if (r5 == 0) goto L72
            int r5 = r2.D
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
            goto Lae
        L72:
            int r5 = r2.E
            if (r4 >= r5) goto L81
            int r5 = r2.G
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r4 >= r5) goto Lab
            goto Lae
        L81:
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
            goto Lab
        L91:
            boolean r4 = r2.f588b
            if (r4 == 0) goto L96
            goto Lad
        L96:
            int r4 = r3.getTop()
            int r5 = r2.E
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
        Lab:
            r1 = 6
            goto Lae
        Lad:
            r1 = 4
        Lae:
            r4 = 0
            r2.E(r3, r1, r4)
            r2.P = r4
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // q.a
    public final boolean q(View view, MotionEvent motionEvent) {
        boolean z2 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.L;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.M;
        if (dVar != null && (this.K || i2 == 1)) {
            dVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z2 = true;
        }
        if (z2 && actionMasked == 2 && !this.N) {
            float fAbs = Math.abs(this.Z - motionEvent.getY());
            d dVar2 = this.M;
            if (fAbs > dVar2.f1315b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void r() {
        int iS = s();
        if (this.f588b) {
            this.G = Math.max(this.T - iS, this.D);
        } else {
            this.G = this.T - iS;
        }
    }

    public final int s() {
        int iMin;
        int i2;
        if (this.f595f) {
            iMin = Math.min(Math.max(this.f596g, this.T - ((this.S * 9) / 16)), this.R);
        } else {
            if (!this.f602n && !this.f603o && (i2 = this.f601m) > 0) {
                return Math.max(this.f594e, i2 + this.f597h);
            }
            iMin = this.f594e;
        }
        return iMin + this.f610v;
    }

    public final void t(int i2) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.G;
            if (i2 <= i3 && i3 != w()) {
                w();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            androidx.activity.result.a.d(arrayList.get(0));
            throw null;
        }
    }

    public final int v(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    public final int w() {
        if (this.f588b) {
            return this.D;
        }
        return Math.max(this.C, this.f606r ? 0 : this.f611w);
    }

    public final int x(int i2) {
        if (i2 == 3) {
            return w();
        }
        if (i2 == 4) {
            return this.G;
        }
        if (i2 == 5) {
            return this.T;
        }
        if (i2 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i2);
    }

    public final void y(View view, f fVar, int i2) {
        f0.e(view, fVar, new j0(this, i2));
    }

    public final void z(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.C = i2;
        G(this.L, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i2;
        super(0);
        int i3 = 0;
        this.a = 0;
        this.f588b = true;
        this.k = -1;
        this.f600l = -1;
        this.A = new e(this, i3);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f591c0 = new SparseIntArray();
        this.f593d0 = new c(this);
        this.f597h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f599j = f1.e.J(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f613y = new k(k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        k kVar = this.f613y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f598i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f599j;
            if (colorStateList != null) {
                this.f598i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f598i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new z0.a(i3, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f600l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i2 = typedValuePeekValue.data) != -1) {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            A(i2);
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.I != z2) {
            this.I = z2;
            if (!z2 && this.L == 5) {
                B(4);
            }
            F();
        }
        this.f602n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f588b != z3) {
            this.f588b = z3;
            if (this.U != null) {
                r();
            }
            C((this.f588b && this.L == 6) ? 3 : this.L);
            G(this.L, true);
            F();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f2 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f2;
        if (this.U != null) {
            this.E = (int) ((1.0f - f2) * this.T);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        z((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0) : typedValuePeekValue2.data);
        this.f592d = typedArrayObtainStyledAttributes.getInt(11, 500);
        this.f603o = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f604p = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f605q = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f606r = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.f607s = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f608t = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f609u = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f612x = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f590c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
