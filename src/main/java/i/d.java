package i;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements Iterator, f {
    public c a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1304b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1305c;

    public d(g gVar) {
        this.f1305c = gVar;
    }

    @Override // i.f
    public final void a(c cVar) {
        c cVar2 = this.a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f1303d;
            this.a = cVar3;
            this.f1304b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1304b) {
            return this.f1305c.a != null;
        }
        c cVar = this.a;
        return (cVar == null || cVar.f1302c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f1304b) {
            this.f1304b = false;
            cVar = this.f1305c.a;
        } else {
            c cVar2 = this.a;
            cVar = cVar2 != null ? cVar2.f1302c : null;
        }
        this.a = cVar;
        return cVar;
    }
}
