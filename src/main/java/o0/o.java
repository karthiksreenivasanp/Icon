package o0;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ p a;

    public o(p pVar) {
        this.a = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        p pVar = this.a;
        pVar.f2061b.setAlpha(iFloatValue);
        pVar.f2062c.setAlpha(iFloatValue);
        pVar.f2072n.invalidate();
    }
}
