package k0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f implements InputFilter {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public e f1480b;

    public f(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = androidx.emoji2.text.j.a().b();
        if (iB != 0) {
            boolean z2 = true;
            if (iB == 1) {
                if (i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z2 = false;
                }
                if (!z2 || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return androidx.emoji2.text.j.a().f(0, charSequence.length(), charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
        if (this.f1480b == null) {
            this.f1480b = new e(textView, this);
        }
        jVarA.g(this.f1480b);
        return charSequence;
    }
}
