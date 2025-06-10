package l;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {
    public boolean a;

    /* renamed from: e, reason: collision with root package name */
    public float f1574e;

    /* renamed from: l, reason: collision with root package name */
    public int f1580l;

    /* renamed from: b, reason: collision with root package name */
    public int f1571b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f1572c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f1573d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1575f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1576g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f1577h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public c[] f1578i = new c[16];

    /* renamed from: j, reason: collision with root package name */
    public int f1579j = 0;
    public int k = 0;

    public l(int i2) {
        this.f1580l = i2;
    }

    public final void a(c cVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f1579j;
            if (i2 >= i3) {
                c[] cVarArr = this.f1578i;
                if (i3 >= cVarArr.length) {
                    this.f1578i = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f1578i;
                int i4 = this.f1579j;
                cVarArr2[i4] = cVar;
                this.f1579j = i4 + 1;
                return;
            }
            if (this.f1578i[i2] == cVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void b(c cVar) {
        int i2 = this.f1579j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f1578i[i3] == cVar) {
                while (i3 < i2 - 1) {
                    c[] cVarArr = this.f1578i;
                    int i4 = i3 + 1;
                    cVarArr[i3] = cVarArr[i4];
                    i3 = i4;
                }
                this.f1579j--;
                return;
            }
            i3++;
        }
    }

    public final void c() {
        this.f1580l = 5;
        this.f1573d = 0;
        this.f1571b = -1;
        this.f1572c = -1;
        this.f1574e = 0.0f;
        this.f1575f = false;
        int i2 = this.f1579j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1578i[i3] = null;
        }
        this.f1579j = 0;
        this.k = 0;
        this.a = false;
        Arrays.fill(this.f1577h, 0.0f);
    }

    public final void d(c cVar) {
        int i2 = this.f1579j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1578i[i3].i(cVar, false);
        }
        this.f1579j = 0;
    }

    public final String toString() {
        return "" + this.f1571b;
    }
}
