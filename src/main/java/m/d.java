package m;

import java.util.HashSet;
import java.util.Iterator;
import l.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final e f1713b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1714c;

    /* renamed from: d, reason: collision with root package name */
    public d f1715d;

    /* renamed from: g, reason: collision with root package name */
    public l f1718g;
    public HashSet a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1716e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1717f = -1;

    public d(e eVar, c cVar) {
        this.f1713b = eVar;
        this.f1714c = cVar;
    }

    public final void a(d dVar, int i2) {
        b(dVar, i2, -1, false);
    }

    public final boolean b(d dVar, int i2, int i3, boolean z2) {
        if (dVar == null) {
            h();
            return true;
        }
        if (!z2 && !g(dVar)) {
            return false;
        }
        this.f1715d = dVar;
        if (dVar.a == null) {
            dVar.a = new HashSet();
        }
        this.f1715d.a.add(this);
        if (i2 > 0) {
            this.f1716e = i2;
        } else {
            this.f1716e = 0;
        }
        this.f1717f = i3;
        return true;
    }

    public final int c() {
        d dVar;
        if (this.f1713b.V == 8) {
            return 0;
        }
        int i2 = this.f1717f;
        return (i2 <= -1 || (dVar = this.f1715d) == null || dVar.f1713b.V != 8) ? this.f1716e : i2;
    }

    public final d d() {
        c cVar = this.f1714c;
        int iOrdinal = cVar.ordinal();
        e eVar = this.f1713b;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.f1745z;
            case 2:
                return eVar.A;
            case 3:
                return eVar.f1743x;
            case 4:
                return eVar.f1744y;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final boolean e() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f1715d != null;
    }

    public final boolean g(d dVar) {
        if (dVar == null) {
            return false;
        }
        c cVar = c.BASELINE;
        c cVar2 = this.f1714c;
        e eVar = dVar.f1713b;
        c cVar3 = dVar.f1714c;
        if (cVar3 == cVar2) {
            return cVar2 != cVar || (eVar.f1742w && this.f1713b.f1742w);
        }
        int iOrdinal = cVar2.ordinal();
        c cVar4 = c.CENTER_Y;
        c cVar5 = c.CENTER_X;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = cVar3 == c.LEFT || cVar3 == c.RIGHT;
                if (eVar instanceof i) {
                    return z2 || cVar3 == cVar5;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = cVar3 == c.TOP || cVar3 == c.BOTTOM;
                if (eVar instanceof i) {
                    return z3 || cVar3 == cVar4;
                }
                return z3;
            case 6:
                return (cVar3 == cVar || cVar3 == cVar5 || cVar3 == cVar4) ? false : true;
            default:
                throw new AssertionError(cVar2.name());
        }
    }

    public final void h() {
        HashSet hashSet;
        d dVar = this.f1715d;
        if (dVar != null && (hashSet = dVar.a) != null) {
            hashSet.remove(this);
        }
        this.f1715d = null;
        this.f1716e = 0;
        this.f1717f = -1;
    }

    public final void i() {
        l lVar = this.f1718g;
        if (lVar == null) {
            this.f1718g = new l(1);
        } else {
            lVar.c();
        }
    }

    public final String toString() {
        return this.f1713b.W + ":" + this.f1714c.toString();
    }
}
