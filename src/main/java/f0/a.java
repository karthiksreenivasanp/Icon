package f0;

/* loaded from: classes.dex */
public final class a {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f981b;

    /* renamed from: c, reason: collision with root package name */
    public float f982c;

    /* renamed from: d, reason: collision with root package name */
    public float f983d;

    /* renamed from: h, reason: collision with root package name */
    public float f987h;

    /* renamed from: i, reason: collision with root package name */
    public int f988i;

    /* renamed from: e, reason: collision with root package name */
    public long f984e = Long.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public long f986g = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f985f = 0;

    public final float a(long j2) {
        if (j2 < this.f984e) {
            return 0.0f;
        }
        long j3 = this.f986g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f987h;
        return (g.b((j2 - j3) / this.f988i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
