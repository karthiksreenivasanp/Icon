package z0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import i1.g;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2382b;

    public /* synthetic */ a(int i2, Object obj) {
        this.a = i2;
        this.f2382b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.a;
        Object obj = this.f2382b;
        switch (i2) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) obj).f598i;
                if (gVar != null) {
                    i1.f fVar = gVar.a;
                    if (fVar.f1343j != fFloatValue) {
                        fVar.f1343j = fFloatValue;
                        gVar.f1358e = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                ((TextInputLayout) obj).f734s0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
