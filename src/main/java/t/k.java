package t;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class k {
    public final Resources a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f2261b;

    public k(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.f2261b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && a0.b.a(this.f2261b, kVar.f2261b);
    }

    public final int hashCode() {
        return a0.b.b(this.a, this.f2261b);
    }
}
