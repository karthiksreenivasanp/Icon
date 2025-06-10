package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements q0.b {
    @Override // q0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // q0.b
    public final Object b(Context context) {
        if (!q0.a.c(context).f2182b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        if (!m.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new l());
        }
        x xVar = x.f383h;
        xVar.getClass();
        xVar.f387e = new Handler();
        xVar.f388f.g(j.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new w(xVar));
        return xVar;
    }
}
