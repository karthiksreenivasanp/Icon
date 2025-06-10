package f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import b0.h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class l implements w.a {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f907u = {1, 4, 5, 3, 2, 0};
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f908b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f909c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f910d;

    /* renamed from: e, reason: collision with root package name */
    public j f911e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f912f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f913g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f914h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f915i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f916j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f917l;

    /* renamed from: s, reason: collision with root package name */
    public m f924s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f918m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f919n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f920o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f921p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f922q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f923r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f925t = false;

    public l(Context context) {
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.f908b = resources;
        this.f912f = new ArrayList();
        this.f913g = new ArrayList();
        this.f914h = true;
        this.f915i = new ArrayList();
        this.f916j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1 && h0.b(ViewConfiguration.get(context))) {
            z2 = true;
        }
        this.f910d = z2;
    }

    public final m a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f907u[i6] << 16) | (65535 & i4);
        m mVar = new m(this, i2, i3, i4, i7, charSequence);
        ArrayList arrayList = this.f912f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((m) arrayList.get(size)).f928d <= i7) {
                i5 = size + 1;
                break;
            }
        }
        arrayList.add(i5, mVar);
        o(true);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f908b.getString(i2));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m mVarA = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            mVarA.setIcon(resolveInfo.loadIcon(packageManager));
            mVarA.f931g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = mVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f908b.getString(i2));
    }

    public final void b(s sVar, Context context) {
        this.f923r.add(new WeakReference(sVar));
        sVar.h(context, this);
        this.k = true;
    }

    public final void c(boolean z2) {
        if (this.f921p) {
            return;
        }
        this.f921p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f923r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s sVar = (s) weakReference.get();
            if (sVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                sVar.a(this, z2);
            }
        }
        this.f921p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        m mVar = this.f924s;
        if (mVar != null) {
            d(mVar);
        }
        this.f912f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f917l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f923r;
        boolean zC = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f924s == mVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                s sVar = (s) weakReference.get();
                if (sVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zC = sVar.c(mVar);
                    if (zC) {
                        break;
                    }
                }
            }
            r();
            if (zC) {
                this.f924s = null;
            }
        }
        return zC;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f911e;
        if (jVar == null) {
            return false;
        }
        jVar.e();
        return false;
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f923r;
        boolean zI = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s sVar = (s) weakReference.get();
            if (sVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zI = sVar.i(mVar);
                if (zI) {
                    break;
                }
            }
        }
        r();
        if (zI) {
            this.f924s = mVar;
        }
        return zI;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) this.f912f.get(i3);
            if (mVar.a == i2) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (menuItemFindItem = mVar.f938o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final m g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f922q;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (m) arrayList.get(0);
        }
        boolean zM = m();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            char c2 = zM ? mVar.f934j : mVar.f932h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zM && c2 == '\b' && i2 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f912f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f912f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                m mVar = (m) arrayList2.get(i3);
                if (mVar.hasSubMenu()) {
                    mVar.f938o.h(arrayList, i2, keyEvent);
                }
                char c2 = zM ? mVar.f934j : mVar.f932h;
                if (((modifiers & 69647) == ((zM ? mVar.k : mVar.f933i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zM && c2 == '\b' && i2 == 67)) && mVar.isEnabled()) {
                        arrayList.add(mVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((m) this.f912f.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f923r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                s sVar = (s) weakReference.get();
                if (sVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= sVar.g();
                }
            }
            ArrayList arrayList = this.f915i;
            ArrayList arrayList2 = this.f916j;
            arrayList.clear();
            arrayList2.clear();
            if (zG) {
                int size = arrayListK.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m mVar = (m) arrayListK.get(i2);
                    if (mVar.c()) {
                        arrayList.add(mVar);
                    } else {
                        arrayList2.add(mVar);
                    }
                }
            } else {
                arrayList2.addAll(k());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public l j() {
        return this;
    }

    public final ArrayList k() {
        boolean z2 = this.f914h;
        ArrayList arrayList = this.f913g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f912f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) arrayList2.get(i2);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.f914h = false;
        this.k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f925t;
    }

    public boolean m() {
        return this.f909c;
    }

    public boolean n() {
        return this.f910d;
    }

    public final void o(boolean z2) {
        if (this.f918m) {
            this.f919n = true;
            if (z2) {
                this.f920o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f914h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f923r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s sVar = (s) weakReference.get();
            if (sVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                sVar.b();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa A[PHI: r1
  0x00aa: PHI (r1v8 boolean) = (r1v7 boolean), (r1v6 boolean), (r1v10 boolean) binds: [B:57:0x00a8, B:35:0x0055, B:30:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MenuItem r6, f.s r7, int r8) {
        /*
            r5 = this;
            f.m r6 = (f.m) r6
            r0 = 0
            if (r6 == 0) goto Lae
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lae
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f939p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L19
            goto L2b
        L19:
            f.l r1 = r6.f937n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L22
            goto L2b
        L22:
            android.content.Intent r3 = r6.f931g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
        L2b:
            r1 = r2
            goto L36
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = r0
        L36:
            int r3 = r6.f948y
            r3 = r3 & 8
            if (r3 == 0) goto L42
            android.view.View r3 = r6.f949z
            if (r3 == 0) goto L42
            r3 = r2
            goto L43
        L42:
            r3 = r0
        L43:
            if (r3 == 0) goto L4d
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Lad
            goto Laa
        L4d:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L58
            r6 = r8 & 1
            if (r6 != 0) goto Lad
            goto Laa
        L58:
            r8 = r8 & 4
            if (r8 != 0) goto L5f
            r5.c(r0)
        L5f:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L73
            f.w r8 = new f.w
            android.content.Context r3 = r5.a
            r8.<init>(r3, r5, r6)
            r6.f938o = r8
            java.lang.CharSequence r3 = r6.f929e
            r8.setHeaderTitle(r3)
        L73:
            f.w r6 = r6.f938o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f923r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7e
            goto La7
        L7e:
            if (r7 == 0) goto L84
            boolean r0 = r7.l(r6)
        L84:
            java.util.Iterator r7 = r8.iterator()
        L88:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La7
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            f.s r4 = (f.s) r4
            if (r4 != 0) goto La0
            r8.remove(r3)
            goto L88
        La0:
            if (r0 != 0) goto L88
            boolean r0 = r4.l(r6)
            goto L88
        La7:
            r1 = r1 | r0
            if (r1 != 0) goto Lad
        Laa:
            r5.c(r2)
        Lad:
            return r1
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.p(android.view.MenuItem, f.s, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        m mVarG = g(i2, keyEvent);
        boolean zP = mVarG != null ? p(mVarG, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i2, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f917l = null;
        } else {
            if (i2 > 0) {
                this.f917l = this.f908b.getText(i2);
            } else if (charSequence != null) {
                this.f917l = charSequence;
            }
            if (i3 > 0) {
                Object obj = s.c.a;
                s.a.b(this.a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f918m = false;
        if (this.f919n) {
            this.f919n = false;
            o(this.f920o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList;
        int size = size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            arrayList = this.f912f;
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((m) arrayList.get(i4)).f926b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((m) arrayList.get(i4)).f926b != i2) {
                    break;
                }
                if (i4 >= 0 && i4 < arrayList.size()) {
                    arrayList.remove(i4);
                }
                i3 = i5;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList;
        int size = size();
        int i3 = 0;
        while (true) {
            arrayList = this.f912f;
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((m) arrayList.get(i3)).a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i3);
        o(true);
    }

    public final void s() {
        if (this.f918m) {
            return;
        }
        this.f918m = true;
        this.f919n = false;
        this.f920o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f912f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            if (mVar.f926b == i2) {
                mVar.f947x = (mVar.f947x & (-5)) | (z3 ? 4 : 0);
                mVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f925t = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f912f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            if (mVar.f926b == i2) {
                mVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f912f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) arrayList.get(i3);
            if (mVar.f926b == i2) {
                int i4 = mVar.f947x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                mVar.f947x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f909c = z2;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f912f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f908b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f908b.getString(i5));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        m mVarA = a(i2, i3, i4, charSequence);
        w wVar = new w(this.a, this, mVarA);
        mVarA.f938o = wVar;
        wVar.setHeaderTitle(mVarA.f929e);
        return wVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
