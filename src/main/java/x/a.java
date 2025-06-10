package x;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
