package j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements Set {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1452b;

    public /* synthetic */ g(j jVar, int i2) {
        this.a = i2;
        this.f1452b = jVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                j jVar = this.f1452b;
                int iD = jVar.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    a aVar = (a) jVar;
                    int i2 = aVar.f1428d;
                    Object obj = aVar.f1429e;
                    switch (i2) {
                        case 0:
                            ((b) obj).put(key, value);
                            break;
                        default:
                            ((c) obj).add(key);
                            break;
                    }
                }
                return iD != jVar.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i2 = this.a;
        j jVar = this.f1452b;
        switch (i2) {
            case 0:
                jVar.a();
                break;
            default:
                jVar.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i2 = this.a;
        boolean z2 = true;
        j jVar = this.f1452b;
        switch (i2) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iE = jVar.e(entry.getKey());
                if (iE < 0) {
                    return false;
                }
                Object objB = jVar.b(iE, 1);
                Object value = entry.getValue();
                if (objB != value && (objB == null || !objB.equals(value))) {
                    z2 = false;
                }
                return z2;
            default:
                return jVar.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                b bVarC = this.f1452b.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!bVarC.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.a) {
        }
        return j.g(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i2 = this.a;
        j jVar = this.f1452b;
        switch (i2) {
            case 0:
                int iHashCode = 0;
                for (int iD = jVar.d() - 1; iD >= 0; iD--) {
                    Object objB = jVar.b(iD, 0);
                    Object objB2 = jVar.b(iD, 1);
                    iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
                }
                return iHashCode;
            default:
                int iHashCode2 = 0;
                for (int iD2 = jVar.d() - 1; iD2 >= 0; iD2--) {
                    Object objB3 = jVar.b(iD2, 0);
                    iHashCode2 += objB3 == null ? 0 : objB3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i2 = this.a;
        j jVar = this.f1452b;
        switch (i2) {
            case 0:
                if (jVar.d() != 0) {
                    break;
                }
                break;
            default:
                if (jVar.d() != 0) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.a;
        j jVar = this.f1452b;
        switch (i2) {
            case 0:
                return new h(jVar);
            default:
                return new f(jVar, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                j jVar = this.f1452b;
                int iE = jVar.e(obj);
                if (iE < 0) {
                    return false;
                }
                jVar.f(iE);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                b bVarC = this.f1452b.c();
                int i2 = bVarC.f1463c;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    bVarC.remove(it.next());
                }
                return i2 != bVarC.f1463c;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return j.h(this.f1452b.c(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i2 = this.a;
        j jVar = this.f1452b;
        switch (i2) {
        }
        return jVar.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                j jVar = this.f1452b;
                int iD = jVar.d();
                Object[] objArr = new Object[iD];
                for (int i2 = 0; i2 < iD; i2++) {
                    objArr[i2] = jVar.b(i2, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f1452b.i(0, objArr);
        }
    }
}
