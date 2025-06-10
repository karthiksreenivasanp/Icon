package j;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {

    /* renamed from: h, reason: collision with root package name */
    public a f1430h;

    public b() {
    }

    public b(b bVar) {
        if (bVar != null) {
            int i2 = bVar.f1463c;
            b(this.f1463c + i2);
            if (this.f1463c != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    put(bVar.h(i3), bVar.j(i3));
                }
            } else if (i2 > 0) {
                System.arraycopy(bVar.a, 0, this.a, 0, i2);
                System.arraycopy(bVar.f1462b, 0, this.f1462b, 0, i2 << 1);
                this.f1463c = i2;
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i2 = 0;
        if (this.f1430h == null) {
            this.f1430h = new a(i2, this);
        }
        a aVar = this.f1430h;
        if (aVar.a == null) {
            aVar.a = new g(aVar, i2);
        }
        return aVar.a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f1430h == null) {
            this.f1430h = new a(0, this);
        }
        a aVar = this.f1430h;
        if (aVar.f1456b == null) {
            aVar.f1456b = new g(aVar, 1);
        }
        return aVar.f1456b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f1463c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f1430h == null) {
            this.f1430h = new a(0, this);
        }
        a aVar = this.f1430h;
        if (aVar.f1457c == null) {
            aVar.f1457c = new i(aVar);
        }
        return aVar.f1457c;
    }
}
