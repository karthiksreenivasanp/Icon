package f1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f1010s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1011t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f1012u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f1013v;

    public c(d dVar, Context context, TextPaint textPaint, e eVar) {
        this.f1013v = dVar;
        this.f1010s = context;
        this.f1011t = textPaint;
        this.f1012u = eVar;
    }

    @Override // f1.e
    public final void i0(int i2) {
        this.f1012u.i0(i2);
    }

    @Override // f1.e
    public final void k0(Typeface typeface, boolean z2) {
        this.f1013v.g(this.f1010s, this.f1011t, typeface);
        this.f1012u.k0(typeface, z2);
    }
}
