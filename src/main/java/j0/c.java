package j0;

import i1.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f1467b;

    /* renamed from: c, reason: collision with root package name */
    public int f1468c;

    /* renamed from: d, reason: collision with root package name */
    public int f1469d;

    public c() {
        if (e.a == null) {
            e.a = new e(11);
        }
    }

    public final int a(int i2) {
        if (i2 < this.f1469d) {
            return this.f1467b.getShort(this.f1468c + i2);
        }
        return 0;
    }
}
