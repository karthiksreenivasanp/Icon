package g;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class x1 implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f1258b;

    public /* synthetic */ x1(SearchView searchView, int i2) {
        this.a = i2;
        this.f1258b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        SearchView searchView = this.f1258b;
        switch (i2) {
            case 0:
                searchView.q();
                break;
            default:
                g0.b bVar = searchView.O;
                if (bVar instanceof k2) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
