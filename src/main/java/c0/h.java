package c0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends AccessibilityNodeProvider {
    public final f.f a;

    public h(f.f fVar) {
        this.a = fVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        g gVarK = this.a.k(i2);
        if (gVarK == null) {
            return null;
        }
        return gVarK.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.a.o(i2, i3, bundle);
    }
}
