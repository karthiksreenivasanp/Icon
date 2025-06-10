package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {
    public final /* synthetic */ SearchView a;

    public b(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        SearchView searchView = this.a;
        if (searchView.f118b0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f123p;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if ((TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.i("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
        if (searchView.f118b0 == null || searchView.O == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i2 == 66 || i2 == 84 || i2 == 61) {
            searchView.l(searchAutoComplete.getListSelection());
        } else {
            if (i2 != 21 && i2 != 22) {
                if (i2 != 19) {
                    return false;
                }
                searchAutoComplete.getListSelection();
                return false;
            }
            searchAutoComplete.setSelection(i2 == 21 ? 0 : searchAutoComplete.length());
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            c.b(searchAutoComplete, 1);
            if (searchAutoComplete.enoughToFilter()) {
                searchAutoComplete.showDropDown();
            }
        }
        return true;
    }
}
