package k1;

import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public final class b {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final String f1489b;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f584f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f585g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f582d = 0;
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "<" + this.f1489b + '>';
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.f1489b = str;
    }
}
