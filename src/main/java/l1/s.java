package l1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.f0;
import com.google.android.material.textfield.TextInputLayout;
import com.nothing.icon.R;
import g.l0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {
    public ColorStateList A;
    public Typeface B;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1647b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1648c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f1649d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1650e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1651f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1652g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f1653h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1654i;

    /* renamed from: j, reason: collision with root package name */
    public int f1655j;
    public FrameLayout k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f1656l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1657m;

    /* renamed from: n, reason: collision with root package name */
    public int f1658n;

    /* renamed from: o, reason: collision with root package name */
    public int f1659o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1660p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1661q;

    /* renamed from: r, reason: collision with root package name */
    public l0 f1662r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1663s;

    /* renamed from: t, reason: collision with root package name */
    public int f1664t;

    /* renamed from: u, reason: collision with root package name */
    public int f1665u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1666v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1667w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1668x;

    /* renamed from: y, reason: collision with root package name */
    public l0 f1669y;

    /* renamed from: z, reason: collision with root package name */
    public int f1670z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1652g = context;
        this.f1653h = textInputLayout;
        this.f1657m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.a = f1.e.x0(context, R.attr.motionDurationShort4, 217);
        this.f1647b = f1.e.x0(context, R.attr.motionDurationMedium4, 167);
        this.f1648c = f1.e.x0(context, R.attr.motionDurationShort4, 167);
        this.f1649d = f1.e.y0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, w0.a.f2314d);
        LinearInterpolator linearInterpolator = w0.a.a;
        this.f1650e = f1.e.y0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1651f = f1.e.y0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i2) {
        if (this.f1654i == null && this.k == null) {
            Context context = this.f1652g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1654i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1654i;
            TextInputLayout textInputLayout = this.f1653h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.f1654i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.f1654i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1654i.setVisibility(0);
        this.f1655j++;
    }

    public final void b() {
        LinearLayout linearLayout = this.f1654i;
        TextInputLayout textInputLayout = this.f1653h;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f1652g;
            boolean zV = f1.e.V(context);
            LinearLayout linearLayout2 = this.f1654i;
            int[] iArr = f0.a;
            int iF = b0.s.f(editText);
            if (zV) {
                iF = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (zV) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int iE = b0.s.e(editText);
            if (zV) {
                iE = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            b0.s.k(linearLayout2, iF, dimensionPixelSize, iE, 0);
        }
    }

    public final void c() {
        Animator animator = this.f1656l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z2) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            boolean z3 = i4 == i2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i5 = this.f1648c;
            objectAnimatorOfFloat.setDuration(z3 ? this.f1647b : i5);
            objectAnimatorOfFloat.setInterpolator(z3 ? this.f1650e : this.f1651f);
            if (i2 == i4 && i3 != 0) {
                objectAnimatorOfFloat.setStartDelay(i5);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i4 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f1657m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.a);
            objectAnimatorOfFloat2.setInterpolator(this.f1649d);
            objectAnimatorOfFloat2.setStartDelay(i5);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i2) {
        if (i2 == 1) {
            return this.f1662r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f1669y;
    }

    public final void f() {
        this.f1660p = null;
        c();
        if (this.f1658n == 1) {
            this.f1659o = (!this.f1668x || TextUtils.isEmpty(this.f1667w)) ? 0 : 2;
        }
        i(this.f1658n, this.f1659o, h(this.f1662r, ""));
    }

    public final void g(TextView textView, int i2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f1654i;
        if (viewGroup2 == null) {
            return;
        }
        boolean z2 = true;
        if (i2 != 0 && i2 != 1) {
            z2 = false;
        }
        if (z2 && (viewGroup = this.k) != null) {
            viewGroup2 = viewGroup;
        }
        viewGroup2.removeView(textView);
        int i3 = this.f1655j - 1;
        this.f1655j = i3;
        LinearLayout linearLayout = this.f1654i;
        if (i3 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        int[] iArr = f0.a;
        TextInputLayout textInputLayout = this.f1653h;
        return b0.u.c(textInputLayout) && textInputLayout.isEnabled() && !(this.f1659o == this.f1658n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i2, int i3, boolean z2) {
        TextView textViewE;
        TextView textViewE2;
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1656l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f1668x, this.f1669y, 2, i2, i3);
            d(arrayList, this.f1661q, this.f1662r, 1, i2, i3);
            f1.e.s0(animatorSet, arrayList);
            animatorSet.addListener(new q(this, i3, e(i2), i2, e(i3)));
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (textViewE2 = e(i3)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i2 != 0 && (textViewE = e(i2)) != null) {
                textViewE.setVisibility(4);
                if (i2 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f1658n = i3;
        }
        TextInputLayout textInputLayout = this.f1653h;
        textInputLayout.q();
        textInputLayout.t(z2, false);
        textInputLayout.w();
    }
}
