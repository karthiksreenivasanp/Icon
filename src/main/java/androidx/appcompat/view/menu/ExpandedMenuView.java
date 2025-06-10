package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import f.k;
import f.m;
import g.f2;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, AdapterView.OnItemClickListener {
    public static final int[] a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        f2 f2Var = new f2(context, context.obtainStyledAttributes(attributeSet, a, R.attr.listViewStyle, 0));
        if (f2Var.k(0)) {
            setBackgroundDrawable(f2Var.e(0));
        }
        if (f2Var.k(1)) {
            setDivider(f2Var.e(1));
        }
        f2Var.n();
    }

    @Override // f.k
    public final boolean a(m mVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        throw null;
    }
}
