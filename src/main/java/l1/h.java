package l1;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class h extends i {
    public h(g gVar) {
        super(gVar);
    }

    @Override // i1.g
    public final void f(Canvas canvas) {
        if (this.f1605x.f1603v.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f1605x.f1603v);
        super.f(canvas);
        canvas.restore();
    }
}
