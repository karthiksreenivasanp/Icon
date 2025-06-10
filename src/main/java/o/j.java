package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j0, reason: collision with root package name */
    public static final SparseIntArray f1910j0;

    /* renamed from: b, reason: collision with root package name */
    public int f1912b;

    /* renamed from: c, reason: collision with root package name */
    public int f1914c;

    /* renamed from: d0, reason: collision with root package name */
    public int[] f1917d0;

    /* renamed from: e0, reason: collision with root package name */
    public String f1919e0;

    /* renamed from: f0, reason: collision with root package name */
    public String f1921f0;
    public boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    public int f1916d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f1918e = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f1920f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f1922g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f1924h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f1926i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f1928j = -1;
    public int k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f1929l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f1930m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f1931n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f1932o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f1933p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f1934q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f1935r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f1936s = -1;

    /* renamed from: t, reason: collision with root package name */
    public float f1937t = 0.5f;

    /* renamed from: u, reason: collision with root package name */
    public float f1938u = 0.5f;

    /* renamed from: v, reason: collision with root package name */
    public String f1939v = null;

    /* renamed from: w, reason: collision with root package name */
    public int f1940w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f1941x = 0;

    /* renamed from: y, reason: collision with root package name */
    public float f1942y = 0.0f;

    /* renamed from: z, reason: collision with root package name */
    public int f1943z = -1;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public float O = -1.0f;
    public float P = -1.0f;
    public int Q = 0;
    public int R = 0;
    public int S = 0;
    public int T = 0;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public float Y = 1.0f;
    public float Z = 1.0f;

    /* renamed from: a0, reason: collision with root package name */
    public int f1911a0 = -1;

    /* renamed from: b0, reason: collision with root package name */
    public int f1913b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1915c0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1923g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1925h0 = false;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1927i0 = true;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1910j0 = sparseIntArray;
        sparseIntArray.append(38, 24);
        sparseIntArray.append(39, 25);
        sparseIntArray.append(41, 28);
        sparseIntArray.append(42, 29);
        sparseIntArray.append(47, 35);
        sparseIntArray.append(46, 34);
        sparseIntArray.append(20, 4);
        sparseIntArray.append(19, 3);
        sparseIntArray.append(17, 1);
        sparseIntArray.append(55, 6);
        sparseIntArray.append(56, 7);
        sparseIntArray.append(27, 17);
        sparseIntArray.append(28, 18);
        sparseIntArray.append(29, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(43, 31);
        sparseIntArray.append(44, 32);
        sparseIntArray.append(26, 10);
        sparseIntArray.append(25, 9);
        sparseIntArray.append(59, 13);
        sparseIntArray.append(62, 16);
        sparseIntArray.append(60, 14);
        sparseIntArray.append(57, 11);
        sparseIntArray.append(61, 15);
        sparseIntArray.append(58, 12);
        sparseIntArray.append(50, 38);
        sparseIntArray.append(36, 37);
        sparseIntArray.append(35, 39);
        sparseIntArray.append(49, 40);
        sparseIntArray.append(34, 20);
        sparseIntArray.append(48, 36);
        sparseIntArray.append(24, 5);
        sparseIntArray.append(37, 76);
        sparseIntArray.append(45, 76);
        sparseIntArray.append(40, 76);
        sparseIntArray.append(18, 76);
        sparseIntArray.append(16, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(21, 61);
        sparseIntArray.append(23, 62);
        sparseIntArray.append(22, 63);
        sparseIntArray.append(54, 69);
        sparseIntArray.append(33, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        StringBuilder sb;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1968d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray = f1910j0;
            int i3 = sparseIntArray.get(index);
            if (i3 == 80) {
                this.f1923g0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1923g0);
            } else if (i3 != 81) {
                switch (i3) {
                    case 1:
                        this.f1932o = n.f(typedArrayObtainStyledAttributes, index, this.f1932o);
                        break;
                    case 2:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 3:
                        this.f1931n = n.f(typedArrayObtainStyledAttributes, index, this.f1931n);
                        break;
                    case 4:
                        this.f1930m = n.f(typedArrayObtainStyledAttributes, index, this.f1930m);
                        break;
                    case 5:
                        this.f1939v = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f1943z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1943z);
                        break;
                    case 7:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                        break;
                    case 8:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 9:
                        this.f1936s = n.f(typedArrayObtainStyledAttributes, index, this.f1936s);
                        break;
                    case 10:
                        this.f1935r = n.f(typedArrayObtainStyledAttributes, index, this.f1935r);
                        break;
                    case 11:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 12:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 13:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 14:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 15:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 16:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 17:
                        this.f1916d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1916d);
                        break;
                    case 18:
                        this.f1918e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1918e);
                        break;
                    case 19:
                        this.f1920f = typedArrayObtainStyledAttributes.getFloat(index, this.f1920f);
                        break;
                    case 20:
                        this.f1937t = typedArrayObtainStyledAttributes.getFloat(index, this.f1937t);
                        break;
                    case 21:
                        this.f1914c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1914c);
                        break;
                    case 22:
                        this.f1912b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1912b);
                        break;
                    case 23:
                        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                        break;
                    case 24:
                        this.f1922g = n.f(typedArrayObtainStyledAttributes, index, this.f1922g);
                        break;
                    case 25:
                        this.f1924h = n.f(typedArrayObtainStyledAttributes, index, this.f1924h);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getInt(index, this.B);
                        break;
                    case 27:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                        break;
                    case 28:
                        this.f1926i = n.f(typedArrayObtainStyledAttributes, index, this.f1926i);
                        break;
                    case 29:
                        this.f1928j = n.f(typedArrayObtainStyledAttributes, index, this.f1928j);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 31:
                        this.f1933p = n.f(typedArrayObtainStyledAttributes, index, this.f1933p);
                        break;
                    case 32:
                        this.f1934q = n.f(typedArrayObtainStyledAttributes, index, this.f1934q);
                        break;
                    case 33:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                        break;
                    case 34:
                        this.f1929l = n.f(typedArrayObtainStyledAttributes, index, this.f1929l);
                        break;
                    case 35:
                        this.k = n.f(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 36:
                        this.f1938u = typedArrayObtainStyledAttributes.getFloat(index, this.f1938u);
                        break;
                    case 37:
                        this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                        break;
                    case 38:
                        this.O = typedArrayObtainStyledAttributes.getFloat(index, this.O);
                        break;
                    case 39:
                        this.Q = typedArrayObtainStyledAttributes.getInt(index, this.Q);
                        break;
                    case 40:
                        this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                        break;
                    default:
                        switch (i3) {
                            case 54:
                                this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                                break;
                            case 55:
                                this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                break;
                            case 56:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                break;
                            case 57:
                                this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                break;
                            case 58:
                                this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                break;
                            case 59:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                break;
                            default:
                                switch (i3) {
                                    case 61:
                                        this.f1940w = n.f(typedArrayObtainStyledAttributes, index, this.f1940w);
                                        break;
                                    case 62:
                                        this.f1941x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1941x);
                                        break;
                                    case 63:
                                        this.f1942y = typedArrayObtainStyledAttributes.getFloat(index, this.f1942y);
                                        break;
                                    default:
                                        switch (i3) {
                                            case 69:
                                                this.Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 70:
                                                this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                continue;
                                            case 72:
                                                this.f1911a0 = typedArrayObtainStyledAttributes.getInt(index, this.f1911a0);
                                                continue;
                                            case 73:
                                                this.f1913b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1913b0);
                                                continue;
                                            case 74:
                                                this.f1919e0 = typedArrayObtainStyledAttributes.getString(index);
                                                continue;
                                            case 75:
                                                this.f1927i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1927i0);
                                                continue;
                                            case 76:
                                                sb = new StringBuilder("unused attribute 0x");
                                                break;
                                            case 77:
                                                this.f1921f0 = typedArrayObtainStyledAttributes.getString(index);
                                                continue;
                                            default:
                                                sb = new StringBuilder("Unknown attribute 0x");
                                                break;
                                        }
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(sparseIntArray.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        break;
                                }
                        }
                }
            } else {
                this.f1925h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1925h0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
