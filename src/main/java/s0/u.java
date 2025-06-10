package s0;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class u {
    public static final c a;

    static {
        new z();
        a = new c(Float.class, "translationAlpha", 5);
        new c(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }
}
