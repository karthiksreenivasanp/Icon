package f0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class i extends b0.c {
    @Override // b0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        c0.k.c(accessibilityEvent, nestedScrollView.getScrollX());
        c0.k.d(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    @Override // b0.c
    public final void d(View view, c0.g gVar) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            gVar.b(c0.f.f519g);
            gVar.b(c0.f.k);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            gVar.b(c0.f.f518f);
            gVar.b(c0.f.f523l);
        }
    }

    @Override // b0.c
    public final boolean g(View view, int i2, Bundle bundle) {
        if (super.g(view, i2, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i2 != 4096) {
            if (i2 == 8192 || i2 == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                return true;
            }
            if (i2 != 16908346) {
                return false;
            }
        }
        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (iMin == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.t(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
        return true;
    }
}
