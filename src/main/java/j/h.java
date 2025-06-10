package j;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator, Map.Entry {
    public int a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f1455d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1454c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f1453b = -1;

    public h(j jVar) {
        this.f1455d = jVar;
        this.a = jVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f1454c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f1453b;
        j jVar = this.f1455d;
        Object objB = jVar.b(i2, 0);
        if (!(key == objB || (key != null && key.equals(objB)))) {
            return false;
        }
        Object value = entry.getValue();
        Object objB2 = jVar.b(this.f1453b, 1);
        return value == objB2 || (value != null && value.equals(objB2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f1454c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f1455d.b(this.f1453b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f1454c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f1455d.b(this.f1453b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1453b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f1454c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f1453b;
        j jVar = this.f1455d;
        Object objB = jVar.b(i2, 0);
        Object objB2 = jVar.b(this.f1453b, 1);
        return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1453b++;
        this.f1454c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1454c) {
            throw new IllegalStateException();
        }
        this.f1455d.f(this.f1453b);
        this.f1453b--;
        this.a--;
        this.f1454c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f1454c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f1453b;
        a aVar = (a) this.f1455d;
        switch (aVar.f1428d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((b) aVar.f1429e).f1462b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
