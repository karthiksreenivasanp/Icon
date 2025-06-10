package androidx.activity.result;

import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
class ActivityResultRegistry$1 implements n {
    @Override // androidx.lifecycle.n
    public final void b(p pVar, j jVar) {
        if (j.ON_START.equals(jVar) || j.ON_STOP.equals(jVar) || j.ON_DESTROY.equals(jVar)) {
            throw null;
        }
    }
}
