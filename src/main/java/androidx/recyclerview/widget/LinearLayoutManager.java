package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b0.f0;
import b0.s;
import f1.e;
import o0.a0;
import o0.b0;
import o0.k0;
import o0.l0;
import o0.m0;
import o0.s0;
import o0.v;
import o0.w;
import o0.w0;
import o0.x;
import o0.y;

/* loaded from: classes.dex */
public class LinearLayoutManager extends l0 {
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public x f396l;

    /* renamed from: m, reason: collision with root package name */
    public a0 f397m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f398n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f399o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f400p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f401q;

    /* renamed from: r, reason: collision with root package name */
    public y f402r;

    /* renamed from: s, reason: collision with root package name */
    public final v f403s;

    /* renamed from: t, reason: collision with root package name */
    public final w f404t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f405u;

    public LinearLayoutManager() {
        this.k = 1;
        this.f398n = false;
        this.f399o = false;
        this.f400p = false;
        this.f401q = true;
        this.f402r = null;
        this.f403s = new v();
        this.f404t = new w();
        this.f405u = new int[2];
        r0(1);
        b(null);
        if (this.f398n) {
            this.f398n = false;
            T();
        }
    }

    @Override // o0.l0
    public final boolean C() {
        return true;
    }

    @Override // o0.l0
    public final void H(RecyclerView recyclerView) {
    }

    @Override // o0.l0
    public final void I(AccessibilityEvent accessibilityEvent) {
        super.I(accessibilityEvent);
        if (q() > 0) {
            accessibilityEvent.setFromIndex(h0());
            accessibilityEvent.setToIndex(i0());
        }
    }

    @Override // o0.l0
    public final void L(Parcelable parcelable) {
        if (parcelable instanceof y) {
            this.f402r = (y) parcelable;
            T();
        }
    }

    @Override // o0.l0
    public final Parcelable M() {
        y yVar = this.f402r;
        if (yVar != null) {
            return new y(yVar);
        }
        y yVar2 = new y();
        if (q() > 0) {
            d0();
            boolean z2 = false ^ this.f399o;
            yVar2.f2137c = z2;
            if (z2) {
                View viewK0 = k0();
                yVar2.f2136b = this.f397m.f() - this.f397m.b(viewK0);
                yVar2.a = l0.y(viewK0);
            } else {
                View viewL0 = l0();
                yVar2.a = l0.y(viewL0);
                yVar2.f2136b = this.f397m.d(viewL0) - this.f397m.h();
            }
        } else {
            yVar2.a = -1;
        }
        return yVar2;
    }

    @Override // o0.l0
    public int U(int i2, s0 s0Var, w0 w0Var) {
        if (this.k == 1) {
            return 0;
        }
        return q0(i2, s0Var, w0Var);
    }

    @Override // o0.l0
    public int V(int i2, s0 s0Var, w0 w0Var) {
        if (this.k == 0) {
            return 0;
        }
        return q0(i2, s0Var, w0Var);
    }

    public void Z(w0 w0Var, int[] iArr) {
        int i2;
        int i3 = w0Var.a != -1 ? this.f397m.i() : 0;
        if (this.f396l.f2131f == -1) {
            i2 = 0;
        } else {
            i2 = i3;
            i3 = 0;
        }
        iArr[0] = i3;
        iArr[1] = i2;
    }

    public final int a0(w0 w0Var) {
        if (q() == 0) {
            return 0;
        }
        d0();
        a0 a0Var = this.f397m;
        boolean z2 = !this.f401q;
        return e.y(w0Var, a0Var, g0(z2), f0(z2), this, this.f401q);
    }

    @Override // o0.l0
    public final void b(String str) {
        if (this.f402r == null) {
            super.b(str);
        }
    }

    public final int b0(w0 w0Var) {
        if (q() == 0) {
            return 0;
        }
        d0();
        a0 a0Var = this.f397m;
        boolean z2 = !this.f401q;
        return e.z(w0Var, a0Var, g0(z2), f0(z2), this, this.f401q, this.f399o);
    }

