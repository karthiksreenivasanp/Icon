package o0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1992c;

    public /* synthetic */ e(k kVar, ArrayList arrayList, int i2) {
        this.a = i2;
        this.f1992c = kVar;
        this.f1991b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        k kVar = this.f1992c;
        ArrayList arrayList = this.f1991b;
        switch (i2) {
            case 0:
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((j) it.next()).getClass();
                    kVar.getClass();
                    throw null;
                }
                arrayList.clear();
                kVar.f2036m.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i iVar = (i) it2.next();
                    kVar.getClass();
                    iVar.getClass();
                    iVar.getClass();
                    ArrayList arrayList2 = kVar.f2041r;
                    long j2 = kVar.f2026f;
                }
                arrayList.clear();
                kVar.f2037n.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                if (!it3.hasNext()) {
                    arrayList.clear();
                    kVar.f2035l.remove(arrayList);
                    return;
                } else {
                    z0 z0Var = (z0) it3.next();
                    kVar.getClass();
                    z0Var.getClass();
                    throw null;
                }
        }
    }
}
