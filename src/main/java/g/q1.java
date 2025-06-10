package g;

import android.content.Context;
import android.view.MenuItem;

/* loaded from: classes.dex */
public final class q1 extends k1 implements l1 {

    /* renamed from: w, reason: collision with root package name */
    public l1 f1205w;

    public q1(Context context, int i2, int i3) {
        super(context, i2, i3);
    }

    @Override // g.l1
    public final void h(f.l lVar, f.m mVar) {
        l1 l1Var = this.f1205w;
        if (l1Var != null) {
            l1Var.h(lVar, mVar);
        }
    }

    @Override // g.l1
    public final void i(f.l lVar, MenuItem menuItem) {
        l1 l1Var = this.f1205w;
        if (l1Var != null) {
            l1Var.i(lVar, menuItem);
        }
    }
}
