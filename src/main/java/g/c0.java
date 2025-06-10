package g;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c0 extends f1.e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1054s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1055t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ WeakReference f1056u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i0 f1057v;

    public c0(i0 i0Var, int i2, int i3, WeakReference weakReference) {
        this.f1057v = i0Var;
        this.f1054s = i2;
        this.f1055t = i3;
        this.f1056u = weakReference;
    }

    @Override // f1.e
    public final void i0(int i2) {
    }

    @Override // f1.e
    public final void j0(Typeface typeface) {
        int i2 = this.f1054s;
        if (i2 != -1) {
            typeface = h0.a(typeface, i2, (this.f1055t & 2) != 0);
        }
        i0 i0Var = this.f1057v;
        if (i0Var.f1094m) {
            i0Var.f1093l = typeface;
            TextView textView = (TextView) this.f1056u.get();
            if (textView != null) {
                int[] iArr = b0.f0.a;
                if (b0.u.b(textView)) {
                    textView.post(new d0(textView, typeface, i0Var.f1092j));
                } else {
                    textView.setTypeface(typeface, i0Var.f1092j);
                }
            }
        }
    }
}
