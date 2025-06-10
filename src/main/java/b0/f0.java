package b0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.nothing.icon.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class f0 {
    public static final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f480b;

    static {
        new AtomicInteger(1);
        a = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        new m();
        f480b = new o();
    }

    public static CharSequence a(View view) {
        return (CharSequence) new n(R.id.tag_accessibility_pane_title, 8, 28, 1).b(view);
    }

    public static ArrayList b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void c(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (u.a(view) != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                u.g(accessibilityEventObtain, i2);
                if (z2) {
                    accessibilityEventObtain.getText().add(a(view));
                    if (r.c(view) == 0) {
                        r.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (r.c((View) parent) == 4) {
                            r.s(view, 2);
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        u.e(view.getParent(), view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            u.g(accessibilityEventObtain2, i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(a(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void d(View view, int i2) {
        ArrayList arrayListB = b(view);
        for (int i3 = 0; i3 < arrayListB.size(); i3++) {
            if (((c0.f) arrayListB.get(i3)).a() == i2) {
                arrayListB.remove(i3);
                return;
            }
        }
    }

    public static void e(View view, c0.f fVar, c0.t tVar) {
        c0.f fVar2 = new c0.f(null, fVar.f524b, null, tVar, fVar.f525c);
        View.AccessibilityDelegate accessibilityDelegateA = c0.a(view);
        c cVar = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof a ? ((a) accessibilityDelegateA).a : new c(accessibilityDelegateA);
        if (cVar == null) {
            cVar = new c();
        }
        f(view, cVar);
        d(view, fVar2.a());
        b(view).add(fVar2);
        c(view, 0);
    }

    public static void f(View view, c cVar) {
        if (cVar == null && (c0.a(view) instanceof a)) {
            cVar = new c();
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.f479b);
    }

    public static void g(View view, CharSequence charSequence) {
        new n(R.id.tag_accessibility_pane_title, 8, 28, true ? 1 : 0).c(view, charSequence);
        o oVar = f480b;
        if (charSequence == null) {
            oVar.a.remove(view);
            view.removeOnAttachStateChangeListener(oVar);
            r.o(view.getViewTreeObserver(), oVar);
        } else {
            oVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(oVar);
            if (u.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(oVar);
            }
        }
    }
}
