package com.google.android.material.button;

import a1.a;
import a1.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b0.f0;
import b0.s;
import f.f;
import f0.p;
import f1.e;
import g.q;
import i1.j;
import i1.k;
import i1.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v.b;

/* loaded from: classes.dex */
public class MaterialButton extends q implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f615r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f616s = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f617d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f618e;

    /* renamed from: f, reason: collision with root package name */
    public a f619f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f620g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f621h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f622i;

    /* renamed from: j, reason: collision with root package name */
    public String f623j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f624l;

    /* renamed from: m, reason: collision with root package name */
    public int f625m;

    /* renamed from: n, reason: collision with root package name */
    public int f626n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f627o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f628p;

    /* renamed from: q, reason: collision with root package name */
    public int f629q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(e.L0(context, attributeSet, com.nothing.icon.R.attr.materialButtonStyle, com.nothing.icon.R.style.Widget_MaterialComponents_Button), attributeSet);
        this.f618e = new LinkedHashSet();
        this.f627o = false;
        this.f628p = false;
        Context context2 = getContext();
        TypedArray typedArrayF0 = e.f0(context2, attributeSet, v0.a.f2297h, com.nothing.icon.R.attr.materialButtonStyle, com.nothing.icon.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f626n = typedArrayF0.getDimensionPixelSize(12, 0);
        this.f620g = e.r0(typedArrayF0.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f621h = e.J(getContext(), typedArrayF0, 14);
        this.f622i = e.N(getContext(), typedArrayF0, 10);
        this.f629q = typedArrayF0.getInteger(11, 1);
        this.k = typedArrayF0.getDimensionPixelSize(13, 0);
        c cVar = new c(this, new k(k.b(context2, attributeSet, com.nothing.icon.R.attr.materialButtonStyle, com.nothing.icon.R.style.Widget_MaterialComponents_Button)));
        this.f617d = cVar;
        cVar.f3c = typedArrayF0.getDimensionPixelOffset(1, 0);
        cVar.f4d = typedArrayF0.getDimensionPixelOffset(2, 0);
        cVar.f5e = typedArrayF0.getDimensionPixelOffset(3, 0);
        cVar.f6f = typedArrayF0.getDimensionPixelOffset(4, 0);
        if (typedArrayF0.hasValue(8)) {
            int dimensionPixelSize = typedArrayF0.getDimensionPixelSize(8, -1);
            cVar.f7g = dimensionPixelSize;
            k kVar = cVar.f2b;
            float f2 = dimensionPixelSize;
            kVar.getClass();
            j jVar = new j(kVar);
            jVar.f1378e = new i1.a(f2);
            jVar.f1379f = new i1.a(f2);
            jVar.f1380g = new i1.a(f2);
            jVar.f1381h = new i1.a(f2);
            cVar.c(new k(jVar));
            cVar.f15p = true;
        }
        cVar.f8h = typedArrayF0.getDimensionPixelSize(20, 0);
        cVar.f9i = e.r0(typedArrayF0.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        cVar.f10j = e.J(getContext(), typedArrayF0, 6);
        cVar.k = e.J(getContext(), typedArrayF0, 19);
        cVar.f11l = e.J(getContext(), typedArrayF0, 16);
        cVar.f16q = typedArrayF0.getBoolean(5, false);
        cVar.f19t = typedArrayF0.getDimensionPixelSize(9, 0);
        cVar.f17r = typedArrayF0.getBoolean(21, true);
        int[] iArr = f0.a;
        int iF = s.f(this);
        int paddingTop = getPaddingTop();
        int iE = s.e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayF0.hasValue(0)) {
            cVar.f14o = true;
            setSupportBackgroundTintList(cVar.f10j);
            setSupportBackgroundTintMode(cVar.f9i);
        } else {
            cVar.e();
        }
        s.k(this, iF + cVar.f3c, paddingTop + cVar.f5e, iE + cVar.f4d, paddingBottom + cVar.f6f);
        typedArrayF0.recycle();
        setCompoundDrawablePadding(this.f626n);
        c(this.f622i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f617d;
        return (cVar == null || cVar.f14o) ? false : true;
    }

    public final void b() {
        int i2 = this.f629q;
        if (i2 == 1 || i2 == 2) {
            p.e(this, this.f622i, null, null, null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            p.e(this, null, null, this.f622i, null);
            return;
        }
        if (i2 == 16 || i2 == 32) {
            p.e(this, null, this.f622i, null, null);
        }
    }

    public final void c(boolean z2) {
        Drawable drawable = this.f622i;
        boolean z3 = true;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f622i = drawableMutate;
            b.h(drawableMutate, this.f621h);
            PorterDuff.Mode mode = this.f620g;
            if (mode != null) {
                b.i(this.f622i, mode);
            }
            int intrinsicWidth = this.k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f622i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f622i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f622i;
            int i2 = this.f624l;
            int i3 = this.f625m;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f622i.setVisible(true, z2);
        }
        if (z2) {
            b();
            return;
        }
        Drawable[] drawableArrA = p.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        int i4 = this.f629q;
        if (!(i4 == 1 || i4 == 2) || drawable3 == this.f622i) {
            if (!(i4 == 3 || i4 == 4) || drawable5 == this.f622i) {
                if (!(i4 == 16 || i4 == 32) || drawable4 == this.f622i) {
                    z3 = false;
                }
            }
        }
        if (z3) {
            b();
        }
    }

    public final void d(int i2, int i3) {
        if (this.f622i == null || getLayout() == null) {
            return;
        }
        int i4 = this.f629q;
        if (!(i4 == 1 || i4 == 2)) {
            if (!(i4 == 3 || i4 == 4)) {
                if (i4 != 16 && i4 != 32) {
                    z = false;
                }
                if (z) {
                    this.f624l = 0;
                    if (i4 == 16) {
                        this.f625m = 0;
                        c(false);
                        return;
                    }
                    int intrinsicHeight = this.k;
                    if (intrinsicHeight == 0) {
                        intrinsicHeight = this.f622i.getIntrinsicHeight();
                    }
                    int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f626n) - getPaddingBottom()) / 2);
                    if (this.f625m != iMax) {
                        this.f625m = iMax;
                        c(false);
                    }
                    return;
                }
                return;
            }
        }
        this.f625m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f629q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f624l = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f622i.getIntrinsicWidth();
        }
        int textLayoutWidth = i2 - getTextLayoutWidth();
        int[] iArr = f0.a;
        int iE = (((textLayoutWidth - s.e(this)) - intrinsicWidth) - this.f626n) - s.f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iE /= 2;
        }
        if ((s.d(this) == 1) != (this.f629q == 4)) {
            iE = -iE;
        }
        if (this.f624l != iE) {
            this.f624l = iE;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f623j)) {
            return this.f623j;
        }
        c cVar = this.f617d;
        return (cVar != null && cVar.f16q ? CompoundButton.class : Button.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f617d.f7g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f622i;
    }

    public int getIconGravity() {
        return this.f629q;
    }

    public int getIconPadding() {
        return this.f626n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.f621h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f620g;
    }

    public int getInsetBottom() {
        return this.f617d.f6f;
    }

    public int getInsetTop() {
        return this.f617d.f5e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f617d.f11l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f617d.f2b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f617d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f617d.f8h;
        }
        return 0;
    }

    @Override // g.q
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f617d.f10j : super.getSupportBackgroundTintList();
    }

    @Override // g.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f617d.f9i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f627o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            e.C0(this, this.f617d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        c cVar = this.f617d;
        if (cVar != null && cVar.f16q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f615r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f616s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // g.q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // g.q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f617d;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f16q);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // g.q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a1.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a1.b bVar = (a1.b) parcelable;
        super.onRestoreInstanceState(bVar.a);
        setChecked(bVar.f1c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        a1.b bVar = new a1.b(super.onSaveInstanceState());
        bVar.f1c = this.f627o;
        return bVar;
    }

    @Override // g.q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f617d.f17r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f622i != null) {
            if (this.f622i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f623j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!a()) {
            super.setBackgroundColor(i2);
            return;
        }
        c cVar = this.f617d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i2);
        }
    }

    @Override // g.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            c cVar = this.f617d;
            cVar.f14o = true;
            ColorStateList colorStateList = cVar.f10j;
            MaterialButton materialButton = cVar.a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(cVar.f9i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // g.q, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? e.M(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (a()) {
            this.f617d.f16q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        c cVar = this.f617d;
        if ((cVar != null && cVar.f16q) && isEnabled() && this.f627o != z2) {
            this.f627o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f627o;
                if (!materialButtonToggleGroup.f634f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f628p) {
                return;
            }
            this.f628p = true;
            Iterator it = this.f618e.iterator();
            if (it.hasNext()) {
                androidx.activity.result.a.d(it.next());
                throw null;
            }
            this.f628p = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (a()) {
            c cVar = this.f617d;
            if (cVar.f15p && cVar.f7g == i2) {
                return;
            }
            cVar.f7g = i2;
            cVar.f15p = true;
            k kVar = cVar.f2b;
            float f2 = i2;
            kVar.getClass();
            j jVar = new j(kVar);
            jVar.f1378e = new i1.a(f2);
            jVar.f1379f = new i1.a(f2);
            jVar.f1380g = new i1.a(f2);
            jVar.f1381h = new i1.a(f2);
            cVar.c(new k(jVar));
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (a()) {
            this.f617d.b(false).i(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f622i != drawable) {
            this.f622i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f629q != i2) {
            this.f629q = i2;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f626n != i2) {
            this.f626n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? e.M(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.k != i2) {
            this.k = i2;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f621h != colorStateList) {
            this.f621h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f620g != mode) {
            this.f620g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(s.c.a(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        c cVar = this.f617d;
        cVar.d(cVar.f5e, i2);
    }

    public void setInsetTop(int i2) {
        c cVar = this.f617d;
        cVar.d(i2, cVar.f6f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f619f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.f619f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((f) aVar).f875b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f617d;
            if (cVar.f11l != colorStateList) {
                cVar.f11l = colorStateList;
                MaterialButton materialButton = cVar.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (a()) {
            setRippleColor(s.c.a(getContext(), i2));
        }
    }

    @Override // i1.v
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f617d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (a()) {
            c cVar = this.f617d;
            cVar.f13n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f617d;
            if (cVar.k != colorStateList) {
                cVar.k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (a()) {
            setStrokeColor(s.c.a(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (a()) {
            c cVar = this.f617d;
            if (cVar.f8h != i2) {
                cVar.f8h = i2;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // g.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f617d;
        if (cVar.f10j != colorStateList) {
            cVar.f10j = colorStateList;
            if (cVar.b(false) != null) {
                b.h(cVar.b(false), cVar.f10j);
            }
        }
    }

    @Override // g.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f617d;
        if (cVar.f9i != mode) {
            cVar.f9i = mode;
            if (cVar.b(false) == null || cVar.f9i == null) {
                return;
            }
            b.i(cVar.b(false), cVar.f9i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f617d.f17r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f627o);
    }
}
