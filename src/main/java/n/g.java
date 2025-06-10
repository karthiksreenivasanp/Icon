package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f1834m;

    public g(m mVar) {
        super(mVar);
        this.f1827e = mVar instanceof j ? 2 : 3;
    }

    @Override // n.f
    public final void d(int i2) {
        if (this.f1832j) {
            return;
        }
        this.f1832j = true;
        this.f1829g = i2;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
