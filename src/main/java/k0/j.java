package k0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j extends androidx.emoji2.text.h {
    public final WeakReference a;

    public j(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.h
    public final void a() {
        k.a((EditText) this.a.get(), 1);
    }
}
