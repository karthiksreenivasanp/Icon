package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f2014e;

    public g(k kVar, z0 z0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2014e = kVar;
        this.a = i2;
        this.f2011b = view;
        this.f2012c = i3;
        this.f2013d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i2 = this.a;
        View view = this.f2011b;
        if (i2 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2012c != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2013d.setListener(null);
        k kVar = this.f2014e;
        kVar.b(null);
        kVar.f2039p.remove((Object) null);
        kVar.g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2014e.getClass();
    }
}
