package g;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class y1 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public y1(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.K;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
