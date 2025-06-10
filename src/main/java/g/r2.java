package g;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class r2 implements View.OnClickListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1209b;

    public /* synthetic */ r2(int i2, Object obj) {
        this.a = i2;
        this.f1209b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.a;
        Object obj = this.f1209b;
        switch (i2) {
            case 0:
                u2 u2Var = ((Toolbar) obj).K;
                f.m mVar = u2Var == null ? null : u2Var.f1239b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    break;
                }
                break;
            default:
                com.google.android.material.datepicker.c cVar = (com.google.android.material.datepicker.c) obj;
                int i3 = cVar.f659j;
                if (i3 != 2) {
                    if (i3 == 1) {
                        cVar.i(2);
                        break;
                    }
                } else {
                    cVar.i(1);
                    break;
                }
                break;
        }
    }
}
