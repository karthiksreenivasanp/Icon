package l1;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import g.l0;

/* loaded from: classes.dex */
public final class w extends b0.c {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f1684d;

    public w(TextInputLayout textInputLayout) {
        this.f1684d = textInputLayout;
    }

    @Override // b0.c
    public final void d(View view, c0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1684d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean z2 = !TextUtils.isEmpty(text);
        boolean z3 = !TextUtils.isEmpty(hint);
        boolean z4 = !textInputLayout.r0;
        boolean z5 = !TextUtils.isEmpty(error);
        boolean z6 = z5 || !TextUtils.isEmpty(counterOverflowDescription);
        String string = z3 ? hint.toString() : "";
        u uVar = textInputLayout.f701b;
        l0 l0Var = uVar.f1674b;
        if (l0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(l0Var);
            accessibilityNodeInfo.setTraversalAfter(l0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.f1676d);
        }
        if (z2) {
            gVar.h(text);
        } else if (!TextUtils.isEmpty(string)) {
            gVar.h(string);
            if (z4 && placeholderText != null) {
                placeholderText = string + ", " + ((Object) placeholderText);
                gVar.h(placeholderText);
            }
        } else if (placeholderText != null) {
            gVar.h(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(!z2);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z6) {
            if (!z5) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        l0 l0Var2 = textInputLayout.f717j.f1669y;
        if (l0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(l0Var2);
        }
        textInputLayout.f703c.b().n(gVar);
    }

    @Override // b0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f1684d.f703c.b().o(accessibilityEvent);
    }
}
