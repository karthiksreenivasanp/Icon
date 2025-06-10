package k0;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class k implements TextWatcher {
    public final EditText a;

    /* renamed from: c, reason: collision with root package name */
    public j f1487c;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1486b = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1488d = true;

    public k(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.a
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L54
            boolean r1 = r4.f1488d
            r2 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r4.f1486b
            r3 = 0
            if (r1 != 0) goto L1c
            androidx.emoji2.text.j r1 = androidx.emoji2.text.j.f251j
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 != 0) goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r3 == 0) goto L1f
            goto L54
        L1f:
            if (r7 > r8) goto L54
            boolean r7 = r5 instanceof android.text.Spannable
            if (r7 == 0) goto L54
            androidx.emoji2.text.j r7 = androidx.emoji2.text.j.a()
            int r7 = r7.b()
            if (r7 == 0) goto L40
            if (r7 == r2) goto L35
            r5 = 3
            if (r7 == r5) goto L40
            goto L54
        L35:
            android.text.Spannable r5 = (android.text.Spannable) r5
            androidx.emoji2.text.j r4 = androidx.emoji2.text.j.a()
            int r8 = r8 + r6
            r4.f(r6, r8, r5)
            goto L54
        L40:
            androidx.emoji2.text.j r5 = androidx.emoji2.text.j.a()
            k0.j r6 = r4.f1487c
            if (r6 != 0) goto L4f
            k0.j r6 = new k0.j
            r6.<init>(r0)
            r4.f1487c = r6
        L4f:
            k0.j r4 = r4.f1487c
            r5.g(r4)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.k.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
