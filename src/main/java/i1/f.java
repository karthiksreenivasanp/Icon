package i1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {
    public k a;

    /* renamed from: b, reason: collision with root package name */
    public d1.a f1335b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1336c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1337d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f1338e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f1339f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1340g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f1341h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1342i;

    /* renamed from: j, reason: collision with root package name */
    public float f1343j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public int f1344l;

    /* renamed from: m, reason: collision with root package name */
    public float f1345m;

    /* renamed from: n, reason: collision with root package name */
    public float f1346n;

    /* renamed from: o, reason: collision with root package name */
    public final float f1347o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1348p;

    /* renamed from: q, reason: collision with root package name */
    public int f1349q;

    /* renamed from: r, reason: collision with root package name */
    public int f1350r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1351s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1352t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint.Style f1353u;

    public f(f fVar) {
        this.f1336c = null;
        this.f1337d = null;
        this.f1338e = null;
        this.f1339f = null;
        this.f1340g = PorterDuff.Mode.SRC_IN;
        this.f1341h = null;
        this.f1342i = 1.0f;
        this.f1343j = 1.0f;
        this.f1344l = 255;
        this.f1345m = 0.0f;
        this.f1346n = 0.0f;
        this.f1347o = 0.0f;
        this.f1348p = 0;
        this.f1349q = 0;
        this.f1350r = 0;
        this.f1351s = 0;
        this.f1352t = false;
        this.f1353u = Paint.Style.FILL_AND_STROKE;
        this.a = fVar.a;
        this.f1335b = fVar.f1335b;
        this.k = fVar.k;
        this.f1336c = fVar.f1336c;
        this.f1337d = fVar.f1337d;
        this.f1340g = fVar.f1340g;
        this.f1339f = fVar.f1339f;
        this.f1344l = fVar.f1344l;
        this.f1342i = fVar.f1342i;
        this.f1350r = fVar.f1350r;
        this.f1348p = fVar.f1348p;
        this.f1352t = fVar.f1352t;
        this.f1343j = fVar.f1343j;
        this.f1345m = fVar.f1345m;
        this.f1346n = fVar.f1346n;
        this.f1347o = fVar.f1347o;
        this.f1349q = fVar.f1349q;
        this.f1351s = fVar.f1351s;
        this.f1338e = fVar.f1338e;
        this.f1353u = fVar.f1353u;
        if (fVar.f1341h != null) {
            this.f1341h = new Rect(fVar.f1341h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f1358e = true;
        return gVar;
    }

    public f(k kVar) {
        this.f1336c = null;
        this.f1337d = null;
        this.f1338e = null;
        this.f1339f = null;
        this.f1340g = PorterDuff.Mode.SRC_IN;
        this.f1341h = null;
        this.f1342i = 1.0f;
        this.f1343j = 1.0f;
        this.f1344l = 255;
        this.f1345m = 0.0f;
        this.f1346n = 0.0f;
        this.f1347o = 0.0f;
        this.f1348p = 0;
        this.f1349q = 0;
        this.f1350r = 0;
        this.f1351s = 0;
        this.f1352t = false;
        this.f1353u = Paint.Style.FILL_AND_STROKE;
        this.a = kVar;
        this.f1335b = null;
    }
}
