package y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements a0.a {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2351b;

    public /* synthetic */ f(int i2, Object obj) {
        this.a = i2;
        this.f2351b = obj;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.a) {
            case 0:
                b((g) obj);
                break;
            default:
                b((g) obj);
                break;
        }
    }

    public final void b(g gVar) {
        switch (this.a) {
            case 0:
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((androidx.activity.result.d) this.f2351b).c(gVar);
                return;
            default:
                synchronized (h.f2354c) {
                    j.k kVar = h.f2355d;
                    ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f2351b, null);
                    if (arrayList == null) {
                        return;
                    }
                    kVar.remove((String) this.f2351b);
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((f) ((a0.a) arrayList.get(i2))).a(gVar);
                    }
                    return;
                }
        }
    }
}
