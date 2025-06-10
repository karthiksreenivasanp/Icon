package o0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {
    public final l.g a = new l.g(30, 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1979b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1980c = new ArrayList();

    public b(d0 d0Var) {
        new j0(2, this);
    }

    public final int a(int i2, int i3) {
        ArrayList arrayList = this.f1980c;
        int size = arrayList.size();
        while (i3 < size) {
            a aVar = (a) arrayList.get(i3);
            aVar.getClass();
            aVar.getClass();
            i3++;
        }
        return i2;
    }

    public final void b(a aVar) {
        aVar.a = null;
        this.a.b(aVar);
    }

    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((a) arrayList.get(i2));
        }
        arrayList.clear();
    }
}
