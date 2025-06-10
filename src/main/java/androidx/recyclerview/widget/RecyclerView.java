package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b0.f0;
import b0.h;
import b0.r;
import b0.x;
import i0.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o0.b;
import o0.b1;
import o0.c0;
import o0.d;
import o0.d0;
import o0.e0;
import o0.g0;
import o0.h0;
import o0.i0;
import o0.i1;
import o0.j1;
import o0.l0;
import o0.m0;
import o0.n0;
import o0.o0;
import o0.p;
import o0.p0;
import o0.q;
import o0.q0;
import o0.r0;
import o0.s;
import o0.s0;
import o0.t0;
import o0.u0;
import o0.w0;
import o0.x0;
import o0.y0;
import o0.z0;
import x.a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f406k0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: l0, reason: collision with root package name */
    public static final Class[] f407l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final c f408m0;
    public g0 A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public EdgeEffect E;
    public h0 F;
    public int G;
    public int H;
    public VelocityTracker I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final int O;
    public final int P;
    public final float Q;
    public final float R;
    public boolean S;
    public final y0 T;
    public s U;
    public final q V;
    public final w0 W;
    public final s0 a;

    /* renamed from: a0, reason: collision with root package name */
    public p0 f409a0;

    /* renamed from: b, reason: collision with root package name */
    public u0 f410b;

    /* renamed from: b0, reason: collision with root package name */
    public ArrayList f411b0;

    /* renamed from: c, reason: collision with root package name */
    public b f412c;

    /* renamed from: c0, reason: collision with root package name */
    public final d0 f413c0;

    /* renamed from: d, reason: collision with root package name */
    public d f414d;

    /* renamed from: d0, reason: collision with root package name */
    public b1 f415d0;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f416e;

    /* renamed from: e0, reason: collision with root package name */
    public h f417e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f418f;

    /* renamed from: f0, reason: collision with root package name */
    public final int[] f419f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f420g;

    /* renamed from: g0, reason: collision with root package name */
    public final int[] f421g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f422h;

    /* renamed from: h0, reason: collision with root package name */
    public final int[] f423h0;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f424i;

    /* renamed from: i0, reason: collision with root package name */
    public final ArrayList f425i0;

    /* renamed from: j, reason: collision with root package name */
    public l0 f426j;

    /* renamed from: j0, reason: collision with root package name */
    public final c0 f427j0;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f428l;

    /* renamed from: m, reason: collision with root package name */
    public o0 f429m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f430n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f431o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f432p;

    /* renamed from: q, reason: collision with root package name */
    public int f433q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f434r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f435s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f436t;

    /* renamed from: u, reason: collision with root package name */
    public int f437u;

    /* renamed from: v, reason: collision with root package name */
    public final AccessibilityManager f438v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f439w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f440x;

    /* renamed from: y, reason: collision with root package name */
    public int f441y;

    /* renamed from: z, reason: collision with root package name */
    public int f442z;

    static {
        Class cls = Integer.TYPE;
        f407l0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f408m0 = new c(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.nothing.icon.R.attr.recyclerViewStyle);
    }

    public static void e(z0 z0Var) {
        WeakReference weakReference = z0Var.a;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    z0Var.getClass();
                    if (view == null) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                z0Var.a = null;
                return;
            }
        }
    }

    private h getScrollingChildHelper() {
        if (this.f417e0 == null) {
            this.f417e0 = new h(this);
        }
        return this.f417e0;
    }

    public static z0 v(View view) {
        if (view == null) {
            return null;
        }
        ((m0) view.getLayoutParams()).getClass();
        return null;
    }

    public final void A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.H = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.L = x2;
            this.J = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.M = y2;
            this.K = y2;
        }
    }

    public final void B(boolean z2) {
        this.f440x = z2 | this.f440x;
        this.f439w = true;
        int iH = this.f414d.h();
        for (int i2 = 0; i2 < iH; i2++) {
            z0 z0VarV = v(this.f414d.g(i2));
            if (z0VarV != null && !z0VarV.n()) {
                z0VarV.b(6);
            }
        }
        x();
        s0 s0Var = this.a;
        ArrayList arrayList = s0Var.f2097c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            z0 z0Var = (z0) arrayList.get(i3);
            if (z0Var != null) {
                z0Var.b(6);
                z0Var.a(null);
            }
        }
        s0Var.f2101g.getClass();
        s0Var.e();
    }

    public final void C(z0 z0Var, q qVar) {
        int i2 = (z0Var.f2147b & (-8193)) | 0;
        z0Var.f2147b = i2;
        if (this.W.f2124g) {
            if (((i2 & 2) != 0) && !z0Var.i() && !z0Var.n()) {
                throw null;
            }
        }
        this.f416e.b(z0Var, qVar);
    }

    public final void D(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f420g;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m0) {
            m0 m0Var = (m0) layoutParams;
            if (!m0Var.f2055b) {
                int i2 = rect.left;
                Rect rect2 = m0Var.a;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f426j.S(this, view, this.f420g, !this.f432p, view2 == null);
    }

    public final void E() {
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        K(0);
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.D;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        EdgeEffect edgeEffect4 = this.E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.E.isFinished();
        }
        if (zIsFinished) {
            int[] iArr = f0.a;
            r.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(int r12, int r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F(int, int, android.view.MotionEvent):boolean");
    }

    public final void G(int i2, int i3, int[] iArr) {
        I();
        y();
        a.a("RV Scroll");
        w0 w0Var = this.W;
        q(w0Var);
        s0 s0Var = this.a;
        int iU = i2 != 0 ? this.f426j.U(i2, s0Var, w0Var) : 0;
        int iV = i3 != 0 ? this.f426j.V(i3, s0Var, w0Var) : 0;
        a.b();
        int iE = this.f414d.e();
        for (int i4 = 0; i4 < iE; i4++) {
            z0 z0VarU = u(this.f414d.d(i4));
            if (z0VarU != null) {
                z0VarU.getClass();
            }
        }
        z(true);
        J(false);
        if (iArr != null) {
            iArr[0] = iU;
            iArr[1] = iV;
        }
    }

    public final void H(int i2, int i3, boolean z2) {
        l0 l0Var = this.f426j;
        if (l0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f435s) {
            return;
        }
        if (!l0Var.c()) {
            i2 = 0;
        }
        if (!this.f426j.d()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().g(i4, 1);
        }
        this.T.b(i2, i3, Integer.MIN_VALUE, null);
    }

    public final void I() {
        int i2 = this.f433q + 1;
        this.f433q = i2;
        if (i2 != 1 || this.f435s) {
            return;
        }
        this.f434r = false;
    }

    public final void J(boolean z2) {
        if (this.f433q < 1) {
            this.f433q = 1;
        }
        if (!z2 && !this.f435s) {
            this.f434r = false;
        }
        int i2 = this.f433q;
        if (i2 == 1) {
            if (z2 && this.f434r && !this.f435s) {
                l0 l0Var = this.f426j;
            }
            if (!this.f435s) {
                this.f434r = false;
            }
        }
        this.f433q = i2 - 1;
    }

    public final void K(int i2) {
        getScrollingChildHelper().h(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        l0 l0Var = this.f426j;
        if (l0Var != null) {
            l0Var.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m0) && this.f426j.e((m0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        l0 l0Var = this.f426j;
        if (l0Var != null && l0Var.c()) {
            return this.f426j.g(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        l0 l0Var = this.f426j;
        if (l0Var != null && l0Var.c()) {
            return this.f426j.h(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        l0 l0Var = this.f426j;
        if (l0Var != null && l0Var.c()) {
            return this.f426j.i(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        l0 l0Var = this.f426j;
        if (l0Var != null && l0Var.d()) {
            return this.f426j.j(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        l0 l0Var = this.f426j;
        if (l0Var != null && l0Var.d()) {
            return this.f426j.k(this.W);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        l0 l0Var = this.f426j;
        if (l0Var != null && l0Var.d()) {
            return this.f426j.l(this.W);
        }
        return 0;
    }

    public final void d(String str) {
        if (this.f441y > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + p());
        }
        if (this.f442z > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + p()));
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        float paddingRight;
        float paddingBottom;
        super.draw(canvas);
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((i0) arrayList.get(i2)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f418f ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.B;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f418f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.C;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.D;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f418f ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.D;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.E;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f418f) {
                paddingRight = getPaddingRight() + (-getWidth());
                paddingBottom = getPaddingBottom() + (-getHeight());
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.E;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.F == null || arrayList.size() <= 0 || !this.F.e()) ? z2 : true) {
            int[] iArr = f0.a;
            r.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.B.onRelease();
            zIsFinished = this.B.isFinished();
        }
        EdgeEffect edgeEffect2 = this.D;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.E.onRelease();
            zIsFinished |= this.E.isFinished();
        }
        if (zIsFinished) {
            int[] iArr = f0.a;
            r.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g() {
        if (!this.f432p || this.f439w) {
            a.a("RV FullInvalidate");
            i();
            a.b();
            return;
        }
        if (this.f412c.f1979b.size() > 0) {
            this.f412c.getClass();
            if (this.f412c.f1979b.size() > 0) {
                a.a("RV FullInvalidate");
                i();
                a.b();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l0 l0Var = this.f426j;
        if (l0Var != null) {
            return l0Var.m();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l0 l0Var = this.f426j;
        if (l0Var != null) {
            return l0Var.n(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e0 getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        l0 l0Var = this.f426j;
        if (l0Var == null) {
            return super.getBaseline();
        }
        l0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f418f;
    }

    public b1 getCompatAccessibilityDelegate() {
        return this.f415d0;
    }

    public g0 getEdgeEffectFactory() {
        return this.A;
    }

    public h0 getItemAnimator() {
        return this.F;
    }

    public int getItemDecorationCount() {
        return this.k.size();
    }

    public l0 getLayoutManager() {
        return this.f426j;
    }

    public int getMaxFlingVelocity() {
        return this.P;
    }

    public int getMinFlingVelocity() {
        return this.O;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public n0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.S;
    }

    public r0 getRecycledViewPool() {
        return this.a.c();
    }

    public int getScrollState() {
        return this.G;
    }

    public final void h(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int[] iArr = f0.a;
        setMeasuredDimension(l0.f(i2, paddingRight, r.e(this)), l0.f(i3, getPaddingBottom() + getPaddingTop(), r.d(this)));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public final void i() {
        Log.e("RecyclerView", "No adapter attached; skipping layout");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f430n;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f435s;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f483d;
    }

    public final boolean j(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public final void k(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void l() {
        if (this.E != null) {
            return;
        }
        this.A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.E = edgeEffect;
        if (this.f418f) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void m() {
        if (this.B != null) {
            return;
        }
        this.A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.B = edgeEffect;
        if (this.f418f) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void n() {
        if (this.D != null) {
            return;
        }
        this.A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.D = edgeEffect;
        if (this.f418f) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void o() {
        if (this.C != null) {
            return;
        }
        this.A.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.C = edgeEffect;
        if (this.f418f) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f441y = r0
            r1 = 1
            r5.f430n = r1
            boolean r2 = r5.f432p
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = r1
        L14:
            r5.f432p = r0
            o0.l0 r0 = r5.f426j
            if (r0 == 0) goto L1c
            r0.f2049e = r1
        L1c:
            java.lang.ThreadLocal r0 = o0.s.f2091e
            java.lang.Object r1 = r0.get()
            o0.s r1 = (o0.s) r1
            r5.U = r1
            if (r1 != 0) goto L56
            o0.s r1 = new o0.s
            r1.<init>()
            r5.U = r1
            int[] r1 = b0.f0.a
            android.view.Display r1 = b0.s.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L48
            if (r1 == 0) goto L48
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L48
            goto L4a
        L48:
            r1 = 1114636288(0x42700000, float:60.0)
        L4a:
            o0.s r2 = r5.U
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f2094c = r3
            r0.set(r2)
        L56:
            o0.s r0 = r5.U
            java.util.ArrayList r0 = r0.a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h0 h0Var = this.F;
        if (h0Var != null) {
            h0Var.d();
        }
        setScrollState(0);
        y0 y0Var = this.T;
        y0Var.f2143g.removeCallbacks(y0Var);
        y0Var.f2139c.abortAnimation();
        l0 l0Var = this.f426j;
        if (l0Var != null) {
            l0Var.getClass();
        }
        this.f430n = false;
        l0 l0Var2 = this.f426j;
        if (l0Var2 != null) {
            l0Var2.f2049e = false;
            l0Var2.H(this);
        }
        this.f425i0.clear();
        removeCallbacks(this.f427j0);
        this.f416e.getClass();
        while (i1.f2027b.a() != null) {
        }
        s sVar = this.U;
        if (sVar != null) {
            sVar.a.remove(this);
            this.U = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((i0) arrayList.get(i2)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            o0.l0 r0 = r5.f426j
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f435s
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            o0.l0 r0 = r5.f426j
            boolean r0 = r0.d()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            o0.l0 r3 = r5.f426j
            boolean r3 = r3.c()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            o0.l0 r3 = r5.f426j
            boolean r3 = r3.d()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            o0.l0 r3 = r5.f426j
            boolean r3 = r3.c()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.Q
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.R
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.F(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f435s) {
            return false;
        }
        this.f429m = null;
        if (s(motionEvent)) {
            E();
            setScrollState(0);
            return true;
        }
        l0 l0Var = this.f426j;
        if (l0Var == null) {
            return false;
        }
        boolean zC = l0Var.c();
        boolean zD = this.f426j.d();
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f436t) {
                this.f436t = false;
            }
            this.H = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.L = x2;
            this.J = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.M = y2;
            this.K = y2;
            if (this.G == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                K(1);
            }
            int[] iArr = this.f421g0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zC;
            if (zD) {
                i2 = (zC ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i2, 0);
        } else if (actionMasked == 1) {
            this.I.clear();
            K(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.H);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.H + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.G != 1) {
                int i3 = x3 - this.J;
                int i4 = y3 - this.K;
                if (zC == 0 || Math.abs(i3) <= this.N) {
                    z2 = false;
                } else {
                    this.L = x3;
                    z2 = true;
                }
                if (zD && Math.abs(i4) > this.N) {
                    this.M = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            E();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.H = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.L = x4;
            this.J = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.M = y4;
            this.K = y4;
        } else if (actionMasked == 6) {
            A(motionEvent);
        }
        return this.G == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        a.a("RV OnLayout");
        i();
        a.b();
        this.f432p = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        l0 l0Var = this.f426j;
        if (l0Var == null) {
            h(i2, i3);
            return;
        }
        if (l0Var.C()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f426j.f2046b.h(i2, i3);
        } else {
            if (this.f431o) {
                this.f426j.f2046b.h(i2, i3);
                return;
            }
            w0 w0Var = this.W;
            if (w0Var.f2126i) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            w0Var.f2121d = 0;
            I();
            this.f426j.f2046b.h(i2, i3);
            J(false);
            w0Var.f2123f = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.f441y > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof u0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u0 u0Var = (u0) parcelable;
        this.f410b = u0Var;
        super.onRestoreInstanceState(u0Var.a);
        l0 l0Var = this.f426j;
        if (l0Var == null || (parcelable2 = this.f410b.f2112c) == null) {
            return;
        }
        l0Var.L(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        u0 u0Var = new u0(super.onSaveInstanceState());
        u0 u0Var2 = this.f410b;
        if (u0Var2 != null) {
            u0Var.f2112c = u0Var2.f2112c;
        } else {
            l0 l0Var = this.f426j;
            u0Var.f2112c = l0Var != null ? l0Var.M() : null;
        }
        return u0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.E = null;
        this.C = null;
        this.D = null;
        this.B = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d A[PHI: r0
  0x021d: PHI (r0v56 int) = (r0v43 int), (r0v60 int) binds: [B:104:0x0208, B:109:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final String p() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f426j + ", context:" + getContext();
    }

    public final void q(w0 w0Var) {
        if (getScrollState() != 2) {
            w0Var.getClass();
            return;
        }
        OverScroller overScroller = this.T.f2139c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        w0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View r(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        z0 z0VarV = v(view);
        if (z0VarV != null) {
            if (z0VarV.k()) {
                z0VarV.f2147b &= -257;
            } else if (!z0VarV.n()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + z0VarV + p());
            }
        }
        view.clearAnimation();
        v(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f426j.getClass();
        if (!(this.f441y > 0) && view2 != null) {
            D(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f426j.S(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f428l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((o0) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f433q != 0 || this.f435s) {
            this.f434r = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(MotionEvent motionEvent) {
        boolean z2;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f428l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0 o0Var = (o0) arrayList.get(i2);
            p pVar = (p) o0Var;
            int i3 = pVar.f2075q;
            if (i3 == 1) {
                boolean zD = pVar.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = pVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        pVar.f2076r = 1;
                        pVar.k = (int) motionEvent.getX();
                    } else if (zD) {
                        pVar.f2076r = 2;
                        pVar.f2069j = (int) motionEvent.getY();
                    }
                    pVar.f(2);
                }
            } else {
                z2 = i3 == 2;
            }
            if (z2 && action != 3) {
                this.f429m = o0Var;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        l0 l0Var = this.f426j;
        if (l0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f435s) {
            return;
        }
        boolean zC = l0Var.c();
        boolean zD = this.f426j.d();
        if (zC || zD) {
            if (!zC) {
                i2 = 0;
            }
            if (!zD) {
                i3 = 0;
            }
            F(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        boolean z2 = true;
        if (this.f441y > 0) {
            int iA = accessibilityEvent != null ? c0.b.a(accessibilityEvent) : 0;
            this.f437u |= iA != 0 ? iA : 0;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(b1 b1Var) {
        this.f415d0 = b1Var;
        f0.f(this, b1Var);
    }

    public void setAdapter(e0 e0Var) {
        setLayoutFrozen(false);
        h0 h0Var = this.F;
        if (h0Var != null) {
            h0Var.d();
        }
        l0 l0Var = this.f426j;
        s0 s0Var = this.a;
        if (l0Var != null) {
            l0Var.O(s0Var);
            this.f426j.P(s0Var);
        }
        s0Var.a.clear();
        s0Var.e();
        b bVar = this.f412c;
        bVar.c(bVar.f1979b);
        bVar.c(bVar.f1980c);
        s0Var.a.clear();
        s0Var.e();
        r0 r0VarC = s0Var.c();
        if (r0VarC.f2090b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = r0VarC.a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((q0) sparseArray.valueAt(i2)).a.clear();
                i2++;
            }
        }
        this.W.f2122e = true;
        B(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(o0.f0 f0Var) {
        if (f0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f418f) {
            this.E = null;
            this.C = null;
            this.D = null;
            this.B = null;
        }
        this.f418f = z2;
        super.setClipToPadding(z2);
        if (this.f432p) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(g0 g0Var) {
        g0Var.getClass();
        this.A = g0Var;
        this.E = null;
        this.C = null;
        this.D = null;
        this.B = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f431o = z2;
    }

    public void setItemAnimator(h0 h0Var) {
        h0 h0Var2 = this.F;
        if (h0Var2 != null) {
            h0Var2.d();
            this.F.a = null;
        }
        this.F = h0Var;
        if (h0Var != null) {
            h0Var.a = this.f413c0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        s0 s0Var = this.a;
        s0Var.f2098d = i2;
        s0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(l0 l0Var) {
        d0 d0Var;
        RecyclerView recyclerView;
        if (l0Var == this.f426j) {
            return;
        }
        int i2 = 0;
        setScrollState(0);
        y0 y0Var = this.T;
        y0Var.f2143g.removeCallbacks(y0Var);
        y0Var.f2139c.abortAnimation();
        l0 l0Var2 = this.f426j;
        if (l0Var2 != null) {
            l0Var2.getClass();
        }
        l0 l0Var3 = this.f426j;
        s0 s0Var = this.a;
        if (l0Var3 != null) {
            h0 h0Var = this.F;
            if (h0Var != null) {
                h0Var.d();
            }
            this.f426j.O(s0Var);
            this.f426j.P(s0Var);
            s0Var.a.clear();
            s0Var.e();
            if (this.f430n) {
                l0 l0Var4 = this.f426j;
                l0Var4.f2049e = false;
                l0Var4.H(this);
            }
            this.f426j.W(null);
            this.f426j = null;
        } else {
            s0Var.a.clear();
            s0Var.e();
        }
        d dVar = this.f414d;
        dVar.f1986b.g();
        ArrayList arrayList = dVar.f1987c;
        int size = arrayList.size();
        while (true) {
            size--;
            d0Var = dVar.a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            d0Var.getClass();
            z0 z0VarV = v(view);
            if (z0VarV != null) {
                int i3 = z0VarV.f2150e;
                RecyclerView recyclerView2 = d0Var.a;
                if (recyclerView2.f441y > 0) {
                    z0VarV.f2151f = i3;
                    recyclerView2.f425i0.add(z0VarV);
                } else {
                    int[] iArr = f0.a;
                    z0VarV.getClass();
                    r.s(null, i3);
                }
                z0VarV.f2150e = 0;
            }
            arrayList.remove(size);
        }
        int iA = d0Var.a();
        while (true) {
            recyclerView = d0Var.a;
            if (i2 >= iA) {
                break;
            }
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getClass();
            v(childAt);
            childAt.clearAnimation();
            i2++;
        }
        recyclerView.removeAllViews();
        this.f426j = l0Var;
        if (l0Var != null) {
            if (l0Var.f2046b != null) {
                throw new IllegalArgumentException("LayoutManager " + l0Var + " is already attached to a RecyclerView:" + l0Var.f2046b.p());
            }
            l0Var.W(this);
            if (this.f430n) {
                this.f426j.f2049e = true;
            }
        }
        s0Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        h scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f483d) {
            int[] iArr = f0.a;
            x.z(scrollingChildHelper.f482c);
        }
        scrollingChildHelper.f483d = z2;
    }

    public void setOnFlingListener(n0 n0Var) {
    }

    @Deprecated
    public void setOnScrollListener(p0 p0Var) {
        this.f409a0 = p0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.S = z2;
    }

    public void setRecycledViewPool(r0 r0Var) {
        s0 s0Var = this.a;
        if (s0Var.f2100f != null) {
            r0.f2090b--;
        }
        s0Var.f2100f = r0Var;
        if (r0Var != null) {
            s0Var.f2101g.getAdapter();
        }
    }

    public void setRecyclerListener(t0 t0Var) {
    }

    public void setScrollState(int i2) {
        if (i2 == this.G) {
            return;
        }
        this.G = i2;
        if (i2 != 2) {
            y0 y0Var = this.T;
            y0Var.f2143g.removeCallbacks(y0Var);
            y0Var.f2139c.abortAnimation();
            l0 l0Var = this.f426j;
            if (l0Var != null) {
                l0Var.getClass();
            }
        }
        l0 l0Var2 = this.f426j;
        if (l0Var2 != null) {
            l0Var2.N(i2);
        }
        p0 p0Var = this.f409a0;
        if (p0Var != null) {
            p0Var.a(this, i2);
        }
        ArrayList arrayList = this.f411b0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((p0) this.f411b0.get(size)).a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i2 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.N = scaledTouchSlop;
    }

    public void setViewCacheExtension(x0 x0Var) {
        this.a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.f435s) {
            d("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f435s = false;
                this.f434r = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f435s = true;
            this.f436t = true;
            setScrollState(0);
            y0 y0Var = this.T;
            y0Var.f2143g.removeCallbacks(y0Var);
            y0Var.f2139c.abortAnimation();
            l0 l0Var = this.f426j;
            if (l0Var != null) {
                l0Var.getClass();
            }
        }
    }

    public final int t(z0 z0Var) {
        if (((z0Var.f2147b & 524) != 0) || !z0Var.f()) {
            return -1;
        }
        b bVar = this.f412c;
        z0Var.getClass();
        ArrayList arrayList = bVar.f1979b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((o0.a) arrayList.get(i2)).getClass();
        }
        return 0;
    }

    public final z0 u(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return v(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect w(View view) {
        m0 m0Var = (m0) view.getLayoutParams();
        boolean z2 = m0Var.f2055b;
        Rect rect = m0Var.a;
        if (!z2) {
            return rect;
        }
        if (this.W.f2123f) {
            if (m0Var.b()) {
                return rect;
            }
            m0Var.getClass();
            throw null;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f420g;
            rect2.set(0, 0, 0, 0);
            ((i0) arrayList.get(i2)).getClass();
            ((m0) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        m0Var.f2055b = false;
        return rect;
    }

    public final void x() {
        int iH = this.f414d.h();
        for (int i2 = 0; i2 < iH; i2++) {
            ((m0) this.f414d.g(i2).getLayoutParams()).f2055b = true;
        }
        ArrayList arrayList = this.a.f2097c;
        if (arrayList.size() <= 0) {
            return;
        }
        ((z0) arrayList.get(0)).getClass();
        throw null;
    }

    public final void y() {
        this.f441y++;
    }

    public final void z(boolean z2) {
        int i2 = this.f441y - 1;
        this.f441y = i2;
        if (i2 < 1) {
            this.f441y = 0;
            if (z2) {
                int i3 = this.f437u;
                this.f437u = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f438v;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                        accessibilityEventObtain.setEventType(2048);
                        c0.b.b(accessibilityEventObtain, i3);
                        sendAccessibilityEventUnchecked(accessibilityEventObtain);
                    }
                }
                ArrayList arrayList = this.f425i0;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    arrayList.clear();
                } else {
                    ((z0) arrayList.get(size)).getClass();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:29|(1:31)(10:32|(1:35)|34|73|37|(1:39)(1:40)|41|71|42|48)|36|34|73|37|(0)(0)|41|71|42|48) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0236, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0239, code lost:
    
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024f, code lost:
    
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x026f, code lost:
    
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r3, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0203 A[Catch: ClassCastException -> 0x0270, IllegalAccessException -> 0x028f, InstantiationException -> 0x02ae, InvocationTargetException -> 0x02cb, ClassNotFoundException -> 0x02e8, TryCatch #4 {ClassCastException -> 0x0270, ClassNotFoundException -> 0x02e8, IllegalAccessException -> 0x028f, InstantiationException -> 0x02ae, InvocationTargetException -> 0x02cb, blocks: (B:37:0x01fd, B:39:0x0203, B:41:0x0210, B:42:0x021b, B:48:0x0240, B:46:0x0239, B:50:0x024f, B:51:0x026f, B:40:0x020c), top: B:73:0x01fd }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020c A[Catch: ClassCastException -> 0x0270, IllegalAccessException -> 0x028f, InstantiationException -> 0x02ae, InvocationTargetException -> 0x02cb, ClassNotFoundException -> 0x02e8, TryCatch #4 {ClassCastException -> 0x0270, ClassNotFoundException -> 0x02e8, IllegalAccessException -> 0x028f, InstantiationException -> 0x02ae, InvocationTargetException -> 0x02cb, blocks: (B:37:0x01fd, B:39:0x0203, B:41:0x0210, B:42:0x021b, B:48:0x0240, B:46:0x0239, B:50:0x024f, B:51:0x026f, B:40:0x020c), top: B:73:0x01fd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l0 l0Var = this.f426j;
        if (l0Var != null) {
            return l0Var.o(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }
}
