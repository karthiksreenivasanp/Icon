package l;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements b {
    public int a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1581b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f1582c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f1583d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public float[] f1584e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f1585f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public int[] f1586g = new int[16];

    /* renamed from: h, reason: collision with root package name */
    public int f1587h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f1588i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final c f1589j;
    public final d k;

    public m(c cVar, d dVar) {
        this.f1589j = cVar;
        this.k = dVar;
        clear();
    }

    @Override // l.b
    public final float a(int i2) {
        int i3 = this.f1587h;
        int i4 = this.f1588i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f1584e[i4];
            }
            i4 = this.f1586g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // l.b
    public final void b(l lVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int iN = n(lVar);
            if (iN == -1) {
                d(lVar, f2);
                return;
            }
            float[] fArr = this.f1584e;
            float f3 = fArr[iN] + f2;
            fArr[iN] = f3;
            if (f3 <= -0.001f || f3 >= 0.001f) {
                return;
            }
            fArr[iN] = 0.0f;
            g(lVar, z2);
        }
    }

    @Override // l.b
    public final l c(int i2) {
        int i3 = this.f1587h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f1588i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return ((l[]) this.k.f1548d)[this.f1583d[i4]];
            }
            i4 = this.f1586g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // l.b
    public final void clear() {
        int i2 = this.f1587h;
        for (int i3 = 0; i3 < i2; i3++) {
            l lVarC = c(i3);
            if (lVarC != null) {
                lVarC.b(this.f1589j);
            }
        }
        for (int i4 = 0; i4 < this.a; i4++) {
            this.f1583d[i4] = -1;
            this.f1582c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.f1581b[i5] = -1;
        }
        this.f1587h = 0;
        this.f1588i = -1;
    }

    @Override // l.b
    public final void d(l lVar, float f2) {
        if (f2 > -0.001f && f2 < 0.001f) {
            g(lVar, true);
            return;
        }
        int i2 = 0;
        if (this.f1587h == 0) {
            m(0, lVar, f2);
            l(lVar, 0);
            this.f1588i = 0;
            return;
        }
        int iN = n(lVar);
        if (iN != -1) {
            this.f1584e[iN] = f2;
            return;
        }
        int i3 = this.f1587h + 1;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f1583d = Arrays.copyOf(this.f1583d, i5);
            this.f1584e = Arrays.copyOf(this.f1584e, i5);
            this.f1585f = Arrays.copyOf(this.f1585f, i5);
            this.f1586g = Arrays.copyOf(this.f1586g, i5);
            this.f1582c = Arrays.copyOf(this.f1582c, i5);
            for (int i6 = this.a; i6 < i5; i6++) {
                this.f1583d[i6] = -1;
                this.f1582c[i6] = -1;
            }
            this.a = i5;
        }
        int i7 = this.f1587h;
        int i8 = this.f1588i;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f1583d[i8];
            int i12 = lVar.f1571b;
            if (i11 == i12) {
                this.f1584e[i8] = f2;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f1586g[i8];
            if (i8 == -1) {
                break;
            }
        }
        while (true) {
            if (i2 >= this.a) {
                i2 = -1;
                break;
            } else if (this.f1583d[i2] == -1) {
                break;
            } else {
                i2++;
            }
        }
        m(i2, lVar, f2);
        int[] iArr = this.f1585f;
        if (i9 != -1) {
            iArr[i2] = i9;
            int[] iArr2 = this.f1586g;
            iArr2[i2] = iArr2[i9];
            iArr2[i9] = i2;
        } else {
            iArr[i2] = -1;
            if (this.f1587h > 0) {
                this.f1586g[i2] = this.f1588i;
                this.f1588i = i2;
            } else {
                this.f1586g[i2] = -1;
            }
        }
        int i13 = this.f1586g[i2];
        if (i13 != -1) {
            this.f1585f[i13] = i2;
        }
        l(lVar, i2);
    }

    @Override // l.b
    public final float e(c cVar, boolean z2) {
        float f2 = f(cVar.a);
        g(cVar.a, z2);
        m mVar = (m) cVar.f1543d;
        int i2 = mVar.f1587h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = mVar.f1583d[i4];
            if (i5 != -1) {
                b(((l[]) this.k.f1548d)[i5], mVar.f1584e[i4] * f2, z2);
                i3++;
            }
            i4++;
        }
        return f2;
    }

    @Override // l.b
    public final float f(l lVar) {
        int iN = n(lVar);
        if (iN != -1) {
            return this.f1584e[iN];
        }
        return 0.0f;
    }

    @Override // l.b
    public final float g(l lVar, boolean z2) {
        int[] iArr;
        int i2;
        int iN = n(lVar);
        if (iN == -1) {
            return 0.0f;
        }
        int i3 = lVar.f1571b;
        int i4 = i3 % 16;
        int[] iArr2 = this.f1581b;
        int i5 = iArr2[i4];
        if (i5 != -1) {
            if (this.f1583d[i5] == i3) {
                int[] iArr3 = this.f1582c;
                iArr2[i4] = iArr3[i5];
                iArr3[i5] = -1;
            } else {
                while (true) {
                    iArr = this.f1582c;
                    i2 = iArr[i5];
                    if (i2 == -1 || this.f1583d[i2] == i3) {
                        break;
                    }
                    i5 = i2;
                }
                if (i2 != -1 && this.f1583d[i2] == i3) {
                    iArr[i5] = iArr[i2];
                    iArr[i2] = -1;
                }
            }
        }
        float f2 = this.f1584e[iN];
        if (this.f1588i == iN) {
            this.f1588i = this.f1586g[iN];
        }
        this.f1583d[iN] = -1;
        int[] iArr4 = this.f1585f;
        int i6 = iArr4[iN];
        if (i6 != -1) {
            int[] iArr5 = this.f1586g;
            iArr5[i6] = iArr5[iN];
        }
        int i7 = this.f1586g[iN];
        if (i7 != -1) {
            iArr4[i7] = iArr4[iN];
        }
        this.f1587h--;
        lVar.k--;
        if (z2) {
            lVar.b(this.f1589j);
        }
        return f2;
    }

    @Override // l.b
    public final boolean h(l lVar) {
        return n(lVar) != -1;
    }

    @Override // l.b
    public final void i(float f2) {
        int i2 = this.f1587h;
        int i3 = this.f1588i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f1584e;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f1586g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // l.b
    public final void j() {
        int i2 = this.f1587h;
        int i3 = this.f1588i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f1584e;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f1586g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // l.b
    public final int k() {
        return this.f1587h;
    }

    public final void l(l lVar, int i2) {
        int[] iArr;
        int i3 = lVar.f1571b % 16;
        int[] iArr2 = this.f1581b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f1582c;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                } else {
                    i4 = i5;
                }
            }
            iArr[i4] = i2;
        }
        this.f1582c[i2] = -1;
    }

    public final void m(int i2, l lVar, float f2) {
        this.f1583d[i2] = lVar.f1571b;
        this.f1584e[i2] = f2;
        this.f1585f[i2] = -1;
        this.f1586g[i2] = -1;
        lVar.a(this.f1589j);
        lVar.k++;
        this.f1587h++;
    }

    public final int n(l lVar) {
        if (this.f1587h == 0) {
            return -1;
        }
        int i2 = lVar.f1571b;
        int i3 = this.f1581b[i2 % 16];
        if (i3 == -1) {
            return -1;
        }
        if (this.f1583d[i3] == i2) {
            return i3;
        }
        do {
            i3 = this.f1582c[i3];
            if (i3 == -1) {
                break;
            }
        } while (this.f1583d[i3] != i2);
        if (i3 != -1 && this.f1583d[i3] == i2) {
            return i3;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i2 = this.f1587h;
        for (int i3 = 0; i3 < i2; i3++) {
            l lVarC = c(i3);
            if (lVarC != null) {
                String str2 = str + lVarC + " = " + a(i3) + " ";
                int iN = n(lVarC);
                String str3 = str2 + "[p: ";
                int i4 = this.f1585f[iN];
                d dVar = this.k;
                if (i4 != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(((l[]) dVar.f1548d)[this.f1583d[this.f1585f[iN]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f1586g[iN] != -1 ? str4 + ((l[]) dVar.f1548d)[this.f1583d[this.f1586g[iN]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
