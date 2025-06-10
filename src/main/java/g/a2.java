package g;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView a;

    public a2(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.a.o();
        return true;
    }
}
