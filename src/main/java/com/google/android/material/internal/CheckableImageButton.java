package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import b0.f0;
import g.y;
import x0.a;

/* loaded from: classes.dex */
public class CheckableImageButton extends y implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f666g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f667d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f668e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f669f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nothing.icon.R.attr.imageButtonStyle);
        this.f668e = true;
        this.f669f = true;
        f0.f(this, new a(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f667d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f667d ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f666g) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e1.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e1.a aVar = (e1.a) parcelable;
        super.onRestoreInstanceState(aVar.a);
        setChecked(aVar.f815c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e1.a aVar = new e1.a(super.onSaveInstanceState());
        aVar.f815c = this.f667d;
        return aVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f668e != z2) {
            this.f668e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f668e || this.f667d == z2) {
            return;
        }
        this.f667d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f669f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f669f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f667d);
    }
}
