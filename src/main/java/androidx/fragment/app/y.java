package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class y extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f357b = new StringBuilder(128);
    public final String a = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f357b;
        if (sb.length() > 0) {
            Log.d(this.a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f357b.append(c2);
            }
        }
    }
}
