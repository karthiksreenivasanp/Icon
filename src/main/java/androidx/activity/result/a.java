package androidx.activity.result;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;
import p1.g;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        if (i2 == 8) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown visibility " + i2);
    }

    public static /* synthetic */ Iterator b() {
        try {
            return Arrays.asList(new AndroidDispatcherFactory()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void c(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void d(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void e(String str) {
        if (str != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void f(g gVar) {
        if (gVar != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ Iterator g() {
        try {
            return Arrays.asList(new AndroidExceptionPreHandler()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void h(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ String i(int i2) {
        return i2 == 1 ? "UNKNOWN" : i2 == 2 ? "HORIZONTAL_DIMENSION" : i2 == 3 ? "VERTICAL_DIMENSION" : i2 == 4 ? "LEFT" : i2 == 5 ? "RIGHT" : i2 == 6 ? "TOP" : i2 == 7 ? "BOTTOM" : i2 == 8 ? "BASELINE" : "null";
    }
}
