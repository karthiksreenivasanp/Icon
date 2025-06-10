package i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.nothing.icon.R;
import java.util.BitSet;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f1354w;
    public f a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f1355b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f1356c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f1357d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1358e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f1359f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f1360g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f1361h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f1362i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1363j;
    public final Region k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f1364l;

    /* renamed from: m, reason: collision with root package name */
    public k f1365m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f1366n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f1367o;

    /* renamed from: p, reason: collision with root package name */
    public final h1.a f1368p;

    /* renamed from: q, reason: collision with root package name */
    public final f.f f1369q;

    /* renamed from: r, reason: collision with root package name */
    public final m f1370r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f1371s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f1372t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1373u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1374v;

    static {
        Paint paint = new Paint(1);
        f1354w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        m mVar = this.f1370r;
        f fVar = this.a;
        mVar.a(fVar.a, fVar.f1343j, rectF, this.f1369q, path);
        if (this.a.f1342i != 1.0f) {
            Matrix matrix = this.f1359f;
            matrix.reset();
            float f2 = this.a.f1342i;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1373u, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        int color;
        int iC;
        if (colorStateList == null || mode == null) {
            if (!z2 || (iC = c((color = paint.getColor()))) == color) {
                return null;
            }
            return new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int c(int i2) {
        int i3;
        f fVar = this.a;
        float f2 = fVar.f1346n + fVar.f1347o + fVar.f1345m;
        d1.a aVar = fVar.f1335b;
        if (aVar == null || !aVar.a) {
            return i2;
        }
        if (!(u.a.c(i2, 255) == aVar.f779d)) {
            return i2;
        }
        float fMin = (aVar.f780e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i2);
        int iZ = f1.e.Z(u.a.c(i2, 255), aVar.f777b, fMin);
        if (fMin > 0.0f && (i3 = aVar.f778c) != 0) {
            iZ = u.a.b(u.a.c(i3, d1.a.f776f), iZ);
        }
        return u.a.c(iZ, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f1357d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.a.f1350r;
        Path path = this.f1360g;
        h1.a aVar = this.f1368p;
        if (i2 != 0) {
            canvas.drawPath(path, aVar.a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            t tVar = this.f1355b[i3];
            int i4 = this.a.f1349q;
            Matrix matrix = t.f1420b;
            tVar.a(matrix, aVar, i4, canvas);
            this.f1356c[i3].a(matrix, aVar, this.a.f1349q, canvas);
        }
        if (this.f1374v) {
            f fVar = this.a;
            int iSin = (int) (Math.sin(Math.toRadians(fVar.f1351s)) * fVar.f1350r);
            f fVar2 = this.a;
            int iCos = (int) (Math.cos(Math.toRadians(fVar2.f1351s)) * fVar2.f1350r);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f1354w);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f1366n;
        paint.setColorFilter(this.f1371s);
        int alpha = paint.getAlpha();
        int i2 = this.a.f1344l;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f1367o;
        paint2.setColorFilter(this.f1372t);
        paint2.setStrokeWidth(this.a.k);
        int alpha2 = paint2.getAlpha();
        int i3 = this.a.f1344l;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z3 = this.f1358e;
        Path path = this.f1360g;
        if (z3) {
            Paint.Style style = this.a.f1353u;
            float f2 = -((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.a.a;
            kVar.getClass();
            j jVar = new j(kVar);
            c bVar = kVar.f1388e;
            if (!(bVar instanceof h)) {
                bVar = new b(f2, bVar);
            }
            jVar.f1378e = bVar;
            c bVar2 = kVar.f1389f;
            if (!(bVar2 instanceof h)) {
                bVar2 = new b(f2, bVar2);
            }
            jVar.f1379f = bVar2;
            c bVar3 = kVar.f1391h;
            if (!(bVar3 instanceof h)) {
                bVar3 = new b(f2, bVar3);
            }
            jVar.f1381h = bVar3;
            c bVar4 = kVar.f1390g;
            if (!(bVar4 instanceof h)) {
                bVar4 = new b(f2, bVar4);
            }
            jVar.f1380g = bVar4;
            k kVar2 = new k(jVar);
            this.f1365m = kVar2;
            m mVar = this.f1370r;
            float f3 = this.a.f1343j;
            RectF rectF = this.f1363j;
            rectF.set(g());
            Paint.Style style2 = this.a.f1353u;
            float strokeWidth = (style2 == Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            mVar.a(kVar2, f3, rectF, null, this.f1361h);
            a(g(), path);
            this.f1358e = false;
        }
        f fVar = this.a;
        int i4 = fVar.f1348p;
        if (i4 == 1 || fVar.f1349q <= 0) {
            z2 = false;
        } else if (i4 != 2) {
            if (!fVar.a.d(g())) {
                path.isConvex();
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            canvas.save();
            f fVar2 = this.a;
            int iSin = (int) (Math.sin(Math.toRadians(fVar2.f1351s)) * fVar2.f1350r);
            f fVar3 = this.a;
            canvas.translate(iSin, (int) (Math.cos(Math.toRadians(fVar3.f1351s)) * fVar3.f1350r));
            if (this.f1374v) {
                RectF rectF2 = this.f1373u;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.a.f1349q * 2) + ((int) rectF2.width()) + iWidth, (this.a.f1349q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f4 = (getBounds().left - this.a.f1349q) - iWidth;
                float f5 = (getBounds().top - this.a.f1349q) - iHeight;
                canvas2.translate(-f4, -f5);
                d(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f4, f5, (Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                d(canvas);
            }
            canvas.restore();
        }
        f fVar4 = this.a;
        Paint.Style style3 = fVar4.f1353u;
        if (style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.FILL) {
            e(canvas, paint, path, fVar4.a, g());
        }
        Paint.Style style4 = this.a.f1353u;
        if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.f1389f.a(rectF) * this.a.f1343j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f1367o;
        Path path = this.f1361h;
        k kVar = this.f1365m;
        RectF rectF = this.f1363j;
        rectF.set(g());
        Paint.Style style = this.a.f1353u;
        float strokeWidth = (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint.getStrokeWidth() > 0.0f ? 1 : (paint.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, kVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f1362i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.f1344l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f fVar = this.a;
        if (fVar.f1348p == 2) {
            return;
        }
        if (fVar.a.d(g())) {
            outline.setRoundRect(getBounds(), this.a.a.f1388e.a(g()) * this.a.f1343j);
        } else {
            RectF rectFG = g();
            Path path = this.f1360g;
            a(rectFG, path);
            outline.setPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.f1341h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f1360g;
        a(rectFG, path);
        Region region2 = this.f1364l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.a.f1335b = new d1.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.a;
        if (fVar.f1346n != f2) {
            fVar.f1346n = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1358e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.f1339f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.f1338e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.f1337d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.f1336c) != null && colorStateList4.isStateful())));
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.a;
        if (fVar.f1336c != colorStateList) {
            fVar.f1336c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.f1336c == null || color2 == (colorForState2 = this.a.f1336c.getColorForState(iArr, (color2 = (paint2 = this.f1366n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.a.f1337d == null || color == (colorForState = this.a.f1337d.getColorForState(iArr, (color = (paint = this.f1367o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter = this.f1371s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1372t;
        f fVar = this.a;
        this.f1371s = b(fVar.f1339f, fVar.f1340g, this.f1366n, true);
        f fVar2 = this.a;
        this.f1372t = b(fVar2.f1338e, fVar2.f1340g, this.f1367o, false);
        f fVar3 = this.a;
        if (fVar3.f1352t) {
            this.f1368p.a(fVar3.f1339f.getColorForState(getState(), 0));
        }
        return (a0.b.a(porterDuffColorFilter, this.f1371s) && a0.b.a(porterDuffColorFilter2, this.f1372t)) ? false : true;
    }

    public final void m() {
        f fVar = this.a;
        float f2 = fVar.f1346n + fVar.f1347o;
        fVar.f1349q = (int) Math.ceil(0.75f * f2);
        this.a.f1350r = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new f(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1358e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = k(iArr) || l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        f fVar = this.a;
        if (fVar.f1344l != i2) {
            fVar.f1344l = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // i1.v
    public final void setShapeAppearanceModel(k kVar) {
        this.a.a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.f1339f = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.a;
        if (fVar.f1340g != mode) {
            fVar.f1340g = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        this(new k(k.b(context, attributeSet, R.attr.chipStyle, R.style.Widget_MaterialComponents_Chip_Action)));
    }

    public g(f fVar) {
        m mVar;
        this.f1355b = new t[4];
        this.f1356c = new t[4];
        this.f1357d = new BitSet(8);
        this.f1359f = new Matrix();
        this.f1360g = new Path();
        this.f1361h = new Path();
        this.f1362i = new RectF();
        this.f1363j = new RectF();
        this.k = new Region();
        this.f1364l = new Region();
        Paint paint = new Paint(1);
        this.f1366n = paint;
        Paint paint2 = new Paint(1);
        this.f1367o = paint2;
        this.f1368p = new h1.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.a;
        } else {
            mVar = new m();
        }
        this.f1370r = mVar;
        this.f1373u = new RectF();
        this.f1374v = true;
        this.a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f1369q = new f.f(28, this);
    }

    public g(k kVar) {
        this(new f(kVar));
    }
}
