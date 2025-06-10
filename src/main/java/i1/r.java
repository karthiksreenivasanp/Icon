package i1;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f1418b;

    /* renamed from: c, reason: collision with root package name */
    public float f1419c;

    @Override // i1.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1418b, this.f1419c);
        path.transform(matrix);
    }
}
