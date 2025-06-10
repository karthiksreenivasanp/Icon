package i1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f1408c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1409d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1410e;

    public p(r rVar, float f2, float f3) {
        this.f1408c = rVar;
        this.f1409d = f2;
        this.f1410e = f3;
    }

    @Override // i1.t
    public final void a(Matrix matrix, h1.a aVar, int i2, Canvas canvas) {
        r rVar = this.f1408c;
        float f2 = rVar.f1419c;
        float f3 = this.f1410e;
        float f4 = rVar.f1418b;
        float f5 = this.f1409d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = h1.a.f1289i;
        iArr[0] = aVar.f1296f;
        iArr[1] = aVar.f1295e;
        iArr[2] = aVar.f1294d;
        Paint paint = aVar.f1293c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, h1.a.f1290j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f1408c;
        return (float) Math.toDegrees(Math.atan((rVar.f1419c - this.f1410e) / (rVar.f1418b - this.f1409d)));
    }
}
