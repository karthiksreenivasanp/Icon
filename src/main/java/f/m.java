package f;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements w.b {
    public MenuItem.OnActionExpandListener A;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f926b;

    /* renamed from: c, reason: collision with root package name */
    public final int f927c;

    /* renamed from: d, reason: collision with root package name */
    public final int f928d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f929e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f930f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f931g;

    /* renamed from: h, reason: collision with root package name */
    public char f932h;

    /* renamed from: j, reason: collision with root package name */
    public char f934j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f935l;

    /* renamed from: n, reason: collision with root package name */
    public final l f937n;

    /* renamed from: o, reason: collision with root package name */
    public w f938o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f939p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f940q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f941r;

    /* renamed from: z, reason: collision with root package name */
    public View f949z;

    /* renamed from: i, reason: collision with root package name */
    public int f933i = 4096;
    public int k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f936m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f942s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f943t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f944u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f945v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f946w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f947x = 16;
    public boolean B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f948y = 0;

    public m(l lVar, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f937n = lVar;
        this.a = i3;
        this.f926b = i2;
        this.f927c = i4;
        this.f928d = i5;
        this.f929e = charSequence;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f946w && (this.f944u || this.f945v)) {
            drawable = drawable.mutate();
            if (this.f944u) {
                v.b.h(drawable, this.f942s);
            }
            if (this.f945v) {
                v.b.i(drawable, this.f943t);
            }
            this.f946w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return (this.f947x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f948y & 8) == 0) {
            return false;
        }
        if (this.f949z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f937n.d(this);
        }
        return false;
    }

    public final void d(boolean z2) {
        this.f947x = z2 ? this.f947x | 32 : this.f947x & (-33);
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!(((this.f948y & 8) == 0 || this.f949z == null) ? false : true)) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f937n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f949z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f934j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f940q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f926b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f935l;
        if (drawable != null) {
            return b(drawable);
        }
        int i2 = this.f936m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableM = f1.e.M(this.f937n.a, i2);
        this.f936m = 0;
        this.f935l = drawableM;
        return b(drawableM);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f942s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f943t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f931g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f933i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f932h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f927c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f938o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f929e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f930f;
        return charSequence != null ? charSequence : this.f929e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f941r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f938o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f947x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f947x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f947x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f947x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        l lVar = this.f937n;
        Context context = lVar.a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f949z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.a) > 0) {
            viewInflate.setId(i3);
        }
        lVar.k = true;
        lVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f934j == c2) {
            return this;
        }
        this.f934j = Character.toLowerCase(c2);
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f947x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f947x = i3;
        if (i2 != i3) {
            this.f937n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f947x;
        int i3 = i2 & 4;
        l lVar = this.f937n;
        if (i3 != 0) {
            lVar.getClass();
            ArrayList arrayList = lVar.f912f;
            int size = arrayList.size();
            lVar.s();
            for (int i4 = 0; i4 < size; i4++) {
                m mVar = (m) arrayList.get(i4);
                if (mVar.f926b == this.f926b) {
                    if (((mVar.f947x & 4) != 0) && mVar.isCheckable()) {
                        boolean z3 = mVar == this;
                        int i5 = mVar.f947x;
                        int i6 = (z3 ? 2 : 0) | (i5 & (-3));
                        mVar.f947x = i6;
                        if (i5 != i6) {
                            mVar.f937n.o(false);
                        }
                    }
                }
            }
            lVar.r();
        } else {
            int i7 = (z2 ? 2 : 0) | (i2 & (-3));
            this.f947x = i7;
            if (i2 != i7) {
                lVar.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f947x = z2 ? this.f947x | 16 : this.f947x & (-17);
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f935l = null;
        this.f936m = i2;
        this.f946w = true;
        this.f937n.o(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f942s = colorStateList;
        this.f944u = true;
        this.f946w = true;
        this.f937n.o(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f943t = mode;
        this.f945v = true;
        this.f946w = true;
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f931g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f932h == c2) {
            return this;
        }
        this.f932h = c2;
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f939p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f932h = c2;
        this.f934j = Character.toLowerCase(c3);
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f948y = i2;
        l lVar = this.f937n;
        lVar.k = true;
        lVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f937n.a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f930f = charSequence;
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f947x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f947x = i3;
        if (i2 != i3) {
            l lVar = this.f937n;
            lVar.f914h = true;
            lVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f929e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // w.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f934j == c2 && this.k == i2) {
            return this;
        }
        this.f934j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.f937n.o(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public final w.b setContentDescription(CharSequence charSequence) {
        this.f940q = charSequence;
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f936m = 0;
        this.f935l = drawable;
        this.f946w = true;
        this.f937n.o(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f932h == c2 && this.f933i == i2) {
            return this;
        }
        this.f932h = c2;
        this.f933i = KeyEvent.normalizeMetaState(i2);
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f932h = c2;
        this.f933i = KeyEvent.normalizeMetaState(i2);
        this.f934j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        this.f937n.o(false);
        return this;
    }

    @Override // w.b, android.view.MenuItem
    public final w.b setTooltipText(CharSequence charSequence) {
        this.f941r = charSequence;
        this.f937n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f929e = charSequence;
        this.f937n.o(false);
        w wVar = this.f938o;
        if (wVar != null) {
            wVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f949z = view;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        l lVar = this.f937n;
        lVar.k = true;
        lVar.o(true);
        return this;
    }
}
