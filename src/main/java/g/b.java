package g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1052b;

    public /* synthetic */ b(int i2, Object obj) {
        this.a = i2;
        this.f1052b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1052b;
                actionBarOverlayLayout.f92t = null;
                actionBarOverlayLayout.f83j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.a;
        Object obj = this.f1052b;
        switch (i2) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f92t = null;
                actionBarOverlayLayout.f83j = false;
                return;
            case 1:
                ((s0.n) obj).l();
                animator.removeListener(this);
                return;
            case 2:
                ((HideBottomViewOnScrollBehavior) obj).f579h = null;
                return;
            case 3:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case 4:
                androidx.activity.result.a.d(obj);
                throw null;
            case 5:
                l1.l lVar = (l1.l) obj;
                lVar.q();
                lVar.f1618r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                androidx.activity.result.a.d(this.f1052b);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
