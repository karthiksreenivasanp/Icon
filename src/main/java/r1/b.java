package r1;

import f1.e;

/* loaded from: classes.dex */
public class b extends q1.b {
    @Override // q1.b
    public final void a(Throwable th, Throwable th2) {
        e.r(th, "cause");
        e.r(th2, "exception");
        Integer num = a.a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
