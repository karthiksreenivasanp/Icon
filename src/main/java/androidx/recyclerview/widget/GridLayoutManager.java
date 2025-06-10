package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.h;
import c0.g;
import g.n2;
import o0.l0;
import o0.m0;
import o0.s0;
import o0.t;
import o0.w0;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final n2 A;
    public final Rect B;

    /* renamed from: v, reason: collision with root package name */
    public int f391v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f392w;

    /* renamed from: x, reason: collision with root package name */
    public View[] f393x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseIntArray f394y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseIntArray f395z;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f391v = -1;
        this.f394y = new SparseIntArray();
        this.f395z = new SparseIntArray();
        this.A = new n2(1);
        this.B = new Rect();
        A0(l0.z(context, attributeSet, i2, i3).f2042b);
    }

    @Override // o0.l0
    public final int A(s0 s0Var, w0 w0Var) {
        if (this.k == 0) {
            return this.f391v;
        }
        if (w0Var.a() < 1) {
            return 0;
        }
        return w0(w0Var.a() - 1, s0Var, w0Var) + 1;
    }

    public final void A0(int i2) {
        if (i2 == this.f391v) {
            return;
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
        this.f391v = i2;
        this.A.d();
        T();
    }

    public final void B0() {
        int iU;
        int iX;
        if (this.k == 1) {
            iU = this.f2053i - w();
            iX = v();
        } else {
            iU = this.f2054j - u();
            iX = x();
        }
        u0(iU - iX);
    }

    @Override // o0.l0
    public final void K(s0 s0Var, w0 w0Var, View view, g gVar) {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof t)) {
            J(view, gVar);
            return;
        }
        t tVar = (t) layoutParams;
        int iW0 = w0(tVar.a(), s0Var, w0Var);
        int i4 = 1;
        if (this.k == 0) {
            iW0 = tVar.f2102d;
            i2 = iW0;
            i3 = 1;
            i4 = tVar.f2103e;
        } else {
            i2 = tVar.f2102d;
            i3 = tVar.f2103e;
        }
        gVar.f(h.a(iW0, i4, i2, i3, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o0.l0
    public final int U(int i2, s0 s0Var, w0 w0Var) {
        B0();
        View[] viewArr = this.f393x;
        if (viewArr == null || viewArr.length != this.f391v) {
            this.f393x = new View[this.f391v];
        }
        return super.U(i2, s0Var, w0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o0.l0
    public final int V(int i2, s0 s0Var, w0 w0Var) {
        B0();
        View[] viewArr = this.f393x;
        if (viewArr == null || viewArr.length != this.f391v) {
            this.f393x = new View[this.f391v];
        }
        return super.V(i2, s0Var, w0Var);
    }

    @Override // o0.l0
    public final boolean e(m0 m0Var) {
        return m0Var instanceof t;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o0.l0
    public final int h(w0 w0Var) {
        return b0(w0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o0.l0
    public final int i(w0 w0Var) {
        return c0(w0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o0.l0
    public final int k(w0 w0Var) {
        return b0(w0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o0.l0
    public final int l(w0 w0Var) {
        return c0(w0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o0.l0
    public final m0 m() {
        return this.k == 0 ? new t(-2, -1) : new t(-1, -2);
    }

    @Override // o0.l0
    public final m0 n(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v42 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0(o0.s0 r20, o0.w0 r21, o0.x r22, o0.w r23) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.n0(o0.s0, o0.w0, o0.x, o0.w):void");
    }

    @Override // o0.l0
    public final m0 o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t((ViewGroup.MarginLayoutParams) layoutParams) : new t(layoutParams);
    }

    @Override // o0.l0
    public final int s(s0 s0Var, w0 w0Var) {
        if (this.k == 1) {
            return this.f391v;
        }
        if (w0Var.a() < 1) {
            return 0;
        }
        return w0(w0Var.a() - 1, s0Var, w0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void s0(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.s0(false);
    }

    public final void u0(int i2) {
        int i3;
        int[] iArr = this.f392w;
        int i4 = this.f391v;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f392w = iArr;
    }

    public final int v0(int i2, int i3) {
        if (this.k != 1 || !m0()) {
            int[] iArr = this.f392w;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f392w;
        int i4 = this.f391v;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public final int w0(int i2, s0 s0Var, w0 w0Var) {
        boolean z2 = w0Var.f2123f;
        n2 n2Var = this.A;
        if (!z2) {
            return n2Var.a(i2, this.f391v);
        }
        int iB = s0Var.b(i2);
        if (iB != -1) {
            return n2Var.a(iB, this.f391v);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    public final int x0(int i2, s0 s0Var, w0 w0Var) {
        boolean z2 = w0Var.f2123f;
        n2 n2Var = this.A;
        if (!z2) {
            return n2Var.b(i2, this.f391v);
        }
        int i3 = this.f395z.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = s0Var.b(i2);
        if (iB != -1) {
            return n2Var.b(iB, this.f391v);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    public final int y0(int i2, s0 s0Var, w0 w0Var) {
        boolean z2 = w0Var.f2123f;
        n2 n2Var = this.A;
        if (!z2) {
            n2Var.getClass();
            return 1;
        }
        int i3 = this.f394y.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (s0Var.b(i2) != -1) {
            n2Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    public final void z0(View view, int i2, boolean z2) {
        int iR;
        int iR2;
        t tVar = (t) view.getLayoutParams();
        Rect rect = tVar.a;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) tVar).topMargin + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) tVar).leftMargin + ((ViewGroup.MarginLayoutParams) tVar).rightMargin;
        int iV0 = v0(tVar.f2102d, tVar.f2103e);
        if (this.k == 1) {
            iR2 = l0.r(false, iV0, i2, i4, ((ViewGroup.MarginLayoutParams) tVar).width);
            iR = l0.r(true, this.f397m.i(), this.f2052h, i3, ((ViewGroup.MarginLayoutParams) tVar).height);
        } else {
            int iR3 = l0.r(false, iV0, i2, i3, ((ViewGroup.MarginLayoutParams) tVar).height);
            int iR4 = l0.r(true, this.f397m.i(), this.f2051g, i4, ((ViewGroup.MarginLayoutParams) tVar).width);
            iR = iR3;
            iR2 = iR4;
        }
        m0 m0Var = (m0) view.getLayoutParams();
        if (z2 ? Y(view, iR2, iR, m0Var) : X(view, iR2, iR, m0Var)) {
            view.measure(iR2, iR);
        }
    }
}
