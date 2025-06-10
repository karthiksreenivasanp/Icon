package s0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s extends n {

    /* renamed from: z, reason: collision with root package name */
    public int f2244z;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f2242x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f2243y = true;
    public boolean A = false;
    public int B = 0;

    @Override // s0.n
    public final void A(i1.e eVar) {
        super.A(eVar);
        this.B |= 4;
        if (this.f2242x != null) {
            for (int i2 = 0; i2 < this.f2242x.size(); i2++) {
                ((n) this.f2242x.get(i2)).A(eVar);
            }
        }
    }

    @Override // s0.n
    public final void B() {
        this.B |= 2;
        int size = this.f2242x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.f2242x.get(i2)).B();
        }
    }

    @Override // s0.n
    public final void C(long j2) {
        this.f2221b = j2;
    }

    @Override // s0.n
    public final String E(String str) {
        String strE = super.E(str);
        for (int i2 = 0; i2 < this.f2242x.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strE);
            sb.append("\n");
            sb.append(((n) this.f2242x.get(i2)).E(str + "  "));
            strE = sb.toString();
        }
        return strE;
    }

    public final void F(n nVar) {
        this.f2242x.add(nVar);
        nVar.f2228i = this;
        long j2 = this.f2222c;
        if (j2 >= 0) {
            nVar.x(j2);
        }
        if ((this.B & 1) != 0) {
            nVar.z(this.f2223d);
        }
        if ((this.B & 2) != 0) {
            nVar.B();
        }
        if ((this.B & 4) != 0) {
            nVar.A(this.f2238t);
        }
        if ((this.B & 8) != 0) {
            nVar.y(this.f2237s);
        }
    }

    @Override // s0.n
    public final void a(m mVar) {
        super.a(mVar);
    }

    @Override // s0.n
    public final void c(t tVar) {
        View view = tVar.f2245b;
        if (r(view)) {
            Iterator it = this.f2242x.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.r(view)) {
                    nVar.c(tVar);
                    tVar.f2246c.add(nVar);
                }
            }
        }
    }

    @Override // s0.n
    public final void e(t tVar) {
        int size = this.f2242x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.f2242x.get(i2)).e(tVar);
        }
    }

    @Override // s0.n
    public final void f(t tVar) {
        View view = tVar.f2245b;
        if (r(view)) {
            Iterator it = this.f2242x.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.r(view)) {
                    nVar.f(tVar);
                    tVar.f2246c.add(nVar);
                }
            }
        }
    }

    @Override // s0.n
    /* renamed from: i */
    public final n clone() {
        s sVar = (s) super.clone();
        sVar.f2242x = new ArrayList();
        int size = this.f2242x.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVarClone = ((n) this.f2242x.get(i2)).clone();
            sVar.f2242x.add(nVarClone);
            nVarClone.f2228i = sVar;
        }
        return sVar;
    }

    @Override // s0.n
    public final void k(ViewGroup viewGroup, l.d dVar, l.d dVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2221b;
        int size = this.f2242x.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = (n) this.f2242x.get(i2);
            if (j2 > 0 && (this.f2243y || i2 == 0)) {
                long j3 = nVar.f2221b;
                if (j3 > 0) {
                    nVar.C(j3 + j2);
                } else {
                    nVar.C(j2);
                }
            }
            nVar.k(viewGroup, dVar, dVar2, arrayList, arrayList2);
        }
    }

    @Override // s0.n
    public final void t(View view) {
        super.t(view);
        int size = this.f2242x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.f2242x.get(i2)).t(view);
        }
    }

    @Override // s0.n
    public final void u(m mVar) {
        super.u(mVar);
    }

    @Override // s0.n
    public final void v(ViewGroup viewGroup) {
        super.v(viewGroup);
        int size = this.f2242x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.f2242x.get(i2)).v(viewGroup);
        }
    }

    @Override // s0.n
    public final void w() {
        if (this.f2242x.isEmpty()) {
            D();
            l();
            return;
        }
        r rVar = new r(this);
        Iterator it = this.f2242x.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(rVar);
        }
        this.f2244z = this.f2242x.size();
        if (this.f2243y) {
            Iterator it2 = this.f2242x.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).w();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f2242x.size(); i2++) {
            ((n) this.f2242x.get(i2 - 1)).a(new h(2, this, (n) this.f2242x.get(i2)));
        }
        n nVar = (n) this.f2242x.get(0);
        if (nVar != null) {
            nVar.w();
        }
    }

    @Override // s0.n
    public final void x(long j2) {
        ArrayList arrayList;
        this.f2222c = j2;
        if (j2 < 0 || (arrayList = this.f2242x) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.f2242x.get(i2)).x(j2);
        }
    }

    @Override // s0.n
    public final void y(f1.e eVar) {
        this.f2237s = eVar;
        this.B |= 8;
        int size = this.f2242x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.f2242x.get(i2)).y(eVar);
        }
    }

    @Override // s0.n
    public final void z(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList arrayList = this.f2242x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((n) this.f2242x.get(i2)).z(timeInterpolator);
            }
        }
        this.f2223d = timeInterpolator;
    }
}
