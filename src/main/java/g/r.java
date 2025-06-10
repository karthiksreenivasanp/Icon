package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public abstract class r extends CheckBox {
    public final s a;

    /* renamed from: b, reason: collision with root package name */
    public final p f1206b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f1207c;

    /* renamed from: d, reason: collision with root package name */
    public x f1208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iH;
        int iH2;
        super(context, attributeSet, R.attr.chipStyle);
        m2.a(context);
        l2.a(this, getContext());
        this.a = new s(this);
        Context context2 = getContext();
        int[] iArr = b.a.f466j;
        f2 f2VarM = f2.m(context2, attributeSet, iArr, R.attr.chipStyle);
        Context context3 = getContext();
        TypedArray typedArray = (TypedArray) f2VarM.f1077b;
        int[] iArr2 = b0.f0.a;
        b0.c0.c(this, context3, iArr, attributeSet, typedArray, R.attr.chipStyle, 0);
        boolean z2 = true;
        try {
            if (!f2VarM.k(1) || (iH2 = f2VarM.h(1, 0)) == 0) {
                z2 = false;
            } else {
                try {
                    setButtonDrawable(f1.e.M(getContext(), iH2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z2 && f2VarM.k(0) && (iH = f2VarM.h(0, 0)) != 0) {
                setButtonDrawable(f1.e.M(getContext(), iH));
            }
            if (f2VarM.k(2)) {
                f0.b.c(this, f2VarM.b(2));
            }
            if (f2VarM.k(3)) {
                f0.b.d(this, s0.a(f2VarM.g(3, -1), null));
            }
            f2VarM.n();
            p pVar = new p(this);
            this.f1206b = pVar;
            pVar.d(attributeSet, R.attr.chipStyle);
            i0 i0Var = new i0(this);
            this.f1207c = i0Var;
            i0Var.f(attributeSet, R.attr.chipStyle);
            getEmojiTextViewHelper().a(attributeSet, R.attr.chipStyle);
        } catch (Throwable th) {
            f2VarM.n();
            throw th;
        }
    }

    private x getEmojiTextViewHelper() {
        if (this.f1208d == null) {
            this.f1208d = new x(this);
        }
        return this.f1208d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f1206b;
        if (pVar != null) {
            pVar.a();
        }
        i0 i0Var = this.f1207c;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        s sVar = this.a;
        if (sVar != null) {
            sVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f1206b;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f1206b;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        s sVar = this.a;
        if (sVar != null) {
            return sVar.f1210b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        s sVar = this.a;
        if (sVar != null) {
            return sVar.f1211c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1207c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1207c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((i1.e) getEmojiTextViewHelper().f1247b.f875b).g(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f1206b;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        p pVar = this.f1206b;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(f1.e.M(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1207c;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1207c;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((i1.e) getEmojiTextViewHelper().f1247b.f875b).h(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((i1.e) getEmojiTextViewHelper().f1247b.f875b).b(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f1206b;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1206b;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        s sVar = this.a;
        if (sVar != null) {
            sVar.f1210b = colorStateList;
            sVar.f1212d = true;
            sVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        s sVar = this.a;
        if (sVar != null) {
            sVar.f1211c = mode;
            sVar.f1213e = true;
            sVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i0 i0Var = this.f1207c;
        i0Var.h(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1207c;
        i0Var.i(mode);
        i0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        s sVar = this.a;
        if (sVar != null) {
            if (sVar.f1214f) {
                sVar.f1214f = false;
            } else {
                sVar.f1214f = true;
                sVar.a();
            }
        }
    }
}
