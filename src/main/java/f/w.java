package f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class w extends l implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final l f979v;

    /* renamed from: w, reason: collision with root package name */
    public final m f980w;

    public w(Context context, l lVar, m mVar) {
        super(context);
        this.f979v = lVar;
        this.f980w = mVar;
    }

    @Override // f.l
    public final boolean d(m mVar) {
        return this.f979v.d(mVar);
    }

    @Override // f.l
    public final boolean e(l lVar, MenuItem menuItem) {
        super.e(lVar, menuItem);
        return this.f979v.e(lVar, menuItem);
    }

    @Override // f.l
    public final boolean f(m mVar) {
        return this.f979v.f(mVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f980w;
    }

    @Override // f.l
    public final l j() {
        return this.f979v.j();
    }

    @Override // f.l
    public final boolean l() {
        return this.f979v.l();
    }

    @Override // f.l
    public final boolean m() {
        return this.f979v.m();
    }

    @Override // f.l
    public final boolean n() {
        return this.f979v.n();
    }

    @Override // f.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f979v.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        q(0, null, i2, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        q(i2, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f980w.setIcon(i2);
        return this;
    }

    @Override // f.l, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f979v.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f980w.setIcon(drawable);
        return this;
    }
}
