package androidx.fragment.app;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class h {
    public final Object a;

    public static h a(int i2, int i3, int i4, int i5, boolean z2) {
        return new h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, false, z2));
    }

    public h(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.a = collectionItemInfo;
    }
}
