package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2057b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2058c;

    public n(View view) {
        this.f2058c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.f2057b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.a;
        Object obj = this.f2058c;
        switch (i2) {
            case 0:
                if (!this.f2057b) {
                    p pVar = (p) obj;
                    if (((Float) pVar.f2079u.getAnimatedValue()).floatValue() != 0.0f) {
                        pVar.f2080v = 2;
                        pVar.f2072n.invalidate();
                        break;
                    } else {
                        pVar.f2080v = 0;
                        pVar.f(0);
                        break;
                    }
                } else {
                    this.f2057b = false;
                    break;
                }
            default:
                View view = (View) obj;
                s0.c cVar = s0.u.a;
                view.setTransitionAlpha(1.0f);
                if (this.f2057b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                View view = (View) this.f2058c;
                int[] iArr = b0.f0.a;
                if (b0.r.h(view) && view.getLayerType() == 0) {
                    this.f2057b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public n(p pVar) {
        this.f2058c = pVar;
    }
}
