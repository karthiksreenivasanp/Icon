package o0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2091e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final q.g f2092f = new q.g(1);

    /* renamed from: b, reason: collision with root package name */
    public long f2093b;

    /* renamed from: c, reason: collision with root package name */
    public long f2094c;
    public final ArrayList a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2095d = new ArrayList();

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f2093b == 0) {
            this.f2093b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        q qVar = recyclerView.V;
        qVar.a = i2;
        qVar.f2082b = i3;
    }

    public final void b(long j2) {
        r rVar;
        RecyclerView recyclerView;
        boolean z2;
        z0 z0VarJ;
        RecyclerView recyclerView2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                q qVar = recyclerView3.V;
                qVar.f2083c = 0;
                qVar.getClass();
                i2 += qVar.f2083c;
            }
        }
        ArrayList arrayList2 = this.f2095d;
        arrayList2.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                q qVar2 = recyclerView4.V;
                Math.abs(qVar2.a);
                Math.abs(qVar2.f2082b);
                if (qVar2.f2083c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new r());
                    }
                    qVar2.getClass();
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f2092f);
        for (int i5 = 0; i5 < arrayList2.size() && (recyclerView = (rVar = (r) arrayList2.get(i5)).f2088d) != null; i5++) {
            long j3 = rVar.a ? Long.MAX_VALUE : j2;
            int i6 = rVar.f2089e;
            int iH = recyclerView.f414d.h();
            int i7 = 0;
            while (true) {
                if (i7 >= iH) {
                    z2 = false;
                    break;
                }
                z0 z0VarV = RecyclerView.v(recyclerView.f414d.g(i7));
                z0VarV.getClass();
                if (i6 == 0 && !z0VarV.g()) {
                    z2 = true;
                    break;
                }
                i7++;
            }
            if (z2) {
                z0VarJ = null;
            } else {
                s0 s0Var = recyclerView.a;
                try {
                    recyclerView.y();
                    z0VarJ = s0Var.j(i6, j3);
                    if (!z0VarJ.f() || z0VarJ.g()) {
                        s0Var.a(z0VarJ, false);
                    } else {
                        z0VarJ.getClass();
                        s0Var.g(null);
                    }
                } finally {
                    recyclerView.z(false);
                }
            }
            if (z0VarJ != null && z0VarJ.a != null && z0VarJ.f() && !z0VarJ.g() && (recyclerView2 = (RecyclerView) z0VarJ.a.get()) != null) {
                if (recyclerView2.f439w && recyclerView2.f414d.h() != 0) {
                    h0 h0Var = recyclerView2.F;
                    if (h0Var != null) {
                        h0Var.d();
                    }
                    l0 l0Var = recyclerView2.f426j;
                    s0 s0Var2 = recyclerView2.a;
                    if (l0Var != null) {
                        l0Var.O(s0Var2);
                        recyclerView2.f426j.P(s0Var2);
                    }
                    s0Var2.a.clear();
                    s0Var2.e();
                }
                q qVar3 = recyclerView2.V;
                qVar3.f2083c = 0;
                qVar3.getClass();
                if (qVar3.f2083c != 0) {
                    try {
                        x.a.a("RV Nested Prefetch");
                        recyclerView2.W.getClass();
                        throw null;
                    } catch (Throwable th) {
                        x.a.b();
                        throw th;
                    }
                }
            }
            rVar.a = false;
            rVar.f2086b = 0;
            rVar.f2087c = 0;
            rVar.f2088d = null;
            rVar.f2089e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            x.a.a("RV Prefetch");
            ArrayList arrayList = this.a;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2094c);
        } finally {
            this.f2093b = 0L;
            x.a.b();
        }
    }
}
