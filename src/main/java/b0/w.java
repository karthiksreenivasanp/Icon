package b0;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class w implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ l a;

    public w(View view, l lVar) {
        this.a = lVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.a.g(view, x0.d(view, windowInsets)).c();
    }
}
