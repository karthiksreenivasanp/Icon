package l1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import g.l0;

/* loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1644c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f1645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f1646e;

    public q(s sVar, int i2, TextView textView, int i3, TextView textView2) {
        this.f1646e = sVar;
        this.a = i2;
        this.f1643b = textView;
        this.f1644c = i3;
        this.f1645d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var;
        int i2 = this.a;
        s sVar = this.f1646e;
        sVar.f1658n = i2;
        sVar.f1656l = null;
        TextView textView = this.f1643b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1644c == 1 && (l0Var = sVar.f1662r) != null) {
                l0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1645d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1645d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
