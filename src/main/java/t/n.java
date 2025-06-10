package t;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class n {
    public static final ThreadLocal a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2265b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2266c = new Object();

    public static Typeface a(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i2, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, f1.e r19, boolean r20, boolean r21) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.n.b(android.content.Context, int, android.util.TypedValue, int, f1.e, boolean, boolean):android.graphics.Typeface");
    }
}
