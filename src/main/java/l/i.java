package l;

/* loaded from: classes.dex */
public final class i implements Comparable {
    public l a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1566b;

    public i(j jVar) {
        this.f1566b = jVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.f1571b - ((l) obj).f1571b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i2 = 0; i2 < 9; i2++) {
                str = str + this.a.f1577h[i2] + " ";
            }
        }
        return str + "] " + this.a;
    }
}
