package g;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class i1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ k1 a;

    public i1(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            k1 k1Var = this.a;
            if ((k1Var.f1145v.getInputMethodMode() == 2) || k1Var.f1145v.getContentView() == null) {
                return;
            }
            Handler handler = k1Var.f1141r;
            d1 d1Var = k1Var.f1137n;
            handler.removeCallbacks(d1Var);
            d1Var.run();
        }
    }
}
