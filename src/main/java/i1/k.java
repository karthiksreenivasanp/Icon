package i1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class k {
    public final f1.e a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.e f1385b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.e f1386c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.e f1387d;

    /* renamed from: e, reason: collision with root package name */
    public final c f1388e;

    /* renamed from: f, reason: collision with root package name */
    public final c f1389f;

    /* renamed from: g, reason: collision with root package name */
    public final c f1390g;

    /* renamed from: h, reason: collision with root package name */
    public final c f1391h;

    /* renamed from: i, reason: collision with root package name */
    public final e f1392i;

    /* renamed from: j, reason: collision with root package name */
    public final e f1393j;
    public final e k;

    /* renamed from: l, reason: collision with root package name */
    public final e f1394l;

    public k() {
        this.a = new i();
        this.f1385b = new i();
        this.f1386c = new i();
        this.f1387d = new i();
        this.f1388e = new a(0.0f);
        this.f1389f = new a(0.0f);
        this.f1390g = new a(0.0f);
        this.f1391h = new a(0.0f);
        this.f1392i = f1.e.F();
        this.f1393j = f1.e.F();
        this.k = f1.e.F();
        this.f1394l = f1.e.F();
    }

    public static j a(Context context, int i2, int i3, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(v0.a.f2303o);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(3, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(4, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(2, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(1, i4);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            j jVar = new j();
            f1.e eVarE = f1.e.E(i5);
            jVar.a = eVarE;
            j.a(eVarE);
            jVar.f1378e = cVarC2;
            f1.e eVarE2 = f1.e.E(i6);
            jVar.f1375b = eVarE2;
            j.a(eVarE2);
            jVar.f1379f = cVarC3;
            f1.e eVarE3 = f1.e.E(i7);
            jVar.f1376c = eVarE3;
            j.a(eVarE3);
            jVar.f1380g = cVarC4;
            f1.e eVarE4 = f1.e.E(i8);
            jVar.f1377d = eVarE4;
            j.a(eVarE4);
            jVar.f1381h = cVarC5;
            return jVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2299j, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i3 = typedValuePeekValue.type;
        return i3 == 5 ? new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z2 = this.f1394l.getClass().equals(e.class) && this.f1393j.getClass().equals(e.class) && this.f1392i.getClass().equals(e.class) && this.k.getClass().equals(e.class);
        float fA = this.f1388e.a(rectF);
        return z2 && ((this.f1389f.a(rectF) > fA ? 1 : (this.f1389f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f1391h.a(rectF) > fA ? 1 : (this.f1391h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f1390g.a(rectF) > fA ? 1 : (this.f1390g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f1385b instanceof i) && (this.a instanceof i) && (this.f1386c instanceof i) && (this.f1387d instanceof i));
    }

    public k(j jVar) {
        this.a = jVar.a;
        this.f1385b = jVar.f1375b;
        this.f1386c = jVar.f1376c;
        this.f1387d = jVar.f1377d;
        this.f1388e = jVar.f1378e;
        this.f1389f = jVar.f1379f;
        this.f1390g = jVar.f1380g;
        this.f1391h = jVar.f1381h;
        this.f1392i = jVar.f1382i;
        this.f1393j = jVar.f1383j;
        this.k = jVar.k;
        this.f1394l = jVar.f1384l;
    }
}
