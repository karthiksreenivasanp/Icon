package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class x implements p {

    /* renamed from: h, reason: collision with root package name */
    public static final x f383h = new x();

    /* renamed from: e, reason: collision with root package name */
    public Handler f387e;
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f384b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f385c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f386d = true;

    /* renamed from: f, reason: collision with root package name */
    public final r f388f = new r(this);

    /* renamed from: g, reason: collision with root package name */
    public final d.a f389g = new d.a(6, this);

    public final void b() {
        int i2 = this.f384b + 1;
        this.f384b = i2;
        if (i2 == 1) {
            if (!this.f385c) {
                this.f387e.removeCallbacks(this.f389g);
            } else {
                this.f388f.g(j.ON_RESUME);
                this.f385c = false;
            }
        }
    }

    @Override // androidx.lifecycle.p
    public final r c() {
        return this.f388f;
    }
}
