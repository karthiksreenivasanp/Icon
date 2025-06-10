package u;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2276e = new c(0, 0, 0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2277b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2278c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2279d;

    public c(int i2, int i3, int i4, int i5) {
        this.a = i2;
        this.f2277b = i3;
        this.f2278c = i4;
        this.f2279d = i5;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.a, cVar2.a), Math.max(cVar.f2277b, cVar2.f2277b), Math.max(cVar.f2278c, cVar2.f2278c), Math.max(cVar.f2279d, cVar2.f2279d));
    }

    public static c b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2276e : new c(i2, i3, i4, i5);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.a, this.f2277b, this.f2278c, this.f2279d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2279d == cVar.f2279d && this.a == cVar.a && this.f2278c == cVar.f2278c && this.f2277b == cVar.f2277b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.f2277b) * 31) + this.f2278c) * 31) + this.f2279d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.f2277b + ", right=" + this.f2278c + ", bottom=" + this.f2279d + '}';
    }
}
