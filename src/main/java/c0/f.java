package c0;

import android.R;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f517e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f518f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f519g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f520h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f521i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f522j;
    public static final f k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f523l;
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f524b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f525c;

    /* renamed from: d, reason: collision with root package name */
    public final t f526d;

    static {
        new f(1);
        new f(2);
        new f(4);
        new f(8);
        f517e = new f(16);
        new f(32);
        new f(64);
        new f(128);
        new f(256, m.class);
        new f(512, m.class);
        new f(1024, n.class);
        new f(2048, n.class);
        f518f = new f(4096);
        f519g = new f(8192);
        new f(16384);
        new f(32768);
        new f(65536);
        new f(131072, r.class);
        f520h = new f(262144);
        f521i = new f(524288);
        f522j = new f(1048576);
        new f(2097152, s.class);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, p.class);
        k = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f523l = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, q.class);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, o.class);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START, R.id.accessibilityActionDragStart, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP, R.id.accessibilityActionDragDrop, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL, R.id.accessibilityActionDragCancel, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, R.id.accessibilityActionShowTextSuggestions, null, null, null);
    }

    public f(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public f(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public f(Object obj, int i2, String str, t tVar, Class cls) {
        this.f524b = i2;
        this.f526d = tVar;
        this.a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, str) : obj;
        this.f525c = cls;
    }
}
