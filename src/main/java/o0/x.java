package o0;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public int f2127b;

    /* renamed from: c, reason: collision with root package name */
    public int f2128c;

    /* renamed from: d, reason: collision with root package name */
    public int f2129d;

    /* renamed from: e, reason: collision with root package name */
    public int f2130e;

    /* renamed from: f, reason: collision with root package name */
    public int f2131f;

    /* renamed from: g, reason: collision with root package name */
    public int f2132g;
    public boolean k;
    public boolean a = true;

    /* renamed from: h, reason: collision with root package name */
    public int f2133h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f2134i = 0;

    /* renamed from: j, reason: collision with root package name */
    public List f2135j = null;

    public final void a(View view) {
        if (this.f2135j.size() <= 0) {
            this.f2129d = -1;
        } else {
            ((z0) this.f2135j.get(0)).getClass();
            throw null;
        }
    }

    public final View b(s0 s0Var) {
        List list = this.f2135j;
        if (list == null) {
            View viewD = s0Var.d(this.f2129d);
            this.f2129d += this.f2130e;
            return viewD;
        }
        if (list.size() <= 0) {
            return null;
        }
        ((z0) this.f2135j.get(0)).getClass();
        throw null;
    }
}
