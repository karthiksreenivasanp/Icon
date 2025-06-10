package p1;

/* loaded from: classes.dex */
public final class c extends u1.a implements t1.b {

    /* renamed from: b, reason: collision with root package name */
    public static final c f2158b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f2159c = new c(1);
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i2) {
        this.a = i2;
    }

    public final Object a(Object obj, Object obj2) {
        d dVar;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                f1.e.r(str, "acc");
                f1.e.r(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                f1.e.r(iVar, "acc");
                f1.e.r(gVar2, "element");
                i iVarMinusKey = iVar.minusKey(gVar2.getKey());
                j jVar = j.a;
                if (iVarMinusKey == jVar) {
                    return gVar2;
                }
                e eVar = e.a;
                f fVar = (f) iVarMinusKey.get(eVar);
                if (fVar == null) {
                    dVar = new d(gVar2, iVarMinusKey);
                } else {
                    i iVarMinusKey2 = iVarMinusKey.minusKey(eVar);
                    if (iVarMinusKey2 == jVar) {
                        return new d(fVar, gVar2);
                    }
                    dVar = new d(fVar, new d(gVar2, iVarMinusKey2));
                }
                return dVar;
        }
    }
}
