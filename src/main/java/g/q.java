package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public abstract class q extends Button {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f1203b;

    /* renamed from: c, reason: collision with root package name */
    public x f1204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.materialButtonStyle);
        m2.a(context);
        l2.a(this, getContext());
        p pVar = new p(this);
        this.a = pVar;
        pVar.d(attributeSet, R.attr.materialButtonStyle);
        i0 i0Var = new i0(this);
        this.f1203b = i0Var;
        i0Var.f(attributeSet, R.attr.materialButtonStyle);
        i0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.materialButtonStyle);
    }

    private x getEmojiTextViewHelper() {
        if (this.f1204c == null) {
            this.f1204c = new x(this);
        }
        return this.f1204c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.a;
        if (pVar != null) {
            pVar.a();
        }
        i0 i0Var = this.f1203b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        int i2 = d3.a;
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        int i2 = d3.a;
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        int i2 = d3.a;
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        int i2 = d3.a;
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i2 = d3.a;
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
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
        return this.f1203b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1203b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        i0 i0Var = this.f1203b;
        if (i0Var != null) {
            i0Var.getClass();
            int i6 = d3.a;
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.f1203b != null) {
            int i5 = d3.a;
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((i1.e) getEmojiTextViewHelper().f1247b.f875b).g(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        int i6 = d3.a;
        super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        int i3 = d3.a;
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        int i3 = d3.a;
        super.setAutoSizeTextTypeWithDefaults(i2);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((i1.e) getEmojiTextViewHelper().f1247b.f875b).h(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((i1.e) getEmojiTextViewHelper().f1247b.f875b).b(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        i0 i0Var = this.f1203b;
        if (i0Var != null) {
            i0Var.a.setAllCaps(z2);
        }
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
        i0 i0Var = this.f1203b;
        i0Var.h(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1203b;
        i0Var.i(mode);
        i0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i0 i0Var = this.f1203b;
        if (i0Var != null) {
            i0Var.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        int i3 = d3.a;
        super.setTextSize(i2, f2);
    }
}
