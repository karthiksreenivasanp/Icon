package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class w extends e {
    final /* synthetic */ x this$0;

    public w(x xVar) {
        this.this$0 = xVar;
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        x xVar = this.this$0;
        int i2 = xVar.f384b - 1;
        xVar.f384b = i2;
        if (i2 == 0) {
            xVar.f387e.postDelayed(xVar.f389g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new v(this));
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        x xVar = this.this$0;
        int i2 = xVar.a - 1;
        xVar.a = i2;
        if (i2 == 0 && xVar.f385c) {
            xVar.f388f.g(j.ON_STOP);
            xVar.f386d = true;
        }
    }
}
