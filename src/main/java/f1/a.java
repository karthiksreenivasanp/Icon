package f1;

import android.graphics.Typeface;
import f.f;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: s, reason: collision with root package name */
    public final Typeface f1005s;

    /* renamed from: t, reason: collision with root package name */
    public final f f1006t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1007u;

    public a(f fVar, Typeface typeface) {
        this.f1005s = typeface;
        this.f1006t = fVar;
    }

    @Override // f1.e
    public final void i0(int i2) {
        if (this.f1007u) {
            return;
        }
        e1.b bVar = (e1.b) this.f1006t.f875b;
        if (bVar.j(this.f1005s)) {
            bVar.h(false);
        }
    }

    @Override // f1.e
    public final void k0(Typeface typeface, boolean z2) {
        if (this.f1007u) {
            return;
        }
        e1.b bVar = (e1.b) this.f1006t.f875b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
