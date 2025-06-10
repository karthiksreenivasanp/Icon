package o0;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2045b;

    public /* synthetic */ l(int i2, Object obj) {
        this.a = i2;
        this.f2045b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        Object obj = this.f2045b;
        switch (i2) {
            case 0:
                p pVar = (p) obj;
                int i3 = pVar.f2080v;
                ValueAnimator valueAnimator = pVar.f2079u;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                }
                pVar.f2080v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).Z();
                break;
        }
    }
}
