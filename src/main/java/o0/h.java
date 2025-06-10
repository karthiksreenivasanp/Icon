package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2021d;

    public /* synthetic */ h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.a = i2;
        this.f2021d = kVar;
        this.f2019b = viewPropertyAnimator;
        this.f2020c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.a;
        View view = this.f2020c;
        ViewPropertyAnimator viewPropertyAnimator = this.f2019b;
        switch (i2) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                throw null;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                throw null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }
}