    @Override // o0.l0
    public final boolean c() {
        return this.k == 0;
    }

    public final int c0(w0 w0Var) {
        if (q() == 0) {
            return 0;
        }
        d0();
        a0 a0Var = this.f397m;
        boolean z2 = !this.f401q;
        return e.A(w0Var, a0Var, g0(z2), f0(z2), this, this.f401q);
    }

    @Override // o0.l0
    public final boolean d() {
        return this.k == 1;
    }

    public final void d0() {
        if (this.f396l == null) {
            this.f396l = new x();
        }
    }

    public final int e0(s0 s0Var, x xVar, w0 w0Var, boolean z2) {
        int i2 = xVar.f2128c;
        int i3 = xVar.f2132g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                xVar.f2132g = i3 + i2;
            }
            o0(s0Var, xVar);
        }
        int i4 = xVar.f2128c + xVar.f2133h;
        while (true) {
            if (!xVar.k && i4 <= 0) {
                break;
            }
            int i5 = xVar.f2129d;
            if (!(i5 >= 0 && i5 < w0Var.a())) {
                break;
            }
            w wVar = this.f404t;
            wVar.a = 0;
            wVar.f2116b = false;
            wVar.f2117c = false;
            wVar.f2118d = false;
            n0(s0Var, w0Var, xVar, wVar);
            if (!wVar.f2116b) {
                int i6 = xVar.f2127b;
                int i7 = wVar.a;
                xVar.f2127b = (xVar.f2131f * i7) + i6;
                if (!wVar.f2117c || xVar.f2135j != null || !w0Var.f2123f) {
                    xVar.f2128c -= i7;
                    i4 -= i7;
                }
                int i8 = xVar.f2132g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + i7;
                    xVar.f2132g = i9;
                    int i10 = xVar.f2128c;
                    if (i10 < 0) {
                        xVar.f2132g = i9 + i10;
                    }
                    o0(s0Var, xVar);
                }
                if (z2 && wVar.f2118d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - xVar.f2128c;
    }

    public final View f0(boolean z2) {
        int iQ;
        int iQ2;
        if (this.f399o) {
            iQ2 = q();
            iQ = 0;
        } else {
            iQ = q() - 1;
            iQ2 = -1;
        }
        return j0(iQ, iQ2, z2);
    }

    @Override // o0.l0
    public final int g(w0 w0Var) {
        return a0(w0Var);
    }

    public final View g0(boolean z2) {
        int iQ;
        int iQ2;
        if (this.f399o) {
            iQ = -1;
            iQ2 = q() - 1;
        } else {
            iQ = q();
            iQ2 = 0;
        }
        return j0(iQ2, iQ, z2);
    }

    @Override // o0.l0
    public int h(w0 w0Var) {
        return b0(w0Var);
    }

    public final int h0() {
        View viewJ0 = j0(0, q(), false);
        if (viewJ0 == null) {
            return -1;
        }
        return l0.y(viewJ0);
    }

    @Override // o0.l0
    public int i(w0 w0Var) {
        return c0(w0Var);
    }

    public final int i0() {
        View viewJ0 = j0(q() - 1, -1, false);
        if (viewJ0 == null) {
            return -1;
        }
        return l0.y(viewJ0);
    }

    @Override // o0.l0
    public final int j(w0 w0Var) {
        return a0(w0Var);
    }

    public final View j0(int i2, int i3, boolean z2) {
        d0();
        return (this.k == 0 ? this.f2047c : this.f2048d).e(i2, i3, z2 ? 24579 : 320, 320);
    }

    @Override // o0.l0
    public int k(w0 w0Var) {
        return b0(w0Var);
    }

    public final View k0() {
        return p(this.f399o ? 0 : q() - 1);
    }

    @Override // o0.l0
    public int l(w0 w0Var) {
        return c0(w0Var);
    }

    public final View l0() {
        return p(this.f399o ? q() - 1 : 0);
    }

    @Override // o0.l0
    public m0 m() {
        return new m0(-2, -2);
    }

    public final boolean m0() {
        RecyclerView recyclerView = this.f2046b;
        int[] iArr = f0.a;
        return s.d(recyclerView) == 1;
    }

    public void n0(s0 s0Var, w0 w0Var, x xVar, w wVar) {
        int i2;
        int iM;
        int i3;
        int iM2;
        View viewB = xVar.b(s0Var);
        if (viewB == null) {
            wVar.f2116b = true;
            return;
        }
        m0 m0Var = (m0) viewB.getLayoutParams();
        if (xVar.f2135j == null) {
            if (this.f399o == (xVar.f2131f == -1)) {
                a(viewB, -1, false);
            } else {
                a(viewB, 0, false);
            }
        } else {
            if (this.f399o == (xVar.f2131f == -1)) {
                a(viewB, -1, true);
            } else {
                a(viewB, 0, true);
            }
        }
        m0 m0Var2 = (m0) viewB.getLayoutParams();
        Rect rectW = this.f2046b.w(viewB);
        int i4 = rectW.left + rectW.right + 0;
        int i5 = rectW.top + rectW.bottom + 0;
        int iR = l0.r(c(), this.f2053i, this.f2051g, w() + v() + ((ViewGroup.MarginLayoutParams) m0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) m0Var2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) m0Var2).width);
        int iR2 = l0.r(d(), this.f2054j, this.f2052h, u() + x() + ((ViewGroup.MarginLayoutParams) m0Var2).topMargin + ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) m0Var2).height);
        if (X(viewB, iR, iR2, m0Var2)) {
            viewB.measure(iR, iR2);
        }
        wVar.a = this.f397m.c(viewB);
        if (this.k == 1) {
            if (m0()) {
                iM2 = this.f2053i - w();
                iM = iM2 - this.f397m.m(viewB);
            } else {
                int iV = v();
                iM2 = this.f397m.m(viewB) + iV;
                iM = iV;
            }
            int i6 = xVar.f2131f;
            i3 = xVar.f2127b;
            if (i6 == -1) {
                i2 = i3;
                i3 -= wVar.a;
            } else {
                i2 = wVar.a + i3;
            }
        } else {
            int iX = x();
            int iM3 = this.f397m.m(viewB) + iX;
            int i7 = xVar.f2131f;
            int i8 = xVar.f2127b;
            if (i7 == -1) {
                i2 = iM3;
                iM = i8 - wVar.a;
                iM2 = i8;
                i3 = iX;
            } else {
                int i9 = wVar.a + i8;
                i2 = iM3;
                iM = i8;
                i3 = iX;
                iM2 = i9;
            }
        }
        l0.E(viewB, iM, i3, iM2, i2);
        if (m0Var.c() || m0Var.b()) {
            wVar.f2117c = true;
        }
        wVar.f2118d = viewB.hasFocusable();
    }

    public final void o0(s0 s0Var, x xVar) {
        if (!xVar.a || xVar.k) {
            return;
        }
        int i2 = xVar.f2132g;
        int i3 = xVar.f2134i;
        if (xVar.f2131f == -1) {
            int iQ = q();
            if (i2 < 0) {
                return;
            }
            int iE = (this.f397m.e() - i2) + i3;
            if (this.f399o) {
                for (int i4 = 0; i4 < iQ; i4++) {
                    View viewP = p(i4);
                    if (this.f397m.d(viewP) < iE || this.f397m.k(viewP) < iE) {
                        p0(s0Var, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = iQ - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View viewP2 = p(i6);
                if (this.f397m.d(viewP2) < iE || this.f397m.k(viewP2) < iE) {
                    p0(s0Var, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i2 < 0) {
            return;
        }
        int i7 = i2 - i3;
        int iQ2 = q();
        if (!this.f399o) {
            for (int i8 = 0; i8 < iQ2; i8++) {
                View viewP3 = p(i8);
                if (this.f397m.b(viewP3) > i7 || this.f397m.j(viewP3) > i7) {
                    p0(s0Var, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = iQ2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View viewP4 = p(i10);
            if (this.f397m.b(viewP4) > i7 || this.f397m.j(viewP4) > i7) {
                p0(s0Var, i9, i10);
                return;
            }
        }
    }

    public final void p0(s0 s0Var, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                View viewP = p(i2);
                R(i2);
                s0Var.g(viewP);
                i2--;
            }
            return;
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            View viewP2 = p(i3);
            R(i3);
            s0Var.g(viewP2);
        }
    }

    public final int q0(int i2, s0 s0Var, w0 w0Var) {
        if (q() == 0 || i2 == 0) {
            return 0;
        }
        d0();
        this.f396l.a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int iAbs = Math.abs(i2);
        t0(i3, iAbs, true, w0Var);
        x xVar = this.f396l;
        int iE0 = e0(s0Var, xVar, w0Var, false) + xVar.f2132g;
        if (iE0 < 0) {
            return 0;
        }
        if (iAbs > iE0) {
            i2 = i3 * iE0;
        }
        this.f397m.l(-i2);
        this.f396l.getClass();
        return i2;
    }

    public final void r0(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        b(null);
        if (i2 != this.k || this.f397m == null) {
            this.f397m = b0.a(this, i2);
            this.f403s.getClass();
            this.k = i2;
            T();
        }
    }

    public void s0(boolean z2) {
        b(null);
        if (this.f400p == z2) {
            return;
        }
        this.f400p = z2;
        T();
    }

    public final void t0(int i2, int i3, boolean z2, w0 w0Var) {
        int iH;
        int iU;
        this.f396l.k = this.f397m.g() == 0 && this.f397m.e() == 0;
        this.f396l.f2131f = i2;
        int[] iArr = this.f405u;
        iArr[0] = 0;
        iArr[1] = 0;
        Z(w0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z3 = i2 == 1;
        x xVar = this.f396l;
        int i4 = z3 ? iMax2 : iMax;
        xVar.f2133h = i4;
        if (!z3) {
            iMax = iMax2;
        }
        xVar.f2134i = iMax;
        if (z3) {
            a0 a0Var = this.f397m;
            int i5 = a0Var.f1976c;
            l0 l0Var = a0Var.a;
            switch (i5) {
                case 0:
                    iU = l0Var.w();
                    break;
                default:
                    iU = l0Var.u();
                    break;
            }
            xVar.f2133h = iU + i4;
            View viewK0 = k0();
            x xVar2 = this.f396l;
            xVar2.f2130e = this.f399o ? -1 : 1;
            int iY = l0.y(viewK0);
            x xVar3 = this.f396l;
            xVar2.f2129d = iY + xVar3.f2130e;
            xVar3.f2127b = this.f397m.b(viewK0);
            iH = this.f397m.b(viewK0) - this.f397m.f();
        } else {
            View viewL0 = l0();
            x xVar4 = this.f396l;
            xVar4.f2133h = this.f397m.h() + xVar4.f2133h;
            x xVar5 = this.f396l;
            xVar5.f2130e = this.f399o ? 1 : -1;
            int iY2 = l0.y(viewL0);
            x xVar6 = this.f396l;
            xVar5.f2129d = iY2 + xVar6.f2130e;
            xVar6.f2127b = this.f397m.d(viewL0);
            iH = (-this.f397m.d(viewL0)) + this.f397m.h();
        }
        x xVar7 = this.f396l;
        xVar7.f2128c = i3;
        if (z2) {
            xVar7.f2128c = i3 - iH;
        }
        xVar7.f2132g = iH;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.k = 1;
        this.f398n = false;
        this.f399o = false;
        this.f400p = false;
        this.f401q = true;
        this.f402r = null;
        this.f403s = new v();
        this.f404t = new w();
        this.f405u = new int[2];
        k0 k0VarZ = l0.z(context, attributeSet, i2, i3);
        r0(k0VarZ.a);
        boolean z2 = k0VarZ.f2043c;
        b(null);
        if (z2 != this.f398n) {
            this.f398n = z2;
            T();
        }
        s0(k0VarZ.f2044d);
    }
}
