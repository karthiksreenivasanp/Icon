package h1;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1289i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f1290j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f1291l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1292b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1293c;

    /* renamed from: d, reason: collision with root package name */
    public int f1294d;

    /* renamed from: e, reason: collision with root package name */
    public int f1295e;

    /* renamed from: f, reason: collision with root package name */
    public int f1296f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f1297g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f1298h;

    public a() {
        Paint paint = new Paint();
        this.f1298h = paint;
        this.a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f1292b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f1293c = new Paint(paint2);
    }

    public final void a(int i2) {
        this.f1294d = u.a.c(i2, 68);
        this.f1295e = u.a.c(i2, 20);
        this.f1296f = u.a.c(i2, 0);
        this.a.setColor(this.f1294d);
    }
}
