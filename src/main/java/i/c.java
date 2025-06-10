package i;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1301b;

    /* renamed from: c, reason: collision with root package name */
    public c f1302c;

    /* renamed from: d, reason: collision with root package name */
    public c f1303d;

    public c(Object obj, Object obj2) {
        this.a = obj;
        this.f1301b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.f1301b.equals(cVar.f1301b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1301b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f1301b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.f1301b;
    }
}
