package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nothing.icon.R;
import f1.e;
import g.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {
    public final LinkedHashSet a;

    /* renamed from: b, reason: collision with root package name */
    public int f573b;

    /* renamed from: c, reason: collision with root package name */
    public int f574c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f575d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f576e;

    /* renamed from: f, reason: collision with root package name */
    public int f577f;

    /* renamed from: g, reason: collision with root package name */
    public int f578g;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f579h;

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet();
        this.f577f = 0;
        this.f578g = 2;
    }

    @Override // q.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f577f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f573b = e.x0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f574c = e.x0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f575d = e.y0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, w0.a.f2314d);
        this.f576e = e.y0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, w0.a.f2313c);
        return false;
    }

    @Override // q.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        LinkedHashSet linkedHashSet = this.a;
        if (i2 > 0) {
            if (this.f578g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f579h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f578g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                androidx.activity.result.a.d(it.next());
                throw null;
            }
            r(view, this.f577f + 0, this.f574c, this.f576e);
            return;
        }
        if (i2 < 0) {
            if (this.f578g == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f579h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f578g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (it2.hasNext()) {
                androidx.activity.result.a.d(it2.next());
                throw null;
            }
            r(view, 0, this.f573b, this.f575d);
        }
    }

    @Override // q.a
    public boolean o(View view, int i2, int i3) {
        return i2 == 2;
    }

    public final void r(View view, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f579h = view.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new b(2, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.a = new LinkedHashSet();
        this.f577f = 0;
        this.f578g = 2;
    }
}
