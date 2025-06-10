package i;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e implements Iterator, f {
    public c a;

    /* renamed from: b, reason: collision with root package name */
    public c f1306b;

    public e(c cVar, c cVar2) {
        this.a = cVar2;
        this.f1306b = cVar;
    }

    @Override // i.f
    public final void a(c cVar) {
        c cVar2;
        if (this.a == cVar && cVar == this.f1306b) {
            this.f1306b = null;
            this.a = null;
        }
        c cVar3 = this.a;
        if (cVar3 == cVar) {
            switch (((b) this).f1300c) {
                case 0:
                    cVar2 = cVar3.f1303d;
                    break;
                default:
                    cVar2 = cVar3.f1302c;
                    break;
            }
            this.a = cVar2;
        }
        if (this.f1306b == cVar) {
            this.f1306b = b();
        }
    }

    public final c b() {
        c cVar = this.f1306b;
        c cVar2 = this.a;
        if (cVar == cVar2 || cVar2 == null) {
            return null;
        }
        switch (((b) this).f1300c) {
            case 0:
                return cVar.f1302c;
            default:
                return cVar.f1303d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1306b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f1306b;
        this.f1306b = b();
        return cVar;
    }
}
