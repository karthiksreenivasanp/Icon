package w0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class a {
    public static final LinearInterpolator a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final m0.b f2312b = new m0.b();

    /* renamed from: c, reason: collision with root package name */
    public static final m0.a f2313c = new m0.a();

    /* renamed from: d, reason: collision with root package name */
    public static final m0.c f2314d = new m0.c();

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f3, float f4, float f5, float f6) {
        if (f6 <= f4) {
            return f2;
        }
        if (f6 >= f5) {
            return f3;
        }
        return ((f3 - f2) * ((f6 - f4) / (f5 - f4))) + f2;
    }
}
