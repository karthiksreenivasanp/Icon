package l1;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {
    public final /* synthetic */ o a;

    public n(o oVar) {
        this.a = oVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        o oVar = this.a;
        if (oVar.f1636s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oVar.f1636s;
        m mVar = oVar.f1639v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (oVar.f1636s.getOnFocusChangeListener() == oVar.b().e()) {
                oVar.f1636s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oVar.f1636s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        oVar.b().m(oVar.f1636s);
        oVar.i(oVar.b());
    }
}
