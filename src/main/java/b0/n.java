package b0;

import android.view.View;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i2, int i3) {
        super(i2, Boolean.class, 0, 28);
        this.f493e = i3;
    }

    public final Boolean d(View view) {
        switch (this.f493e) {
            case 0:
                return Boolean.valueOf(b0.d(view));
            default:
                return Boolean.valueOf(b0.c(view));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i2, int i3, int i4, int i5) {
        super(i2, CharSequence.class, i3, i4);
        this.f493e = i5;
    }
}
