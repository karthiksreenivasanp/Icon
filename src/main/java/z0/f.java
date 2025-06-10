package z0;

import android.view.View;
import android.view.animation.LinearInterpolator;
import b0.l0;
import b0.x0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public int f2394b;

    /* renamed from: c, reason: collision with root package name */
    public int f2395c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2396d = new int[2];

    public f(View view) {
        this.a = view;
    }

    public final void a(x0 x0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if ((l0Var.a.O0() & 8) != 0) {
                int i2 = this.f2395c;
                float fN0 = l0Var.a.N0();
                LinearInterpolator linearInterpolator = w0.a.a;
                this.a.setTranslationY(Math.round(fN0 * (0 - i2)) + i2);
                return;
            }
        }
    }
}
