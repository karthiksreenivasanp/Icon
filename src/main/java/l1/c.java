package l1;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1592b;

    public /* synthetic */ c(p pVar, int i2) {
        this.a = i2;
        this.f1592b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        int i2 = this.a;
        p pVar = this.f1592b;
        switch (i2) {
            case 0:
                e eVar = (e) pVar;
                eVar.t(eVar.u());
                break;
            default:
                l lVar = (l) pVar;
                lVar.f1612l = z2;
                lVar.q();
                if (!z2) {
                    lVar.t(false);
                    lVar.f1613m = false;
                    break;
                }
                break;
        }
    }
}
