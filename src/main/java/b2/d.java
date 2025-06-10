package b2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f512b;

    /* renamed from: c, reason: collision with root package name */
    public final int f513c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f514d;

    /* renamed from: g, reason: collision with root package name */
    public static final k1.b f511g = new k1.b("REMOVE_FROZEN");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f509e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f510f = AtomicLongFieldUpdater.newUpdater(d.class, "_state");

    public d(int i2, boolean z2) {
        this.a = i2;
        this.f512b = z2;
        int i3 = i2 - 1;
        this.f513c = i3;
        this.f514d = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r15) {
        /*
            r14 = this;
        L0:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L15
            r14 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r14 = r14 & r2
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 == 0) goto L14
            r1 = 2
        L14:
            return r1
        L15:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.f513c
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L30
            return r1
        L30:
            boolean r4 = r14.f512b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.f514d
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r2 = r14.a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L0
        L4e:
            return r1
        L4f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = b2.d.f510f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f514d
            r1 = r10 & r11
            r0.set(r1, r15)
        L6c:
            long r0 = r14._state
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L76
            goto L94
        L76:
            b2.d r14 = r14.e()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f514d
            int r1 = r14.f513c
            r1 = r1 & r10
            java.lang.Object r2 = r0.get(r1)
            boolean r3 = r2 instanceof b2.c
            if (r3 == 0) goto L91
            b2.c r2 = (b2.c) r2
            int r2 = r2.a
            if (r2 != r10) goto L91
            r0.set(r1, r15)
            goto L92
        L91:
            r14 = 0
        L92:
            if (r14 != 0) goto L6c
        L94:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f510f.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final boolean d() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    public final d e() {
        long j2;
        while (true) {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (f510f.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            d dVar = (d) this._next;
            if (dVar != null) {
                return dVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f509e;
            d dVar2 = new d(this.a * 2, this.f512b);
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f513c;
                int i5 = i2 & i4;
                if (i5 != (i4 & i3)) {
                    Object cVar = this.f514d.get(i5);
                    if (cVar == null) {
                        cVar = new c(i2);
                    }
                    dVar2.f514d.set(dVar2.f513c & i2, cVar);
                    i2++;
                }
            }
            dVar2._state = (-1152921504606846977L) & j2;
            atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2);
        }
    }

    public final Object f() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f511g;
            }
            int i2 = (int) ((j2 & 1073741823) >> 0);
            int i3 = this.f513c;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.f514d.get(i5);
            if (obj == null) {
                if (this.f512b) {
                    return null;
                }
            } else {
                if (obj instanceof c) {
                    return null;
                }
                long j3 = ((i2 + 1) & 1073741823) << 0;
                if (f510f.compareAndSet(this, j2, j3 | (j2 & (-1073741824)))) {
                    this.f514d.set(this.f513c & i2, null);
                    return obj;
                }
                if (this.f512b) {
                    d dVarE = this;
                    while (true) {
                        long j4 = dVarE._state;
                        int i6 = (int) ((j4 & 1073741823) >> 0);
                        if ((j4 & 1152921504606846976L) != 0) {
                            dVarE = dVarE.e();
                        } else {
                            if (f510f.compareAndSet(dVarE, j4, (j4 & (-1073741824)) | j3)) {
                                dVarE.f514d.set(dVarE.f513c & i6, null);
                                dVarE = null;
                            } else {
                                continue;
                            }
                        }
                        if (dVarE == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
