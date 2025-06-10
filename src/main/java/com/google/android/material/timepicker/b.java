package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f748t.f757d) - clockFaceView.B;
        if (height != clockFaceView.f770r) {
            clockFaceView.f770r = height;
            clockFaceView.f();
            int i2 = clockFaceView.f770r;
            ClockHandView clockHandView = clockFaceView.f748t;
            clockHandView.f764l = i2;
            clockHandView.invalidate();
        }
        return true;
    }
}
