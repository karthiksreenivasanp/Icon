package i1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class m {
    public final u[] a = new u[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f1395b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f1396c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f1397d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f1398e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f1399f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final u f1400g = new u();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f1401h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1402i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f1403j = new Path();
    public final Path k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1404l = true;

    public m() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new u();
            this.f1395b[i2] = new Matrix();
            this.f1396c[i2] = new Matrix();
        }
    }

    public final void a(k kVar, float f2, RectF rectF, f.f fVar, Path path) {
        int i2;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        float fCenterX;
        float f3;
        char c2;
        float f4;
        float f5;
        float f6;
        m mVar = this;
        RectF rectF2 = rectF;
        f.f fVar2 = fVar;
        Path path2 = path;
        path.rewind();
        Path path3 = mVar.f1398e;
        path3.rewind();
        Path path4 = mVar.f1399f;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            i2 = 4;
            matrixArr = mVar.f1396c;
            fArr = mVar.f1401h;
            matrixArr2 = mVar.f1395b;
            uVarArr = mVar.a;
            if (i3 >= 4) {
                break;
            }
            c cVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f1389f : kVar.f1388e : kVar.f1391h : kVar.f1390g;
            f1.e eVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.f1385b : kVar.a : kVar.f1387d : kVar.f1386c;
            u uVar = uVarArr[i3];
            eVar.getClass();
            eVar.L(f2, cVar.a(rectF2), uVar);
            int i4 = i3 + 1;
            float f7 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = mVar.f1397d;
            if (i3 == 1) {
                f4 = rectF2.right;
            } else if (i3 != 2) {
                f5 = i3 != 3 ? rectF2.right : rectF2.left;
                f6 = rectF2.top;
                pointF.set(f5, f6);
                matrixArr2[i3].setTranslate(pointF.x, pointF.y);
                matrixArr2[i3].preRotate(f7);
                u uVar2 = uVarArr[i3];
                fArr[0] = uVar2.f1422c;
                fArr[1] = uVar2.f1423d;
                matrixArr2[i3].mapPoints(fArr);
                matrixArr[i3].reset();
                matrixArr[i3].setTranslate(fArr[0], fArr[1]);
                matrixArr[i3].preRotate(f7);
                rectF2 = rectF;
                i3 = i4;
            } else {
                f4 = rectF2.left;
            }
            f5 = f4;
            f6 = rectF2.bottom;
            pointF.set(f5, f6);
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f7);
            u uVar22 = uVarArr[i3];
            fArr[0] = uVar22.f1422c;
            fArr[1] = uVar22.f1423d;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f7);
            rectF2 = rectF;
            i3 = i4;
        }
        char c3 = 1;
        char c4 = 0;
        int i5 = 0;
        while (i5 < i2) {
            u uVar3 = uVarArr[i5];
            fArr[c4] = uVar3.a;
            fArr[c3] = uVar3.f1421b;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path2.moveTo(fArr[c4], fArr[c3]);
            } else {
                path2.lineTo(fArr[c4], fArr[c3]);
            }
            uVarArr[i5].b(matrixArr2[i5], path2);
            if (fVar2 != null) {
                u uVar4 = uVarArr[i5];
                Matrix matrix = matrixArr2[i5];
                g gVar = (g) fVar2.f875b;
                BitSet bitSet = gVar.f1357d;
                uVar4.getClass();
                bitSet.set(i5, false);
                uVar4.a(uVar4.f1425f);
                gVar.f1355b[i5] = new n(new ArrayList(uVar4.f1427h), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            u uVar5 = uVarArr[i5];
            fArr[0] = uVar5.f1422c;
            fArr[1] = uVar5.f1423d;
            matrixArr2[i5].mapPoints(fArr);
            u uVar6 = uVarArr[i7];
            float f8 = uVar6.a;
            float[] fArr2 = mVar.f1402i;
            fArr2[0] = f8;
            fArr2[1] = uVar6.f1421b;
            matrixArr2[i7].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i5];
            fArr[0] = uVar7.f1422c;
            fArr[1] = uVar7.f1423d;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                fCenterX = rectF.centerX();
                f3 = fArr[0];
            } else {
                fCenterX = rectF.centerY();
                f3 = fArr[1];
            }
            Math.abs(fCenterX - f3);
            u uVar8 = mVar.f1400g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f1393j : kVar.f1392i : kVar.f1394l : kVar.k).getClass();
            uVar8.c(fMax, 0.0f);
            Path path5 = mVar.f1403j;
            path5.reset();
            uVar8.b(matrixArr[i5], path5);
            if (mVar.f1404l && (mVar.b(path5, i5) || mVar.b(path5, i7))) {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr[0] = uVar8.a;
                fArr[1] = uVar8.f1421b;
                matrixArr[i5].mapPoints(fArr);
                path3.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i5], path3);
                fVar2 = fVar;
                path2 = path;
            } else {
                path2 = path;
                uVar8.b(matrixArr[i5], path2);
                fVar2 = fVar;
            }
            if (fVar2 != null) {
                Matrix matrix2 = matrixArr[i5];
                g gVar2 = (g) fVar2.f875b;
                c2 = 0;
                gVar2.f1357d.set(i5 + 4, false);
                uVar8.a(uVar8.f1425f);
                gVar2.f1356c[i5] = new n(new ArrayList(uVar8.f1427h), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            i5 = i6;
            c4 = c2;
            c3 = 1;
            i2 = 4;
            mVar = this;
        }
        path.close();
        path3.close();
        if (path3.isEmpty()) {
            return;
        }
        path2.op(path3, Path.Op.UNION);
    }

    public final boolean b(Path path, int i2) {
        Path path2 = this.k;
        path2.reset();
        this.a[i2].b(this.f1395b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
