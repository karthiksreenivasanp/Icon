package y0;

import android.view.View;
import b0.f0;
import b0.r;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i0.d;

/* loaded from: classes.dex */
public final class b implements Runnable {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f2364b;

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f2364b = swipeDismissBehavior;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f2364b.a;
        if (dVar == null || !dVar.g()) {
            return;
        }
        int[] iArr = f0.a;
        r.m(this.a, this);
    }
}
