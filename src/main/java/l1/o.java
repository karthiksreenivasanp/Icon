package l1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
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
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class o extends LinearLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f1619w = 0;
    public final TextInputLayout a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f1620b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f1621c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1622d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f1623e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f1624f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f1625g;

    /* renamed from: h, reason: collision with root package name */
    public final o.f f1626h;

    /* renamed from: i, reason: collision with root package name */
    public int f1627i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f1628j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1629l;

    /* renamed from: m, reason: collision with root package name */
    public int f1630m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f1631n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f1632o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1633p;

    /* renamed from: q, reason: collision with root package name */
    public final l0 f1634q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1635r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f1636s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f1637t;

    /* renamed from: u, reason: collision with root package name */
    public c0.d f1638u;

    /* renamed from: v, reason: collision with root package name */
    public final m f1639v;

    public o(TextInputLayout textInputLayout, f2 f2Var) {
        CharSequence charSequenceJ;
        super(textInputLayout.getContext());
        this.f1627i = 0;
        this.f1628j = new LinkedHashSet();
        this.f1639v = new m(this);
        n nVar = new n(this);
        this.f1637t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1620b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f1621c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f1625g = checkableImageButtonA2;
        this.f1626h = new o.f(this, f2Var);
        l0 l0Var = new l0(getContext(), null);
        this.f1634q = l0Var;
        if (f2Var.k(36)) {
            this.f1622d = f1.e.K(getContext(), f2Var, 36);
        }
        if (f2Var.k(37)) {
            this.f1623e = f1.e.r0(f2Var.g(37, -1), null);
        }
        if (f2Var.k(35)) {
            h(f2Var.e(35));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        int[] iArr = f0.a;
        b0.r.s(checkableImageButtonA, 2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!f2Var.k(51)) {
            if (f2Var.k(30)) {
                this.k = f1.e.K(getContext(), f2Var, 30);
            }
            if (f2Var.k(31)) {
                this.f1629l = f1.e.r0(f2Var.g(31, -1), null);
            }
        }
        if (f2Var.k(28)) {
            f(f2Var.g(28, 0));
            if (f2Var.k(25) && checkableImageButtonA2.getContentDescription() != (charSequenceJ = f2Var.j(25))) {
                checkableImageButtonA2.setContentDescription(charSequenceJ);
            }
            checkableImageButtonA2.setCheckable(f2Var.a(24, true));
        } else if (f2Var.k(51)) {
            if (f2Var.k(52)) {
                this.k = f1.e.K(getContext(), f2Var, 52);
            }
            if (f2Var.k(53)) {
                this.f1629l = f1.e.r0(f2Var.g(53, -1), null);
            }
            f(f2Var.a(51, false) ? 1 : 0);
            CharSequence charSequenceJ2 = f2Var.j(49);
            if (checkableImageButtonA2.getContentDescription() != charSequenceJ2) {
                checkableImageButtonA2.setContentDescription(charSequenceJ2);
            }
        }
        int iD = f2Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iD < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iD != this.f1630m) {
            this.f1630m = iD;
            checkableImageButtonA2.setMinimumWidth(iD);
            checkableImageButtonA2.setMinimumHeight(iD);
            checkableImageButtonA.setMinimumWidth(iD);
            checkableImageButtonA.setMinimumHeight(iD);
        }
        if (f2Var.k(29)) {
            ImageView.ScaleType scaleTypeB = f1.e.B(f2Var.g(29, -1));
            this.f1631n = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        l0Var.setVisibility(8);
        l0Var.setId(R.id.textinput_suffix_text);
        l0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        b0.u.f(l0Var, 1);
        l0Var.setTextAppearance(f2Var.h(70, 0));
        if (f2Var.k(71)) {
            l0Var.setTextColor(f2Var.b(71));
        }
        CharSequence charSequenceJ3 = f2Var.j(69);
        this.f1633p = TextUtils.isEmpty(charSequenceJ3) ? null : charSequenceJ3;
        l0Var.setText(charSequenceJ3);
        m();
        frameLayout.addView(checkableImageButtonA2);
        addView(l0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f704c0.add(nVar);
        if (textInputLayout.f705d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new f.d(2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        if (f1.e.V(getContext())) {
            b0.f.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final p b() {
        int i2 = this.f1627i;
        o.f fVar = this.f1626h;
        SparseArray sparseArray = (SparseArray) fVar.f1898c;
        p fVar2 = (p) sparseArray.get(i2);
        if (fVar2 == null) {
            if (i2 != -1) {
                int i3 = 1;
                if (i2 == 0) {
                    fVar2 = new f((o) fVar.f1899d, i3);
                } else if (i2 == 1) {
                    fVar2 = new t((o) fVar.f1899d, fVar.f1897b);
                } else if (i2 == 2) {
                    fVar2 = new e((o) fVar.f1899d);
                } else {
                    if (i2 != 3) {
                        throw new IllegalArgumentException("Invalid end icon mode: " + i2);
                    }
                    fVar2 = new l((o) fVar.f1899d);
                }
            } else {
                fVar2 = new f((o) fVar.f1899d, 0);
            }
            sparseArray.append(i2, fVar2);
        }
        return fVar2;
    }

    public final boolean c() {
        return this.f1620b.getVisibility() == 0 && this.f1625g.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f1621c.getVisibility() == 0;
    }

    public final void e(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean zIsChecked;
        p pVarB = b();
        boolean zK = pVarB.k();
        CheckableImageButton checkableImageButton = this.f1625g;
        boolean z4 = true;
        if (!zK || (zIsChecked = checkableImageButton.isChecked()) == pVarB.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!zIsChecked);
            z3 = true;
        }
        if (!(pVarB instanceof l) || (zIsActivated = checkableImageButton.isActivated()) == pVarB.j()) {
            z4 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z2 || z4) {
            f1.e.v0(this.a, checkableImageButton, this.k);
        }
    }

    public final void f(int i2) {
        if (this.f1627i == i2) {
            return;
        }
        p pVarB = b();
        c0.d dVar = this.f1638u;
        AccessibilityManager accessibilityManager = this.f1637t;
        if (dVar != null && accessibilityManager != null) {
            c0.c.b(accessibilityManager, dVar);
        }
        this.f1638u = null;
        pVarB.s();
        this.f1627i = i2;
        Iterator it = this.f1628j.iterator();
        if (it.hasNext()) {
            androidx.activity.result.a.d(it.next());
            throw null;
        }
        g(i2 != 0);
        p pVarB2 = b();
        int iD = this.f1626h.a;
        if (iD == 0) {
            iD = pVarB2.d();
        }
        Drawable drawableM = iD != 0 ? f1.e.M(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f1625g;
        checkableImageButton.setImageDrawable(drawableM);
        TextInputLayout textInputLayout = this.a;
        if (drawableM != null) {
            f1.e.e(textInputLayout, checkableImageButton, this.k, this.f1629l);
            f1.e.v0(textInputLayout, checkableImageButton, this.k);
        }
        int iC = pVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(pVarB2.k());
        if (!pVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        pVarB2.r();
        c0.d dVarH = pVarB2.h();
        this.f1638u = dVarH;
        if (dVarH != null && accessibilityManager != null) {
            int[] iArr = f0.a;
            if (b0.u.b(this)) {
                c0.c.a(accessibilityManager, this.f1638u);
            }
        }
        View.OnClickListener onClickListenerF = pVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f1632o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        f1.e.B0(checkableImageButton, onLongClickListener);
        EditText editText = this.f1636s;
        if (editText != null) {
            pVarB2.m(editText);
            i(pVarB2);
        }
        f1.e.e(textInputLayout, checkableImageButton, this.k, this.f1629l);
        e(true);
    }

    public final void g(boolean z2) {
        if (c() != z2) {
            this.f1625g.setVisibility(z2 ? 0 : 8);
            j();
            l();
            this.a.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1621c;
        checkableImageButton.setImageDrawable(drawable);
        k();
        f1.e.e(this.a, checkableImageButton, this.f1622d, this.f1623e);
    }

    public final void i(p pVar) {
        if (this.f1636s == null) {
            return;
        }
        if (pVar.e() != null) {
            this.f1636s.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.f1625g.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void j() {
        this.f1620b.setVisibility((this.f1625g.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility(c() || d() || !((this.f1633p == null || this.f1635r) ? 8 : false) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.f1621c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility(drawable != null && textInputLayout.f717j.f1661q && textInputLayout.m() ? 0 : 8);
        j();
        l();
        if (this.f1627i != 0) {
            return;
        }
        textInputLayout.p();
    }

    public final void l() {
        int iE;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.f705d == null) {
            return;
        }
        if (c() || d()) {
            iE = 0;
        } else {
            EditText editText = textInputLayout.f705d;
            int[] iArr = f0.a;
            iE = b0.s.e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f705d.getPaddingTop();
        int paddingBottom = textInputLayout.f705d.getPaddingBottom();
        int[] iArr2 = f0.a;
        b0.s.k(this.f1634q, dimensionPixelSize, paddingTop, iE, paddingBottom);
    }

    public final void m() {
        l0 l0Var = this.f1634q;
        int visibility = l0Var.getVisibility();
        int i2 = (this.f1633p == null || this.f1635r) ? 8 : 0;
        if (visibility != i2) {
            b().p(i2 == 0);
        }
        j();
        l0Var.setVisibility(i2);
        this.a.p();
    }
}
