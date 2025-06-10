package k0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public final i1.e f1478b;

    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        i1.e eVar = new i1.e(13, null);
        super(inputConnection, false);
        this.a = editText;
        this.f1478b = eVar;
        if (androidx.emoji2.text.j.f251j != null) {
            androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
            if (!(jVarA.b() == 1) || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            jVarA.f255e.s(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.a.getEditableText();
        this.f1478b.getClass();
        return i1.e.e(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.a.getEditableText();
        this.f1478b.getClass();
        return i1.e.e(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
