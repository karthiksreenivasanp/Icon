package j;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Collection {
    public final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int iIndexOf;
        a aVar = (a) this.a;
        int i2 = aVar.f1428d;
        Object obj2 = aVar.f1429e;
        switch (i2) {
            case 0:
                iIndexOf = ((b) obj2).g(obj);
                break;
            default:
                iIndexOf = ((c) obj2).indexOf(obj);
                break;
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf;
        j jVar = this.a;
        a aVar = (a) jVar;
        int i2 = aVar.f1428d;
        Object obj2 = aVar.f1429e;
        switch (i2) {
            case 0:
                iIndexOf = ((b) obj2).g(obj);
                break;
            default:
                iIndexOf = ((c) obj2).indexOf(obj);
                break;
        }
        if (iIndexOf < 0) {
            return false;
        }
        jVar.f(iIndexOf);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        j jVar = this.a;
        int iD = jVar.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iD) {
            if (collection.contains(jVar.b(i2, 1))) {
                jVar.f(i2);
                i2--;
                iD--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        j jVar = this.a;
        int iD = jVar.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < iD) {
            if (!collection.contains(jVar.b(i2, 1))) {
                jVar.f(i2);
                i2--;
                iD--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        j jVar = this.a;
        int iD = jVar.d();
        Object[] objArr = new Object[iD];
        for (int i2 = 0; i2 < iD; i2++) {
            objArr[i2] = jVar.b(i2, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.i(1, objArr);
    }
}
