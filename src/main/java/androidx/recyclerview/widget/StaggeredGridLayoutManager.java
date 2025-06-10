package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.h;
import b0.f0;
import b0.s;
import c0.g;
import i1.e;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import o0.b0;
import o0.c1;
import o0.e1;
import o0.f1;
import o0.j1;
import o0.k0;
import o0.l;
import o0.l0;
import o0.m0;
import o0.s0;
import o0.u;
import o0.w0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends l0 {
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public f1[] f443l;

    /* renamed from: m, reason: collision with root package name */
    public b0 f444m;

    /* renamed from: n, reason: collision with root package name */
    public b0 f445n;

    /* renamed from: o, reason: collision with root package name */
    public int f446o;

    /* renamed from: p, reason: collision with root package name */
    public final u f447p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f448q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f449r = false;

    /* renamed from: s, reason: collision with root package name */
    public BitSet f450s;

    /* renamed from: t, reason: collision with root package name */
    public final j1 f451t;

    /* renamed from: u, reason: collision with root package name */
    public final int f452u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f453v;

    /* renamed from: w, reason: collision with root package name */
    public e1 f454w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f455x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f456y;

    /* renamed from: z, reason: collision with root package name */
    public final l f457z;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.k = -1;
        this.f448q = false;
        j1 j1Var = new j1(1);
        this.f451t = j1Var;
        this.f452u = 2;
        this.f455x = new Rect();
        new e(this);
        this.f456y = true;
        this.f457z = new l(1, this);
        k0 k0VarZ = l0.z(context, attributeSet, i2, i3);
        int i4 = k0VarZ.a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        b(null);
        if (i4 != this.f446o) {
            this.f446o = i4;
            b0 b0Var = this.f444m;
            this.f444m = this.f445n;
            this.f445n = b0Var;
            T();
        }
        int i5 = k0VarZ.f2042b;
        b(null);
        if (i5 != this.k) {
            j1Var.c();
            T();
            this.k = i5;
            this.f450s = new BitSet(this.k);
            this.f443l = new f1[this.k];
            for (int i6 = 0; i6 < this.k; i6++) {
                this.f443l[i6] = new f1(this, i6);
            }
            T();
        }
        boolean z2 = k0VarZ.f2043c;
        b(null);
        e1 e1Var = this.f454w;
        if (e1Var != null && e1Var.f1999h != z2) {
            e1Var.f1999h = z2;
        }
        this.f448q = z2;
        T();
        this.f447p = new u();
        this.f444m = b0.a(this, this.f446o);
        this.f445n = b0.a(this, 1 - this.f446o);
    }

    public static int v0(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    @Override // o0.l0
    public final int A(s0 s0Var, w0 w0Var) {
        return this.f446o == 0 ? this.k : super.A(s0Var, w0Var);
    }

    @Override // o0.l0
    public final boolean C() {
        return this.f452u != 0;
    }

    @Override // o0.l0
    public final void F(int i2) {
        super.F(i2);
        for (int i3 = 0; i3 < this.k; i3++) {
            f1 f1Var = this.f443l[i3];
            int i4 = f1Var.f2006b;
            if (i4 != Integer.MIN_VALUE) {
                f1Var.f2006b = i4 + i2;
            }
            int i5 = f1Var.f2007c;
            if (i5 != Integer.MIN_VALUE) {
                f1Var.f2007c = i5 + i2;
            }
        }
    }

    @Override // o0.l0
    public final void G(int i2) {
        super.G(i2);
        for (int i3 = 0; i3 < this.k; i3++) {
            f1 f1Var = this.f443l[i3];
            int i4 = f1Var.f2006b;
            if (i4 != Integer.MIN_VALUE) {
                f1Var.f2006b = i4 + i2;
            }
            int i5 = f1Var.f2007c;
            if (i5 != Integer.MIN_VALUE) {
                f1Var.f2007c = i5 + i2;
            }
        }
    }

    @Override // o0.l0
    public final void H(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2046b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f457z);
        }
        for (int i2 = 0; i2 < this.k; i2++) {
            this.f443l[i2].b();
        }
        recyclerView.requestLayout();
    }

    @Override // o0.l0
    public final void I(AccessibilityEvent accessibilityEvent) {
        super.I(accessibilityEvent);
        if (q() > 0) {
            View viewF0 = f0(false);
            View viewE0 = e0(false);
            if (viewF0 == null || viewE0 == null) {
                return;
            }
            int iY = l0.y(viewF0);
            int iY2 = l0.y(viewE0);
            if (iY < iY2) {
                accessibilityEvent.setFromIndex(iY);
                accessibilityEvent.setToIndex(iY2);
            } else {
                accessibilityEvent.setFromIndex(iY2);
                accessibilityEvent.setToIndex(iY);
            }
        }
    }

    @Override // o0.l0
    public final void K(s0 s0Var, w0 w0Var, View view, g gVar) {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c1)) {
            J(view, gVar);
            return;
        }
        c1 c1Var = (c1) layoutParams;
        int i4 = 1;
        int i5 = -1;
        if (this.f446o == 0) {
            f1 f1Var = c1Var.f1985d;
            i3 = f1Var == null ? -1 : f1Var.f2009e;
            i2 = -1;
        } else {
            f1 f1Var2 = c1Var.f1985d;
            i2 = f1Var2 == null ? -1 : f1Var2.f2009e;
            i3 = -1;
            i5 = 1;
            i4 = -1;
        }
        gVar.f(h.a(i3, i4, i2, i5, false));
    }

    @Override // o0.l0
    public final void L(Parcelable parcelable) {
        if (parcelable instanceof e1) {
            this.f454w = (e1) parcelable;
            T();
        }
    }

    @Override // o0.l0
    public final Parcelable M() {
        int iE;
        int iH;
        int[] iArr;
        e1 e1Var = this.f454w;
        if (e1Var != null) {
            return new e1(e1Var);
        }
        e1 e1Var2 = new e1();
        e1Var2.f1999h = this.f448q;
        e1Var2.f2000i = this.f453v;
        e1Var2.f2001j = false;
        j1 j1Var = this.f451t;
        if (j1Var == null || (iArr = (int[]) j1Var.f2029b) == null) {
            e1Var2.f1996e = 0;
        } else {
            e1Var2.f1997f = iArr;
            e1Var2.f1996e = iArr.length;
            e1Var2.f1998g = (List) j1Var.f2030c;
        }
        if (q() > 0) {
            e1Var2.a = this.f453v ? h0() : g0();
            View viewE0 = this.f449r ? e0(true) : f0(true);
            e1Var2.f1993b = viewE0 != null ? l0.y(viewE0) : -1;
            int i2 = this.k;
            e1Var2.f1994c = i2;
            e1Var2.f1995d = new int[i2];
            for (int i3 = 0; i3 < this.k; i3++) {
                if (this.f453v) {
                    iE = this.f443l[i3].c(Integer.MIN_VALUE);
                    if (iE != Integer.MIN_VALUE) {
                        iH = this.f444m.f();
                        iE -= iH;
                    }
                } else {
                    iE = this.f443l[i3].e(Integer.MIN_VALUE);
                    if (iE != Integer.MIN_VALUE) {
                        iH = this.f444m.h();
                        iE -= iH;
                    }
                }
                e1Var2.f1995d[i3] = iE;
            }
        } else {
            e1Var2.a = -1;
            e1Var2.f1993b = -1;
            e1Var2.f1994c = 0;
        }
        return e1Var2;
    }

    @Override // o0.l0
    public final void N(int i2) {
        if (i2 == 0) {
            Z();
        }
    }

    @Override // o0.l0
    public final int U(int i2, s0 s0Var, w0 w0Var) {
        return r0(i2, s0Var, w0Var);
    }

    @Override // o0.l0
    public final int V(int i2, s0 s0Var, w0 w0Var) {
        return r0(i2, s0Var, w0Var);
    }

    public final boolean Z() {
        int iG0;
        if (q() != 0 && this.f452u != 0 && this.f2049e) {
            if (this.f449r) {
                iG0 = h0();
                g0();
            } else {
                iG0 = g0();
                h0();
            }
            if (iG0 == 0 && k0() != null) {
                this.f451t.c();
                T();
                return true;
            }
        }
        return false;
    }

    public final int a0(w0 w0Var) {
        if (q() == 0) {
            return 0;
        }
        b0 b0Var = this.f444m;
        boolean z2 = this.f456y;
        return f1.e.y(w0Var, b0Var, f0(!z2), e0(!z2), this, this.f456y);
    }

    @Override // o0.l0
    public final void b(String str) {
        if (this.f454w == null) {
            super.b(str);
        }
    }

    public final int b0(w0 w0Var) {
        if (q() == 0) {
            return 0;
        }
        b0 b0Var = this.f444m;
        boolean z2 = this.f456y;
        return f1.e.z(w0Var, b0Var, f0(!z2), e0(!z2), this, this.f456y, this.f449r);
    }

    @Override // o0.l0
    public final boolean c() {
        return this.f446o == 0;
    }

    public final int c0(w0 w0Var) {
        if (q() == 0) {
            return 0;
        }
        b0 b0Var = this.f444m;
        boolean z2 = this.f456y;
        return f1.e.A(w0Var, b0Var, f0(!z2), e0(!z2), this, this.f456y);
    }

    @Override // o0.l0
    public final boolean d() {
        return this.f446o == 1;
    }

    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    public final int d0(s0 s0Var, u uVar, w0 w0Var) {
        f1 f1Var;
        ?? r8;
        int iR;
        int iR2;
        int i2;
        int iE;
        int iC;
        int iH;
        int iC2;
        int i3;
        s0 s0Var2 = s0Var;
        int i4 = 0;
        this.f450s.set(0, this.k, true);
        u uVar2 = this.f447p;
        int i5 = uVar2.f2111i ? uVar.f2107e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : uVar.f2107e == 1 ? uVar.f2109g + uVar.f2104b : uVar.f2108f - uVar.f2104b;
        int i6 = uVar.f2107e;
        for (int i7 = 0; i7 < this.k; i7++) {
            if (!this.f443l[i7].a.isEmpty()) {
                u0(this.f443l[i7], i6, i5);
            }
        }
        int iF = this.f449r ? this.f444m.f() : this.f444m.h();
        int i8 = 1;
        boolean z2 = false;
        while (true) {
            int i9 = uVar.f2105c;
            int i10 = -1;
            if (((i9 < 0 || i9 >= w0Var.a()) ? i4 : i8) == 0 || (!uVar2.f2111i && this.f450s.isEmpty())) {
                break;
            }
            View viewD = s0Var2.d(uVar.f2105c);
            uVar.f2105c += uVar.f2106d;
            c1 c1Var = (c1) viewD.getLayoutParams();
            int iA = c1Var.a();
            j1 j1Var = this.f451t;
            int[] iArr = (int[]) j1Var.f2029b;
            int i11 = (iArr == null || iA >= iArr.length) ? -1 : iArr[iA];
            if ((i11 == -1 ? i8 : i4) != 0) {
                if (m0(uVar.f2107e)) {
                    i4 = this.k - i8;
                    i3 = -1;
                } else {
                    i10 = this.k;
                    i3 = i8;
                }
                f1Var = null;
                if (uVar.f2107e == i8) {
                    int iH2 = this.f444m.h();
                    int i12 = Integer.MAX_VALUE;
                    while (true) {
                        f1 f1Var2 = f1Var;
                        if (i4 == i10) {
                            break;
                        }
                        f1Var = this.f443l[i4];
                        int iC3 = f1Var.c(iH2);
                        if (iC3 < i12) {
                            i12 = iC3;
                        } else {
                            f1Var = f1Var2;
                        }
                        i4 += i3;
                    }
                } else {
                    int iF2 = this.f444m.f();
                    int i13 = Integer.MIN_VALUE;
                    while (i4 != i10) {
                        f1 f1Var3 = this.f443l[i4];
                        int i14 = i10;
                        int iE2 = f1Var3.e(iF2);
                        if (iE2 > i13) {
                            i13 = iE2;
                            f1Var = f1Var3;
                        }
                        i4 += i3;
                        i10 = i14;
                    }
                }
                j1Var.d(iA);
                ((int[]) j1Var.f2029b)[iA] = f1Var.f2009e;
            } else {
                f1Var = this.f443l[i11];
            }
            c1Var.f1985d = f1Var;
            if (uVar.f2107e == 1) {
                r8 = 0;
                a(viewD, -1, false);
            } else {
                r8 = 0;
                a(viewD, 0, false);
            }
            if (this.f446o == 1) {
                iR = l0.r(r8, 0, this.f2051g, r8, ((ViewGroup.MarginLayoutParams) c1Var).width);
                iR2 = l0.r(true, this.f2054j, this.f2052h, u() + x(), ((ViewGroup.MarginLayoutParams) c1Var).height);
                i2 = 0;
            } else {
                iR = l0.r(true, this.f2053i, this.f2051g, w() + v(), ((ViewGroup.MarginLayoutParams) c1Var).width);
                iR2 = l0.r(false, 0, this.f2052h, 0, ((ViewGroup.MarginLayoutParams) c1Var).height);
                i2 = 0;
            }
            RecyclerView recyclerView = this.f2046b;
            Rect rect = this.f455x;
            if (recyclerView == null) {
                rect.set(i2, i2, i2, i2);
            } else {
                rect.set(recyclerView.w(viewD));
            }
            c1 c1Var2 = (c1) viewD.getLayoutParams();
            int iV0 = v0(iR, ((ViewGroup.MarginLayoutParams) c1Var2).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1Var2).rightMargin + rect.right);
            int iV02 = v0(iR2, ((ViewGroup.MarginLayoutParams) c1Var2).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1Var2).bottomMargin + rect.bottom);
            if (X(viewD, iV0, iV02, c1Var2)) {
                viewD.measure(iV0, iV02);
            }
            if (uVar.f2107e == 1) {
                iC = f1Var.c(iF);
                iE = this.f444m.c(viewD) + iC;
            } else {
                iE = f1Var.e(iF);
                iC = iE - this.f444m.c(viewD);
            }
            int i15 = uVar.f2107e;
            f1 f1Var4 = c1Var.f1985d;
            f1Var4.getClass();
            if (i15 == 1) {
                c1 c1Var3 = (c1) viewD.getLayoutParams();
                c1Var3.f1985d = f1Var4;
                ArrayList arrayList = f1Var4.a;
                arrayList.add(viewD);
                f1Var4.f2007c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    f1Var4.f2006b = Integer.MIN_VALUE;
                }
                if (c1Var3.c() || c1Var3.b()) {
                    f1Var4.f2008d = f1Var4.f2010f.f444m.c(viewD) + f1Var4.f2008d;
                }
            } else {
                c1 c1Var4 = (c1) viewD.getLayoutParams();
                c1Var4.f1985d = f1Var4;
                ArrayList arrayList2 = f1Var4.a;
                arrayList2.add(0, viewD);
                f1Var4.f2006b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    f1Var4.f2007c = Integer.MIN_VALUE;
                }
                if (c1Var4.c() || c1Var4.b()) {
                    f1Var4.f2008d = f1Var4.f2010f.f444m.c(viewD) + f1Var4.f2008d;
                }
            }
            if (l0() && this.f446o == 1) {
                iC2 = this.f445n.f() - (((this.k - 1) - f1Var.f2009e) * 0);
                iH = iC2 - this.f445n.c(viewD);
            } else {
                iH = this.f445n.h() + (f1Var.f2009e * 0);
                iC2 = this.f445n.c(viewD) + iH;
            }
            if (this.f446o == 1) {
                int i16 = iH;
                iH = iC;
                iC = i16;
                int i17 = iC2;
                iC2 = iE;
                iE = i17;
            }
            l0.E(viewD, iC, iH, iE, iC2);
            u0(f1Var, uVar2.f2107e, i5);
            s0Var2 = s0Var;
            o0(s0Var2, uVar2);
            if (uVar2.f2110h && viewD.hasFocusable()) {
                this.f450s.set(f1Var.f2009e, false);
                i4 = 0;
            } else {
                i4 = 0;
            }
            z2 = true;
            i8 = 1;
        }
        if (!z2) {
            o0(s0Var2, uVar2);
        }
        int iH3 = uVar2.f2107e == -1 ? this.f444m.h() - j0(this.f444m.h()) : i0(this.f444m.f()) - this.f444m.f();
        return iH3 > 0 ? Math.min(uVar.f2104b, iH3) : i4;
    }

    @Override // o0.l0
    public final boolean e(m0 m0Var) {
        return m0Var instanceof c1;
    }

    public final View e0(boolean z2) {
        int iH = this.f444m.h();
        int iF = this.f444m.f();
        View view = null;
        for (int iQ = q() - 1; iQ >= 0; iQ--) {
            View viewP = p(iQ);
            int iD = this.f444m.d(viewP);
            int iB = this.f444m.b(viewP);
            if (iB > iH && iD < iF) {
                if (iB <= iF || !z2) {
                    return viewP;
                }
                if (view == null) {
                    view = viewP;
                }
            }
        }
        return view;
    }

    public final View f0(boolean z2) {
        int iH = this.f444m.h();
        int iF = this.f444m.f();
        int iQ = q();
        View view = null;
        for (int i2 = 0; i2 < iQ; i2++) {
            View viewP = p(i2);
            int iD = this.f444m.d(viewP);
            if (this.f444m.b(viewP) > iH && iD < iF) {
                if (iD >= iH || !z2) {
                    return viewP;
                }
                if (view == null) {
                    view = viewP;
                }
            }
        }
        return view;
    }

    @Override // o0.l0
    public final int g(w0 w0Var) {
        return a0(w0Var);
    }

    public final int g0() {
        if (q() == 0) {
            return 0;
        }
        return l0.y(p(0));
    }

    @Override // o0.l0
    public final int h(w0 w0Var) {
        return b0(w0Var);
    }

    public final int h0() {
        int iQ = q();
        if (iQ == 0) {
            return 0;
        }
        return l0.y(p(iQ - 1));
    }

    @Override // o0.l0
    public final int i(w0 w0Var) {
        return c0(w0Var);
    }

    public final int i0(int i2) {
        int iC = this.f443l[0].c(i2);
        for (int i3 = 1; i3 < this.k; i3++) {
            int iC2 = this.f443l[i3].c(i2);
            if (iC2 > iC) {
                iC = iC2;
            }
        }
        return iC;
    }

    @Override // o0.l0
    public final int j(w0 w0Var) {
        return a0(w0Var);
    }

    public final int j0(int i2) {
        int iE = this.f443l[0].e(i2);
        for (int i3 = 1; i3 < this.k; i3++) {
            int iE2 = this.f443l[i3].e(i2);
            if (iE2 < iE) {
                iE = iE2;
            }
        }
        return iE;
    }

    @Override // o0.l0
    public final int k(w0 w0Var) {
        return b0(w0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View k0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.k0():android.view.View");
    }

    @Override // o0.l0
    public final int l(w0 w0Var) {
        return c0(w0Var);
    }

    public final boolean l0() {
        RecyclerView recyclerView = this.f2046b;
        int[] iArr = f0.a;
        return s.d(recyclerView) == 1;
    }

    @Override // o0.l0
    public final m0 m() {
        return this.f446o == 0 ? new c1(-2, -1) : new c1(-1, -2);
    }

    public final boolean m0(int i2) {
        if (this.f446o == 0) {
            return (i2 == -1) != this.f449r;
        }
        return ((i2 == -1) == this.f449r) == l0();
    }

    @Override // o0.l0
    public final m0 n(Context context, AttributeSet attributeSet) {
        return new c1(context, attributeSet);
    }

    public final void n0(int i2, w0 w0Var) {
        int iG0;
        int i3;
        if (i2 > 0) {
            iG0 = h0();
            i3 = 1;
        } else {
            iG0 = g0();
            i3 = -1;
        }
        u uVar = this.f447p;
        uVar.a = true;
        t0(iG0, w0Var);
        s0(i3);
        uVar.f2105c = iG0 + uVar.f2106d;
        uVar.f2104b = Math.abs(i2);
    }

    @Override // o0.l0
    public final m0 o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c1((ViewGroup.MarginLayoutParams) layoutParams) : new c1(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if (r6.f2107e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0(o0.s0 r5, o0.u r6) {
        /*
            r4 = this;
            boolean r0 = r6.a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f2111i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f2104b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f2107e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f2109g
        L15:
            r4.p0(r6, r5)
            goto L7c
        L19:
            int r6 = r6.f2108f
        L1b:
            r4.q0(r6, r5)
            goto L7c
        L1f:
            int r0 = r6.f2107e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f2108f
            o0.f1[] r1 = r4.f443l
            r1 = r1[r2]
            int r1 = r1.e(r0)
        L2f:
            int r2 = r4.k
            if (r3 >= r2) goto L41
            o0.f1[] r2 = r4.f443l
            r2 = r2[r3]
            int r2 = r2.e(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f2109g
            int r6 = r6.f2104b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f2109g
            o0.f1[] r1 = r4.f443l
            r1 = r1[r2]
            int r1 = r1.c(r0)
        L5a:
            int r2 = r4.k
            if (r3 >= r2) goto L6c
            o0.f1[] r2 = r4.f443l
            r2 = r2[r3]
            int r2 = r2.c(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f2109g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f2108f
            int r6 = r6.f2104b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0(o0.s0, o0.u):void");
    }

    public final void p0(int i2, s0 s0Var) {
        for (int iQ = q() - 1; iQ >= 0; iQ--) {
            View viewP = p(iQ);
            if (this.f444m.d(viewP) < i2 || this.f444m.k(viewP) < i2) {
                return;
            }
            c1 c1Var = (c1) viewP.getLayoutParams();
            c1Var.getClass();
            if (c1Var.f1985d.a.size() == 1) {
                return;
            }
            f1 f1Var = c1Var.f1985d;
            ArrayList arrayList = f1Var.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            c1 c1VarD = f1.d(view);
            c1VarD.f1985d = null;
            if (c1VarD.c() || c1VarD.b()) {
                f1Var.f2008d -= f1Var.f2010f.f444m.c(view);
            }
            if (size == 1) {
                f1Var.f2006b = Integer.MIN_VALUE;
            }
            f1Var.f2007c = Integer.MIN_VALUE;
            Q(viewP, s0Var);
        }
    }

    public final void q0(int i2, s0 s0Var) {
        while (q() > 0) {
            View viewP = p(0);
            if (this.f444m.b(viewP) > i2 || this.f444m.j(viewP) > i2) {
                return;
            }
            c1 c1Var = (c1) viewP.getLayoutParams();
            c1Var.getClass();
            if (c1Var.f1985d.a.size() == 1) {
                return;
            }
            f1 f1Var = c1Var.f1985d;
            ArrayList arrayList = f1Var.a;
            View view = (View) arrayList.remove(0);
            c1 c1VarD = f1.d(view);
            c1VarD.f1985d = null;
            if (arrayList.size() == 0) {
                f1Var.f2007c = Integer.MIN_VALUE;
            }
            if (c1VarD.c() || c1VarD.b()) {
                f1Var.f2008d -= f1Var.f2010f.f444m.c(view);
            }
            f1Var.f2006b = Integer.MIN_VALUE;
            Q(viewP, s0Var);
        }
    }

    public final int r0(int i2, s0 s0Var, w0 w0Var) {
        if (q() == 0 || i2 == 0) {
            return 0;
        }
        n0(i2, w0Var);
        u uVar = this.f447p;
        int iD0 = d0(s0Var, uVar, w0Var);
        if (uVar.f2104b >= iD0) {
            i2 = i2 < 0 ? -iD0 : iD0;
        }
        this.f444m.l(-i2);
        this.f453v = this.f449r;
        uVar.f2104b = 0;
        o0(s0Var, uVar);
        return i2;
    }

    @Override // o0.l0
    public final int s(s0 s0Var, w0 w0Var) {
        return this.f446o == 1 ? this.k : super.s(s0Var, w0Var);
    }

    public final void s0(int i2) {
        u uVar = this.f447p;
        uVar.f2107e = i2;
        uVar.f2106d = this.f449r != (i2 == -1) ? -1 : 1;
    }

    public final void t0(int i2, w0 w0Var) {
        u uVar = this.f447p;
        boolean z2 = false;
        uVar.f2104b = 0;
        uVar.f2105c = i2;
        RecyclerView recyclerView = this.f2046b;
        if (recyclerView != null && recyclerView.f418f) {
            uVar.f2108f = this.f444m.h() - 0;
            uVar.f2109g = this.f444m.f() + 0;
        } else {
            uVar.f2109g = this.f444m.e() + 0;
            uVar.f2108f = -0;
        }
        uVar.f2110h = false;
        uVar.a = true;
        if (this.f444m.g() == 0 && this.f444m.e() == 0) {
            z2 = true;
        }
        uVar.f2111i = z2;
    }

    public final void u0(f1 f1Var, int i2, int i3) {
        int i4 = f1Var.f2008d;
        if (i2 == -1) {
            int i5 = f1Var.f2006b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) f1Var.a.get(0);
                c1 c1VarD = f1.d(view);
                f1Var.f2006b = f1Var.f2010f.f444m.d(view);
                c1VarD.getClass();
                i5 = f1Var.f2006b;
            }
            if (i5 + i4 > i3) {
                return;
            }
        } else {
            int i6 = f1Var.f2007c;
            if (i6 == Integer.MIN_VALUE) {
                f1Var.a();
                i6 = f1Var.f2007c;
            }
            if (i6 - i4 < i3) {
                return;
            }
        }
        this.f450s.set(f1Var.f2009e, false);
    }
}
