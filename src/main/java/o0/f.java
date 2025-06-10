package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2003c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2005e;

    public /* synthetic */ f(k kVar, z0 z0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2005e = kVar;
        this.f2002b = z0Var;
        this.f2003c = view;
        this.f2004d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.f2003c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.a;
        Object obj = this.f2002b;
        Object obj2 = this.f2005e;
        Object obj3 = this.f2004d;
        switch (i2) {
            case 0:
                ((ViewPropertyAnimator) obj3).setListener(null);
                this.f2003c.setAlpha(1.0f);
                k kVar = (k) obj2;
                z0 z0Var = (z0) obj;
                kVar.b(z0Var);
                kVar.f2040q.remove(z0Var);
                kVar.g();
                break;
            default:
                ((ViewPropertyAnimator) obj3).setListener(null);
                k kVar2 = (k) obj2;
                z0 z0Var2 = (z0) obj;
                kVar2.b(z0Var2);
                kVar2.f2038o.remove(z0Var2);
                kVar2.g();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i2 = this.a;
        Object obj = this.f2005e;
        switch (i2) {
            case 0:
                ((k) obj).getClass();
                break;
            default:
                ((k) obj).getClass();
                break;
        }
    }

    public f(k kVar, z0 z0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2005e = kVar;
        this.f2002b = z0Var;
        this.f2004d = viewPropertyAnimator;
        this.f2003c = view;
    }
}
