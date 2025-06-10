package j;

/* loaded from: classes.dex */
public final class d implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1440e = new Object();
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f1441b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1442c;

    /* renamed from: d, reason: collision with root package name */
    public int f1443d;

    public d() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f1441b = new long[i5];
        this.f1442c = new Object[i5];
    }

    public final void a() {
        int i2 = this.f1443d;
        Object[] objArr = this.f1442c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1443d = 0;
        this.a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f1441b = (long[]) this.f1441b.clone();
            dVar.f1442c = (Object[]) this.f1442c.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i2 = this.f1443d;
        long[] jArr = this.f1441b;
        Object[] objArr = this.f1442c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1440e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.a = false;
        this.f1443d = i3;
    }

    public final Object d(long j2, Long l2) {
        Object obj;
        int iJ = f1.e.j(this.f1441b, this.f1443d, j2);
        return (iJ < 0 || (obj = this.f1442c[iJ]) == f1440e) ? l2 : obj;
    }

    public final void e(long j2, Object obj) {
        int iJ = f1.e.j(this.f1441b, this.f1443d, j2);
        if (iJ >= 0) {
            this.f1442c[iJ] = obj;
            return;
        }
        int i2 = ~iJ;
        int i3 = this.f1443d;
        if (i2 < i3) {
            Object[] objArr = this.f1442c;
            if (objArr[i2] == f1440e) {
                this.f1441b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.f1441b.length) {
            c();
            i2 = ~f1.e.j(this.f1441b, this.f1443d, j2);
        }
        int i4 = this.f1443d;
        if (i4 >= this.f1441b.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f1441b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1442c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1441b = jArr;
            this.f1442c = objArr2;
        }
        int i9 = this.f1443d - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f1441b;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f1442c;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f1443d - i2);
        }
        this.f1441b[i2] = j2;
        this.f1442c[i2] = obj;
        this.f1443d++;
    }

    public final Object f(int i2) {
        if (this.a) {
            c();
        }
        return this.f1442c[i2];
    }

    public final String toString() {
        if (this.a) {
            c();
        }
        int i2 = this.f1443d;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f1443d; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.a) {
                c();
            }
            sb.append(this.f1441b[i3]);
            sb.append('=');
            Object objF = f(i3);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
