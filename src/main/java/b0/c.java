package b0;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f478c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;

    /* renamed from: b, reason: collision with root package name */
    public final a f479b;

    public c() {
        this(f478c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public f.f b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.a, view);
        if (accessibilityNodeProviderA != null) {
            return new f.f(13, accessibilityNodeProviderA);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, c0.g gVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, gVar.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = 2131231104(0x7f080180, float:1.807828E38)
            java.lang.Object r0 = r7.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            r1 = 0
            r2 = r1
        L11:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L55
            java.lang.Object r3 = r0.get(r2)
            c0.f r3 = (c0.f) r3
            int r5 = r3.a()
            if (r5 != r8) goto L52
            c0.t r0 = r3.f526d
            if (r0 == 0) goto L55
            java.lang.Class r2 = r3.f525c
            if (r2 != 0) goto L2d
            goto L4d
        L2d:
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Constructor r3 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3d
            java.lang.Object r3 = r3.newInstance(r5)     // Catch: java.lang.Exception -> L3d
            androidx.activity.result.a.d(r3)     // Catch: java.lang.Exception -> L3d
            throw r4     // Catch: java.lang.Exception -> L3d
        L3d:
            r3 = move-exception
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r2, r3)
        L4d:
            boolean r0 = r0.c(r7)
            goto L56
        L52:
            int r2 = r2 + 1
            goto L11
        L55:
            r0 = r1
        L56:
            if (r0 != 0) goto L5e
            android.view.View$AccessibilityDelegate r6 = r6.a
            boolean r0 = b0.b.b(r6, r7, r8, r9)
        L5e:
            if (r0 != 0) goto Lc1
            r6 = 2131230735(0x7f08000f, float:1.8077531E38)
            if (r8 != r6) goto Lc1
            if (r9 == 0) goto Lc1
            java.lang.String r6 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r8 = -1
            int r6 = r9.getInt(r6, r8)
            r8 = 2131231105(0x7f080181, float:1.8078282E38)
            java.lang.Object r8 = r7.getTag(r8)
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            if (r8 == 0) goto Lc0
            java.lang.Object r6 = r8.get(r6)
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            if (r6 == 0) goto Lc0
            java.lang.Object r6 = r6.get()
            android.text.style.ClickableSpan r6 = (android.text.style.ClickableSpan) r6
            r8 = 1
            if (r6 == 0) goto Lb9
            android.view.accessibility.AccessibilityNodeInfo r9 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r9 = r9.getText()
            boolean r0 = r9 instanceof android.text.Spanned
            if (r0 == 0) goto La6
            r0 = r9
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r9 = r9.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r9 = r0.getSpans(r1, r9, r2)
            r4 = r9
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        La6:
            r9 = r1
        La7:
            if (r4 == 0) goto Lb9
            int r0 = r4.length
            if (r9 >= r0) goto Lb9
            r0 = r4[r9]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb6
            r9 = r8
            goto Lba
        Lb6:
            int r9 = r9 + 1
            goto La7
        Lb9:
            r9 = r1
        Lba:
            if (r9 == 0) goto Lc0
            r6.onClick(r7)
            r1 = r8
        Lc0:
            r0 = r1
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i2) {
        this.a.sendAccessibilityEvent(view, i2);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.f479b = new a(this);
    }
}
