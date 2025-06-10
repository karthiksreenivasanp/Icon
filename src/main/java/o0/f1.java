package o0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f1 {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f2006b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2007c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f2008d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2010f;

    public f1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f2010f = staggeredGridLayoutManager;
        this.f2009e = i2;
    }

    public static c1 d(View view) {
        return (c1) view.getLayoutParams();
    }

    public final void a() {
        View view = (View) this.a.get(r0.size() - 1);
        c1 c1VarD = d(view);
        this.f2007c = this.f2010f.f444m.b(view);
        c1VarD.getClass();
    }

    public final void b() {
        this.a.clear();
        this.f2006b = Integer.MIN_VALUE;
        this.f2007c = Integer.MIN_VALUE;
        this.f2008d = 0;
    }

    public final int c(int i2) {
        int i3 = this.f2007c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.a.size() == 0) {
            return i2;
        }
        a();
        return this.f2007c;
    }

    public final int e(int i2) {
        int i3 = this.f2006b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return i2;
        }
        View view = (View) arrayList.get(0);
        c1 c1VarD = d(view);
        this.f2006b = this.f2010f.f444m.d(view);
        c1VarD.getClass();
        return this.f2006b;
    }
}
