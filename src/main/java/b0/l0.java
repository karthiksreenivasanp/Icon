package b0;

import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class l0 {
    public final k0 a;

    public l0(int i2, DecelerateInterpolator decelerateInterpolator, long j2) {
        this.a = new k0(new WindowInsetsAnimation(i2, decelerateInterpolator, j2));
    }

    public l0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        this.a = new k0(windowInsetsAnimation);
    }
}
