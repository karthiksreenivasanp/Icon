package l1;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1590b;

    public /* synthetic */ a(p pVar, int i2) {
        this.a = i2;
        this.f1590b = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.a;
        p pVar = this.f1590b;
        switch (i2) {
            case 0:
                e eVar = (e) pVar;
                eVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = eVar.f1642d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            case 1:
                e eVar2 = (e) pVar;
                eVar2.getClass();
                eVar2.f1642d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                l lVar = (l) pVar;
                lVar.getClass();
                lVar.f1642d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
