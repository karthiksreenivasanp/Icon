package g;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class b2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ SearchView a;

    public b2(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.a.l(i2);
    }
}
