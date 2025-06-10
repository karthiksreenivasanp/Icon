package c0;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class i extends h {
    public i(f.f fVar) {
        super(fVar);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        g gVarL = this.a.l(i2);
        if (gVarL == null) {
            return null;
        }
        return gVarL.a;
    }
}
