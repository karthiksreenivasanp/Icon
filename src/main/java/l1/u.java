package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b0.f0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nothing.icon.R;
import g.f2;
import g.l0;

/* loaded from: classes.dex */
public final class u extends LinearLayout {
    public final TextInputLayout a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f1674b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1675c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1676d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1677e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1678f;

    /* renamed from: g, reason: collision with root package name */
    public int f1679g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f1680h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f1681i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1682j;

    public u(TextInputLayout textInputLayout, f2 f2Var) {
        CharSequence charSequenceJ;
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1676d = checkableImageButton;
        l0 l0Var = new l0(getContext(), null);
        this.f1674b = l0Var;
        if (f1.e.V(getContext())) {
            b0.f.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f1681i;
        checkableImageButton.setOnClickListener(null);
        f1.e.B0(checkableImageButton, onLongClickListener);
        this.f1681i = null;
        checkableImageButton.setOnLongClickListener(null);
        f1.e.B0(checkableImageButton, null);
        if (f2Var.k(67)) {
            this.f1677e = f1.e.K(getContext(), f2Var, 67);
        }
        if (f2Var.k(68)) {
            this.f1678f = f1.e.r0(f2Var.g(68, -1), null);
        }
        if (f2Var.k(64)) {
            a(f2Var.e(64));
            if (f2Var.k(63) && checkableImageButton.getContentDescription() != (charSequenceJ = f2Var.j(63))) {
                checkableImageButton.setContentDescription(charSequenceJ);
            }
            checkableImageButton.setCheckable(f2Var.a(62, true));
        }
        int iD = f2Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iD < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iD != this.f1679g) {
            this.f1679g = iD;
            checkableImageButton.setMinimumWidth(iD);
            checkableImageButton.setMinimumHeight(iD);
        }
        if (f2Var.k(66)) {
            ImageView.ScaleType scaleTypeB = f1.e.B(f2Var.g(66, -1));
            this.f1680h = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        l0Var.setVisibility(8);
        l0Var.setId(R.id.textinput_prefix_text);
        l0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int[] iArr = f0.a;
        b0.u.f(l0Var, 1);
        l0Var.setTextAppearance(f2Var.h(58, 0));
        if (f2Var.k(59)) {
            l0Var.setTextColor(f2Var.b(59));
        }
        CharSequence charSequenceJ2 = f2Var.j(57);
        this.f1675c = TextUtils.isEmpty(charSequenceJ2) ? null : charSequenceJ2;
        l0Var.setText(charSequenceJ2);
        d();
        addView(checkableImageButton);
        addView(l0Var);
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1676d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1677e;
            PorterDuff.Mode mode = this.f1678f;
            TextInputLayout textInputLayout = this.a;
            f1.e.e(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            f1.e.v0(textInputLayout, checkableImageButton, this.f1677e);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f1681i;
        checkableImageButton.setOnClickListener(null);
        f1.e.B0(checkableImageButton, onLongClickListener);
        this.f1681i = null;
        checkableImageButton.setOnLongClickListener(null);
        f1.e.B0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z2) {
        CheckableImageButton checkableImageButton = this.f1676d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            c();
            d();
        }
    }

    public final void c() throws Resources.NotFoundException {
        EditText editText = this.a.f705d;
        if (editText == null) {
            return;
        }
        int iF = 0;
        if (!(this.f1676d.getVisibility() == 0)) {
            int[] iArr = f0.a;
            iF = b0.s.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        int[] iArr2 = f0.a;
        b0.s.k(this.f1674b, iF, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i2 = (this.f1675c == null || this.f1682j) ? 8 : 0;
        setVisibility(this.f1676d.getVisibility() == 0 || i2 == 0 ? 0 : 8);
        this.f1674b.setVisibility(i2);
        this.a.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        super.onMeasure(i2, i3);
        c();
    }
}
