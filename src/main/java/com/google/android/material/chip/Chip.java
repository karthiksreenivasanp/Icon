package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import b0.f0;
import b0.s;
import c1.b;
import c1.d;
import c1.e;
import c1.f;
import g.r;
import i1.k;
import i1.v;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import v.c;
import z.i;
import z.j;

/* loaded from: classes.dex */
public class Chip extends r implements e, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f639w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f640x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f641y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public f f642e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f643f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f644g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f645h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f646i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f647j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f648l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f649m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f650n;

    /* renamed from: o, reason: collision with root package name */
    public int f651o;

    /* renamed from: p, reason: collision with root package name */
    public int f652p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f653q;

    /* renamed from: r, reason: collision with root package name */
    public final d f654r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f655s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f656t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f657u;

    /* renamed from: v, reason: collision with root package name */
    public final b f658v;

    /* JADX WARN: Removed duplicated region for block: B:101:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f657u;
        rectF.setEmpty();
        if (c() && this.f645h != null) {
            f fVar = this.f642e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f2 = fVar.f547d0 + fVar.f546c0 + fVar.O + fVar.f545b0 + fVar.f544a0;
                if (c.a(fVar) == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i2 = (int) closeIconTouchBounds.left;
        int i3 = (int) closeIconTouchBounds.top;
        int i4 = (int) closeIconTouchBounds.right;
        int i5 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f656t;
        rect.set(i2, i3, i4, i5);
        return rect;
    }

    private f1.d getTextAppearance() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.f554k0.f867f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f648l != z2) {
            this.f648l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.k != z2) {
            this.k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i2) {
        this.f652p = i2;
        if (!this.f650n) {
            InsetDrawable insetDrawable = this.f643f;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f643f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i2 - ((int) this.f642e.f570z));
        int iMax2 = Math.max(0, i2 - this.f642e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f643f;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f643f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i4 = iMax > 0 ? iMax / 2 : 0;
        if (this.f643f != null) {
            Rect rect = new Rect();
            this.f643f.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                e();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f643f = new InsetDrawable((Drawable) this.f642e, i3, i4, i3, i4);
        e();
    }

    public final boolean c() {
        f fVar = this.f642e;
        if (fVar != null) {
            Object obj = fVar.L;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof v.e) {
                ((v.f) ((v.e) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            boolean r0 = r3.c()
            r1 = 0
            if (r0 == 0) goto L20
            c1.f r0 = r3.f642e
            r2 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.K
            if (r0 == 0) goto L12
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L20
            android.view.View$OnClickListener r0 = r3.f645h
            if (r0 == 0) goto L20
            c1.d r0 = r3.f654r
            b0.f0.f(r3, r0)
            r1 = r2
            goto L24
        L20:
            r0 = 0
            b0.f0.f(r3, r0)
        L24:
            r3.f655s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f655s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r11)
            return r10
        L9:
            c1.d r0 = r10.f654r
            android.view.accessibility.AccessibilityManager r1 = r0.f538h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.f542m
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.f542m = r7
            r0.q(r7, r5)
            r0.q(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = r0.f543n
            boolean r9 = r8.c()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = r3
            goto L5f
        L5e:
            r1 = r4
        L5f:
            int r6 = r0.f542m
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.f542m = r1
            r0.q(r1, r5)
            r0.q(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = r3
            goto L71
        L70:
            r0 = r4
        L71:
            if (r0 != 0) goto L7b
            boolean r10 = super.dispatchHoverEvent(r11)
            if (r10 == 0) goto L7a
            goto L7b
        L7a:
            r3 = r4
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f655s
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        L9:
            c1.d r0 = r9.f654r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r3
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.f541l
            if (r1 == r4) goto L85
            com.google.android.material.chip.Chip r5 = r0.f543n
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r3) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.f645h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.f655s
            if (r1 == 0) goto L85
            c1.d r1 = r5.f654r
            r1.q(r3, r3)
        L85:
            r2 = r3
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r3, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f541l
            if (r0 == r4) goto La4
            return r3
        La4:
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // g.r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i2;
        super.drawableStateChanged();
        f fVar = this.f642e;
        boolean zV = false;
        if (fVar != null && f.t(fVar.L)) {
            f fVar2 = this.f642e;
            ?? IsEnabled = isEnabled();
            int i3 = IsEnabled;
            if (this.f649m) {
                i3 = IsEnabled + 1;
            }
            int i4 = i3;
            if (this.f648l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.k) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f649m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f648l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(fVar2.f569y0, iArr)) {
                fVar2.f569y0 = iArr;
                if (fVar2.T()) {
                    zV = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (zV) {
            invalidate();
        }
    }

    public final void e() {
        ColorStateList colorStateListValueOf = this.f642e.D;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.f644g = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        f fVar = this.f642e;
        if (fVar.f571z0) {
            fVar.f571z0 = false;
            fVar.A0 = null;
            fVar.onStateChange(fVar.getState());
        }
        RippleDrawable rippleDrawable = this.f644g;
        int[] iArr = f0.a;
        b0.r.q(this, rippleDrawable);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f642e) == null) {
            return;
        }
        int iQ = (int) (fVar.q() + fVar.f547d0 + fVar.f544a0);
        f fVar2 = this.f642e;
        int iP = (int) (fVar2.p() + fVar2.W + fVar2.Z);
        if (this.f643f != null) {
            Rect rect = new Rect();
            this.f643f.getPadding(rect);
            iP += rect.left;
            iQ += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr = f0.a;
        s.k(this, iP, paddingTop, iQ, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f642e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        f1.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f658v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f653q)) {
            return this.f653q;
        }
        f fVar = this.f642e;
        if (!(fVar != null && fVar.Q)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f643f;
        return insetDrawable == null ? this.f642e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.f568y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f642e;
        if (fVar != null) {
            return Math.max(0.0f, fVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f642e;
    }

    public float getChipEndPadding() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.f547d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f642e;
        if (fVar == null || (drawable = fVar.G) == 0) {
            return null;
        }
        if (!(drawable instanceof v.e)) {
            return drawable;
        }
        ((v.f) ((v.e) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.H;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.f570z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f642e;
        if (fVar == null || (drawable = fVar.L) == 0) {
            return null;
        }
        if (!(drawable instanceof v.e)) {
            return drawable;
        }
        ((v.f) ((v.e) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.f546c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.f545b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f655s) {
            d dVar = this.f654r;
            if (dVar.f541l == 1 || dVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public w0.b getHideMotionSpec() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.V;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.D;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f642e.a.a;
    }

    public w0.b getShowMotionSpec() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.U;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.f544a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f642e;
        if (fVar != null) {
            return fVar.Z;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f1.e.C0(this, this.f642e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f640x);
        }
        f fVar = this.f642e;
        if (fVar != null && fVar.Q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f641y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f655s) {
            d dVar = this.f654r;
            int i3 = dVar.f541l;
            if (i3 != Integer.MIN_VALUE) {
                dVar.j(i3);
            }
            if (z2) {
                dVar.m(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f642e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.Q);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f651o != i2) {
            this.f651o = i2;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.k
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f645h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f655s
            if (r0 == 0) goto L42
            c1.d r0 = r5.f654r
            r0.q(r2, r2)
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f653q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f644g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // g.r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f644g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // g.r, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.w(z2);
        }
    }

    public void setCheckableResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.w(fVar.f548e0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        f fVar = this.f642e;
        if (fVar == null) {
            this.f647j = z2;
        } else if (fVar.Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.x(f1.e.M(fVar.f548e0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.y(s.c.a(fVar.f548e0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.z(fVar.f548e0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f642e;
        if (fVar == null || fVar.f568y == colorStateList) {
            return;
        }
        fVar.f568y = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList colorStateListA;
        f fVar = this.f642e;
        if (fVar == null || fVar.f568y == (colorStateListA = s.c.a(fVar.f548e0, i2))) {
            return;
        }
        fVar.f568y = colorStateListA;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.A(fVar.f548e0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f642e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.B0 = new WeakReference(null);
            }
            this.f642e = fVar;
            fVar.D0 = false;
            fVar.B0 = new WeakReference(this);
            b(this.f652p);
        }
    }

    public void setChipEndPadding(float f2) {
        f fVar = this.f642e;
        if (fVar == null || fVar.f547d0 == f2) {
            return;
        }
        fVar.f547d0 = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipEndPaddingResource(int i2) throws Resources.NotFoundException {
        f fVar = this.f642e;
        if (fVar != null) {
            float dimension = fVar.f548e0.getResources().getDimension(i2);
            if (fVar.f547d0 != dimension) {
                fVar.f547d0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.B(f1.e.M(fVar.f548e0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.C(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.C(fVar.f548e0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.D(s.c.a(fVar.f548e0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.E(fVar.f548e0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f2) {
        f fVar = this.f642e;
        if (fVar == null || fVar.f570z == f2) {
            return;
        }
        fVar.f570z = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipMinHeightResource(int i2) throws Resources.NotFoundException {
        f fVar = this.f642e;
        if (fVar != null) {
            float dimension = fVar.f548e0.getResources().getDimension(i2);
            if (fVar.f570z != dimension) {
                fVar.f570z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        f fVar = this.f642e;
        if (fVar == null || fVar.W == f2) {
            return;
        }
        fVar.W = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipStartPaddingResource(int i2) throws Resources.NotFoundException {
        f fVar = this.f642e;
        if (fVar != null) {
            float dimension = fVar.f548e0.getResources().getDimension(i2);
            if (fVar.W != dimension) {
                fVar.W = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.F(s.c.a(fVar.f548e0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.G(fVar.f548e0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f642e;
        if (fVar == null || fVar.P == charSequence) {
            return;
        }
        String str = z.b.f2369d;
        Locale locale = Locale.getDefault();
        int i2 = j.a;
        z.b bVar = i.a(locale) == 1 ? z.b.f2372g : z.b.f2371f;
        fVar.P = bVar.c(charSequence, bVar.f2374c);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.I(fVar.f548e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.H(f1.e.M(fVar.f548e0, i2));
        }
        d();
    }

    public void setCloseIconSize(float f2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.J(fVar.f548e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.K(fVar.f548e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.L(s.c.a(fVar.f548e0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // g.r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // g.r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f642e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.C0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f650n = z2;
        b(this.f652p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(w0.b bVar) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.V = bVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.V = w0.b.a(fVar.f548e0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.N(fVar.f548e0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.O(fVar.f548e0.getResources().getDimension(i2));
        }
    }

    public void setInternalOnCheckedChangeListener(e1.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f642e == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.E0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f646i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f645h = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        if (this.f642e.f571z0) {
            return;
        }
        e();
    }

    public void setRippleColorResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.P(s.c.a(fVar.f548e0, i2));
            if (this.f642e.f571z0) {
                return;
            }
            e();
        }
    }

    @Override // i1.v
    public void setShapeAppearanceModel(k kVar) {
        this.f642e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(w0.b bVar) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.U = bVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.U = w0.b.a(fVar.f548e0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f642e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.D0 ? null : charSequence, bufferType);
        f fVar2 = this.f642e;
        if (fVar2 == null || TextUtils.equals(fVar2.E, charSequence)) {
            return;
        }
        fVar2.E = charSequence;
        fVar2.f554k0.f865d = true;
        fVar2.invalidateSelf();
        fVar2.u();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.Q(new f1.d(fVar.f548e0, i2));
        }
        g();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        f fVar = this.f642e;
        if (fVar == null || fVar.f544a0 == f2) {
            return;
        }
        fVar.f544a0 = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextEndPaddingResource(int i2) throws Resources.NotFoundException {
        f fVar = this.f642e;
        if (fVar != null) {
            float dimension = fVar.f548e0.getResources().getDimension(i2);
            if (fVar.f544a0 != dimension) {
                fVar.f544a0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        f fVar = this.f642e;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i2, f2, getResources().getDisplayMetrics());
            e1.i iVar = fVar.f554k0;
            f1.d dVar = iVar.f867f;
            if (dVar != null) {
                dVar.k = fApplyDimension;
                iVar.a.setTextSize(fApplyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f2) {
        f fVar = this.f642e;
        if (fVar == null || fVar.Z == f2) {
            return;
        }
        fVar.Z = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextStartPaddingResource(int i2) throws Resources.NotFoundException {
        f fVar = this.f642e;
        if (fVar != null) {
            float dimension = fVar.f548e0.getResources().getDimension(i2);
            if (fVar.Z != dimension) {
                fVar.Z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.M(z2);
        }
        d();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCheckedIconVisible(boolean z2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.Q(new f1.d(fVar.f548e0, i2));
        }
        g();
    }

    public void setTextAppearance(f1.d dVar) {
        f fVar = this.f642e;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        g();
    }
}
