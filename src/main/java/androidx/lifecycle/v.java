package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class v extends e {
    final /* synthetic */ w this$1;

    public v(w wVar) {
        this.this$1 = wVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.this$1.this$0.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        x xVar = this.this$1.this$0;
        int i2 = xVar.a + 1;
        xVar.a = i2;
        if (i2 == 1 && xVar.f386d) {
            xVar.f388f.g(j.ON_START);
            xVar.f386d = false;
        }
    }
}
