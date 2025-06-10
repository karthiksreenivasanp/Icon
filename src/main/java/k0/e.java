package k0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e extends androidx.emoji2.text.h {
    public final WeakReference a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1479b;

    public e(TextView textView, f fVar) {
        this.a = new WeakReference(textView);
        this.f1479b = new WeakReference(fVar);
    }

    @Override // androidx.emoji2.text.h
    public final void a() {
        boolean z2;
        int length;
        InputFilter[] filters;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.f1479b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            z2 = false;
        } else {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z2 && textView.isAttachedToWindow()) {
            CharSequence text = textView.getText();
            androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
            if (text == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = text.length();
            }
            CharSequence charSequenceF = jVarA.f(0, length, text);
            if (text == charSequenceF) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(charSequenceF);
            int selectionEnd = Selection.getSelectionEnd(charSequenceF);
            textView.setText(charSequenceF);
            if (charSequenceF instanceof Spannable) {
                Spannable spannable = (Spannable) charSequenceF;
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                } else if (selectionStart >= 0) {
                    Selection.setSelection(spannable, selectionStart);
                } else if (selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionEnd);
                }
            }
        }
    }
}
