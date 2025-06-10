package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public float A;
    public String B;
    public final int C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a;

    /* renamed from: a0, reason: collision with root package name */
    public int f1856a0;

    /* renamed from: b, reason: collision with root package name */
    public int f1857b;

    /* renamed from: b0, reason: collision with root package name */
    public int f1858b0;

    /* renamed from: c, reason: collision with root package name */
    public float f1859c;

    /* renamed from: c0, reason: collision with root package name */
    public int f1860c0;

    /* renamed from: d, reason: collision with root package name */
    public int f1861d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1862d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1863e;

    /* renamed from: e0, reason: collision with root package name */
    public int f1864e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1865f;

    /* renamed from: f0, reason: collision with root package name */
    public int f1866f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1867g;

    /* renamed from: g0, reason: collision with root package name */
    public float f1868g0;

    /* renamed from: h, reason: collision with root package name */
    public int f1869h;

    /* renamed from: h0, reason: collision with root package name */
    public int f1870h0;

    /* renamed from: i, reason: collision with root package name */
    public int f1871i;

    /* renamed from: i0, reason: collision with root package name */
    public int f1872i0;

    /* renamed from: j, reason: collision with root package name */
    public int f1873j;

    /* renamed from: j0, reason: collision with root package name */
    public float f1874j0;
    public int k;

    /* renamed from: k0, reason: collision with root package name */
    public m.e f1875k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1876l;

    /* renamed from: m, reason: collision with root package name */
    public int f1877m;

    /* renamed from: n, reason: collision with root package name */
    public int f1878n;

    /* renamed from: o, reason: collision with root package name */
    public float f1879o;

    /* renamed from: p, reason: collision with root package name */
    public int f1880p;

    /* renamed from: q, reason: collision with root package name */
    public int f1881q;

    /* renamed from: r, reason: collision with root package name */
    public int f1882r;

    /* renamed from: s, reason: collision with root package name */
    public int f1883s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1884t;

    /* renamed from: u, reason: collision with root package name */
    public int f1885u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1886v;

    /* renamed from: w, reason: collision with root package name */
    public int f1887w;

    /* renamed from: x, reason: collision with root package name */
    public int f1888x;

    /* renamed from: y, reason: collision with root package name */
    public int f1889y;

    /* renamed from: z, reason: collision with root package name */
    public float f1890z;

    public d() {
        super(-2, -2);
        this.a = -1;
        this.f1857b = -1;
        this.f1859c = -1.0f;
        this.f1861d = -1;
        this.f1863e = -1;
        this.f1865f = -1;
        this.f1867g = -1;
        this.f1869h = -1;
        this.f1871i = -1;
        this.f1873j = -1;
        this.k = -1;
        this.f1876l = -1;
        this.f1877m = -1;
        this.f1878n = 0;
        this.f1879o = 0.0f;
        this.f1880p = -1;
        this.f1881q = -1;
        this.f1882r = -1;
        this.f1883s = -1;
        this.f1884t = -1;
        this.f1885u = -1;
        this.f1886v = -1;
        this.f1887w = -1;
        this.f1888x = -1;
        this.f1889y = -1;
        this.f1890z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f1856a0 = -1;
        this.f1858b0 = -1;
        this.f1860c0 = -1;
        this.f1862d0 = -1;
        this.f1864e0 = -1;
        this.f1866f0 = -1;
        this.f1868g0 = 0.5f;
        this.f1875k0 = new m.e();
    }

    public final void a() {
        this.Y = false;
        this.V = true;
        this.W = true;
        int i2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i2 == -2 && this.S) {
            this.V = false;
            if (this.H == 0) {
                this.H = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.T) {
            this.W = false;
            if (this.I == 0) {
                this.I = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.V = false;
            if (i2 == 0 && this.H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.S = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.W = false;
            if (i3 == 0 && this.I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.T = true;
            }
        }
        if (this.f1859c == -1.0f && this.a == -1 && this.f1857b == -1) {
            return;
        }
        this.Y = true;
        this.V = true;
        this.W = true;
        if (!(this.f1875k0 instanceof m.i)) {
            this.f1875k0 = new m.i();
        }
        ((m.i) this.f1875k0).B(this.R);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.resolveLayoutDirection(int):void");
    }

    public d(Context context, AttributeSet attributeSet) throws NumberFormatException {
        String str;
        int i2;
        super(context, attributeSet);
        this.a = -1;
        this.f1857b = -1;
        this.f1859c = -1.0f;
        this.f1861d = -1;
        this.f1863e = -1;
        this.f1865f = -1;
        this.f1867g = -1;
        this.f1869h = -1;
        this.f1871i = -1;
        this.f1873j = -1;
        this.k = -1;
        this.f1876l = -1;
        this.f1877m = -1;
        this.f1878n = 0;
        this.f1879o = 0.0f;
        this.f1880p = -1;
        this.f1881q = -1;
        this.f1882r = -1;
        this.f1883s = -1;
        this.f1884t = -1;
        this.f1885u = -1;
        this.f1886v = -1;
        this.f1887w = -1;
        this.f1888x = -1;
        this.f1889y = -1;
        this.f1890z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f1856a0 = -1;
        this.f1858b0 = -1;
        this.f1860c0 = -1;
        this.f1862d0 = -1;
        this.f1864e0 = -1;
        this.f1866f0 = -1;
        this.f1868g0 = 0.5f;
        this.f1875k0 = new m.e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1966b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            int i4 = c.a.get(index);
            switch (i4) {
                case 1:
                    this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                    continue;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1877m);
                    this.f1877m = resourceId;
                    if (resourceId == -1) {
                        this.f1877m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 3:
                    this.f1878n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1878n);
                    continue;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.f1879o) % 360.0f;
                    this.f1879o = f2;
                    if (f2 < 0.0f) {
                        this.f1879o = (360.0f - f2) % 360.0f;
                    } else {
                        continue;
                    }
                case 5:
                    this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                    continue;
                case 6:
                    this.f1857b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1857b);
                    continue;
                case 7:
                    this.f1859c = typedArrayObtainStyledAttributes.getFloat(index, this.f1859c);
                    continue;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1861d);
                    this.f1861d = resourceId2;
                    if (resourceId2 == -1) {
                        this.f1861d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1863e);
                    this.f1863e = resourceId3;
                    if (resourceId3 == -1) {
                        this.f1863e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1865f);
                    this.f1865f = resourceId4;
                    if (resourceId4 == -1) {
                        this.f1865f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1867g);
                    this.f1867g = resourceId5;
                    if (resourceId5 == -1) {
                        this.f1867g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1869h);
                    this.f1869h = resourceId6;
                    if (resourceId6 == -1) {
                        this.f1869h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1871i);
                    this.f1871i = resourceId7;
                    if (resourceId7 == -1) {
                        this.f1871i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1873j);
                    this.f1873j = resourceId8;
                    if (resourceId8 == -1) {
                        this.f1873j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                    this.k = resourceId9;
                    if (resourceId9 == -1) {
                        this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1876l);
                    this.f1876l = resourceId10;
                    if (resourceId10 == -1) {
                        this.f1876l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1880p);
                    this.f1880p = resourceId11;
                    if (resourceId11 == -1) {
                        this.f1880p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1881q);
                    this.f1881q = resourceId12;
                    if (resourceId12 == -1) {
                        this.f1881q = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1882r);
                    this.f1882r = resourceId13;
                    if (resourceId13 == -1) {
                        this.f1882r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1883s);
                    this.f1883s = resourceId14;
                    if (resourceId14 == -1) {
                        this.f1883s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    } else {
                        continue;
                    }
                case 21:
                    this.f1884t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1884t);
                    continue;
                case 22:
                    this.f1885u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1885u);
                    continue;
                case 23:
                    this.f1886v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1886v);
                    continue;
                case 24:
                    this.f1887w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1887w);
                    continue;
                case 25:
                    this.f1888x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1888x);
                    continue;
                case 26:
                    this.f1889y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1889y);
                    continue;
                case 27:
                    this.S = typedArrayObtainStyledAttributes.getBoolean(index, this.S);
                    continue;
                case 28:
                    this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                    continue;
                case 29:
                    this.f1890z = typedArrayObtainStyledAttributes.getFloat(index, this.f1890z);
                    continue;
                case 30:
                    this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                    continue;
                case 31:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    this.H = i5;
                    if (i5 == 1) {
                        str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        break;
                    }
                case 32:
                    int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    this.I = i6;
                    if (i6 == 1) {
                        str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        break;
                    }
                case 33:
                    try {
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        continue;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.J) == -2) {
                            this.J = -2;
                        }
                    }
                case 34:
                    try {
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        continue;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                            this.L = -2;
                        }
                    }
                case 35:
                    this.N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.N));
                    this.H = 2;
                    continue;
                case 36:
                    try {
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        continue;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                            this.K = -2;
                        }
                    }
                case 37:
                    try {
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        continue;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                            this.M = -2;
                        }
                    }
                case 38:
                    this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                    this.I = 2;
                    continue;
                default:
                    switch (i4) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.B = string;
                            this.C = -1;
                            if (string == null) {
                                break;
                            } else {
                                int length = string.length();
                                int iIndexOf = this.B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i2 = 0;
                                } else {
                                    String strSubstring = this.B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        this.C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        this.C = 1;
                                    }
                                    i2 = iIndexOf + 1;
                                }
                                int iIndexOf2 = this.B.indexOf(58);
                                if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                    String strSubstring2 = this.B.substring(i2, iIndexOf2);
                                    String strSubstring3 = this.B.substring(iIndexOf2 + 1);
                                    if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                                        break;
                                    } else {
                                        try {
                                            float f3 = Float.parseFloat(strSubstring2);
                                            float f4 = Float.parseFloat(strSubstring3);
                                            if (f3 <= 0.0f || f4 <= 0.0f) {
                                                break;
                                            } else if (this.C == 1) {
                                                Math.abs(f4 / f3);
                                                break;
                                            } else {
                                                Math.abs(f3 / f4);
                                                break;
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String strSubstring4 = this.B.substring(i2);
                                    if (strSubstring4.length() <= 0) {
                                        break;
                                    } else {
                                        Float.parseFloat(strSubstring4);
                                        continue;
                                    }
                                }
                            }
                        case 45:
                            this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                            break;
                        case 46:
                            this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                            break;
                        case 47:
                            this.F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                            break;
                        case 50:
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                            break;
                        case 51:
                            this.U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
            Log.e("ConstraintLayout", str);
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.f1857b = -1;
        this.f1859c = -1.0f;
        this.f1861d = -1;
        this.f1863e = -1;
        this.f1865f = -1;
        this.f1867g = -1;
        this.f1869h = -1;
        this.f1871i = -1;
        this.f1873j = -1;
        this.k = -1;
        this.f1876l = -1;
        this.f1877m = -1;
        this.f1878n = 0;
        this.f1879o = 0.0f;
        this.f1880p = -1;
        this.f1881q = -1;
        this.f1882r = -1;
        this.f1883s = -1;
        this.f1884t = -1;
        this.f1885u = -1;
        this.f1886v = -1;
        this.f1887w = -1;
        this.f1888x = -1;
        this.f1889y = -1;
        this.f1890z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f1856a0 = -1;
        this.f1858b0 = -1;
        this.f1860c0 = -1;
        this.f1862d0 = -1;
        this.f1864e0 = -1;
        this.f1866f0 = -1;
        this.f1868g0 = 0.5f;
        this.f1875k0 = new m.e();
    }
}
