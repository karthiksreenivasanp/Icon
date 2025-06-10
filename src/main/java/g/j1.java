package g;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class j1 implements View.OnTouchListener {
    public final /* synthetic */ k1 a;

    public j1(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        b0 b0Var;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        k1 k1Var = this.a;
        if (action == 0 && (b0Var = k1Var.f1145v) != null && b0Var.isShowing() && x2 >= 0) {
            b0 b0Var2 = k1Var.f1145v;
            if (x2 < b0Var2.getWidth() && y2 >= 0 && y2 < b0Var2.getHeight()) {
                k1Var.f1141r.postDelayed(k1Var.f1137n, 250L);
                return false;
            }
        }
        if (action != 1) {
            return false;
        }
        k1Var.f1141r.removeCallbacks(k1Var.f1137n);
        return false;
    }
}
