package g;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class w1 implements TextWatcher {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1246b;

    public /* synthetic */ w1(ViewGroup viewGroup, int i2) {
        this.a = i2;
        this.f1246b = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f1246b;
                textInputLayout.t(!textInputLayout.f744x0, false);
                if (textInputLayout.k) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.f733s) {
                    textInputLayout.u(editable);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                SearchView searchView = (SearchView) this.f1246b;
                Editable text = searchView.f123p.getText();
                searchView.V = text;
                boolean z2 = !TextUtils.isEmpty(text);
                searchView.t(z2);
                boolean z3 = !z2;
                int i5 = 8;
                if (searchView.U && !searchView.N && z3) {
                    searchView.f128u.setVisibility(8);
                    i5 = 0;
                }
                searchView.f130w.setVisibility(i5);
                searchView.p();
                searchView.s();
                charSequence.toString();
                searchView.getClass();
                break;
        }
    }
}
