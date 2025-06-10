package g;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class d3 {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        int[] iArr = b0.f0.a;
        return b0.s.d(view) == 1;
    }
}
