package s0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import b0.f0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f2218u = {2, 1, 3, 4};

    /* renamed from: v, reason: collision with root package name */
    public static final i1.e f2219v = new i1.e(20);

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f2220w = new ThreadLocal();
    public ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2230l;

    /* renamed from: s, reason: collision with root package name */
    public f1.e f2237s;
    public final String a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2221b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2222c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2223d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2224e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2225f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public l.d f2226g = new l.d(4);

    /* renamed from: h, reason: collision with root package name */
    public l.d f2227h = new l.d(4);

    /* renamed from: i, reason: collision with root package name */
    public s f2228i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2229j = f2218u;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2231m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f2232n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2233o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2234p = false;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2235q = null;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2236r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public i1.e f2238t = f2219v;

    public static void b(l.d dVar, View view, t tVar) {
        ((j.b) dVar.a).put(view, tVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) dVar.f1546b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int[] iArr = f0.a;
        String strK = b0.x.k(view);
        if (strK != null) {
            if (((j.b) dVar.f1548d).containsKey(strK)) {
                ((j.b) dVar.f1548d).put(strK, null);
            } else {
                ((j.b) dVar.f1548d).put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                j.d dVar2 = (j.d) dVar.f1547c;
                if (dVar2.a) {
                    dVar2.c();
                }
                if (f1.e.j(dVar2.f1441b, dVar2.f1443d, itemIdAtPosition) < 0) {
                    b0.r.r(view, true);
                    dVar2.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) dVar2.d(itemIdAtPosition, null);
                if (view2 != null) {
                    b0.r.r(view2, false);
                    dVar2.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static j.b n() {
        ThreadLocal threadLocal = f2220w;
        j.b bVar = (j.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        j.b bVar2 = new j.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean s(t tVar, t tVar2, String str) {
        Object obj = tVar.a.get(str);
        Object obj2 = tVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(i1.e eVar) {
        if (eVar == null) {
            eVar = f2219v;
        }
        this.f2238t = eVar;
    }

    public void B() {
    }

    public void C(long j2) {
        this.f2221b = j2;
    }

    public final void D() {
        if (this.f2232n == 0) {
            ArrayList arrayList = this.f2235q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2235q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((m) arrayList2.get(i2)).d();
                }
            }
            this.f2234p = false;
        }
        this.f2232n++;
    }

    public String E(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f2222c != -1) {
            str2 = str2 + "dur(" + this.f2222c + ") ";
        }
        if (this.f2221b != -1) {
            str2 = str2 + "dly(" + this.f2221b + ") ";
        }
        if (this.f2223d != null) {
            str2 = str2 + "interp(" + this.f2223d + ") ";
        }
        ArrayList arrayList = this.f2224e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2225f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (arrayList.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + arrayList.get(i2);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + arrayList2.get(i3);
            }
        }
        return str3 + ")";
    }

    public void a(m mVar) {
        if (this.f2235q == null) {
            this.f2235q = new ArrayList();
        }
        this.f2235q.add(mVar);
    }

    public abstract void c(t tVar);

    public final void d(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            t tVar = new t(view);
            if (z2) {
                f(tVar);
            } else {
                c(tVar);
            }
            tVar.f2246c.add(this);
            e(tVar);
            b(z2 ? this.f2226g : this.f2227h, view, tVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                d(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    public void e(t tVar) {
    }

    public abstract void f(t tVar);

    public final void g(ViewGroup viewGroup, boolean z2) {
        h(z2);
        ArrayList arrayList = this.f2224e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2225f;
        if (size <= 0 && arrayList2.size() <= 0) {
            d(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (viewFindViewById != null) {
                t tVar = new t(viewFindViewById);
                if (z2) {
                    f(tVar);
                } else {
                    c(tVar);
                }
                tVar.f2246c.add(this);
                e(tVar);
                b(z2 ? this.f2226g : this.f2227h, viewFindViewById, tVar);
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            t tVar2 = new t(view);
            if (z2) {
                f(tVar2);
            } else {
                c(tVar2);
            }
            tVar2.f2246c.add(this);
            e(tVar2);
            b(z2 ? this.f2226g : this.f2227h, view, tVar2);
        }
    }

    public final void h(boolean z2) {
        l.d dVar;
        if (z2) {
            ((j.b) this.f2226g.a).clear();
            ((SparseArray) this.f2226g.f1546b).clear();
            dVar = this.f2226g;
        } else {
            ((j.b) this.f2227h.a).clear();
            ((SparseArray) this.f2227h.f1546b).clear();
            dVar = this.f2227h;
        }
        ((j.d) dVar.f1547c).a();
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f2236r = new ArrayList();
            nVar.f2226g = new l.d(4);
            nVar.f2227h = new l.d(4);
            nVar.k = null;
            nVar.f2230l = null;
            return nVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator j(ViewGroup viewGroup, t tVar, t tVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(android.view.ViewGroup r20, l.d r21, l.d r22, java.util.ArrayList r23, java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.n.k(android.view.ViewGroup, l.d, l.d, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void l() {
        int i2 = this.f2232n - 1;
        this.f2232n = i2;
        if (i2 != 0) {
            return;
        }
        ArrayList arrayList = this.f2235q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2235q.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((m) arrayList2.get(i3)).c(this);
            }
        }
        int i4 = 0;
        while (true) {
            j.d dVar = (j.d) this.f2226g.f1547c;
            if (dVar.a) {
                dVar.c();
            }
            if (i4 >= dVar.f1443d) {
                break;
            }
            View view = (View) ((j.d) this.f2226g.f1547c).f(i4);
            if (view != null) {
                int[] iArr = f0.a;
                b0.r.r(view, false);
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            j.d dVar2 = (j.d) this.f2227h.f1547c;
            if (dVar2.a) {
                dVar2.c();
            }
            if (i5 >= dVar2.f1443d) {
                this.f2234p = true;
                return;
            }
            View view2 = (View) ((j.d) this.f2227h.f1547c).f(i5);
            if (view2 != null) {
                int[] iArr2 = f0.a;
                b0.r.r(view2, false);
            }
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r5 = r5.f2230l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r5 = r5.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (s0.t) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s0.t m(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            s0.s r0 = r5.f2228i
            if (r0 == 0) goto L9
            s0.t r5 = r0.m(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.k
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f2230l
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            s0.t r4 = (s0.t) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f2245b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r5 = r5.f2230l
            goto L36
        L34:
            java.util.ArrayList r5 = r5.k
        L36:
            java.lang.Object r5 = r5.get(r3)
            r1 = r5
            s0.t r1 = (s0.t) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.n.m(android.view.View, boolean):s0.t");
    }

    public String[] o() {
        return null;
    }

    public final t p(View view, boolean z2) {
        s sVar = this.f2228i;
        if (sVar != null) {
            return sVar.p(view, z2);
        }
        return (t) ((j.b) (z2 ? this.f2226g : this.f2227h).a).getOrDefault(view, null);
    }

    public boolean q(t tVar, t tVar2) {
        if (tVar == null || tVar2 == null) {
            return false;
        }
        String[] strArrO = o();
        if (strArrO == null) {
            Iterator it = tVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (s(tVar, tVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrO) {
            if (!s(tVar, tVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean r(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2224e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2225f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void t(View view) {
        int i2;
        if (this.f2234p) {
            return;
        }
        j.b bVarN = n();
        int i3 = bVarN.f1463c;
        c cVar = u.a;
        WindowId windowId = view.getWindowId();
        int i4 = i3 - 1;
        while (true) {
            i2 = 0;
            if (i4 < 0) {
                break;
            }
            l lVar = (l) bVarN.j(i4);
            if (lVar.a != null) {
                e0 e0Var = lVar.f2216d;
                if ((e0Var instanceof d0) && ((d0) e0Var).a.equals(windowId)) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    ((Animator) bVarN.h(i4)).pause();
                }
            }
            i4--;
        }
        ArrayList arrayList = this.f2235q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2235q.clone();
            int size = arrayList2.size();
            while (i2 < size) {
                ((m) arrayList2.get(i2)).b();
                i2++;
            }
        }
        this.f2233o = true;
    }

    public final String toString() {
        return E("");
    }

    public void u(m mVar) {
        ArrayList arrayList = this.f2235q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(mVar);
        if (this.f2235q.size() == 0) {
            this.f2235q = null;
        }
    }

    public void v(ViewGroup viewGroup) {
        if (this.f2233o) {
            if (!this.f2234p) {
                j.b bVarN = n();
                int i2 = bVarN.f1463c;
                c cVar = u.a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    l lVar = (l) bVarN.j(i3);
                    if (lVar.a != null) {
                        e0 e0Var = lVar.f2216d;
                        if ((e0Var instanceof d0) && ((d0) e0Var).a.equals(windowId)) {
                            ((Animator) bVarN.h(i3)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.f2235q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2235q.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((m) arrayList2.get(i4)).e();
                    }
                }
            }
            this.f2233o = false;
        }
    }

    public void w() {
        D();
        j.b bVarN = n();
        Iterator it = this.f2236r.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (bVarN.containsKey(animator)) {
                D();
                if (animator != null) {
                    animator.addListener(new k(this, bVarN));
                    long j2 = this.f2222c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2221b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f2223d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new g.b(1, this));
                    animator.start();
                }
            }
        }
        this.f2236r.clear();
        l();
    }

    public void x(long j2) {
        this.f2222c = j2;
    }

    public void y(f1.e eVar) {
        this.f2237s = eVar;
    }

    public void z(TimeInterpolator timeInterpolator) {
        this.f2223d = timeInterpolator;
    }
}
