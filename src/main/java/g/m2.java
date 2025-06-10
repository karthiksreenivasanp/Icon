package g;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public abstract class m2 extends ContextWrapper {
    public static final Object a = new Object();

    public static void a(Context context) {
        if (context.getResources() instanceof o2) {
            return;
        }
        context.getResources();
        int i2 = b3.a;
    }
}
