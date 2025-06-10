package f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends BaseAdapter {
    public final l a;

    /* renamed from: b, reason: collision with root package name */
    public int f902b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f903c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f904d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f905e;

    /* renamed from: f, reason: collision with root package name */
    public final int f906f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f904d = z2;
        this.f905e = layoutInflater;
        this.a = lVar;
        this.f906f = i2;
        a();
    }

    public final void a() {
        l lVar = this.a;
        m mVar = lVar.f924s;
        if (mVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f916j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((m) arrayList.get(i2)) == mVar) {
                    this.f902b = i2;
                    return;
                }
            }
        }
        this.f902b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i2) {
        ArrayList arrayListK;
        boolean z2 = this.f904d;
        l lVar = this.a;
        if (z2) {
            lVar.i();
            arrayListK = lVar.f916j;
        } else {
            arrayListK = lVar.k();
        }
        int i3 = this.f902b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (m) arrayListK.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        boolean z2 = this.f904d;
        l lVar = this.a;
        if (z2) {
            lVar.i();
            arrayListK = lVar.f916j;
        } else {
            arrayListK = lVar.k();
        }
        return this.f902b < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f905e.inflate(this.f906f, viewGroup, false);
        }
        int i3 = getItem(i2).f926b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f926b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.l() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        t tVar = (t) view;
        if (this.f903c) {
            listMenuItemView.setForceShowIcon(true);
        }
        tVar.c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
