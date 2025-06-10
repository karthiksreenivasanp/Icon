package o0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(l0 l0Var, int i2) {
        super(l0Var);
        this.f1976c = i2;
    }

    @Override // o0.b0
    public final int b(View view) {
        int bottom;
        int i2;
        int i3 = this.f1976c;
        l0 l0Var = this.a;
        switch (i3) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                l0Var.getClass();
                bottom = view.getRight() + ((m0) view.getLayoutParams()).a.right;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var).rightMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                l0Var.getClass();
                bottom = view.getBottom() + ((m0) view.getLayoutParams()).a.bottom;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin;
                break;
        }
        return bottom + i2;
    }

    @Override // o0.b0
    public final int c(View view) {
        int measuredHeight;
        int i2;
        int i3 = this.f1976c;
        l0 l0Var = this.a;
        switch (i3) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                l0Var.getClass();
                Rect rect = ((m0) view.getLayoutParams()).a;
                measuredHeight = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) m0Var).leftMargin;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var).rightMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                l0Var.getClass();
                Rect rect2 = ((m0) view.getLayoutParams()).a;
                measuredHeight = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) m0Var2).topMargin;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin;
                break;
        }
        return measuredHeight + i2;
    }

    @Override // o0.b0
    public final int d(View view) {
        int top;
        int i2;
        int i3 = this.f1976c;
        l0 l0Var = this.a;
        switch (i3) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                l0Var.getClass();
                top = view.getLeft() - ((m0) view.getLayoutParams()).a.left;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var).leftMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                l0Var.getClass();
                top = view.getTop() - ((m0) view.getLayoutParams()).a.top;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var2).topMargin;
                break;
        }
        return top - i2;
    }

    @Override // o0.b0
    public final int e() {
        int i2 = this.f1976c;
        l0 l0Var = this.a;
        switch (i2) {
            case 0:
                return l0Var.f2053i;
            default:
                return l0Var.f2054j;
        }
    }

    @Override // o0.b0
    public final int f() {
        int i2;
        int iU;
        int i3 = this.f1976c;
        l0 l0Var = this.a;
        switch (i3) {
            case 0:
                i2 = l0Var.f2053i;
                iU = l0Var.w();
                break;
            default:
                i2 = l0Var.f2054j;
                iU = l0Var.u();
                break;
        }
        return i2 - iU;
    }

    @Override // o0.b0
    public final int g() {
        int i2 = this.f1976c;
        l0 l0Var = this.a;
        switch (i2) {
            case 0:
                return l0Var.f2051g;
            default:
                return l0Var.f2052h;
        }
    }

    @Override // o0.b0
    public final int h() {
        int i2 = this.f1976c;
        l0 l0Var = this.a;
        switch (i2) {
            case 0:
                return l0Var.v();
            default:
                return l0Var.x();
        }
    }

    @Override // o0.b0
    public final int i() {
        int iX;
        int iU;
        int i2 = this.f1976c;
        l0 l0Var = this.a;
        switch (i2) {
            case 0:
                iX = l0Var.f2053i - l0Var.v();
                iU = l0Var.w();
                break;
            default:
                iX = l0Var.f2054j - l0Var.x();
                iU = l0Var.u();
                break;
        }
        return iX - iU;
    }

    @Override // o0.b0
    public final int j(View view) {
        int i2 = this.f1976c;
        Rect rect = this.f1981b;
        l0 l0Var = this.a;
        switch (i2) {
            case 0:
                l0Var.B(view, rect);
                return rect.right;
            default:
                l0Var.B(view, rect);
                return rect.bottom;
        }
    }

    @Override // o0.b0
    public final int k(View view) {
        int i2 = this.f1976c;
        Rect rect = this.f1981b;
        l0 l0Var = this.a;
        switch (i2) {
            case 0:
                l0Var.B(view, rect);
                return rect.left;
            default:
                l0Var.B(view, rect);
                return rect.top;
        }
    }

    @Override // o0.b0
    public final void l(int i2) {
        int i3 = this.f1976c;
        l0 l0Var = this.a;
        switch (i3) {
            case 0:
                l0Var.F(i2);
                break;
            default:
                l0Var.G(i2);
                break;
        }
    }

    public final int m(View view) {
        int measuredWidth;
        int i2;
        int i3 = this.f1976c;
        l0 l0Var = this.a;
        switch (i3) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                l0Var.getClass();
                Rect rect = ((m0) view.getLayoutParams()).a;
                measuredWidth = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) m0Var).topMargin;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                l0Var.getClass();
                Rect rect2 = ((m0) view.getLayoutParams()).a;
                measuredWidth = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) m0Var2).leftMargin;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var2).rightMargin;
                break;
        }
        return measuredWidth + i2;
    }
}
