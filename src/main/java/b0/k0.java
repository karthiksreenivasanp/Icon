package b0;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class k0 extends f1.e {

    /* renamed from: s, reason: collision with root package name */
    public final WindowInsetsAnimation f489s;

    public k0(WindowInsetsAnimation windowInsetsAnimation) {
        this.f489s = windowInsetsAnimation;
    }

    public final float N0() {
        return this.f489s.getInterpolatedFraction();
    }

    public final int O0() {
        return this.f489s.getTypeMask();
    }

    public final void P0(float f2) {
        this.f489s.setFraction(f2);
    }
}
