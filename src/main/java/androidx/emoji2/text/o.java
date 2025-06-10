package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f264d = new ThreadLocal();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final l.d f265b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f266c = 0;

    public o(l.d dVar, int i2) {
        this.f265b = dVar;
        this.a = i2;
    }

    public final int a(int i2) {
        j0.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = aVarC.f1467b;
        int i3 = iA + aVarC.a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final int b() {
        j0.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i2 = iA + aVarC.a;
        return aVarC.f1467b.getInt(aVarC.f1467b.getInt(i2) + i2);
    }

    public final j0.a c() {
        short s2;
        ThreadLocal threadLocal = f264d;
        j0.a aVar = (j0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new j0.a();
            threadLocal.set(aVar);
        }
        j0.b bVar = (j0.b) this.f265b.a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i2 = iA + bVar.a;
            int i3 = (this.a * 4) + bVar.f1467b.getInt(i2) + i2 + 4;
            int i4 = bVar.f1467b.getInt(i3) + i3;
            ByteBuffer byteBuffer = bVar.f1467b;
            aVar.f1467b = byteBuffer;
            if (byteBuffer != null) {
                aVar.a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                aVar.f1468c = i5;
                s2 = aVar.f1467b.getShort(i5);
            } else {
                s2 = 0;
                aVar.a = 0;
                aVar.f1468c = 0;
            }
            aVar.f1469d = s2;
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        j0.a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? aVarC.f1467b.getInt(iA + aVarC.a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i2 = 0; i2 < iB; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
