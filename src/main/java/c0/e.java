package c0;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import b0.f0;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final d a;

    public e(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.a.equals(((e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        l1.l lVar = (l1.l) ((e0.a) this.a).a;
        AutoCompleteTextView autoCompleteTextView = lVar.f1609h;
        if (autoCompleteTextView != null) {
            if (autoCompleteTextView.getInputType() != 0) {
                return;
            }
            int i2 = z2 ? 2 : 1;
            int[] iArr = f0.a;
            b0.r.s(lVar.f1642d, i2);
        }
    }
}
