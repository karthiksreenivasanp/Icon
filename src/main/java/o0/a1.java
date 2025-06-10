package o0;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a1 extends b0.c {

    /* renamed from: d, reason: collision with root package name */
    public final b1 f1977d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f1978e = new WeakHashMap();

    public a1(b1 b1Var) {
        this.f1977d = b1Var;
    }

    @Override // b0.c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        b0.c cVar = (b0.c) this.f1978e.get(view);
        return cVar != null ? cVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
    }

    @Override // b0.c
    public final f.f b(View view) {
        b0.c cVar = (b0.c) this.f1978e.get(view);
        return cVar != null ? cVar.b(view) : super.b(view);
    }

    @Override // b0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        b0.c cVar = (b0.c) this.f1978e.get(view);
        if (cVar != null) {
            cVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // b0.c
    public final void d(View view, c0.g gVar) {
        b1 b1Var = this.f1977d;
        RecyclerView recyclerView = b1Var.f1982d;
        boolean z2 = true;
        if (recyclerView.f432p && !recyclerView.f439w) {
            if (!(recyclerView.f412c.f1979b.size() > 0)) {
                z2 = false;
            }
        }
        if (!z2) {
            RecyclerView recyclerView2 = b1Var.f1982d;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().J(view, gVar);
                b0.c cVar = (b0.c) this.f1978e.get(view);
                if (cVar != null) {
                    cVar.d(view, gVar);
                    return;
                }
            }
        }
        this.a.onInitializeAccessibilityNodeInfo(view, gVar.a);
    }

    @Override // b0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        b0.c cVar = (b0.c) this.f1978e.get(view);
        if (cVar != null) {
            cVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // b0.c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        b0.c cVar = (b0.c) this.f1978e.get(viewGroup);
        return cVar != null ? cVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @Override // b0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            o0.b1 r0 = r5.f1977d
            androidx.recyclerview.widget.RecyclerView r1 = r0.f1982d
            boolean r2 = r1.f432p
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L20
            boolean r2 = r1.f439w
            if (r2 != 0) goto L20
            o0.b r1 = r1.f412c
            java.util.ArrayList r1 = r1.f1979b
            int r1 = r1.size()
            if (r1 <= 0) goto L1a
            r1 = r4
            goto L1b
        L1a:
            r1 = r3
        L1b:
            if (r1 == 0) goto L1e
            goto L20
        L1e:
            r1 = r3
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 != 0) goto L4c
            androidx.recyclerview.widget.RecyclerView r0 = r0.f1982d
            o0.l0 r1 = r0.getLayoutManager()
            if (r1 == 0) goto L4c
            java.util.WeakHashMap r1 = r5.f1978e
            java.lang.Object r1 = r1.get(r6)
            b0.c r1 = (b0.c) r1
            if (r1 == 0) goto L3c
            boolean r5 = r1.g(r6, r7, r8)
            if (r5 == 0) goto L43
            return r4
        L3c:
            boolean r5 = super.g(r6, r7, r8)
            if (r5 == 0) goto L43
            return r4
        L43:
            o0.l0 r5 = r0.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r5 = r5.f2046b
            o0.s0 r5 = r5.a
            return r3
        L4c:
            boolean r5 = super.g(r6, r7, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a1.g(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // b0.c
    public final void h(View view, int i2) {
        b0.c cVar = (b0.c) this.f1978e.get(view);
        if (cVar != null) {
            cVar.h(view, i2);
        } else {
            super.h(view, i2);
        }
    }

    @Override // b0.c
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        b0.c cVar = (b0.c) this.f1978e.get(view);
        if (cVar != null) {
            cVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
