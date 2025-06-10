package c1;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b0.f0;
import b0.r;
import c0.g;
import c0.l;
import com.google.android.material.chip.Chip;
import com.nothing.icon.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends b0.c {

    /* renamed from: o, reason: collision with root package name */
    public static final Rect f531o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: p, reason: collision with root package name */
    public static final i1.e f532p = new i1.e(5, null);

    /* renamed from: q, reason: collision with root package name */
    public static final i1.e f533q = new i1.e(6, null);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f538h;

    /* renamed from: i, reason: collision with root package name */
    public final View f539i;

    /* renamed from: j, reason: collision with root package name */
    public i0.a f540j;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Chip f543n;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f534d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f535e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f536f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f537g = new int[2];
    public int k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f541l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f542m = Integer.MIN_VALUE;

    public d(Chip chip, Chip chip2) {
        this.f543n = chip;
        if (chip2 == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f539i = chip2;
        this.f538h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        int[] iArr = f0.a;
        if (r.c(chip2) == 0) {
            r.s(chip2, 1);
        }
    }

    @Override // b0.c
    public final f.f b(View view) {
        if (this.f540j == null) {
            this.f540j = new i0.a(this);
        }
        return this.f540j;
    }

    @Override // b0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // b0.c
    public final void d(View view, g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f543n;
        f fVar = chip.f642e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.Q);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        gVar.h(chip.getText());
    }

    public final boolean j(int i2) {
        if (this.f541l != i2) {
            return false;
        }
        this.f541l = Integer.MIN_VALUE;
        if (i2 == 1) {
            Chip chip = this.f543n;
            chip.f649m = false;
            chip.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    public final g k(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f531o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        gVar.f527b = -1;
        View view = this.f539i;
        accessibilityNodeInfoObtain.setParent(view);
        o(i2, gVar);
        if (gVar.e() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f535e;
        gVar.d(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        gVar.f528c = i2;
        accessibilityNodeInfoObtain.setSource(view, i2);
        boolean z2 = false;
        if (this.k == i2) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            gVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            gVar.a(64);
        }
        boolean z3 = this.f541l == i2;
        if (z3) {
            gVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            gVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z3);
        int[] iArr = this.f537g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f534d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            gVar.d(rect3);
            if (gVar.f527b != -1) {
                g gVar2 = new g(AccessibilityNodeInfo.obtain());
                int i3 = gVar.f527b;
                while (true) {
                    accessibilityNodeInfo = gVar2.a;
                    if (i3 == -1) {
                        break;
                    }
                    gVar2.f527b = -1;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i3, gVar2);
                    gVar2.d(rect2);
                    rect3.offset(rect2.left, rect2.top);
                    i3 = gVar2.f527b;
                }
                accessibilityNodeInfo.recycle();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f536f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                gVar.a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    while (true) {
                        Object parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                        } else if (parent != null) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    accessibilityNodeInfoObtain.setVisibleToUser(true);
                }
            }
        }
        return gVar;
    }

    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f639w;
        Chip chip = this.f543n;
        if (chip.c()) {
            f fVar = chip.f642e;
            if (fVar != null && fVar.K) {
                z2 = true;
            }
            if (!z2 || chip.f645h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.d.m(int, android.graphics.Rect):boolean");
    }

    public final g n(int i2) {
        if (i2 != -1) {
            return k(i2);
        }
        View view = this.f539i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        g gVar = new g(accessibilityNodeInfoObtain);
        int[] iArr = f0.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            gVar.a.addChild(view, ((Integer) arrayList.get(i3)).intValue());
        }
        return gVar;
    }

    public final void o(int i2, g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.a;
        if (i2 != 1) {
            gVar.g("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f639w);
            return;
        }
        Chip chip = this.f543n;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription == null) {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            Object[] objArr = new Object[1];
            objArr[0] = TextUtils.isEmpty(text) ? "" : text;
            closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
        }
        gVar.g(closeIconContentDescription);
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        gVar.b(c0.f.f517e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    public final boolean p(int i2) {
        int i3;
        View view = this.f539i;
        if ((view.isFocused() || view.requestFocus()) && (i3 = this.f541l) != i2) {
            if (i3 != Integer.MIN_VALUE) {
                j(i3);
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f541l = i2;
                if (i2 == 1) {
                    Chip chip = this.f543n;
                    chip.f649m = true;
                    chip.refreshDrawableState();
                }
                q(i2, 8);
                return true;
            }
        }
        return false;
    }

    public final void q(int i2, int i3) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i2 == Integer.MIN_VALUE || !this.f538h.isEnabled() || (parent = (view = this.f539i).getParent()) == null) {
            return;
        }
        if (i2 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            g gVarN = n(i2);
            accessibilityEventObtain.getText().add(gVarN.e());
            AccessibilityNodeInfo accessibilityNodeInfo = gVarN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            l.a(accessibilityEventObtain, view, i2);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
