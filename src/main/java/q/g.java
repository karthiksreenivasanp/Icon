package q;

import android.view.View;
import b0.f0;
import b0.x;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class g implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i2) {
        this.a = i2;
    }

    public final int a(View view, View view2) {
        switch (this.a) {
            case 0:
                int[] iArr = f0.a;
                float fM = x.m(view);
                float fM2 = x.m(view2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r4 != false) goto L19;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L46
        L6:
            o0.r r5 = (o0.r) r5
            o0.r r6 = (o0.r) r6
            androidx.recyclerview.widget.RecyclerView r4 = r5.f2088d
            r0 = 0
            r1 = 1
            if (r4 != 0) goto L12
            r2 = r1
            goto L13
        L12:
            r2 = r0
        L13:
            androidx.recyclerview.widget.RecyclerView r3 = r6.f2088d
            if (r3 != 0) goto L19
            r3 = r1
            goto L1a
        L19:
            r3 = r0
        L1a:
            if (r2 == r3) goto L1f
            if (r4 != 0) goto L27
            goto L29
        L1f:
            boolean r4 = r5.a
            boolean r2 = r6.a
            if (r4 == r2) goto L2b
            if (r4 == 0) goto L29
        L27:
            r0 = -1
            goto L3c
        L29:
            r0 = r1
            goto L3c
        L2b:
            int r4 = r6.f2086b
            int r1 = r5.f2086b
            int r4 = r4 - r1
            if (r4 == 0) goto L34
        L32:
            r0 = r4
            goto L3c
        L34:
            int r4 = r5.f2087c
            int r5 = r6.f2087c
            int r4 = r4 - r5
            if (r4 == 0) goto L3c
            goto L32
        L3c:
            return r0
        L3d:
            android.view.View r5 = (android.view.View) r5
            android.view.View r6 = (android.view.View) r6
            int r4 = r4.a(r5, r6)
            return r4
        L46:
            android.view.View r5 = (android.view.View) r5
            android.view.View r6 = (android.view.View) r6
            int r4 = r4.a(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q.g.compare(java.lang.Object, java.lang.Object):int");
    }
}
