package i1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f1421b;

    /* renamed from: c, reason: collision with root package name */
    public float f1422c;

    /* renamed from: d, reason: collision with root package name */
    public float f1423d;

    /* renamed from: e, reason: collision with root package name */
    public float f1424e;

    /* renamed from: f, reason: collision with root package name */
    public float f1425f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1426g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1427h = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.f1424e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f1422c;
        float f6 = this.f1423d;
        q qVar = new q(f5, f6, f5, f6);
        qVar.f1416f = this.f1424e;
        qVar.f1417g = f4;
        this.f1427h.add(new o(qVar));
        this.f1424e = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1426g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((s) arrayList.get(i2)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        r rVar = new r();
        rVar.f1418b = f2;
        rVar.f1419c = f3;
        this.f1426g.add(rVar);
        p pVar = new p(rVar, this.f1422c, this.f1423d);
        float fB = pVar.b() + 270.0f;
        float fB2 = pVar.b() + 270.0f;
        a(fB);
        this.f1427h.add(pVar);
        this.f1424e = fB2;
        this.f1422c = f2;
        this.f1423d = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.a = 0.0f;
        this.f1421b = f2;
        this.f1422c = 0.0f;
        this.f1423d = f2;
        this.f1424e = f3;
        this.f1425f = (f3 + f4) % 360.0f;
        this.f1426g.clear();
        this.f1427h.clear();
    }
}
