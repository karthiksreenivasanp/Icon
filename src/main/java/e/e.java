package e;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import b0.g;
import f.m;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class e {
    public CharSequence A;
    public final /* synthetic */ f D;
    public final Menu a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f792h;

    /* renamed from: i, reason: collision with root package name */
    public int f793i;

    /* renamed from: j, reason: collision with root package name */
    public int f794j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f795l;

    /* renamed from: m, reason: collision with root package name */
    public int f796m;

    /* renamed from: n, reason: collision with root package name */
    public char f797n;

    /* renamed from: o, reason: collision with root package name */
    public int f798o;

    /* renamed from: p, reason: collision with root package name */
    public char f799p;

    /* renamed from: q, reason: collision with root package name */
    public int f800q;

    /* renamed from: r, reason: collision with root package name */
    public int f801r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f802s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f803t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f804u;

    /* renamed from: v, reason: collision with root package name */
    public int f805v;

    /* renamed from: w, reason: collision with root package name */
    public int f806w;

    /* renamed from: x, reason: collision with root package name */
    public String f807x;

    /* renamed from: y, reason: collision with root package name */
    public String f808y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f809z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f786b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f787c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f788d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f789e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f790f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f791g = true;

    public e(f fVar, Menu menu) {
        this.D = fVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.f813c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f802s).setVisible(this.f803t).setEnabled(this.f804u).setCheckable(this.f801r >= 1).setTitleCondensed(this.f795l).setIcon(this.f796m);
        int i2 = this.f805v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f808y;
        f fVar = this.D;
        if (str != null) {
            if (fVar.f813c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (fVar.f814d == null) {
                fVar.f814d = f.a(fVar.f813c);
            }
            menuItem.setOnMenuItemClickListener(new d(fVar.f814d, this.f808y));
        }
        if (this.f801r >= 2 && (menuItem instanceof m)) {
            m mVar = (m) menuItem;
            mVar.f947x = (mVar.f947x & (-5)) | 4;
        }
        String str2 = this.f807x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, f.f810e, fVar.a));
            z2 = true;
        }
        int i3 = this.f806w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        CharSequence charSequence = this.f809z;
        boolean z3 = menuItem instanceof w.b;
        if (z3) {
            ((w.b) menuItem).setContentDescription(charSequence);
        } else {
            g.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z3) {
            ((w.b) menuItem).setTooltipText(charSequence2);
        } else {
            g.m(menuItem, charSequence2);
        }
        char c2 = this.f797n;
        int i4 = this.f798o;
        if (z3) {
            ((w.b) menuItem).setAlphabeticShortcut(c2, i4);
        } else {
            g.g(menuItem, c2, i4);
        }
        char c3 = this.f799p;
        int i5 = this.f800q;
        if (z3) {
            ((w.b) menuItem).setNumericShortcut(c3, i5);
        } else {
            g.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z3) {
                ((w.b) menuItem).setIconTintMode(mode);
            } else {
                g.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z3) {
                ((w.b) menuItem).setIconTintList(colorStateList);
            } else {
                g.i(menuItem, colorStateList);
            }
        }
    }
}
