package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class t {
    public final SparseArray a;

    /* renamed from: b, reason: collision with root package name */
    public o f283b;

    public t(int i2) {
        this.a = new SparseArray(i2);
    }

    public final void a(o oVar, int i2, int i3) {
        int iA = oVar.a(i2);
        SparseArray sparseArray = this.a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(iA);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(oVar.a(i2), tVar);
        }
        if (i3 > i2) {
            tVar.a(oVar, i2 + 1, i3);
        } else {
            tVar.f283b = oVar;
        }
    }
}
