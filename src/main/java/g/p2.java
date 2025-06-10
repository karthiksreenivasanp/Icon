package g;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1202b;

    public /* synthetic */ p2(Toolbar toolbar, int i2) {
        this.a = i2;
        this.f1202b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        Toolbar toolbar = this.f1202b;
        switch (i2) {
            case 0:
                toolbar.k();
                break;
            default:
                u2 u2Var = toolbar.K;
                f.m mVar = u2Var == null ? null : u2Var.f1239b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
