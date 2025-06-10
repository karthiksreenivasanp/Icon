package m0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {
    public final float[] a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1806b;

    public d(float[] fArr) {
        this.a = fArr;
        this.f1806b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f1806b;
        float f4 = (f2 - (iMin * f3)) / f3;
        float f5 = fArr[iMin];
        return ((fArr[iMin + 1] - f5) * f4) + f5;
    }
}
