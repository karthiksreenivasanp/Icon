package x1;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0);
    }

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.a == cVar.a) {
                    if (this.f2336b == cVar.f2336b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.f2336b + (this.a * 31);
    }

    public final boolean isEmpty() {
        return this.a > this.f2336b;
    }

    public final String toString() {
        return this.a + ".." + this.f2336b;
    }
}
