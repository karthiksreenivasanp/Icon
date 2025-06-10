package g;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public abstract class v0 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z2) {
        absListView.setSelectedChildViewEnabled(z2);
    }
}
