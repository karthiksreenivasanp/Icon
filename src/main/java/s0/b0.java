package s0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter implements m {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2189b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2190c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2192e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2193f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2191d = true;

    public b0(View view, int i2) {
        this.a = view;
        this.f2189b = i2;
        this.f2190c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // s0.m
    public final void a() {
    }

    @Override // s0.m
    public final void b() {
        f(false);
    }

    @Override // s0.m
    public final void c(n nVar) {
        if (!this.f2193f) {
            c cVar = u.a;
            this.a.setTransitionVisibility(this.f2189b);
            ViewGroup viewGroup = this.f2190c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        nVar.u(this);
    }

    @Override // s0.m
    public final void d() {
    }

    @Override // s0.m
    public final void e() {
        f(true);
    }

    public final void f(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f2191d || this.f2192e == z2 || (viewGroup = this.f2190c) == null) {
            return;
        }
        this.f2192e = z2;
        viewGroup.suppressLayout(z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2193f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2193f) {
            c cVar = u.a;
            this.a.setTransitionVisibility(this.f2189b);
            ViewGroup viewGroup = this.f2190c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f2193f) {
            return;
        }
        c cVar = u.a;
        this.a.setTransitionVisibility(this.f2189b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f2193f) {
            return;
        }
        c cVar = u.a;
        this.a.setTransitionVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
