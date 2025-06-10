package g;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class l0 extends TextView {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f1162b;

    /* renamed from: c, reason: collision with root package name */
    public x f1163c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1164d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f1165e;

    /* renamed from: f, reason: collision with root package name */
    public Future f1166f;

    public l0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private x getEmojiTextViewHelper() {
        if (this.f1163c == null) {
            this.f1163c = new x(this);
        }
        return this.f1163c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.a;
        if (pVar != null) {
            pVar.a();
        }
        i0 i0Var = this.f1162b;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public j0 getSuperCaller() {
        if (this.f1165e == null) {
            this.f1165e = new k0(this);
        }
        return this.f1165e;
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
        return this.f1162b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1162b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f1166f;
        if (future != null) {
            try {
                this.f1166f = null;
                androidx.activity.result.a.d(future.get());
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public z.c getTextMetricsParamsCompat() {
        return new z.c(f0.r.b(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1162b.getClass();
        f1.e.g0(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        i0 i0Var = this.f1162b;
        if (i0Var != null) {
            i0Var.getClass();
            int i6 = d3.a;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        Future future = this.f1166f;
        if (future != null) {
            try {
                this.f1166f = null;
                androidx.activity.result.a.d(future.get());
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.f1162b != null) {
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1162b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1162b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? f1.e.M(context, i2) : null, i3 != 0 ? f1.e.M(context, i3) : null, i4 != 0 ? f1.e.M(context, i4) : null, i5 != 0 ? f1.e.M(context, i5) : null);
        i0 i0Var = this.f1162b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? f1.e.M(context, i2) : null, i3 != 0 ? f1.e.M(context, i3) : null, i4 != 0 ? f1.e.M(context, i4) : null, i5 != 0 ? f1.e.M(context, i5) : null);
        i0 i0Var = this.f1162b;
        if (i0Var != null) {
            i0Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        getSuperCaller().b(i2);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        getSuperCaller().j(i2);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        f1.e.n(i2);
        if (i2 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(z.d dVar) {
        throw null;
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
        i0 i0Var = this.f1162b;
        i0Var.h(colorStateList);
        i0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i0 i0Var = this.f1162b;
        i0Var.i(mode);
        i0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        i0 i0Var = this.f1162b;
        if (i0Var != null) {
            i0Var.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<z.d> future) {
        this.f1166f = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTextMetricsParamsCompat(z.c r3) {
        /*
            r2 = this;
            android.text.TextDirectionHeuristic r0 = r3.f2375b
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r0 != r1) goto L7
            goto L30
        L7:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 != r1) goto Lc
            goto L30
        Lc:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r0 != r1) goto L12
            r0 = 2
            goto L31
        L12:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LTR
            if (r0 != r1) goto L18
            r0 = 3
            goto L31
        L18:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.RTL
            if (r0 != r1) goto L1e
            r0 = 4
            goto L31
        L1e:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LOCALE
            if (r0 != r1) goto L24
            r0 = 5
            goto L31
        L24:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 != r1) goto L2a
            r0 = 6
            goto L31
        L2a:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r0 != r1) goto L30
            r0 = 7
            goto L31
        L30:
            r0 = 1
        L31:
            f0.p.h(r2, r0)
            android.text.TextPaint r0 = r2.getPaint()
            android.text.TextPaint r1 = r3.a
            r0.set(r1)
            int r0 = r3.f2376c
            f0.q.e(r2, r0)
            int r3 = r3.f2377d
            f0.q.h(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l0.setTextMetricsParamsCompat(z.c):void");
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        int i3 = d3.a;
        super.setTextSize(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (this.f1164d) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            u.h hVar = u.g.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        this.f1164d = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f1164d = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i2);
        m2.a(context);
        this.f1164d = false;
        this.f1165e = null;
        l2.a(this, getContext());
        p pVar = new p(this);
        this.a = pVar;
        pVar.d(attributeSet, i2);
        i0 i0Var = new i0(this);
        this.f1162b = i0Var;
        i0Var.f(attributeSet, i2);
        i0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1162b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        i0 i0Var = this.f1162b;
        if (i0Var != null) {
            i0Var.b();
        }
    }
}
