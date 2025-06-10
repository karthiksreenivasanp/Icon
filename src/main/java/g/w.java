package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public abstract class w extends EditText {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f1242b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.activity.result.d f1243c;

    /* renamed from: d, reason: collision with root package name */
    public v f1244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.editTextStyle);
        m2.a(context);
        l2.a(this, getContext());
        p pVar = new p(this);
        this.a = pVar;
        pVar.d(attributeSet, R.attr.editTextStyle);
        i0 i0Var = new i0(this);
        this.f1242b = i0Var;
        i0Var.f(attributeSet, R.attr.editTextStyle);
        i0Var.b();
        androidx.activity.result.d dVar = new androidx.activity.result.d(this);
        this.f1243c = dVar;
        dVar.b(attributeSet, R.attr.editTextStyle);
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

    private v getSuperCaller() {
        if (this.f1244d == null) {
            this.f1244d = new v(this);
        }
        return this.f1244d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.a;
        if (pVar != null) {
            pVar.a();
        }
        i0 i0Var = this.f1242b;
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
        return this.f1242b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1242b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1242b.getClass();
        f1.e.g0(this, editorInfo, inputConnectionOnCreateInputConnection);
        k0.b bVar = (k0.b) this.f1243c.f30c;
        if (inputConnectionOnCreateInputConnection != null) {
            return bVar.a.j(inputConnectionOnCreateInputConnection, editorInfo);
        }
        bVar.getClass();
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        return super.onTextContextMenuItem(i2);
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
        i0 i0Var = this.f1242b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1242b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((k0.b) this.f1243c.f30c).a.h(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1243c.a(keyListener));
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
        i0 i0Var = this.f1242b;
        i0Var.h(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1242b;
        i0Var.i(mode);
        i0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i0 i0Var = this.f1242b;
        if (i0Var != null) {
            i0Var.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }
}
