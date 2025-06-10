package o0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c0 implements Runnable {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ c0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        h0 h0Var = recyclerView.F;
        if (h0Var != null) {
            k kVar = (k) h0Var;
            ArrayList arrayList = kVar.f2032h;
            boolean z2 = !arrayList.isEmpty();
            ArrayList arrayList2 = kVar.f2034j;
            boolean z3 = !arrayList2.isEmpty();
            ArrayList arrayList3 = kVar.k;
            boolean z4 = !arrayList3.isEmpty();
            ArrayList arrayList4 = kVar.f2033i;
            boolean z5 = !arrayList4.isEmpty();
            if (z2 || z3 || z5 || z4) {
                Iterator it = arrayList.iterator();
                boolean zHasNext = it.hasNext();
                long j2 = kVar.f2024d;
                if (zHasNext) {
                    ((z0) it.next()).getClass();
                    throw null;
                }
                arrayList.clear();
                if (z3) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.addAll(arrayList2);
                    kVar.f2036m.add(arrayList5);
                    arrayList2.clear();
                    e eVar = new e(kVar, arrayList5, 0);
                    if (z2) {
                        ((j) arrayList5.get(0)).getClass();
                        throw null;
                    }
                    eVar.run();
                }
                if (z4) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList3);
                    kVar.f2037n.add(arrayList6);
                    arrayList3.clear();
                    e eVar2 = new e(kVar, arrayList6, 1);
                    if (z2) {
                        ((i) arrayList6.get(0)).getClass();
                        throw null;
                    }
                    eVar2.run();
                }
                if (z5) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    kVar.f2035l.add(arrayList7);
                    arrayList4.clear();
                    e eVar3 = new e(kVar, arrayList7, 2);
                    if (z2 || z3 || z4) {
                        if (!z2) {
                            j2 = 0;
                        }
                        long jMax = Math.max(z3 ? kVar.f2025e : 0L, z4 ? kVar.f2026f : 0L) + j2;
                        ((z0) arrayList7.get(0)).getClass();
                        int[] iArr = b0.f0.a;
                        b0.r.n(null, eVar3, jMax);
                    } else {
                        eVar3.run();
                    }
                }
            }
        }
        recyclerView.getClass();
    }
}
