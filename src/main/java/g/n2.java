package g;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class n2 {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1178b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1179c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1180d;

    public n2(int i2) {
        if (i2 != 1) {
            return;
        }
        this.f1179c = new SparseIntArray();
        this.f1180d = new SparseIntArray();
        this.a = false;
        this.f1178b = false;
    }

    public final int a(int i2, int i3) {
        if (!this.f1178b) {
            return c(i2, i3);
        }
        int i4 = ((SparseIntArray) this.f1180d).get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int iC = c(i2, i3);
        ((SparseIntArray) this.f1180d).put(i2, iC);
        return iC;
    }

    public final int b(int i2, int i3) {
        if (!this.a) {
            return i2 % i3;
        }
        int i4 = ((SparseIntArray) this.f1179c).get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int i5 = i2 % i3;
        ((SparseIntArray) this.f1179c).put(i2, i5);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f1178b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L48
            java.lang.Object r0 = r8.f1180d
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = r2
        L11:
            if (r5 > r3) goto L22
            int r6 = r5 + r3
            int r6 = r6 >>> r1
            int r7 = r0.keyAt(r6)
            if (r7 >= r9) goto L1f
            int r5 = r6 + 1
            goto L11
        L1f:
            int r3 = r6 + (-1)
            goto L11
        L22:
            int r5 = r5 + r4
            if (r5 < 0) goto L30
            int r3 = r0.size()
            if (r5 >= r3) goto L30
            int r0 = r0.keyAt(r5)
            goto L31
        L30:
            r0 = r4
        L31:
            if (r0 == r4) goto L48
            java.lang.Object r3 = r8.f1180d
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r8 = r8.b(r0, r10)
            int r8 = r8 + r1
            if (r8 != r10) goto L4b
            int r3 = r3 + 1
            r8 = r2
            goto L4b
        L48:
            r8 = r2
            r3 = r8
            r4 = r3
        L4b:
            if (r4 >= r9) goto L5d
            int r8 = r8 + 1
            if (r8 != r10) goto L55
            int r3 = r3 + 1
            r8 = r2
            goto L5a
        L55:
            if (r8 <= r10) goto L5a
            int r3 = r3 + 1
            r8 = r1
        L5a:
            int r4 = r4 + 1
            goto L4b
        L5d:
            int r8 = r8 + r1
            if (r8 <= r10) goto L62
            int r3 = r3 + 1
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.n2.c(int, int):int");
    }

    public final void d() {
        ((SparseIntArray) this.f1179c).clear();
    }
}
