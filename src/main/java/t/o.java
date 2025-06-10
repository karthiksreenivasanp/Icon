package t;

/* loaded from: classes.dex */
public final class o {
    public static final o k;
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2267b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2268c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2269d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2270e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2271f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f2272g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2273h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2274i;

    /* renamed from: j, reason: collision with root package name */
    public final float f2275j;

    static {
        float f2;
        float f3;
        float[] fArr = f1.e.f1037n;
        float fM0 = (float) ((f1.e.M0() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = f1.e.f1035l;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = (fArr3[1] * f6) + f5;
        float f8 = fArr[2];
        float f9 = (fArr3[2] * f8) + f7;
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[2] * f8) + (fArr4[1] * f6) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f11 = (f8 * fArr5[2]) + (f6 * fArr5[1]) + (f4 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f2 = 0.100000046f;
            f3 = 0.59f;
        } else {
            f2 = 0.12999998f;
            f3 = 0.525f;
        }
        float f12 = f2 + f3;
        float fExp = (1.0f - (((float) Math.exp(((-fM0) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * fM0) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(fM0 * 5.0d))) + (f14 * fM0);
        float fM02 = f1.e.M0() / fArr[1];
        double d3 = fM02;
        float fSqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float fPow2 = (float) Math.pow(((fArr6[2] * fCbrt) * f11) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f10) / 100.0d, 0.42d), fPow2};
        float f16 = fArr7[0];
        float f17 = fArr7[1];
        k = new o(fM02, ((((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f) + (((f16 * 400.0f) / (f16 + 27.13f)) * 2.0f) + ((f17 * 400.0f) / (f17 + 27.13f))) * fPow, fPow, fPow, f12, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public o(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f2271f = f2;
        this.a = f3;
        this.f2267b = f4;
        this.f2268c = f5;
        this.f2269d = f6;
        this.f2270e = f7;
        this.f2272g = fArr;
        this.f2273h = f8;
        this.f2274i = f9;
        this.f2275j = f10;
    }
}
