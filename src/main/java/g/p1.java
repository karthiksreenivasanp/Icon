package g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class p1 extends x0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f1198m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1199n;

    /* renamed from: o, reason: collision with root package name */
    public l1 f1200o;

    /* renamed from: p, reason: collision with root package name */
    public f.m f1201p;

    public p1(Context context, boolean z2) {
        super(context, z2);
        if (1 == o1.a(context.getResources().getConfiguration())) {
            this.f1198m = 21;
            this.f1199n = 22;
        } else {
            this.f1198m = 22;
            this.f1199n = 21;
        }
    }

    @Override // g.x0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        f.i iVar;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f1200o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (f.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (f.i) adapter;
                headersCount = 0;
            }
            f.m item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= iVar.getCount()) ? null : iVar.getItem(i2);
            f.m mVar = this.f1201p;
            if (mVar != item) {
                f.l lVar = iVar.a;
                if (mVar != null) {
                    this.f1200o.i(lVar, mVar);
                }
                this.f1201p = item;
                if (item != null) {
                    this.f1200o.h(lVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f1198m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f1199n) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        ((f.i) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(l1 l1Var) {
        this.f1200o = l1Var;
    }

    @Override // g.x0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
