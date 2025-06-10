package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import b0.f0;
import b0.s;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.nothing.icon.R;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f747b;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f747b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        int[] iArr = f0.a;
        editText.setId(s.a());
        s.h(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f747b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z2) {
        Chip chip = this.a;
        chip.setChecked(z2);
        int i2 = z2 ? 0 : 4;
        EditText editText = this.f747b;
        editText.setVisibility(i2);
        int i3 = 8;
        chip.setVisibility(z2 ? 8 : 0);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new d.a(i3, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i2, Object obj) {
        this.a.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.a.toggle();
    }
}
