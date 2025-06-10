package i;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1299e = new HashMap();

    @Override // i.g
    public final c a(Object obj) {
        return (c) this.f1299e.get(obj);
    }

    @Override // i.g
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f1299e.remove(obj);
        return objB;
    }

    public final Object c(Object obj, Object obj2) {
        c cVarA = a(obj);
        if (cVarA != null) {
            return cVarA.f1301b;
        }
        HashMap map = this.f1299e;
        c cVar = new c(obj, obj2);
        this.f1309d++;
        c cVar2 = this.f1307b;
        if (cVar2 == null) {
            this.a = cVar;
        } else {
            cVar2.f1302c = cVar;
            cVar.f1303d = cVar2;
        }
        this.f1307b = cVar;
        map.put(obj, cVar);
        return null;
    }
}
