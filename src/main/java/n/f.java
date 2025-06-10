package n;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final m f1826d;

    /* renamed from: f, reason: collision with root package name */
    public int f1828f;

    /* renamed from: g, reason: collision with root package name */
    public int f1829g;
    public m a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1824b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1825c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1827e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f1830h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f1831i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1832j = false;
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1833l = new ArrayList();

    public f(m mVar) {
        this.f1826d = mVar;
    }

    @Override // n.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f1833l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f1832j) {
                return;
            }
        }
        this.f1825c = true;
        m mVar = this.a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f1824b) {
            this.f1826d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i2 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f1832j) {
            g gVar = this.f1831i;
            if (gVar != null) {
                if (!gVar.f1832j) {
                    return;
                } else {
                    this.f1828f = this.f1830h * gVar.f1829g;
                }
            }
            d(fVar.f1829g + this.f1828f);
        }
        m mVar2 = this.a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.k.add(dVar);
        if (this.f1832j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f1833l.clear();
        this.k.clear();
        this.f1832j = false;
        this.f1829g = 0;
        this.f1825c = false;
        this.f1824b = false;
    }

    public void d(int i2) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1826d.f1837b.W);
        sb.append(":");
        sb.append(androidx.activity.result.a.i(this.f1827e));
        sb.append("(");
        sb.append(this.f1832j ? Integer.valueOf(this.f1829g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1833l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
