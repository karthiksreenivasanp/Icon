package w0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2316b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f2317c;

    /* renamed from: d, reason: collision with root package name */
    public int f2318d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2319e = 1;

    public c(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.f2316b = 300L;
        this.f2317c = null;
        this.a = j2;
        this.f2316b = j3;
        this.f2317c = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f2317c;
        return timeInterpolator != null ? timeInterpolator : a.f2312b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && this.f2316b == cVar.f2316b && this.f2318d == cVar.f2318d && this.f2319e == cVar.f2319e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.f2316b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f2318d) * 31) + this.f2319e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.a + " duration: " + this.f2316b + " interpolator: " + a().getClass() + " repeatCount: " + this.f2318d + " repeatMode: " + this.f2319e + "}\n";
    }
}
