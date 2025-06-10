package g;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class h1 extends DataSetObserver {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1081b;

    public /* synthetic */ h1(int i2, Object obj) {
        this.a = i2;
        this.f1081b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i2 = this.a;
        Object obj = this.f1081b;
        switch (i2) {
            case 0:
                k1 k1Var = (k1) obj;
                if (k1Var.d()) {
                    k1Var.f();
                    break;
                }
                break;
            default:
                g0.b bVar = (g0.b) obj;
                bVar.a = true;
                bVar.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i2 = this.a;
        Object obj = this.f1081b;
        switch (i2) {
            case 0:
                ((k1) obj).j();
                break;
            default:
                g0.b bVar = (g0.b) obj;
                bVar.a = false;
                bVar.notifyDataSetInvalidated();
                break;
        }
    }
}
