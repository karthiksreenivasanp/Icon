package i1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f1407c;

    public o(q qVar) {
        this.f1407c = qVar;
    }

    @Override // i1.t
    public final void a(Matrix matrix, h1.a aVar, int i2, Canvas canvas) {
        q qVar = this.f1407c;
        float f2 = qVar.f1416f;
        float f3 = qVar.f1417g;
        RectF rectF = new RectF(qVar.f1412b, qVar.f1413c, qVar.f1414d, qVar.f1415e);
        aVar.getClass();
        boolean z2 = f3 < 0.0f;
        Path path = aVar.f1297g;
        int[] iArr = h1.a.k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar.f1296f;
            iArr[2] = aVar.f1295e;
            iArr[3] = aVar.f1294d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = aVar.f1294d;
            iArr[2] = aVar.f1295e;
            iArr[3] = aVar.f1296f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / fWidth);
        float[] fArr = h1.a.f1291l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f1292b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f1298h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
