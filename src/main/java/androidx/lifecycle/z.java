package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class z extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f390b = 0;
    public f.f a;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, j jVar) {
        if (activity instanceof p) {
            r rVarC = ((p) activity).c();
            if (rVarC instanceof r) {
                rVarC.g(jVar);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        f.f fVar = this.a;
        if (fVar != null) {
            ((x) fVar.f875b).b();
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        f.f fVar = this.a;
        if (fVar != null) {
            x xVar = (x) fVar.f875b;
            int i2 = xVar.a + 1;
            xVar.a = i2;
            if (i2 == 1 && xVar.f386d) {
                xVar.f388f.g(j.ON_START);
                xVar.f386d = false;
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
    }
}
