package i1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f1411h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public float f1412b;

    /* renamed from: c, reason: collision with root package name */
    public float f1413c;

    /* renamed from: d, reason: collision with root package name */
    public float f1414d;

    /* renamed from: e, reason: collision with root package name */
    public float f1415e;

    /* renamed from: f, reason: collision with root package name */
    public float f1416f;

    /* renamed from: g, reason: collision with root package name */
    public float f1417g;

    public q(float f2, float f3, float f4, float f5) {
        this.f1412b = f2;
        this.f1413c = f3;
        this.f1414d = f4;
        this.f1415e = f5;
    }

    @Override // i1.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f1411h;
        rectF.set(this.f1412b, this.f1413c, this.f1414d, this.f1415e);
        path.arcTo(rectF, this.f1416f, this.f1417g, false);
        path.transform(matrix);
    }
}
