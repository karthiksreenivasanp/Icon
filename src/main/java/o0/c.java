package o0;

/* loaded from: classes.dex */
public final class c {
    public long a = 0;

    /* renamed from: b, reason: collision with root package name */
    public c f1984b;

    public final void a(int i2) {
        if (i2 < 64) {
            this.a &= ~(1 << i2);
            return;
        }
        c cVar = this.f1984b;
        if (cVar != null) {
            cVar.a(i2 - 64);
        }
    }

    public final int b(int i2) {
        c cVar = this.f1984b;
        if (cVar == null) {
            if (i2 >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(((1 << i2) - 1) & this.a);
        }
        if (i2 < 64) {
            return Long.bitCount(((1 << i2) - 1) & this.a);
        }
        return Long.bitCount(this.a) + cVar.b(i2 - 64);
    }

    public final void c() {
        if (this.f1984b == null) {
            this.f1984b = new c();
        }
    }

    public final boolean d(int i2) {
        if (i2 < 64) {
            return ((1 << i2) & this.a) != 0;
        }
        c();
        return this.f1984b.d(i2 - 64);
    }

    public final void e(int i2, boolean z2) {
        if (i2 >= 64) {
            c();
            this.f1984b.e(i2 - 64, z2);
            return;
        }
        long j2 = this.a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        this.a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            h(i2);
        } else {
            a(i2);
        }
        if (z3 || this.f1984b != null) {
            c();
            this.f1984b.e(0, z3);
        }
    }

    public final boolean f(int i2) {
        if (i2 >= 64) {
            c();
            return this.f1984b.f(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.a = j4;
        long j5 = j2 - 1;
        this.a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        c cVar = this.f1984b;
        if (cVar != null) {
            if (cVar.d(0)) {
                h(63);
            }
            this.f1984b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.a = 0L;
        c cVar = this.f1984b;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h(int i2) {
        if (i2 < 64) {
            this.a |= 1 << i2;
        } else {
            c();
            this.f1984b.h(i2 - 64);
        }
    }

    public final String toString() {
        if (this.f1984b == null) {
            return Long.toBinaryString(this.a);
        }
        return this.f1984b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}
