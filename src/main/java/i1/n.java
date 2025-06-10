package i1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f1405c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f1406d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f1405c = arrayList;
        this.f1406d = matrix;
    }

    @Override // i1.t
    public final void a(Matrix matrix, h1.a aVar, int i2, Canvas canvas) {
        Iterator it = this.f1405c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f1406d, aVar, i2, canvas);
        }
    }
}
