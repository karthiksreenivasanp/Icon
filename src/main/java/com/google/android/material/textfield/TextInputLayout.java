package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.f0;
import b0.m;
import b0.r;
import b0.z;
import com.google.android.material.internal.CheckableImageButton;
import e1.b;
import f1.d;
import f1.e;
import g.f2;
import g.l0;
import g.s0;
import g.w1;
import i1.f;
import i1.g;
import i1.j;
import i1.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import l1.n;
import l1.o;
import l1.s;
import l1.u;
import l1.v;
import l1.w;
import l1.x;
import l1.y;
import s.c;
import s0.i;
import s0.q;
import w0.a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: y0, reason: collision with root package name */
    public static final int[][] f699y0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public boolean A;
    public CharSequence B;
    public boolean C;
    public g D;
    public g E;
    public StateListDrawable F;
    public boolean G;
    public g H;
    public g I;
    public k J;
    public boolean K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public final Rect T;
    public final Rect U;
    public final RectF V;
    public Typeface W;
    public final FrameLayout a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorDrawable f700a0;

    /* renamed from: b, reason: collision with root package name */
    public final u f701b;

    /* renamed from: b0, reason: collision with root package name */
    public int f702b0;

    /* renamed from: c, reason: collision with root package name */
    public final o f703c;

    /* renamed from: c0, reason: collision with root package name */
    public final LinkedHashSet f704c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f705d;

    /* renamed from: d0, reason: collision with root package name */
    public ColorDrawable f706d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f707e;

    /* renamed from: e0, reason: collision with root package name */
    public int f708e0;

    /* renamed from: f, reason: collision with root package name */
    public int f709f;

    /* renamed from: f0, reason: collision with root package name */
    public Drawable f710f0;

    /* renamed from: g, reason: collision with root package name */
    public int f711g;

    /* renamed from: g0, reason: collision with root package name */
    public ColorStateList f712g0;

    /* renamed from: h, reason: collision with root package name */
    public int f713h;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f714h0;

    /* renamed from: i, reason: collision with root package name */
    public int f715i;

    /* renamed from: i0, reason: collision with root package name */
    public int f716i0;

    /* renamed from: j, reason: collision with root package name */
    public final s f717j;

    /* renamed from: j0, reason: collision with root package name */
    public int f718j0;
    public boolean k;

    /* renamed from: k0, reason: collision with root package name */
    public int f719k0;

    /* renamed from: l, reason: collision with root package name */
    public int f720l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f721l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f722m;

    /* renamed from: m0, reason: collision with root package name */
    public int f723m0;

    /* renamed from: n, reason: collision with root package name */
    public x f724n;

    /* renamed from: n0, reason: collision with root package name */
    public int f725n0;

    /* renamed from: o, reason: collision with root package name */
    public l0 f726o;

    /* renamed from: o0, reason: collision with root package name */
    public int f727o0;

    /* renamed from: p, reason: collision with root package name */
    public int f728p;

    /* renamed from: p0, reason: collision with root package name */
    public int f729p0;

    /* renamed from: q, reason: collision with root package name */
    public int f730q;

    /* renamed from: q0, reason: collision with root package name */
    public int f731q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f732r;
    public boolean r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f733s;

    /* renamed from: s0, reason: collision with root package name */
    public final b f734s0;

    /* renamed from: t, reason: collision with root package name */
    public l0 f735t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f736t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f737u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f738u0;

    /* renamed from: v, reason: collision with root package name */
    public int f739v;

    /* renamed from: v0, reason: collision with root package name */
    public ValueAnimator f740v0;

    /* renamed from: w, reason: collision with root package name */
    public i f741w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f742w0;

    /* renamed from: x, reason: collision with root package name */
    public i f743x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f744x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f745y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f746z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v57 */
    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        ?? r4;
        int colorForState;
        super(e.L0(context, attributeSet, com.nothing.icon.R.attr.textInputStyle, com.nothing.icon.R.style.Widget_Design_TextInputLayout), attributeSet, com.nothing.icon.R.attr.textInputStyle);
        this.f709f = -1;
        this.f711g = -1;
        this.f713h = -1;
        this.f715i = -1;
        this.f717j = new s(this);
        this.f724n = new m();
        this.T = new Rect();
        this.U = new Rect();
        this.V = new RectF();
        this.f704c0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f734s0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = a.a;
        bVar.Q = linearInterpolator;
        bVar.h(false);
        bVar.P = linearInterpolator;
        bVar.h(false);
        if (bVar.f827g != 8388659) {
            bVar.f827g = 8388659;
            bVar.h(false);
        }
        int[] iArr = v0.a.f2308t;
        e.o(context2, attributeSet, com.nothing.icon.R.attr.textInputStyle, com.nothing.icon.R.style.Widget_Design_TextInputLayout);
        e.s(context2, attributeSet, iArr, com.nothing.icon.R.attr.textInputStyle, com.nothing.icon.R.style.Widget_Design_TextInputLayout, 22, 20, 38, 43, 47);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.nothing.icon.R.attr.textInputStyle, com.nothing.icon.R.style.Widget_Design_TextInputLayout);
        f2 f2Var = new f2(context2, typedArrayObtainStyledAttributes);
        u uVar = new u(this, f2Var);
        this.f701b = uVar;
        this.A = f2Var.a(46, true);
        setHint(f2Var.j(4));
        this.f738u0 = f2Var.a(45, true);
        this.f736t0 = f2Var.a(40, true);
        if (f2Var.k(6)) {
            setMinEms(f2Var.g(6, -1));
        } else if (f2Var.k(3)) {
            setMinWidth(f2Var.d(3, -1));
        }
        if (f2Var.k(5)) {
            setMaxEms(f2Var.g(5, -1));
        } else if (f2Var.k(2)) {
            setMaxWidth(f2Var.d(2, -1));
        }
        this.J = new k(k.b(context2, attributeSet, com.nothing.icon.R.attr.textInputStyle, com.nothing.icon.R.style.Widget_Design_TextInputLayout));
        this.L = context2.getResources().getDimensionPixelOffset(com.nothing.icon.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.N = f2Var.c(9, 0);
        this.P = f2Var.d(16, context2.getResources().getDimensionPixelSize(com.nothing.icon.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.Q = f2Var.d(17, context2.getResources().getDimensionPixelSize(com.nothing.icon.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.O = this.P;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        k kVar = this.J;
        kVar.getClass();
        j jVar = new j(kVar);
        if (dimension >= 0.0f) {
            jVar.f1378e = new i1.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            jVar.f1379f = new i1.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            jVar.f1380g = new i1.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            jVar.f1381h = new i1.a(dimension4);
        }
        this.J = new k(jVar);
        ColorStateList colorStateListK = e.K(context2, f2Var, 7);
        if (colorStateListK != null) {
            int defaultColor = colorStateListK.getDefaultColor();
            this.f723m0 = defaultColor;
            this.S = defaultColor;
            if (colorStateListK.isStateful()) {
                this.f725n0 = colorStateListK.getColorForState(new int[]{-16842910}, -1);
                this.f727o0 = colorStateListK.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListK.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f727o0 = this.f723m0;
                ColorStateList colorStateListA = c.a(context2, com.nothing.icon.R.color.mtrl_filled_background_color);
                this.f725n0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.f729p0 = colorForState;
        } else {
            this.S = 0;
            this.f723m0 = 0;
            this.f725n0 = 0;
            this.f727o0 = 0;
            this.f729p0 = 0;
        }
        if (f2Var.k(1)) {
            ColorStateList colorStateListB = f2Var.b(1);
            this.f714h0 = colorStateListB;
            this.f712g0 = colorStateListB;
        }
        ColorStateList colorStateListK2 = e.K(context2, f2Var, 14);
        this.f719k0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        Object obj = c.a;
        this.f716i0 = s.b.a(context2, com.nothing.icon.R.color.mtrl_textinput_default_box_stroke_color);
        this.f731q0 = s.b.a(context2, com.nothing.icon.R.color.mtrl_textinput_disabled_color);
        this.f718j0 = s.b.a(context2, com.nothing.icon.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListK2 != null) {
            setBoxStrokeColorStateList(colorStateListK2);
        }
        if (f2Var.k(15)) {
            setBoxStrokeErrorColor(e.K(context2, f2Var, 15));
        }
        if (f2Var.h(47, -1) != -1) {
            r4 = 0;
            setHintTextAppearance(f2Var.h(47, 0));
        } else {
            r4 = 0;
        }
        int iH = f2Var.h(38, r4);
        CharSequence charSequenceJ = f2Var.j(33);
        int iG = f2Var.g(32, 1);
        boolean zA = f2Var.a(34, r4);
        int iH2 = f2Var.h(43, r4);
        boolean zA2 = f2Var.a(42, r4);
        CharSequence charSequenceJ2 = f2Var.j(41);
        int iH3 = f2Var.h(55, r4);
        CharSequence charSequenceJ3 = f2Var.j(54);
        boolean zA3 = f2Var.a(18, r4);
        setCounterMaxLength(f2Var.g(19, -1));
        this.f730q = f2Var.h(22, 0);
        this.f728p = f2Var.h(20, 0);
        setBoxBackgroundMode(f2Var.g(8, 0));
        setErrorContentDescription(charSequenceJ);
        setErrorAccessibilityLiveRegion(iG);
        setCounterOverflowTextAppearance(this.f728p);
        setHelperTextTextAppearance(iH2);
        setErrorTextAppearance(iH);
        setCounterTextAppearance(this.f730q);
        setPlaceholderText(charSequenceJ3);
        setPlaceholderTextAppearance(iH3);
        if (f2Var.k(39)) {
            setErrorTextColor(f2Var.b(39));
        }
        if (f2Var.k(44)) {
            setHelperTextColor(f2Var.b(44));
        }
        if (f2Var.k(48)) {
            setHintTextColor(f2Var.b(48));
        }
        if (f2Var.k(23)) {
            setCounterTextColor(f2Var.b(23));
        }
        if (f2Var.k(21)) {
            setCounterOverflowTextColor(f2Var.b(21));
        }
        if (f2Var.k(56)) {
            setPlaceholderTextColor(f2Var.b(56));
        }
        o oVar = new o(this, f2Var);
        this.f703c = oVar;
        boolean zA4 = f2Var.a(0, true);
        f2Var.n();
        int[] iArr2 = f0.a;
        r.s(this, 2);
        z.l(this, 1);
        frameLayout.addView(uVar);
        frameLayout.addView(oVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceJ2);
    }

    private Drawable getEditTextBoxBackground() {
        int iA;
        EditText editText = this.f705d;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int I = e.I(this.f705d, com.nothing.icon.R.attr.colorControlHighlight);
                int i2 = this.M;
                int[][] iArr = f699y0;
                if (i2 != 2) {
                    if (i2 != 1) {
                        return null;
                    }
                    g gVar = this.D;
                    int i3 = this.S;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{e.Z(I, i3, 0.1f), i3}), gVar, gVar);
                }
                Context context = getContext();
                g gVar2 = this.D;
                TypedValue typedValueZ0 = e.z0(context, com.nothing.icon.R.attr.colorSurface, "TextInputLayout");
                int i4 = typedValueZ0.resourceId;
                if (i4 != 0) {
                    Object obj = c.a;
                    iA = s.b.a(context, i4);
                } else {
                    iA = typedValueZ0.data;
                }
                g gVar3 = new g(gVar2.a.a);
                int iZ = e.Z(I, iA, 0.1f);
                gVar3.j(new ColorStateList(iArr, new int[]{iZ, 0}));
                gVar3.setTint(iA);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iZ, iA});
                g gVar4 = new g(gVar2.a.a);
                gVar4.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
            }
        }
        return this.D;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.F == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.F = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.F.addState(new int[0], f(false));
        }
        return this.F;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.E == null) {
            this.E = f(true);
        }
        return this.E;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f705d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f705d = editText;
        int i2 = this.f709f;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f713h);
        }
        int i3 = this.f711g;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f715i);
        }
        this.G = false;
        i();
        setTextInputAccessibilityDelegate(new w(this));
        Typeface typeface = this.f705d.getTypeface();
        b bVar = this.f734s0;
        bVar.m(typeface);
        float textSize = this.f705d.getTextSize();
        if (bVar.f828h != textSize) {
            bVar.f828h = textSize;
            bVar.h(false);
        }
        float letterSpacing = this.f705d.getLetterSpacing();
        if (bVar.W != letterSpacing) {
            bVar.W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f705d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (bVar.f827g != i4) {
            bVar.f827g = i4;
            bVar.h(false);
        }
        if (bVar.f825f != gravity) {
            bVar.f825f = gravity;
            bVar.h(false);
        }
        this.f705d.addTextChangedListener(new w1(this, 1));
        if (this.f712g0 == null) {
            this.f712g0 = this.f705d.getHintTextColors();
        }
        if (this.A) {
            if (TextUtils.isEmpty(this.B)) {
                CharSequence hint = this.f705d.getHint();
                this.f707e = hint;
                setHint(hint);
                this.f705d.setHint((CharSequence) null);
            }
            this.C = true;
        }
        if (this.f726o != null) {
            n(this.f705d.getText());
        }
        q();
        this.f717j.b();
        this.f701b.bringToFront();
        o oVar = this.f703c;
        oVar.bringToFront();
        Iterator it = this.f704c0.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(this);
        }
        oVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.B)) {
            return;
        }
        this.B = charSequence;
        b bVar = this.f734s0;
        if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
            bVar.A = charSequence;
            bVar.B = null;
            Bitmap bitmap = bVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.E = null;
            }
            bVar.h(false);
        }
        if (this.r0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f733s == z2) {
            return;
        }
        if (z2) {
            l0 l0Var = this.f735t;
            if (l0Var != null) {
                this.a.addView(l0Var);
                this.f735t.setVisibility(0);
            }
        } else {
            l0 l0Var2 = this.f735t;
            if (l0Var2 != null) {
                l0Var2.setVisibility(8);
            }
            this.f735t = null;
        }
        this.f733s = z2;
    }

    public final void a(float f2) {
        b bVar = this.f734s0;
        if (bVar.f817b == f2) {
            return;
        }
        int i2 = 1;
        if (this.f740v0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f740v0 = valueAnimator;
            valueAnimator.setInterpolator(e.y0(getContext(), com.nothing.icon.R.attr.motionEasingEmphasizedInterpolator, a.f2312b));
            this.f740v0.setDuration(e.x0(getContext(), com.nothing.icon.R.attr.motionDurationMedium4, 167));
            this.f740v0.addUpdateListener(new z0.a(i2, this));
        }
        this.f740v0.setFloatValues(bVar.f817b, f2);
        this.f740v0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        s();
        setEditText((EditText) view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            i1.g r0 = r7.D
            if (r0 != 0) goto L5
            return
        L5:
            i1.f r1 = r0.a
            i1.k r1 = r1.a
            i1.k r2 = r7.J
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.M
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.O
            if (r0 <= r2) goto L22
            int r0 = r7.R
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            i1.g r0 = r7.D
            int r1 = r7.O
            float r1 = (float) r1
            int r5 = r7.R
            i1.f r6 = r0.a
            r6.k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            i1.f r5 = r0.a
            android.content.res.ColorStateList r6 = r5.f1337d
            if (r6 == r1) goto L4b
            r5.f1337d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.S
            int r1 = r7.M
            if (r1 != r4) goto L73
            android.content.Context r0 = r7.getContext()
            r1 = 2130903299(0x7f030103, float:1.7413412E38)
            android.util.TypedValue r1 = f1.e.w0(r0, r1)
            if (r1 == 0) goto L6c
            int r5 = r1.resourceId
            if (r5 == 0) goto L69
            java.lang.Object r1 = s.c.a
            int r0 = s.b.a(r0, r5)
            goto L6d
        L69:
            int r0 = r1.data
            goto L6d
        L6c:
            r0 = r3
        L6d:
            int r1 = r7.S
            int r0 = u.a.b(r1, r0)
        L73:
            r7.S = r0
            i1.g r1 = r7.D
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.j(r0)
            i1.g r0 = r7.H
            if (r0 == 0) goto Lb4
            i1.g r1 = r7.I
            if (r1 != 0) goto L87
            goto Lb4
        L87:
            int r1 = r7.O
            if (r1 <= r2) goto L90
            int r1 = r7.R
            if (r1 == 0) goto L90
            r3 = r4
        L90:
            if (r3 == 0) goto Lb1
            android.widget.EditText r1 = r7.f705d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L9d
            int r1 = r7.f716i0
            goto L9f
        L9d:
            int r1 = r7.R
        L9f:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
            i1.g r0 = r7.I
            int r1 = r7.R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
        Lb1:
            r7.invalidate()
        Lb4:
            r7.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float fD;
        if (!this.A) {
            return 0;
        }
        int i2 = this.M;
        b bVar = this.f734s0;
        if (i2 == 0) {
            fD = bVar.d();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final i d() {
        i iVar = new i();
        iVar.f2222c = e.x0(getContext(), com.nothing.icon.R.attr.motionDurationShort2, 87);
        iVar.f2223d = e.y0(getContext(), com.nothing.icon.R.attr.motionEasingLinearInterpolator, a.a);
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f705d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f707e != null) {
            boolean z2 = this.C;
            this.C = false;
            CharSequence hint = editText.getHint();
            this.f705d.setHint(this.f707e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f705d.setHint(hint);
                this.C = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f705d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f744x0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f744x0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        super.draw(canvas);
        boolean z2 = this.A;
        b bVar = this.f734s0;
        if (z2) {
            bVar.getClass();
            int iSave = canvas.save();
            if (bVar.B != null) {
                RectF rectF = bVar.f823e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.N;
                    textPaint.setTextSize(bVar.G);
                    float f2 = bVar.f835p;
                    float f3 = bVar.f836q;
                    float f4 = bVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (bVar.f822d0 > 1 && !bVar.C) {
                        float lineStart = bVar.f835p - bVar.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (bVar.f818b0 * f5));
                        float f6 = bVar.H;
                        float f7 = bVar.I;
                        float f8 = bVar.J;
                        int i2 = bVar.K;
                        textPaint.setShadowLayer(f6, f7, f8, u.a.c(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                        bVar.Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f816a0 * f5));
                        float f9 = bVar.H;
                        float f10 = bVar.I;
                        float f11 = bVar.J;
                        int i3 = bVar.K;
                        textPaint.setShadowLayer(f9, f10, f11, u.a.c(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                        int lineBaseline = bVar.Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f820c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                        String strTrim = bVar.f820c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.Y.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                    } else {
                        canvas.translate(f2, f3);
                        bVar.Y.draw(canvas);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.I == null || (gVar = this.H) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f705d.isFocused()) {
            Rect bounds = this.I.getBounds();
            Rect bounds2 = this.H.getBounds();
            float f13 = bVar.f817b;
            int iCenterX = bounds2.centerX();
            int i4 = bounds2.left;
            LinearInterpolator linearInterpolator = a.a;
            bounds.left = Math.round((i4 - iCenterX) * f13) + iCenterX;
            bounds.right = Math.round(f13 * (bounds2.right - iCenterX)) + iCenterX;
            this.I.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() throws Resources.NotFoundException {
        boolean z2;
        ColorStateList colorStateList;
        boolean z3;
        if (this.f742w0) {
            return;
        }
        this.f742w0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f734s0;
        if (bVar != null) {
            bVar.L = drawableState;
            ColorStateList colorStateList2 = bVar.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f830j) != null && colorStateList.isStateful())) {
                bVar.h(false);
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3 | false;
        } else {
            z2 = false;
        }
        if (this.f705d != null) {
            int[] iArr = f0.a;
            t(b0.u.c(this) && isEnabled(), false);
        }
        q();
        w();
        if (z2) {
            invalidate();
        }
        this.f742w0 = false;
    }

    public final boolean e() {
        return this.A && !TextUtils.isEmpty(this.B) && (this.D instanceof l1.i);
    }

    public final g f(boolean z2) throws Resources.NotFoundException {
        int iA;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.nothing.icon.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.nothing.icon.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.nothing.icon.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        j jVar = new j();
        jVar.f1378e = new i1.a(f2);
        jVar.f1379f = new i1.a(f2);
        jVar.f1381h = new i1.a(dimensionPixelOffset);
        jVar.f1380g = new i1.a(dimensionPixelOffset);
        k kVar = new k(jVar);
        Context context = getContext();
        Paint paint = g.f1354w;
        TypedValue typedValueZ0 = e.z0(context, com.nothing.icon.R.attr.colorSurface, g.class.getSimpleName());
        int i2 = typedValueZ0.resourceId;
        if (i2 != 0) {
            Object obj = c.a;
            iA = s.b.a(context, i2);
        } else {
            iA = typedValueZ0.data;
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(ColorStateList.valueOf(iA));
        gVar.i(dimensionPixelOffset2);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.a;
        if (fVar.f1341h == null) {
            fVar.f1341h = new Rect();
        }
        gVar.a.f1341h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i2, boolean z2) {
        int compoundPaddingLeft = this.f705d.getCompoundPaddingLeft() + i2;
        return (getPrefixText() == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f705d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i2 = this.M;
        if (i2 == 1 || i2 == 2) {
            return this.D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.S;
    }

    public int getBoxBackgroundMode() {
        return this.M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zX = e.X(this);
        RectF rectF = this.V;
        k kVar = this.J;
        return (zX ? kVar.f1391h : kVar.f1390g).a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zX = e.X(this);
        RectF rectF = this.V;
        k kVar = this.J;
        return (zX ? kVar.f1390g : kVar.f1391h).a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zX = e.X(this);
        RectF rectF = this.V;
        k kVar = this.J;
        return (zX ? kVar.f1388e : kVar.f1389f).a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zX = e.X(this);
        RectF rectF = this.V;
        k kVar = this.J;
        return (zX ? kVar.f1389f : kVar.f1388e).a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f719k0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f721l0;
    }

    public int getBoxStrokeWidth() {
        return this.P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.Q;
    }

    public int getCounterMaxLength() {
        return this.f720l;
    }

    public CharSequence getCounterOverflowDescription() {
        l0 l0Var;
        if (this.k && this.f722m && (l0Var = this.f726o) != null) {
            return l0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f746z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f745y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f712g0;
    }

    public EditText getEditText() {
        return this.f705d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f703c.f1625g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f703c.f1625g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f703c.f1630m;
    }

    public int getEndIconMode() {
        return this.f703c.f1627i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f703c.f1631n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f703c.f1625g;
    }

    public CharSequence getError() {
        s sVar = this.f717j;
        if (sVar.f1661q) {
            return sVar.f1660p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f717j.f1664t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f717j.f1663s;
    }

    public int getErrorCurrentTextColors() {
        l0 l0Var = this.f717j.f1662r;
        if (l0Var != null) {
            return l0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f703c.f1621c.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.f717j;
        if (sVar.f1668x) {
            return sVar.f1667w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        l0 l0Var = this.f717j.f1669y;
        if (l0Var != null) {
            return l0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A) {
            return this.B;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f734s0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f734s0;
        return bVar.e(bVar.k);
    }

    public ColorStateList getHintTextColor() {
        return this.f714h0;
    }

    public x getLengthCounter() {
        return this.f724n;
    }

    public int getMaxEms() {
        return this.f711g;
    }

    public int getMaxWidth() {
        return this.f715i;
    }

    public int getMinEms() {
        return this.f709f;
    }

    public int getMinWidth() {
        return this.f713h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f703c.f1625g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f703c.f1625g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f733s) {
            return this.f732r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f739v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f737u;
    }

    public CharSequence getPrefixText() {
        return this.f701b.f1675c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f701b.f1674b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f701b.f1674b;
    }

    public k getShapeAppearanceModel() {
        return this.J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f701b.f1676d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f701b.f1676d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f701b.f1679g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f701b.f1680h;
    }

    public CharSequence getSuffixText() {
        return this.f703c.f1633p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f703c.f1634q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f703c.f1634q;
    }

    public Typeface getTypeface() {
        return this.W;
    }

    public final int h(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.f705d.getCompoundPaddingRight();
        return (getPrefixText() == null || !z2) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i2) {
        boolean z2 = true;
        try {
            textView.setTextAppearance(i2);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            textView.setTextAppearance(com.nothing.icon.R.style.TextAppearance_AppCompat_Caption);
            Context context = getContext();
            Object obj = c.a;
            textView.setTextColor(s.b.a(context, com.nothing.icon.R.color.design_error));
        }
    }

    public final boolean m() {
        s sVar = this.f717j;
        return (sVar.f1659o != 1 || sVar.f1662r == null || TextUtils.isEmpty(sVar.f1660p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((m) this.f724n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f722m;
        int i2 = this.f720l;
        String string = null;
        if (i2 == -1) {
            this.f726o.setText(String.valueOf(length));
            this.f726o.setContentDescription(null);
            this.f722m = false;
        } else {
            this.f722m = length > i2;
            Context context = getContext();
            this.f726o.setContentDescription(context.getString(this.f722m ? com.nothing.icon.R.string.character_counter_overflowed_content_description : com.nothing.icon.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f720l)));
            if (z2 != this.f722m) {
                o();
            }
            String str = z.b.f2369d;
            Locale locale = Locale.getDefault();
            int i3 = z.j.a;
            z.b bVar = z.i.a(locale) == 1 ? z.b.f2372g : z.b.f2371f;
            l0 l0Var = this.f726o;
            String string2 = getContext().getString(com.nothing.icon.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f720l));
            if (string2 == null) {
                bVar.getClass();
            } else {
                string = bVar.c(string2, bVar.f2374c).toString();
            }
            l0Var.setText(string);
        }
        if (this.f705d == null || z2 == this.f722m) {
            return;
        }
        t(false, false);
        w();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        l0 l0Var = this.f726o;
        if (l0Var != null) {
            l(l0Var, this.f722m ? this.f728p : this.f730q);
            if (!this.f722m && (colorStateList2 = this.f745y) != null) {
                this.f726o.setTextColor(colorStateList2);
            }
            if (!this.f722m || (colorStateList = this.f746z) == null) {
                return;
            }
            this.f726o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f734s0.g(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d9  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        EditText editText;
        int iMax;
        super.onMeasure(i2, i3);
        EditText editText2 = this.f705d;
        int i4 = 1;
        o oVar = this.f703c;
        if (editText2 != null && this.f705d.getMeasuredHeight() < (iMax = Math.max(oVar.getMeasuredHeight(), this.f701b.getMeasuredHeight()))) {
            this.f705d.setMinimumHeight(iMax);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zP = p();
        if (z2 || zP) {
            this.f705d.post(new v(this, i4));
        }
        if (this.f735t != null && (editText = this.f705d) != null) {
            this.f735t.setGravity(editText.getGravity());
            this.f735t.setPadding(this.f705d.getCompoundPaddingLeft(), this.f705d.getCompoundPaddingTop(), this.f705d.getCompoundPaddingRight(), this.f705d.getCompoundPaddingBottom());
        }
        oVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        super.onRestoreInstanceState(yVar.a);
        setError(yVar.f1685c);
        if (yVar.f1686d) {
            post(new v(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = i2 == 1;
        if (z2 != this.K) {
            i1.c cVar = this.J.f1388e;
            RectF rectF = this.V;
            float fA = cVar.a(rectF);
            float fA2 = this.J.f1389f.a(rectF);
            float fA3 = this.J.f1391h.a(rectF);
            float fA4 = this.J.f1390g.a(rectF);
            k kVar = this.J;
            e eVar = kVar.a;
            j jVar = new j();
            e eVar2 = kVar.f1385b;
            jVar.a = eVar2;
            j.a(eVar2);
            jVar.f1375b = eVar;
            j.a(eVar);
            e eVar3 = kVar.f1386c;
            jVar.f1377d = eVar3;
            j.a(eVar3);
            e eVar4 = kVar.f1387d;
            jVar.f1376c = eVar4;
            j.a(eVar4);
            jVar.f1378e = new i1.a(fA2);
            jVar.f1379f = new i1.a(fA);
            jVar.f1381h = new i1.a(fA4);
            jVar.f1380g = new i1.a(fA3);
            k kVar2 = new k(jVar);
            this.K = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        if (m()) {
            yVar.f1685c = getError();
        }
        o oVar = this.f703c;
        yVar.f1686d = (oVar.f1627i != 0) && oVar.f1625g.isChecked();
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        l0 l0Var;
        int currentTextColor;
        EditText editText = this.f705d;
        if (editText == null || this.M != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int i2 = s0.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            currentTextColor = getErrorCurrentTextColors();
        } else {
            if (!this.f722m || (l0Var = this.f726o) == null) {
                drawableMutate.clearColorFilter();
                this.f705d.refreshDrawableState();
                return;
            }
            currentTextColor = l0Var.getCurrentTextColor();
        }
        drawableMutate.setColorFilter(g.u.c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final void r() {
        EditText editText = this.f705d;
        if (editText == null || this.D == null) {
            return;
        }
        if ((this.G || editText.getBackground() == null) && this.M != 0) {
            EditText editText2 = this.f705d;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            int[] iArr = f0.a;
            r.q(editText2, editTextBoxBackground);
            this.G = true;
        }
    }

    public final void s() {
        if (this.M != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.S != i2) {
            this.S = i2;
            this.f723m0 = i2;
            this.f727o0 = i2;
            this.f729p0 = i2;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        Context context = getContext();
        Object obj = c.a;
        setBoxBackgroundColor(s.b.a(context, i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f723m0 = defaultColor;
        this.S = defaultColor;
        this.f725n0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f727o0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f729p0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i2) throws Resources.NotFoundException {
        if (i2 == this.M) {
            return;
        }
        this.M = i2;
        if (this.f705d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.N = i2;
    }

    public void setBoxCornerFamily(int i2) {
        k kVar = this.J;
        kVar.getClass();
        j jVar = new j(kVar);
        i1.c cVar = this.J.f1388e;
        e eVarE = e.E(i2);
        jVar.a = eVarE;
        j.a(eVarE);
        jVar.f1378e = cVar;
        i1.c cVar2 = this.J.f1389f;
        e eVarE2 = e.E(i2);
        jVar.f1375b = eVarE2;
        j.a(eVarE2);
        jVar.f1379f = cVar2;
        i1.c cVar3 = this.J.f1391h;
        e eVarE3 = e.E(i2);
        jVar.f1377d = eVarE3;
        j.a(eVarE3);
        jVar.f1381h = cVar3;
        i1.c cVar4 = this.J.f1390g;
        e eVarE4 = e.E(i2);
        jVar.f1376c = eVarE4;
        j.a(eVarE4);
        jVar.f1380g = cVar4;
        this.J = new k(jVar);
        b();
    }

    public void setBoxStrokeColor(int i2) throws Resources.NotFoundException {
        if (this.f719k0 != i2) {
            this.f719k0 = i2;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f719k0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            w();
        } else {
            this.f716i0 = colorStateList.getDefaultColor();
            this.f731q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f718j0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f719k0 = defaultColor;
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f721l0 != colorStateList) {
            this.f721l0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i2) throws Resources.NotFoundException {
        this.P = i2;
        w();
    }

    public void setBoxStrokeWidthFocused(int i2) throws Resources.NotFoundException {
        this.Q = i2;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.k != z2) {
            s sVar = this.f717j;
            if (z2) {
                l0 l0Var = new l0(getContext(), null);
                this.f726o = l0Var;
                l0Var.setId(com.nothing.icon.R.id.textinput_counter);
                Typeface typeface = this.W;
                if (typeface != null) {
                    this.f726o.setTypeface(typeface);
                }
                this.f726o.setMaxLines(1);
                sVar.a(this.f726o, 2);
                b0.f.h((ViewGroup.MarginLayoutParams) this.f726o.getLayoutParams(), getResources().getDimensionPixelOffset(com.nothing.icon.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f726o != null) {
                    EditText editText = this.f705d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.f726o, 2);
                this.f726o = null;
            }
            this.k = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f720l != i2) {
            if (i2 <= 0) {
                i2 = -1;
            }
            this.f720l = i2;
            if (!this.k || this.f726o == null) {
                return;
            }
            EditText editText = this.f705d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f728p != i2) {
            this.f728p = i2;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f746z != colorStateList) {
            this.f746z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f730q != i2) {
            this.f730q = i2;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f745y != colorStateList) {
            this.f745y = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f712g0 = colorStateList;
        this.f714h0 = colorStateList;
        if (this.f705d != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f703c.f1625g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f703c.f1625g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        o oVar = this.f703c;
        CharSequence text = i2 != 0 ? oVar.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = oVar.f1625g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        o oVar = this.f703c;
        Drawable drawableM = i2 != 0 ? e.M(oVar.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = oVar.f1625g;
        checkableImageButton.setImageDrawable(drawableM);
        if (drawableM != null) {
            ColorStateList colorStateList = oVar.k;
            PorterDuff.Mode mode = oVar.f1629l;
            TextInputLayout textInputLayout = oVar.a;
            e.e(textInputLayout, checkableImageButton, colorStateList, mode);
            e.v0(textInputLayout, checkableImageButton, oVar.k);
        }
    }

    public void setEndIconMinSize(int i2) {
        o oVar = this.f703c;
        if (i2 < 0) {
            oVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != oVar.f1630m) {
            oVar.f1630m = i2;
            CheckableImageButton checkableImageButton = oVar.f1625g;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = oVar.f1621c;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.f703c.f(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f703c;
        View.OnLongClickListener onLongClickListener = oVar.f1632o;
        CheckableImageButton checkableImageButton = oVar.f1625g;
        checkableImageButton.setOnClickListener(onClickListener);
        e.B0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f703c;
        oVar.f1632o = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f1625g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.B0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        o oVar = this.f703c;
        oVar.f1631n = scaleType;
        oVar.f1625g.setScaleType(scaleType);
        oVar.f1621c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        o oVar = this.f703c;
        if (oVar.k != colorStateList) {
            oVar.k = colorStateList;
            e.e(oVar.a, oVar.f1625g, colorStateList, oVar.f1629l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f703c;
        if (oVar.f1629l != mode) {
            oVar.f1629l = mode;
            e.e(oVar.a, oVar.f1625g, oVar.k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f703c.g(z2);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        s sVar = this.f717j;
        if (!sVar.f1661q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sVar.f();
            return;
        }
        sVar.c();
        sVar.f1660p = charSequence;
        sVar.f1662r.setText(charSequence);
        int i2 = sVar.f1658n;
        if (i2 != 1) {
            sVar.f1659o = 1;
        }
        sVar.i(i2, sVar.f1659o, sVar.h(sVar.f1662r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        s sVar = this.f717j;
        sVar.f1664t = i2;
        l0 l0Var = sVar.f1662r;
        if (l0Var != null) {
            int[] iArr = f0.a;
            b0.u.f(l0Var, i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.f717j;
        sVar.f1663s = charSequence;
        l0 l0Var = sVar.f1662r;
        if (l0Var != null) {
            l0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) throws Resources.NotFoundException {
        s sVar = this.f717j;
        if (sVar.f1661q == z2) {
            return;
        }
        sVar.c();
        TextInputLayout textInputLayout = sVar.f1653h;
        if (z2) {
            l0 l0Var = new l0(sVar.f1652g, null);
            sVar.f1662r = l0Var;
            l0Var.setId(com.nothing.icon.R.id.textinput_error);
            sVar.f1662r.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f1662r.setTypeface(typeface);
            }
            int i2 = sVar.f1665u;
            sVar.f1665u = i2;
            l0 l0Var2 = sVar.f1662r;
            if (l0Var2 != null) {
                textInputLayout.l(l0Var2, i2);
            }
            ColorStateList colorStateList = sVar.f1666v;
            sVar.f1666v = colorStateList;
            l0 l0Var3 = sVar.f1662r;
            if (l0Var3 != null && colorStateList != null) {
                l0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f1663s;
            sVar.f1663s = charSequence;
            l0 l0Var4 = sVar.f1662r;
            if (l0Var4 != null) {
                l0Var4.setContentDescription(charSequence);
            }
            int i3 = sVar.f1664t;
            sVar.f1664t = i3;
            l0 l0Var5 = sVar.f1662r;
            if (l0Var5 != null) {
                int[] iArr = f0.a;
                b0.u.f(l0Var5, i3);
            }
            sVar.f1662r.setVisibility(4);
            sVar.a(sVar.f1662r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f1662r, 0);
            sVar.f1662r = null;
            textInputLayout.q();
            textInputLayout.w();
        }
        sVar.f1661q = z2;
    }

    public void setErrorIconDrawable(int i2) {
        o oVar = this.f703c;
        oVar.h(i2 != 0 ? e.M(oVar.getContext(), i2) : null);
        e.v0(oVar.a, oVar.f1621c, oVar.f1622d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f703c;
        CheckableImageButton checkableImageButton = oVar.f1621c;
        View.OnLongClickListener onLongClickListener = oVar.f1624f;
        checkableImageButton.setOnClickListener(onClickListener);
        e.B0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f703c;
        oVar.f1624f = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f1621c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.B0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        o oVar = this.f703c;
        if (oVar.f1622d != colorStateList) {
            oVar.f1622d = colorStateList;
            e.e(oVar.a, oVar.f1621c, colorStateList, oVar.f1623e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f703c;
        if (oVar.f1623e != mode) {
            oVar.f1623e = mode;
            e.e(oVar.a, oVar.f1621c, oVar.f1622d, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        s sVar = this.f717j;
        sVar.f1665u = i2;
        l0 l0Var = sVar.f1662r;
        if (l0Var != null) {
            sVar.f1653h.l(l0Var, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.f717j;
        sVar.f1666v = colorStateList;
        l0 l0Var = sVar.f1662r;
        if (l0Var == null || colorStateList == null) {
            return;
        }
        l0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f736t0 != z2) {
            this.f736t0 = z2;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.f717j;
        if (zIsEmpty) {
            if (sVar.f1668x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f1668x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f1667w = charSequence;
        sVar.f1669y.setText(charSequence);
        int i2 = sVar.f1658n;
        if (i2 != 2) {
            sVar.f1659o = 2;
        }
        sVar.i(i2, sVar.f1659o, sVar.h(sVar.f1669y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.f717j;
        sVar.A = colorStateList;
        l0 l0Var = sVar.f1669y;
        if (l0Var == null || colorStateList == null) {
            return;
        }
        l0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) throws Resources.NotFoundException {
        s sVar = this.f717j;
        if (sVar.f1668x == z2) {
            return;
        }
        sVar.c();
        if (z2) {
            l0 l0Var = new l0(sVar.f1652g, null);
            sVar.f1669y = l0Var;
            l0Var.setId(com.nothing.icon.R.id.textinput_helper_text);
            sVar.f1669y.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f1669y.setTypeface(typeface);
            }
            sVar.f1669y.setVisibility(4);
            l0 l0Var2 = sVar.f1669y;
            int[] iArr = f0.a;
            b0.u.f(l0Var2, 1);
            int i2 = sVar.f1670z;
            sVar.f1670z = i2;
            l0 l0Var3 = sVar.f1669y;
            if (l0Var3 != null) {
                l0Var3.setTextAppearance(i2);
            }
            ColorStateList colorStateList = sVar.A;
            sVar.A = colorStateList;
            l0 l0Var4 = sVar.f1669y;
            if (l0Var4 != null && colorStateList != null) {
                l0Var4.setTextColor(colorStateList);
            }
            sVar.a(sVar.f1669y, 1);
            sVar.f1669y.setAccessibilityDelegate(new l1.r(sVar));
        } else {
            sVar.c();
            int i3 = sVar.f1658n;
            if (i3 == 2) {
                sVar.f1659o = 0;
            }
            sVar.i(i3, sVar.f1659o, sVar.h(sVar.f1669y, ""));
            sVar.g(sVar.f1669y, 1);
            sVar.f1669y = null;
            TextInputLayout textInputLayout = sVar.f1653h;
            textInputLayout.q();
            textInputLayout.w();
        }
        sVar.f1668x = z2;
    }

    public void setHelperTextTextAppearance(int i2) {
        s sVar = this.f717j;
        sVar.f1670z = i2;
        l0 l0Var = sVar.f1669y;
        if (l0Var != null) {
            l0Var.setTextAppearance(i2);
        }
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f738u0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.A) {
            this.A = z2;
            if (z2) {
                CharSequence hint = this.f705d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.B)) {
                        setHint(hint);
                    }
                    this.f705d.setHint((CharSequence) null);
                }
                this.C = true;
            } else {
                this.C = false;
                if (!TextUtils.isEmpty(this.B) && TextUtils.isEmpty(this.f705d.getHint())) {
                    this.f705d.setHint(this.B);
                }
                setHintInternal(null);
            }
            if (this.f705d != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        b bVar = this.f734s0;
        View view = bVar.a;
        d dVar = new d(view.getContext(), i2);
        ColorStateList colorStateList = dVar.f1022j;
        if (colorStateList != null) {
            bVar.k = colorStateList;
        }
        float f2 = dVar.k;
        if (f2 != 0.0f) {
            bVar.f829i = f2;
        }
        ColorStateList colorStateList2 = dVar.a;
        if (colorStateList2 != null) {
            bVar.U = colorStateList2;
        }
        bVar.S = dVar.f1017e;
        bVar.T = dVar.f1018f;
        bVar.R = dVar.f1019g;
        bVar.V = dVar.f1021i;
        f1.a aVar = bVar.f844y;
        if (aVar != null) {
            aVar.f1007u = true;
        }
        f.f fVar = new f.f(27, bVar);
        dVar.a();
        bVar.f844y = new f1.a(fVar, dVar.f1025n);
        dVar.c(view.getContext(), bVar.f844y);
        bVar.h(false);
        this.f714h0 = bVar.k;
        if (this.f705d != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f714h0 != colorStateList) {
            if (this.f712g0 == null) {
                b bVar = this.f734s0;
                if (bVar.k != colorStateList) {
                    bVar.k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f714h0 = colorStateList;
            if (this.f705d != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(x xVar) {
        this.f724n = xVar;
    }

    public void setMaxEms(int i2) {
        this.f711g = i2;
        EditText editText = this.f705d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.f715i = i2;
        EditText editText = this.f705d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f709f = i2;
        EditText editText = this.f705d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.f713h = i2;
        EditText editText = this.f705d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        o oVar = this.f703c;
        oVar.f1625g.setContentDescription(i2 != 0 ? oVar.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        o oVar = this.f703c;
        oVar.f1625g.setImageDrawable(i2 != 0 ? e.M(oVar.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        o oVar = this.f703c;
        if (z2 && oVar.f1627i != 1) {
            oVar.f(1);
        } else if (z2) {
            oVar.getClass();
        } else {
            oVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        o oVar = this.f703c;
        oVar.k = colorStateList;
        e.e(oVar.a, oVar.f1625g, colorStateList, oVar.f1629l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        o oVar = this.f703c;
        oVar.f1629l = mode;
        e.e(oVar.a, oVar.f1625g, oVar.k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f735t == null) {
            l0 l0Var = new l0(getContext(), null);
            this.f735t = l0Var;
            l0Var.setId(com.nothing.icon.R.id.textinput_placeholder);
            l0 l0Var2 = this.f735t;
            int[] iArr = f0.a;
            r.s(l0Var2, 2);
            i iVarD = d();
            this.f741w = iVarD;
            iVarD.f2221b = 67L;
            this.f743x = d();
            setPlaceholderTextAppearance(this.f739v);
            setPlaceholderTextColor(this.f737u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f733s) {
                setPlaceholderTextEnabled(true);
            }
            this.f732r = charSequence;
        }
        EditText editText = this.f705d;
        u(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f739v = i2;
        l0 l0Var = this.f735t;
        if (l0Var != null) {
            l0Var.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f737u != colorStateList) {
            this.f737u = colorStateList;
            l0 l0Var = this.f735t;
            if (l0Var == null || colorStateList == null) {
                return;
            }
            l0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        u uVar = this.f701b;
        uVar.getClass();
        uVar.f1675c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        uVar.f1674b.setText(charSequence);
        uVar.d();
    }

    public void setPrefixTextAppearance(int i2) {
        this.f701b.f1674b.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f701b.f1674b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.D;
        if (gVar == null || gVar.a.a == kVar) {
            return;
        }
        this.J = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f701b.f1676d.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? e.M(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        u uVar = this.f701b;
        if (i2 < 0) {
            uVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != uVar.f1679g) {
            uVar.f1679g = i2;
            CheckableImageButton checkableImageButton = uVar.f1676d;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.f701b;
        View.OnLongClickListener onLongClickListener = uVar.f1681i;
        CheckableImageButton checkableImageButton = uVar.f1676d;
        checkableImageButton.setOnClickListener(onClickListener);
        e.B0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.f701b;
        uVar.f1681i = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.f1676d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        e.B0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.f701b;
        uVar.f1680h = scaleType;
        uVar.f1676d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.f701b;
        if (uVar.f1677e != colorStateList) {
            uVar.f1677e = colorStateList;
            e.e(uVar.a, uVar.f1676d, colorStateList, uVar.f1678f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.f701b;
        if (uVar.f1678f != mode) {
            uVar.f1678f = mode;
            e.e(uVar.a, uVar.f1676d, uVar.f1677e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f701b.b(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        o oVar = this.f703c;
        oVar.getClass();
        oVar.f1633p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oVar.f1634q.setText(charSequence);
        oVar.m();
    }

    public void setSuffixTextAppearance(int i2) {
        this.f703c.f1634q.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f703c.f1634q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.f705d;
        if (editText != null) {
            f0.f(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.W) {
            this.W = typeface;
            this.f734s0.m(typeface);
            s sVar = this.f717j;
            if (typeface != sVar.B) {
                sVar.B = typeface;
                l0 l0Var = sVar.f1662r;
                if (l0Var != null) {
                    l0Var.setTypeface(typeface);
                }
                l0 l0Var2 = sVar.f1669y;
                if (l0Var2 != null) {
                    l0Var2.setTypeface(typeface);
                }
            }
            l0 l0Var3 = this.f726o;
            if (l0Var3 != null) {
                l0Var3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.t(boolean, boolean):void");
    }

    public final void u(Editable editable) {
        ((m) this.f724n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.r0) {
            l0 l0Var = this.f735t;
            if (l0Var == null || !this.f733s) {
                return;
            }
            l0Var.setText((CharSequence) null);
            q.a(frameLayout, this.f743x);
            this.f735t.setVisibility(4);
            return;
        }
        if (this.f735t == null || !this.f733s || TextUtils.isEmpty(this.f732r)) {
            return;
        }
        this.f735t.setText(this.f732r);
        q.a(frameLayout, this.f741w);
        this.f735t.setVisibility(0);
        this.f735t.bringToFront();
        announceForAccessibility(this.f732r);
    }

    public final void v(boolean z2, boolean z3) {
        int defaultColor = this.f721l0.getDefaultColor();
        int colorForState = this.f721l0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f721l0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.R = colorForState2;
        } else if (z3) {
            this.R = colorForState;
        } else {
            this.R = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.w():void");
    }

    public void setHint(CharSequence charSequence) {
        if (this.A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f701b.f1676d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f701b.a(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f703c.f1625g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f703c.f1625g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f703c.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f703c.f1625g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        o oVar = this.f703c;
        CheckableImageButton checkableImageButton = oVar.f1625g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = oVar.k;
            PorterDuff.Mode mode = oVar.f1629l;
            TextInputLayout textInputLayout = oVar.a;
            e.e(textInputLayout, checkableImageButton, colorStateList, mode);
            e.v0(textInputLayout, checkableImageButton, oVar.k);
        }
    }
}
