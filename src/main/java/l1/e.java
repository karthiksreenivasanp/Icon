package l1;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f1594e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1595f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1596g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f1597h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f1598i;

    /* renamed from: j, reason: collision with root package name */
    public final b f1599j;
    public final c k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1600l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f1601m;

    public e(o oVar) {
        super(oVar);
        this.f1599j = new b(this, 0);
        this.k = new c(this, 0);
        this.f1594e = f1.e.x0(oVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f1595f = f1.e.x0(oVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f1596g = f1.e.y0(oVar.getContext(), R.attr.motionEasingLinearInterpolator, w0.a.a);
        this.f1597h = f1.e.y0(oVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, w0.a.f2314d);
    }

    @Override // l1.p
    public final void a() {
        if (this.f1640b.f1633p != null) {
            return;
        }
        t(u());
    }

    @Override // l1.p
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // l1.p
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // l1.p
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // l1.p
    public final View.OnClickListener f() {
        return this.f1599j;
    }

    @Override // l1.p
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // l1.p
    public final void m(EditText editText) {
        this.f1598i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // l1.p
    public final void p(boolean z2) {
        if (this.f1640b.f1633p == null) {
            return;
        }
        t(z2);
    }

    @Override // l1.p
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f1597h);
        valueAnimatorOfFloat.setDuration(this.f1595f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1596g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f1594e;
        valueAnimatorOfFloat2.setDuration(i2);
        valueAnimatorOfFloat2.addUpdateListener(new a(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1600l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f1600l.addListener(new d(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new a(this, 1));
        this.f1601m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new d(this, 1));
    }

    @Override // l1.p
    public final void s() {
        EditText editText = this.f1598i;
        if (editText != null) {
            editText.post(new j1.d(1, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f1640b.c() == z2;
        if (z2 && !this.f1600l.isRunning()) {
            this.f1601m.cancel();
            this.f1600l.start();
            if (z3) {
                this.f1600l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f1600l.cancel();
        this.f1601m.start();
        if (z3) {
            this.f1601m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f1598i;
        return editText != null && (editText.hasFocus() || this.f1642d.hasFocus()) && this.f1598i.getText().length() > 0;
    }
}
