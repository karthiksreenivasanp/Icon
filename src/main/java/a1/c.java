package a1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import b0.f0;
import b0.s;
import com.google.android.material.button.MaterialButton;
import com.nothing.icon.R;
import f1.e;
import i1.f;
import i1.g;
import i1.k;
import i1.v;

/* loaded from: classes.dex */
public final class c {
    public final MaterialButton a;

    /* renamed from: b, reason: collision with root package name */
    public k f2b;

    /* renamed from: c, reason: collision with root package name */
    public int f3c;

    /* renamed from: d, reason: collision with root package name */
    public int f4d;

    /* renamed from: e, reason: collision with root package name */
    public int f5e;

    /* renamed from: f, reason: collision with root package name */
    public int f6f;

    /* renamed from: g, reason: collision with root package name */
    public int f7g;

    /* renamed from: h, reason: collision with root package name */
    public int f8h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f9i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f10j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f11l;

    /* renamed from: m, reason: collision with root package name */
    public g f12m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f18s;

    /* renamed from: t, reason: collision with root package name */
    public int f19t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.a = materialButton;
        this.f2b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f18s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.f18s.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.f18s;
        return (v) (numberOfLayers > 2 ? rippleDrawable2.getDrawable(2) : rippleDrawable2.getDrawable(1));
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f18s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f18s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f2b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i2, int i3) {
        int[] iArr = f0.a;
        MaterialButton materialButton = this.a;
        int iF = s.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iE = s.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f5e;
        int i5 = this.f6f;
        this.f6f = i3;
        this.f5e = i2;
        if (!this.f14o) {
            e();
        }
        s.k(materialButton, iF, (paddingTop + i2) - i4, iE, (paddingBottom + i3) - i5);
    }

    public final void e() {
        g gVar = new g(this.f2b);
        MaterialButton materialButton = this.a;
        gVar.h(materialButton.getContext());
        v.b.h(gVar, this.f10j);
        PorterDuff.Mode mode = this.f9i;
        if (mode != null) {
            v.b.i(gVar, mode);
        }
        float f2 = this.f8h;
        ColorStateList colorStateList = this.k;
        gVar.a.k = f2;
        gVar.invalidateSelf();
        f fVar = gVar.a;
        if (fVar.f1337d != colorStateList) {
            fVar.f1337d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f2b);
        gVar2.setTint(0);
        float f3 = this.f8h;
        int I = this.f13n ? e.I(materialButton, R.attr.colorSurface) : 0;
        gVar2.a.k = f3;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(I);
        f fVar2 = gVar2.a;
        if (fVar2.f1337d != colorStateListValueOf) {
            fVar2.f1337d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f2b);
        this.f12m = gVar3;
        v.b.g(gVar3, -1);
        ColorStateList colorStateListValueOf2 = this.f11l;
        if (colorStateListValueOf2 == null) {
            colorStateListValueOf2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f3c, this.f5e, this.f4d, this.f6f), this.f12m);
        this.f18s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.i(this.f19t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f2 = this.f8h;
            ColorStateList colorStateList = this.k;
            gVarB.a.k = f2;
            gVarB.invalidateSelf();
            f fVar = gVarB.a;
            if (fVar.f1337d != colorStateList) {
                fVar.f1337d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f3 = this.f8h;
                int I = this.f13n ? e.I(this.a, R.attr.colorSurface) : 0;
                gVarB2.a.k = f3;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(I);
                f fVar2 = gVarB2.a;
                if (fVar2.f1337d != colorStateListValueOf) {
                    fVar2.f1337d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}
