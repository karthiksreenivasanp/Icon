package g0;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import g.h1;
import g.k2;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable, c {

    /* renamed from: g, reason: collision with root package name */
    public d f1284g;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1279b = true;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f1280c = null;
    public boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    public int f1281d = -1;

    /* renamed from: e, reason: collision with root package name */
    public a f1282e = new a(this);

    /* renamed from: f, reason: collision with root package name */
    public h1 f1283f = new h1(1, this);

    public b(Context context) {
    }

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1280c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f1282e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                h1 h1Var = this.f1283f;
                if (h1Var != null) {
                    cursor2.unregisterDataSetObserver(h1Var);
                }
            }
            this.f1280c = cursor;
            if (cursor != null) {
                a aVar2 = this.f1282e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                h1 h1Var2 = this.f1283f;
                if (h1Var2 != null) {
                    cursor.registerDataSetObserver(h1Var2);
                }
                this.f1281d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.f1281d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.f1280c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.f1280c.moveToPosition(i2);
        if (view == null) {
            k2 k2Var = (k2) this;
            view = k2Var.f1149j.inflate(k2Var.f1148i, viewGroup, false);
        }
        a(view, this.f1280c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1284g == null) {
            this.f1284g = new d(this);
        }
        return this.f1284g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.a || (cursor = this.f1280c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f1280c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.a && (cursor = this.f1280c) != null && cursor.moveToPosition(i2)) {
            return this.f1280c.getLong(this.f1281d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1280c.moveToPosition(i2)) {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f1280c);
        return view;
    }
}
