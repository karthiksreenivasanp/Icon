package l1;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class i extends i1.g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1604y = 0;

    /* renamed from: x, reason: collision with root package name */
    public g f1605x;

    public i(g gVar) {
        super(gVar);
        this.f1605x = gVar;
    }

    @Override // i1.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1605x = new g(this.f1605x);
        return this;
    }

    public final void n(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f1605x.f1603v;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
