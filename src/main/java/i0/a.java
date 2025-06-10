package i0;

import android.view.accessibility.AccessibilityNodeInfo;
import c0.g;
import f.f;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.d f1310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c1.d dVar) {
        super(13);
        this.f1310c = dVar;
    }

    @Override // f.f
    public final g k(int i2) {
        return new g(AccessibilityNodeInfo.obtain(this.f1310c.n(i2).a));
    }

    @Override // f.f
    public final g l(int i2) {
        c1.d dVar = this.f1310c;
        int i3 = i2 == 2 ? dVar.k : dVar.f541l;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return k(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    @Override // f.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(int r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            c1.d r5 = r5.f1310c
            android.view.View r0 = r5.f539i
            r1 = -1
            if (r6 == r1) goto L85
            r8 = 1
            if (r7 == r8) goto L80
            r1 = 2
            if (r7 == r1) goto L7b
            r1 = 64
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r7 == r1) goto L50
            r1 = 128(0x80, float:1.8E-43)
            if (r7 == r1) goto L40
            r0 = 16
            if (r7 != r0) goto L3e
            com.google.android.material.chip.Chip r5 = r5.f543n
            if (r6 != 0) goto L28
            boolean r5 = r5.performClick()
            goto L8b
        L28:
            if (r6 != r8) goto L3e
            r5.playSoundEffect(r4)
            android.view.View$OnClickListener r6 = r5.f645h
            if (r6 == 0) goto L35
            r6.onClick(r5)
            r4 = r8
        L35:
            boolean r6 = r5.f655s
            if (r6 == 0) goto L3e
            c1.d r5 = r5.f654r
            r5.q(r8, r8)
        L3e:
            r5 = r4
            goto L8b
        L40:
            int r7 = r5.k
            if (r7 != r6) goto L4d
            r5.k = r3
            r0.invalidate()
            r5.q(r6, r2)
            goto L4e
        L4d:
            r8 = r4
        L4e:
            r5 = r8
            goto L8b
        L50:
            android.view.accessibility.AccessibilityManager r7 = r5.f538h
            boolean r1 = r7.isEnabled()
            if (r1 == 0) goto L4d
            boolean r7 = r7.isTouchExplorationEnabled()
            if (r7 != 0) goto L5f
            goto L4d
        L5f:
            int r7 = r5.k
            if (r7 == r6) goto L4d
            if (r7 == r3) goto L6f
            r5.k = r3
            android.view.View r1 = r5.f539i
            r1.invalidate()
            r5.q(r7, r2)
        L6f:
            r5.k = r6
            r0.invalidate()
            r7 = 32768(0x8000, float:4.5918E-41)
            r5.q(r6, r7)
            goto L4e
        L7b:
            boolean r5 = r5.j(r6)
            goto L8b
        L80:
            boolean r5 = r5.p(r6)
            goto L8b
        L85:
            int[] r5 = b0.f0.a
            boolean r5 = b0.r.j(r0, r7, r8)
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.a.o(int, int, android.os.Bundle):boolean");
    }
}
