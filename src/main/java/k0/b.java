package k0;

import android.widget.EditText;

/* loaded from: classes.dex */
public final class b {
    public final a a;

    public b(EditText editText) {
        if (editText == null) {
            throw new NullPointerException("editText cannot be null");
        }
        this.a = new a(editText);
    }
}
