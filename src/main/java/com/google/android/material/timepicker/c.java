package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class c extends b0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f768d;

    public c(ClockFaceView clockFaceView) {
        this.f768d = clockFaceView;
    }

    @Override // b0.c
    public final void d(View view, c0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f768d.f752x.get(iIntValue - 1));
        }
        gVar.f(androidx.fragment.app.h.a(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(c0.f.f517e);
    }

    @Override // b0.c
    public final boolean g(View view, int i2, Bundle bundle) {
        if (i2 != 16) {
            return super.g(view, i2, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f768d;
        view.getHitRect(clockFaceView.f749u);
        float fCenterX = clockFaceView.f749u.centerX();
        float fCenterY = clockFaceView.f749u.centerY();
        clockFaceView.f748t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f748t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
