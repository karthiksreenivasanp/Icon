package x0;

import android.view.View;
import b0.f0;

/* loaded from: classes.dex */
public final class e {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public int f2333b;

    /* renamed from: c, reason: collision with root package name */
    public int f2334c;

    /* renamed from: d, reason: collision with root package name */
    public int f2335d;

    public e(View view) {
        this.a = view;
    }

    public final void a() {
        int i2 = this.f2335d;
        View view = this.a;
        int top = i2 - (view.getTop() - this.f2333b);
        int[] iArr = f0.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f2334c));
    }
}
