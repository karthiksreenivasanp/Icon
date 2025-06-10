package o0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class l0 {
    public d a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2046b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f2047c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f2048d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2049e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2050f;

    /* renamed from: g, reason: collision with root package name */
    public int f2051g;

    /* renamed from: h, reason: collision with root package name */
    public int f2052h;

    /* renamed from: i, reason: collision with root package name */
    public int f2053i;

    /* renamed from: j, reason: collision with root package name */
    public int f2054j;

    public l0() {
        j0 j0Var = new j0(0, this);
        j0 j0Var2 = new j0(1, this);
        this.f2047c = new j1(j0Var);
        this.f2048d = new j1(j0Var2);
        this.f2049e = false;
        this.f2050f = true;
    }

    public static boolean D(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    public static void E(View view, int i2, int i3, int i4, int i5) {
        m0 m0Var = (m0) view.getLayoutParams();
        Rect rect = m0Var.a;
        view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) m0Var).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) m0Var).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) m0Var).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin);
    }

    public static int f(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1a
            if (r8 < 0) goto L11
            goto L1c
        L11:
            if (r8 != r1) goto L2f
            if (r6 == r2) goto L20
            if (r6 == 0) goto L2f
            if (r6 == r3) goto L20
            goto L2f
        L1a:
            if (r8 < 0) goto L1e
        L1c:
            r6 = r3
            goto L31
        L1e:
            if (r8 != r1) goto L22
        L20:
            r8 = r5
            goto L31
        L22:
            if (r8 != r0) goto L2f
            if (r6 == r2) goto L2c
            if (r6 != r3) goto L29
            goto L2c
        L29:
            r8 = r5
            r6 = r7
            goto L31
        L2c:
            r8 = r5
            r6 = r2
            goto L31
        L2f:
            r6 = r7
            r8 = r6
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.l0.r(boolean, int, int, int, int):int");
    }

    public static int y(View view) {
        return ((m0) view.getLayoutParams()).a();
    }

    public static k0 z(Context context, AttributeSet attributeSet, int i2, int i3) {
        k0 k0Var = new k0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n0.a.a, i2, i3);
        k0Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        k0Var.f2042b = typedArrayObtainStyledAttributes.getInt(10, 1);
        k0Var.f2043c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        k0Var.f2044d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return k0Var;
    }

    public int A(s0 s0Var, w0 w0Var) {
        return 1;
    }

    public final void B(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((m0) view.getLayoutParams()).a;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2046b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2046b.f424i;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean C() {
        return false;
    }

    public void F(int i2) {
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null) {
            int iE = recyclerView.f414d.e();
            for (int i3 = 0; i3 < iE; i3++) {
                recyclerView.f414d.d(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void G(int i2) {
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null) {
            int iE = recyclerView.f414d.e();
            for (int i3 = 0; i3 < iE; i3++) {
                recyclerView.f414d.d(i3).offsetTopAndBottom(i2);
            }
        }
    }

    public void H(RecyclerView recyclerView) {
    }

    public void I(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2046b;
        s0 s0Var = recyclerView.a;
        w0 w0Var = recyclerView.W;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2046b.canScrollVertically(-1) && !this.f2046b.canScrollHorizontally(-1) && !this.f2046b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f2046b.getClass();
    }

    public final void J(View view, c0.g gVar) {
        z0 z0VarV = RecyclerView.v(view);
        if (z0VarV == null || z0VarV.i()) {
            return;
        }
        d dVar = this.a;
        z0VarV.getClass();
        if (dVar.j(null)) {
            return;
        }
        RecyclerView recyclerView = this.f2046b;
        K(recyclerView.a, recyclerView.W, view, gVar);
    }

    public void K(s0 s0Var, w0 w0Var, View view, c0.g gVar) {
        gVar.f(androidx.fragment.app.h.a(d() ? y(view) : 0, 1, c() ? y(view) : 0, 1, false));
    }

    public void L(Parcelable parcelable) {
    }

    public Parcelable M() {
        return null;
    }

    public void N(int i2) {
    }

    public final void O(s0 s0Var) {
        int iQ = q();
        while (true) {
            iQ--;
            if (iQ < 0) {
                return;
            }
            if (!RecyclerView.v(p(iQ)).n()) {
                View viewP = p(iQ);
                R(iQ);
                s0Var.g(viewP);
            }
        }
    }

    public final void P(s0 s0Var) {
        ArrayList arrayList;
        int size = s0Var.a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = s0Var.a;
            if (i2 < 0) {
                break;
            }
            ((z0) arrayList.get(i2)).getClass();
            z0 z0VarV = RecyclerView.v(null);
            if (!z0VarV.n()) {
                z0VarV.m(false);
                if (z0VarV.k()) {
                    this.f2046b.removeDetachedView(null, false);
                }
                h0 h0Var = this.f2046b.F;
                if (h0Var != null) {
                    h0Var.c(z0VarV);
                }
                z0VarV.m(true);
                z0 z0VarV2 = RecyclerView.v(null);
                z0VarV2.f2148c = null;
                z0VarV2.f2149d = false;
                z0VarV2.f2147b &= -33;
                s0Var.h(z0VarV2);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = s0Var.f2096b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2046b.invalidate();
        }
    }

    public final void Q(View view, s0 s0Var) {
        d dVar = this.a;
        d0 d0Var = dVar.a;
        int iIndexOfChild = d0Var.a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (dVar.f1986b.f(iIndexOfChild)) {
                dVar.k(view);
            }
            d0Var.b(iIndexOfChild);
        }
        s0Var.g(view);
    }

    public final void R(int i2) {
        if (p(i2) != null) {
            d dVar = this.a;
            int iF = dVar.f(i2);
            d0 d0Var = dVar.a;
            View childAt = d0Var.a.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            if (dVar.f1986b.f(iF)) {
                dVar.k(childAt);
            }
            d0Var.b(iF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean S(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.v()
            int r1 = r8.x()
            int r2 = r8.f2053i
            int r3 = r8.w()
            int r2 = r2 - r3
            int r3 = r8.f2054j
            int r4 = r8.u()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f2046b
            int[] r7 = b0.f0.a
            int r3 = b0.s.d(r3)
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            if (r13 == 0) goto Laf
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L78
            goto Lac
        L78:
            int r11 = r8.v()
            int r13 = r8.x()
            int r3 = r8.f2053i
            int r4 = r8.w()
            int r3 = r3 - r4
            int r4 = r8.f2054j
            int r5 = r8.u()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f2046b
            android.graphics.Rect r5 = r5.f420g
            r8.t(r10, r5)
            int r8 = r5.left
            int r8 = r8 - r2
            if (r8 >= r3) goto Lac
            int r8 = r5.right
            int r8 = r8 - r2
            if (r8 <= r11) goto Lac
            int r8 = r5.top
            int r8 = r8 - r1
            if (r8 >= r4) goto Lac
            int r8 = r5.bottom
            int r8 = r8 - r1
            if (r8 > r13) goto Laa
            goto Lac
        Laa:
            r8 = r7
            goto Lad
        Lac:
            r8 = r0
        Lad:
            if (r8 == 0) goto Lb4
        Laf:
            if (r2 != 0) goto Lb5
            if (r1 == 0) goto Lb4
            goto Lb5
        Lb4:
            return r0
        Lb5:
            if (r12 == 0) goto Lbb
            r9.scrollBy(r2, r1)
            goto Lbe
        Lbb:
            r9.H(r2, r1, r0)
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.l0.S(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void T() {
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int U(int i2, s0 s0Var, w0 w0Var);

    public int V(int i2, s0 s0Var, w0 w0Var) {
        return 0;
    }

    public final void W(RecyclerView recyclerView) {
        int height;
        if (recyclerView == null) {
            this.f2046b = null;
            this.a = null;
            height = 0;
            this.f2053i = 0;
        } else {
            this.f2046b = recyclerView;
            this.a = recyclerView.f414d;
            this.f2053i = recyclerView.getWidth();
            height = recyclerView.getHeight();
        }
        this.f2054j = height;
        this.f2051g = 1073741824;
        this.f2052h = 1073741824;
    }

    public final boolean X(View view, int i2, int i3, m0 m0Var) {
        return (!view.isLayoutRequested() && this.f2050f && D(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) m0Var).width) && D(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) m0Var).height)) ? false : true;
    }

    public final boolean Y(View view, int i2, int i3, m0 m0Var) {
        return (this.f2050f && D(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) m0Var).width) && D(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) m0Var).height)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r6, int r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.l0.a(android.view.View, int, boolean):void");
    }

    public void b(String str) {
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null) {
            recyclerView.d(str);
        }
    }

    public abstract boolean c();

    public boolean d() {
        return false;
    }

    public boolean e(m0 m0Var) {
        return m0Var != null;
    }

    public abstract int g(w0 w0Var);

    public abstract int h(w0 w0Var);

    public abstract int i(w0 w0Var);

    public int j(w0 w0Var) {
        return 0;
    }

    public int k(w0 w0Var) {
        return 0;
    }

    public int l(w0 w0Var) {
        return 0;
    }

    public abstract m0 m();

    public m0 n(Context context, AttributeSet attributeSet) {
        return new m0(context, attributeSet);
    }

    public m0 o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m0 ? new m0((m0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m0((ViewGroup.MarginLayoutParams) layoutParams) : new m0(layoutParams);
    }

    public final View p(int i2) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.d(i2);
        }
        return null;
    }

    public final int q() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.e();
        }
        return 0;
    }

    public int s(s0 s0Var, w0 w0Var) {
        return 1;
    }

    public void t(View view, Rect rect) {
        int[] iArr = RecyclerView.f406k0;
        m0 m0Var = (m0) view.getLayoutParams();
        Rect rect2 = m0Var.a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) m0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) m0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) m0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin);
    }

    public final int u() {
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int v() {
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int w() {
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int x() {
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }
}
