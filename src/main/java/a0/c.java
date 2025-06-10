package a0;

import l.g;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: d, reason: collision with root package name */
    public final Object f0d;

    public c() {
        super(12, 1);
        this.f0d = new Object();
    }

    @Override // l.g
    public final Object a() {
        Object objA;
        synchronized (this.f0d) {
            objA = super.a();
        }
        return objA;
    }

    @Override // l.g
    public final boolean b(Object obj) {
        boolean zB;
        synchronized (this.f0d) {
            zB = super.b(obj);
        }
        return zB;
    }
}
