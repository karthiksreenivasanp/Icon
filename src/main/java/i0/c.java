package i0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class c implements Interpolator {
    public final /* synthetic */ int a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0004. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.a) {
        }
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}
