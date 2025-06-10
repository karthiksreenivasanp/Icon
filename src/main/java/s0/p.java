package s0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final n a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2239b;

    public p(ViewGroup viewGroup, n nVar) {
        this.a = nVar;
        this.f2239b = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e9 A[EDGE_INSN: B:146:0x01e9->B:95:0x01e9 BREAK  A[LOOP:1: B:19:0x0087->B:94:0x01e1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.p.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f2239b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        q.f2241c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) q.b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n) it.next()).v(viewGroup);
            }
        }
        this.a.h(true);
    }
}
