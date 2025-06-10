package f;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import b0.f0;

/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f870b;

    public /* synthetic */ d(int i2, Object obj) {
        this.a = i2;
        this.f870b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                l1.o oVar = (l1.o) this.f870b;
                int i2 = l1.o.f1619w;
                if (oVar.f1638u != null && (accessibilityManager = oVar.f1637t) != null) {
                    int[] iArr = f0.a;
                    if (b0.u.b(oVar)) {
                        c0.c.a(accessibilityManager, oVar.f1638u);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i2 = this.a;
        Object obj = this.f870b;
        switch (i2) {
            case 0:
                h hVar = (h) obj;
                ViewTreeObserver viewTreeObserver = hVar.f900y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        hVar.f900y = view.getViewTreeObserver();
                    }
                    hVar.f900y.removeGlobalOnLayoutListener(hVar.f886j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                v vVar = (v) obj;
                ViewTreeObserver viewTreeObserver2 = vVar.f973p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        vVar.f973p = view.getViewTreeObserver();
                    }
                    vVar.f973p.removeGlobalOnLayoutListener(vVar.f968j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                l1.o oVar = (l1.o) obj;
                int i3 = l1.o.f1619w;
                c0.d dVar = oVar.f1638u;
                if (dVar != null && (accessibilityManager = oVar.f1637t) != null) {
                    c0.c.b(accessibilityManager, dVar);
                    break;
                }
                break;
        }
    }
}
