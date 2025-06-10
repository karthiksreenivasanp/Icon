package o0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class j0 implements h1, c0.t {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2028b;

    public /* synthetic */ j0(int i2, Object obj) {
        this.a = i2;
        this.f2028b = obj;
    }

    public int a(View view) {
        int bottom;
        int i2;
        int i3 = this.a;
        Object obj = this.f2028b;
        switch (i3) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                ((l0) obj).getClass();
                bottom = view.getRight() + ((m0) view.getLayoutParams()).a.right;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var).rightMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                ((l0) obj).getClass();
                bottom = view.getBottom() + ((m0) view.getLayoutParams()).a.bottom;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin;
                break;
        }
        return bottom + i2;
    }

    public int b(View view) {
        int top;
        int i2;
        int i3 = this.a;
        Object obj = this.f2028b;
        switch (i3) {
            case 0:
                m0 m0Var = (m0) view.getLayoutParams();
                ((l0) obj).getClass();
                top = view.getLeft() - ((m0) view.getLayoutParams()).a.left;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var).leftMargin;
                break;
            default:
                m0 m0Var2 = (m0) view.getLayoutParams();
                ((l0) obj).getClass();
                top = view.getTop() - ((m0) view.getLayoutParams()).a.top;
                i2 = ((ViewGroup.MarginLayoutParams) m0Var2).topMargin;
                break;
        }
        return top - i2;
    }

    @Override // c0.t
    public boolean c(View view) {
        ((BottomSheetBehavior) this.f2028b).B(this.a);
        return true;
    }

    public int d() {
        int i2;
        int iU;
        int i3 = this.a;
        Object obj = this.f2028b;
        switch (i3) {
            case 0:
                l0 l0Var = (l0) obj;
                i2 = l0Var.f2053i;
                iU = l0Var.w();
                break;
            default:
                l0 l0Var2 = (l0) obj;
                i2 = l0Var2.f2054j;
                iU = l0Var2.u();
                break;
        }
        return i2 - iU;
    }

    public j0(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f2028b = bottomSheetBehavior;
        this.a = i2;
    }
}
