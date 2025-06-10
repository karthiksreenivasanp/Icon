package o;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {
    public p(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        d dVar = (d) getLayoutParams();
        dVar.a = i2;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i2) {
        d dVar = (d) getLayoutParams();
        dVar.f1857b = i2;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f2) {
        d dVar = (d) getLayoutParams();
        dVar.f1859c = f2;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }
}
