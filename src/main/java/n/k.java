package n;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {
    public final m a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1835b = new ArrayList();

    public k(m mVar) {
        this.a = null;
        this.a = mVar;
    }

    public static long a(f fVar, long j2) {
        m mVar = fVar.f1826d;
        if (mVar instanceof i) {
            return j2;
        }
        ArrayList arrayList = fVar.k;
        int size = arrayList.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1826d != mVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f1828f + j2));
                }
            }
        }
        if (fVar != mVar.f1844i) {
            return jMin;
        }
        long j3 = mVar.j();
        long j4 = j2 - j3;
        return Math.min(Math.min(jMin, a(mVar.f1843h, j4)), j4 - r9.f1828f);
    }

    public static long b(f fVar, long j2) {
        m mVar = fVar.f1826d;
        if (mVar instanceof i) {
            return j2;
        }
        ArrayList arrayList = fVar.k;
        int size = arrayList.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1826d != mVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f1828f + j2));
                }
            }
        }
        if (fVar != mVar.f1843h) {
            return jMax;
        }
        long j3 = mVar.j();
        long j4 = j2 + j3;
        return Math.max(Math.max(jMax, b(mVar.f1844i, j4)), j4 - r9.f1828f);
    }
}
