package b0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.nothing.icon.R;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        f.f fVarB = this.a.b(view);
        if (fVarB != null) {
            return (AccessibilityNodeProvider) fVarB.f875b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        c0.g gVar = new c0.g(accessibilityNodeInfo);
        int[] iArr = f0.a;
        Boolean bool = (Boolean) new n(R.id.tag_screen_reader_focusable, 0).b(view);
        accessibilityNodeInfo.setScreenReaderFocusable(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new n(R.id.tag_accessibility_heading, 3).b(view);
        accessibilityNodeInfo.setHeading(bool2 != null && bool2.booleanValue());
        accessibilityNodeInfo.setPaneTitle(f0.a(view));
        accessibilityNodeInfo.setStateDescription((CharSequence) new n(R.id.tag_state_description, 64, 30, 2).b(view));
        this.a.d(view, gVar);
        accessibilityNodeInfo.getText();
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < listEmptyList.size(); i2++) {
            gVar.b((c0.f) listEmptyList.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.a.g(view, i2, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i2) {
        this.a.h(view, i2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.i(view, accessibilityEvent);
    }
}
