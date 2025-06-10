package c0;

import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public abstract class k {
    public static int a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    public static void c(AccessibilityRecord accessibilityRecord, int i2) {
        accessibilityRecord.setMaxScrollX(i2);
    }

    public static void d(AccessibilityRecord accessibilityRecord, int i2) {
        accessibilityRecord.setMaxScrollY(i2);
    }
}
