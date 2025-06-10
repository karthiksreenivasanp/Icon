package g;

/* loaded from: classes.dex */
public final class u1 {
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1232b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1233c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f1234d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f1235e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1236f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1237g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1238h = false;

    public final void a(int i2, int i3) {
        this.f1233c = i2;
        this.f1234d = i3;
        this.f1238h = true;
        if (this.f1237g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1232b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1232b = i3;
        }
    }
}
