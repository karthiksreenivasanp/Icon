package b0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class m0 {
    public static final Field a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f490b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f491c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f492d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f490b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f491c = declaredField3;
            declaredField3.setAccessible(true);
            f492d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
