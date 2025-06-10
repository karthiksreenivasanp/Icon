package g;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class e1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1074b;

    public /* synthetic */ e1(int i2, Object obj) {
        this.a = i2;
        this.f1074b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        p1 p1Var;
        int i3 = this.a;
        Object obj = this.f1074b;
        switch (i3) {
            case 0:
                if (i2 != -1 && (p1Var = ((k1) obj).f1127c) != null) {
                    p1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
