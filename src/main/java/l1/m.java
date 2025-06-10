package l1;

import android.text.Editable;

/* loaded from: classes.dex */
public final class m extends e1.j {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    @Override // e1.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.a.b().b();
    }
}
