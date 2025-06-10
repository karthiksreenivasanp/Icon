package o0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r0 {
    public final SparseArray a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f2090b = 0;

    public final q0 a(int i2) {
        SparseArray sparseArray = this.a;
        q0 q0Var = (q0) sparseArray.get(i2);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0();
        sparseArray.put(i2, q0Var2);
        return q0Var2;
    }
}
