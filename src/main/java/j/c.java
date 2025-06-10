package j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1431e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f1432f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    public static Object[] f1433g;

    /* renamed from: h, reason: collision with root package name */
    public static int f1434h;

    /* renamed from: i, reason: collision with root package name */
    public static Object[] f1435i;

    /* renamed from: j, reason: collision with root package name */
    public static int f1436j;
    public int[] a = f1431e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1437b = f1432f;

    /* renamed from: c, reason: collision with root package name */
    public int f1438c = 0;

    /* renamed from: d, reason: collision with root package name */
    public a f1439d;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f1436j < 10) {
                    objArr[0] = f1435i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1435i = objArr;
                    f1436j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                if (f1434h < 10) {
                    objArr[0] = f1433g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1433g = objArr;
                    f1434h++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                Object[] objArr = f1435i;
                if (objArr != null) {
                    this.f1437b = objArr;
                    f1435i = (Object[]) objArr[0];
                    this.a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1436j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f1433g;
                if (objArr2 != null) {
                    this.f1437b = objArr2;
                    f1433g = (Object[]) objArr2[0];
                    this.a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1434h--;
                    return;
                }
            }
        }
        this.a = new int[i2];
        this.f1437b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iC;
        if (obj == null) {
            iC = d();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iC = c(iHashCode, obj);
        }
        if (iC >= 0) {
            return false;
        }
        int i3 = ~iC;
        int i4 = this.f1438c;
        int[] iArr = this.a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f1437b;
            a(i5);
            int[] iArr2 = this.a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1437b, 0, objArr.length);
            }
            b(iArr, objArr, this.f1438c);
        }
        int i6 = this.f1438c;
        if (i3 < i6) {
            int[] iArr3 = this.a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1437b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1438c - i3);
        }
        this.a[i3] = i2;
        this.f1437b[i3] = obj;
        this.f1438c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f1438c;
        int[] iArr = this.a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1437b;
            a(size);
            int i2 = this.f1438c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i2);
                System.arraycopy(objArr, 0, this.f1437b, 0, this.f1438c);
            }
            b(iArr, objArr, this.f1438c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final int c(int i2, Object obj) {
        int i3 = this.f1438c;
        if (i3 == 0) {
            return -1;
        }
        int i4 = f1.e.i(i3, i2, this.a);
        if (i4 < 0 || obj.equals(this.f1437b[i4])) {
            return i4;
        }
        int i5 = i4 + 1;
        while (i5 < i3 && this.a[i5] == i2) {
            if (obj.equals(this.f1437b[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = i4 - 1; i6 >= 0 && this.a[i6] == i2; i6--) {
            if (obj.equals(this.f1437b[i6])) {
                return i6;
            }
        }
        return ~i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f1438c;
        if (i2 != 0) {
            b(this.a, this.f1437b, i2);
            this.a = f1431e;
            this.f1437b = f1432f;
            this.f1438c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i2 = this.f1438c;
        if (i2 == 0) {
            return -1;
        }
        int i3 = f1.e.i(i2, 0, this.a);
        if (i3 < 0 || this.f1437b[i3] == null) {
            return i3;
        }
        int i4 = i3 + 1;
        while (i4 < i2 && this.a[i4] == 0) {
            if (this.f1437b[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = i3 - 1; i5 >= 0 && this.a[i5] == 0; i5--) {
            if (this.f1437b[i5] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final void e(int i2) {
        Object[] objArr = this.f1437b;
        Object obj = objArr[i2];
        int i3 = this.f1438c;
        if (i3 <= 1) {
            b(this.a, objArr, i3);
            this.a = f1431e;
            this.f1437b = f1432f;
            this.f1438c = 0;
            return;
        }
        int[] iArr = this.a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.f1438c = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.f1437b;
                System.arraycopy(objArr2, i5, objArr2, i2, this.f1438c - i2);
            }
            this.f1437b[this.f1438c] = null;
            return;
        }
        a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f1438c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.a, 0, i2);
            System.arraycopy(objArr, 0, this.f1437b, 0, i2);
        }
        int i6 = this.f1438c;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.a, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.f1437b, i2, this.f1438c - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1438c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1438c; i2++) {
                try {
                    if (!set.contains(this.f1437b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i2 = this.f1438c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1438c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i2 = 1;
        if (this.f1439d == null) {
            this.f1439d = new a(1, this);
        }
        a aVar = this.f1439d;
        if (aVar.f1456b == null) {
            aVar.f1456b = new g(aVar, i2);
        }
        return aVar.f1456b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f1438c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1437b[i2])) {
                e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1438c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.f1438c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1437b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1438c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1438c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1437b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f1438c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f1438c);
        }
        System.arraycopy(this.f1437b, 0, objArr, 0, this.f1438c);
        int length = objArr.length;
        int i2 = this.f1438c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
