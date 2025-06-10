package f1;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f1008s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f1009t;

    public b(d dVar, e eVar) {
        this.f1009t = dVar;
        this.f1008s = eVar;
    }

    @Override // f1.e
    public final void i0(int i2) {
        this.f1009t.f1024m = true;
        this.f1008s.i0(i2);
    }

    @Override // f1.e
    public final void j0(Typeface typeface) {
        d dVar = this.f1009t;
        dVar.f1025n = Typeface.create(typeface, dVar.f1015c);
        dVar.f1024m = true;
        this.f1008s.k0(dVar.f1025n, false);
    }
}
