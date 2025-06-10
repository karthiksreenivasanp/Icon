package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class d extends b0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f660d;

    @Override // b0.c
    public final void d(View view, c0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}
