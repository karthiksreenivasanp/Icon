package o0;

/* loaded from: classes.dex */
public final class g1 {
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2015b;

    /* renamed from: c, reason: collision with root package name */
    public int f2016c;

    /* renamed from: d, reason: collision with root package name */
    public int f2017d;

    /* renamed from: e, reason: collision with root package name */
    public int f2018e;

    public final boolean a() {
        int i2 = this.a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f2017d;
            int i5 = this.f2015b;
            if ((((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) << 0) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f2017d;
            int i7 = this.f2016c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f2018e;
            int i9 = this.f2015b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f2018e;
            int i11 = this.f2016c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if (((i3 << 12) & i2) == 0) {
                return false;
            }
        }
        return true;
    }
}
