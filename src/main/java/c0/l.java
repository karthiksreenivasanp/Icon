package c0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public abstract class l {
    public static void a(AccessibilityRecord accessibilityRecord, View view, int i2) {
        accessibilityRecord.setSource(view, i2);
    }
}
