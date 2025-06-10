package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f1227b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static u f1228c;
    public s1 a;

    public static synchronized u a() {
        if (f1228c == null) {
            d();
        }
        return f1228c;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        return s1.g(i2, mode);
    }

    public static synchronized void d() {
        if (f1228c == null) {
            u uVar = new u();
            f1228c = uVar;
            uVar.a = s1.c();
            s1 s1Var = f1228c.a;
            t tVar = new t();
            synchronized (s1Var) {
                s1Var.f1221e = tVar;
            }
        }
    }

    public static void e(Drawable drawable, n2 n2Var, int[] iArr) {
        PorterDuff.Mode mode = s1.f1215f;
        int[] state = drawable.getState();
        int i2 = s0.a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = n2Var.f1178b;
        if (!z2 && !n2Var.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterG = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) n2Var.f1179c : null;
        PorterDuff.Mode mode2 = n2Var.a ? (PorterDuff.Mode) n2Var.f1180d : s1.f1215f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterG = s1.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterG);
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.a.e(context, i2);
    }
}
