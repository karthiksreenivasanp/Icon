package k0;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i extends i1.e {

    /* renamed from: b, reason: collision with root package name */
    public final h f1485b;

    public i(TextView textView) {
        super(15, null);
        this.f1485b = new h(textView);
    }

    @Override // i1.e
    public final InputFilter[] b(InputFilter[] inputFilterArr) {
        return (androidx.emoji2.text.j.f251j != null) ^ true ? inputFilterArr : this.f1485b.b(inputFilterArr);
    }

    @Override // i1.e
    public final void g(boolean z2) {
        if (!(androidx.emoji2.text.j.f251j != null)) {
            return;
        }
        this.f1485b.g(z2);
    }

    @Override // i1.e
    public final void h(boolean z2) {
        boolean z3 = !(androidx.emoji2.text.j.f251j != null);
        h hVar = this.f1485b;
        if (z3) {
            hVar.f1484d = z2;
        } else {
            hVar.h(z2);
        }
    }
}
