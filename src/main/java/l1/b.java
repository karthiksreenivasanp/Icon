package l1;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1591b;

    public /* synthetic */ b(p pVar, int i2) {
        this.a = i2;
        this.f1591b = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        PasswordTransformationMethod passwordTransformationMethod;
        int i2 = this.a;
        p pVar = this.f1591b;
        switch (i2) {
            case 0:
                e eVar = (e) pVar;
                EditText editText2 = eVar.f1598i;
                if (editText2 != null) {
                    Editable text = editText2.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    break;
                }
                break;
            case 1:
                ((l) pVar).u();
                break;
            default:
                t tVar = (t) pVar;
                EditText editText3 = tVar.f1672f;
                if (editText3 != null) {
                    int selectionEnd = editText3.getSelectionEnd();
                    EditText editText4 = tVar.f1672f;
                    if (editText4 != null && (editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        editText = tVar.f1672f;
                        passwordTransformationMethod = null;
                    } else {
                        editText = tVar.f1672f;
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        tVar.f1672f.setSelection(selectionEnd);
                    }
                    tVar.q();
                    break;
                }
                break;
        }
    }
}
