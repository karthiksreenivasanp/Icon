package o0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2031g = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2032h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2033i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2034j = new ArrayList();
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2035l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2036m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2037n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2038o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2039p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2040q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2041r = new ArrayList();

    public static void f(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((z0) arrayList.get(size)).getClass();
        throw null;
    }

    @Override // o0.h0
    public final void c(z0 z0Var) {
        z0Var.getClass();
        throw null;
    }

    @Override // o0.h0
    public final void d() {
        ArrayList arrayList;
        int size;
        ArrayList arrayList2;
        int size2;
        ArrayList arrayList3 = this.f2034j;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            ((j) arrayList3.get(size3)).getClass();
            throw null;
        }
        ArrayList arrayList4 = this.f2032h;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            b((z0) arrayList4.get(size4));
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.f2033i;
        int size5 = arrayList5.size() - 1;
        if (size5 >= 0) {
            ((z0) arrayList5.get(size5)).getClass();
            throw null;
        }
        ArrayList arrayList6 = this.k;
        int size6 = arrayList6.size();
        while (true) {
            size6--;
            if (size6 < 0) {
                break;
            }
            i iVar = (i) arrayList6.get(size6);
            iVar.getClass();
            iVar.getClass();
        }
        arrayList6.clear();
        if (e()) {
            ArrayList arrayList7 = this.f2036m;
            int size7 = arrayList7.size();
            do {
                size7--;
                if (size7 < 0) {
                    ArrayList arrayList8 = this.f2035l;
                    int size8 = arrayList8.size();
                    do {
                        size8--;
                        if (size8 < 0) {
                            ArrayList arrayList9 = this.f2037n;
                            int size9 = arrayList9.size();
                            while (true) {
                                size9--;
                                if (size9 < 0) {
                                    break;
                                }
                                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                                int size10 = arrayList10.size();
                                while (true) {
                                    size10--;
                                    if (size10 >= 0) {
                                        i iVar2 = (i) arrayList10.get(size10);
                                        iVar2.getClass();
                                        iVar2.getClass();
                                        if (arrayList10.isEmpty()) {
                                            arrayList9.remove(arrayList10);
                                        }
                                    }
                                }
                            }
                            f(this.f2040q);
                            f(this.f2039p);
                            f(this.f2038o);
                            f(this.f2041r);
                            ArrayList arrayList11 = this.f2022b;
                            if (arrayList11.size() <= 0) {
                                arrayList11.clear();
                                return;
                            } else {
                                androidx.activity.result.a.d(arrayList11.get(0));
                                throw null;
                            }
                        }
                        arrayList = (ArrayList) arrayList8.get(size8);
                        size = arrayList.size() - 1;
                    } while (size < 0);
                    ((z0) arrayList.get(size)).getClass();
                    throw null;
                }
                arrayList2 = (ArrayList) arrayList7.get(size7);
                size2 = arrayList2.size() - 1;
            } while (size2 < 0);
            ((j) arrayList2.get(size2)).getClass();
            throw null;
        }
    }

    @Override // o0.h0
    public final boolean e() {
        return (this.f2033i.isEmpty() && this.k.isEmpty() && this.f2034j.isEmpty() && this.f2032h.isEmpty() && this.f2039p.isEmpty() && this.f2040q.isEmpty() && this.f2038o.isEmpty() && this.f2041r.isEmpty() && this.f2036m.isEmpty() && this.f2035l.isEmpty() && this.f2037n.isEmpty()) ? false : true;
    }

    public final void g() {
        if (e()) {
            return;
        }
        ArrayList arrayList = this.f2022b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            androidx.activity.result.a.d(arrayList.get(0));
            throw null;
        }
    }

    public final void h(z0 z0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            i iVar = (i) arrayList.get(size);
            if (i(iVar, z0Var)) {
                iVar.getClass();
                iVar.getClass();
                arrayList.remove(iVar);
            }
        }
    }

    public final boolean i(i iVar, z0 z0Var) {
        iVar.getClass();
        if (z0Var != null) {
            iVar.getClass();
            if (z0Var != null) {
                return false;
            }
        }
        iVar.getClass();
        z0Var.getClass();
        throw null;
    }
}
