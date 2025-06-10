package o0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d0 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ d0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final void b(int i2) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.v(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }
}
