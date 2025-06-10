package s0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ Object a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2213b;

    public /* synthetic */ k(Object obj, j.b bVar) {
        this.f2213b = obj;
        this.a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((j.b) this.a).remove(animator);
        ((n) this.f2213b).f2231m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((n) this.f2213b).f2231m.add(animator);
    }
}
