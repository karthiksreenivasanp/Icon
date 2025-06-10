package g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public abstract class o extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1181d = {R.attr.popupBackground};
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f1182b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.activity.result.d f1183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, com.nothing.icon.R.attr.autoCompleteTextViewStyle);
        m2.a(context);
        l2.a(this, getContext());
        f2 f2VarM = f2.m(getContext(), attributeSet, f1181d, com.nothing.icon.R.attr.autoCompleteTextViewStyle);
        if (f2VarM.k(0)) {
            setDropDownBackgroundDrawable(f2VarM.e(0));
        }
        f2VarM.n();
        p pVar = new p(this);
        this.a = pVar;
        pVar.d(attributeSet, com.nothing.icon.R.attr.autoCompleteTextViewStyle);
        i0 i0Var = new i0(this);
        this.f1182b = i0Var;
        i0Var.f(attributeSet, com.nothing.icon.R.attr.autoCompleteTextViewStyle);
        i0Var.b();
        androidx.activity.result.d dVar = new androidx.activity.result.d(this);
        this.f1183c = dVar;
        dVar.b(attributeSet, com.nothing.icon.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = dVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.a;
        if (pVar != null) {
            pVar.a();
        }
        i0 i0Var = this.f1182b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1182b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1182b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        f1.e.g0(this, editorInfo, inputConnectionOnCreateInputConnection);
        k0.b bVar = (k0.b) this.f1183c.f30c;
        if (inputConnectionOnCreateInputConnection != null) {
            return bVar.a.j(inputConnectionOnCreateInputConnection, editorInfo);
        }
        bVar.getClass();
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.a;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        p pVar = this.a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1182b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1182b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(f1.e.M(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((k0.b) this.f1183c.f30c).a.h(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1183c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i0 i0Var = this.f1182b;
        i0Var.h(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1182b;
        i0Var.i(mode);
        i0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i0 i0Var = this.f1182b;
        if (i0Var != null) {
            i0Var.g(context, i2);
        }
    }
}
