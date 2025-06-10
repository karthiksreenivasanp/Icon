package f;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class n implements u, s, AdapterView.OnItemClickListener {
    public Rect a;

    public static int n(i iVar, Context context, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = iVar.getCount();
        int i3 = 0;
        int i4 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = iVar.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = iVar.getView(i5, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    public static boolean v(l lVar) {
        int size = lVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = lVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // f.s
    public final boolean c(m mVar) {
        return false;
    }

    @Override // f.s
    public final void h(Context context, l lVar) {
    }

    @Override // f.s
    public final boolean i(m mVar) {
        return false;
    }

    public abstract void m(l lVar);

    public abstract void o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (i) listAdapter).a.p((MenuItem) listAdapter.getItem(i2), this, (this instanceof h) ^ true ? 0 : 4);
    }

    public abstract void p(boolean z2);

    public abstract void q(int i2);

    public abstract void r(int i2);

    public abstract void s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z2);

    public abstract void u(int i2);
}
