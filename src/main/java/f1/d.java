package f1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import t.n;

/* loaded from: classes.dex */
public final class d {
    public final ColorStateList a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1014b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1015c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1016d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1017e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1018f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1019g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1020h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1021i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1022j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1023l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1024m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f1025n;

    public d(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, v0.a.f2306r);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f1022j = e.J(context, typedArrayObtainStyledAttributes, 3);
        e.J(context, typedArrayObtainStyledAttributes, 4);
        e.J(context, typedArrayObtainStyledAttributes, 5);
        this.f1015c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1016d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i3 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1023l = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
        this.f1014b = typedArrayObtainStyledAttributes.getString(i3);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = e.J(context, typedArrayObtainStyledAttributes, 6);
        this.f1017e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f1018f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f1019g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, v0.a.k);
        this.f1020h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f1021i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1025n;
        int i2 = this.f1015c;
        if (typeface == null && (str = this.f1014b) != null) {
            this.f1025n = Typeface.create(str, i2);
        }
        if (this.f1025n == null) {
            int i3 = this.f1016d;
            this.f1025n = i3 != 1 ? i3 != 2 ? i3 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f1025n = Typeface.create(this.f1025n, i2);
        }
    }

    public final Typeface b(Context context) {
        if (this.f1024m) {
            return this.f1025n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = n.a(context, this.f1023l);
                this.f1025n = typefaceA;
                if (typefaceA != null) {
                    this.f1025n = Typeface.create(typefaceA, this.f1015c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f1014b, e2);
            }
        }
        a();
        this.f1024m = true;
        return this.f1025n;
    }

    public final void c(Context context, e eVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f1023l;
        if (i2 == 0) {
            this.f1024m = true;
        }
        if (this.f1024m) {
            eVar.k0(this.f1025n, true);
            return;
        }
        try {
            b bVar = new b(this, eVar);
            ThreadLocal threadLocal = n.a;
            if (context.isRestricted()) {
                bVar.k(-4);
            } else {
                n.b(context, i2, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1024m = true;
            eVar.i0(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f1014b, e2);
            this.f1024m = true;
            eVar.i0(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f1023l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal r7 = t.n.a
            boolean r7 = r8.isRestricted()
            if (r7 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r7 = t.n.b(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r7 = 0
        L1d:
            if (r7 == 0) goto L21
            r7 = 1
            goto L22
        L21:
            r7 = 0
        L22:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, e eVar) {
        f(context, textPaint, eVar);
        ColorStateList colorStateList = this.f1022j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.f1019g, this.f1017e, this.f1018f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, e eVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f1025n);
        c(context, new c(this, context, textPaint, eVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceC0 = e.c0(context.getResources().getConfiguration(), typeface);
        if (typefaceC0 != null) {
            typeface = typefaceC0;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f1015c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.f1020h) {
            textPaint.setLetterSpacing(this.f1021i);
        }
    }
}
