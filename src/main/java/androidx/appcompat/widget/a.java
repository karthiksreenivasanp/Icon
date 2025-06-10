package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ SearchView a;

    public a(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.a;
        ImageView imageView = searchView.f127t;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f123p;
        if (view == imageView) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f129v) {
            searchView.k();
            return;
        }
        if (view == searchView.f128u) {
            searchView.o();
            return;
        }
        if (view != searchView.f130w) {
            if (view == searchAutoComplete) {
                c.a(searchAutoComplete);
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f118b0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.j(searchView.I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
