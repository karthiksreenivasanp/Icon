package l1;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends i1.f {

    /* renamed from: v, reason: collision with root package name */
    public final RectF f1603v;

    public g(i1.k kVar, RectF rectF) {
        super(kVar);
        this.f1603v = rectF;
    }

    @Override // i1.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        h hVar = new h(this);
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f1603v = gVar.f1603v;
    }
}
