package l;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f1532b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1533c;
    public int a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1534d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1535e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f1536f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f1537g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f1538h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f1539i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1540j = false;

    public a(c cVar, d dVar) {
        this.f1532b = cVar;
        this.f1533c = dVar;
    }

    @Override // l.b
    public final float a(int i2) {
        int i3 = this.f1538h;
        for (int i4 = 0; i3 != -1 && i4 < this.a; i4++) {
            if (i4 == i2) {
                return this.f1537g[i3];
            }
            i3 = this.f1536f[i3];
        }
        return 0.0f;
    }

    @Override // l.b
    public final void b(l lVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f1538h;
            c cVar = this.f1532b;
            if (i2 == -1) {
                this.f1538h = 0;
                this.f1537g[0] = f2;
                this.f1535e[0] = lVar.f1571b;
                this.f1536f[0] = -1;
                lVar.k++;
                lVar.a(cVar);
                this.a++;
                if (this.f1540j) {
                    return;
                }
                int i3 = this.f1539i + 1;
                this.f1539i = i3;
                int[] iArr = this.f1535e;
                if (i3 >= iArr.length) {
                    this.f1540j = true;
                    this.f1539i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.a; i5++) {
                int i6 = this.f1535e[i2];
                int i7 = lVar.f1571b;
                if (i6 == i7) {
                    float[] fArr = this.f1537g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f1538h) {
                            this.f1538h = this.f1536f[i2];
                        } else {
                            int[] iArr2 = this.f1536f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            lVar.b(cVar);
                        }
                        if (this.f1540j) {
                            this.f1539i = i2;
                        }
                        lVar.k--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f1536f[i2];
            }
            int length = this.f1539i;
            int i8 = length + 1;
            if (this.f1540j) {
                int[] iArr3 = this.f1535e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f1535e;
            if (length >= iArr4.length && this.a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f1535e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f1535e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f1534d * 2;
                this.f1534d = i10;
                this.f1540j = false;
                this.f1539i = length - 1;
                this.f1537g = Arrays.copyOf(this.f1537g, i10);
                this.f1535e = Arrays.copyOf(this.f1535e, this.f1534d);
                this.f1536f = Arrays.copyOf(this.f1536f, this.f1534d);
            }
            this.f1535e[length] = lVar.f1571b;
            this.f1537g[length] = f2;
            int[] iArr7 = this.f1536f;
            if (i4 != -1) {
                iArr7[length] = iArr7[i4];
                iArr7[i4] = length;
            } else {
                iArr7[length] = this.f1538h;
                this.f1538h = length;
            }
            lVar.k++;
            lVar.a(cVar);
            this.a++;
            if (!this.f1540j) {
                this.f1539i++;
            }
            int i11 = this.f1539i;
            int[] iArr8 = this.f1535e;
            if (i11 >= iArr8.length) {
                this.f1540j = true;
                this.f1539i = iArr8.length - 1;
            }
        }
    }

    @Override // l.b
    public final l c(int i2) {
        int i3 = this.f1538h;
        for (int i4 = 0; i3 != -1 && i4 < this.a; i4++) {
            if (i4 == i2) {
                return ((l[]) this.f1533c.f1548d)[this.f1535e[i3]];
            }
            i3 = this.f1536f[i3];
        }
        return null;
    }

    @Override // l.b
    public final void clear() {
        int i2 = this.f1538h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            l lVar = ((l[]) this.f1533c.f1548d)[this.f1535e[i2]];
            if (lVar != null) {
                lVar.b(this.f1532b);
            }
            i2 = this.f1536f[i2];
        }
        this.f1538h = -1;
        this.f1539i = -1;
        this.f1540j = false;
        this.a = 0;
    }

    @Override // l.b
    public final void d(l lVar, float f2) {
        if (f2 == 0.0f) {
            g(lVar, true);
            return;
        }
        int i2 = this.f1538h;
        c cVar = this.f1532b;
        if (i2 == -1) {
            this.f1538h = 0;
            this.f1537g[0] = f2;
            this.f1535e[0] = lVar.f1571b;
            this.f1536f[0] = -1;
            lVar.k++;
            lVar.a(cVar);
            this.a++;
            if (this.f1540j) {
                return;
            }
            int i3 = this.f1539i + 1;
            this.f1539i = i3;
            int[] iArr = this.f1535e;
            if (i3 >= iArr.length) {
                this.f1540j = true;
                this.f1539i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.a; i5++) {
            int i6 = this.f1535e[i2];
            int i7 = lVar.f1571b;
            if (i6 == i7) {
                this.f1537g[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f1536f[i2];
        }
        int length = this.f1539i;
        int i8 = length + 1;
        if (this.f1540j) {
            int[] iArr2 = this.f1535e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i8;
        }
        int[] iArr3 = this.f1535e;
        if (length >= iArr3.length && this.a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f1535e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f1535e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i10 = this.f1534d * 2;
            this.f1534d = i10;
            this.f1540j = false;
            this.f1539i = length - 1;
            this.f1537g = Arrays.copyOf(this.f1537g, i10);
            this.f1535e = Arrays.copyOf(this.f1535e, this.f1534d);
            this.f1536f = Arrays.copyOf(this.f1536f, this.f1534d);
        }
        this.f1535e[length] = lVar.f1571b;
        this.f1537g[length] = f2;
        int[] iArr6 = this.f1536f;
        if (i4 != -1) {
            iArr6[length] = iArr6[i4];
            iArr6[i4] = length;
        } else {
            iArr6[length] = this.f1538h;
            this.f1538h = length;
        }
        lVar.k++;
        lVar.a(cVar);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.f1540j) {
            this.f1539i++;
        }
        int[] iArr7 = this.f1535e;
        if (i11 >= iArr7.length) {
            this.f1540j = true;
        }
        if (this.f1539i >= iArr7.length) {
            this.f1540j = true;
            this.f1539i = iArr7.length - 1;
        }
    }

    @Override // l.b
    public final float e(c cVar, boolean z2) {
        float f2 = f(cVar.a);
        g(cVar.a, z2);
        b bVar = cVar.f1543d;
        int iK = bVar.k();
        for (int i2 = 0; i2 < iK; i2++) {
            l lVarC = bVar.c(i2);
            b(lVarC, bVar.f(lVarC) * f2, z2);
        }
        return f2;
    }

    @Override // l.b
    public final float f(l lVar) {
        int i2 = this.f1538h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (this.f1535e[i2] == lVar.f1571b) {
                return this.f1537g[i2];
            }
            i2 = this.f1536f[i2];
        }
        return 0.0f;
    }

    @Override // l.b
    public final float g(l lVar, boolean z2) {
        int i2 = this.f1538h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.f1535e[i2] == lVar.f1571b) {
                if (i2 == this.f1538h) {
                    this.f1538h = this.f1536f[i2];
                } else {
                    int[] iArr = this.f1536f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    lVar.b(this.f1532b);
                }
                lVar.k--;
                this.a--;
                this.f1535e[i2] = -1;
                if (this.f1540j) {
                    this.f1539i = i2;
                }
                return this.f1537g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f1536f[i2];
        }
        return 0.0f;
    }

    @Override // l.b
    public final boolean h(l lVar) {
        int i2 = this.f1538h;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (this.f1535e[i2] == lVar.f1571b) {
                return true;
            }
            i2 = this.f1536f[i2];
        }
        return false;
    }

    @Override // l.b
    public final void i(float f2) {
        int i2 = this.f1538h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            float[] fArr = this.f1537g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f1536f[i2];
        }
    }

    @Override // l.b
    public final void j() {
        int i2 = this.f1538h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            float[] fArr = this.f1537g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f1536f[i2];
        }
    }

    @Override // l.b
    public final int k() {
        return this.a;
    }

    public final String toString() {
        int i2 = this.f1538h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            str = ((str + " -> ") + this.f1537g[i2] + " : ") + ((l[]) this.f1533c.f1548d)[this.f1535e[i2]];
            i2 = this.f1536f[i2];
        }
        return str;
    }
}
