package j;

/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f1464d = new Object();
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1465b;

    /* renamed from: c, reason: collision with root package name */
    public int f1466c;

    public l() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.a = new int[i5];
        this.f1465b = new Object[i5];
    }

    public final void a(int i2, Object obj) {
        int i3 = this.f1466c;
        if (i3 != 0 && i2 <= this.a[i3 - 1]) {
            d(i2, obj);
            return;
        }
        if (i3 >= this.a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1465b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.a = iArr;
            this.f1465b = objArr;
        }
        this.a[i3] = i2;
        this.f1465b[i3] = obj;
        this.f1466c = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.a = (int[]) this.a.clone();
            lVar.f1465b = (Object[]) this.f1465b.clone();
            return lVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final Object c(int i2, Integer num) {
        Object obj;
        int i3 = f1.e.i(this.f1466c, i2, this.a);
        return (i3 < 0 || (obj = this.f1465b[i3]) == f1464d) ? num : obj;
    }

    public final void d(int i2, Object obj) {
        int i3 = f1.e.i(this.f1466c, i2, this.a);
        if (i3 >= 0) {
            this.f1465b[i3] = obj;
            return;
        }
        int i4 = ~i3;
        int i5 = this.f1466c;
        if (i4 < i5) {
            Object[] objArr = this.f1465b;
            if (objArr[i4] == f1464d) {
                this.a[i4] = i2;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.a.length) {
            int i6 = (i5 + 1) * 4;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 4;
            int[] iArr = new int[i9];
            Object[] objArr2 = new Object[i9];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1465b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.a = iArr;
            this.f1465b = objArr2;
        }
        int i10 = this.f1466c - i4;
        if (i10 != 0) {
            int[] iArr3 = this.a;
            int i11 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i11, i10);
            Object[] objArr4 = this.f1465b;
            System.arraycopy(objArr4, i4, objArr4, i11, this.f1466c - i4);
        }
        this.a[i4] = i2;
        this.f1465b[i4] = obj;
        this.f1466c++;
    }

    public final String toString() {
        int i2 = this.f1466c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f1466c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.a[i3]);
            sb.append('=');
            Object obj = this.f1465b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
