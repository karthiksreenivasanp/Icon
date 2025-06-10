package g;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u2 implements f.s {
    public f.l a;

    /* renamed from: b, reason: collision with root package name */
    public f.m f1239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1240c;

    public u2(Toolbar toolbar) {
        this.f1240c = toolbar;
    }

    @Override // f.s
    public final void a(f.l lVar, boolean z2) {
    }

    @Override // f.s
    public final void b() {
        if (this.f1239b != null) {
            f.l lVar = this.a;
            boolean z2 = false;
            if (lVar != null) {
                int size = lVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (this.a.getItem(i2) == this.f1239b) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                return;
            }
            c(this.f1239b);
        }
    }

    @Override // f.s
    public final boolean c(f.m mVar) {
        Toolbar toolbar = this.f1240c;
        KeyEvent.Callback callback = toolbar.f145i;
        if (callback instanceof e.b) {
            SearchView searchView = (SearchView) ((e.b) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f123p;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.V = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f117a0);
            searchView.W = false;
        }
        toolbar.removeView(toolbar.f145i);
        toolbar.removeView(toolbar.f144h);
        toolbar.f145i = null;
        ArrayList arrayList = toolbar.E;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.f1239b = null;
                toolbar.requestLayout();
                mVar.B = false;
                mVar.f937n.o(false);
                toolbar.r();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // f.s
    public final boolean g() {
        return false;
    }

    @Override // f.s
    public final void h(Context context, f.l lVar) {
        f.m mVar;
        f.l lVar2 = this.a;
        if (lVar2 != null && (mVar = this.f1239b) != null) {
            lVar2.d(mVar);
        }
        this.a = lVar;
    }

    @Override // f.s
    public final boolean i(f.m mVar) {
        Toolbar toolbar = this.f1240c;
        toolbar.c();
        ViewParent parent = toolbar.f144h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f144h);
            }
            toolbar.addView(toolbar.f144h);
        }
        View actionView = mVar.getActionView();
        toolbar.f145i = actionView;
        this.f1239b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f145i);
            }
            v2 v2Var = new v2();
            v2Var.a = (toolbar.f149n & 112) | 8388611;
            v2Var.f1241b = 2;
            toolbar.f145i.setLayoutParams(v2Var);
            toolbar.addView(toolbar.f145i);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((v2) childAt.getLayoutParams()).f1241b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.B = true;
        mVar.f937n.o(false);
        KeyEvent.Callback callback = toolbar.f145i;
        if (callback instanceof e.b) {
            SearchView searchView = (SearchView) ((e.b) callback);
            if (!searchView.W) {
                searchView.W = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f123p;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f117a0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        toolbar.r();
        return true;
    }

    @Override // f.s
    public final boolean l(f.w wVar) {
        return false;
    }
}
