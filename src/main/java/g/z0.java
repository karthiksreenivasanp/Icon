package g;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class z0 implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f1265b;

    public /* synthetic */ z0(a1 a1Var, int i2) {
        this.a = i2;
        this.f1265b = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        a1 a1Var = this.f1265b;
        switch (i2) {
            case 0:
                ViewParent parent = a1Var.f1046d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                a1Var.a();
                View view = a1Var.f1046d;
                if (view.isEnabled() && !view.isLongClickable() && a1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    a1Var.f1049g = true;
                    break;
                }
                break;
        }
    }
}
