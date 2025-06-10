package kotlinx.coroutines.scheduling;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final d f1516c = new d();

    public d() {
        super(k.f1521b, k.f1522c, k.f1523d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // z1.c
    public final String toString() {
        return "Dispatchers.Default";
    }
}
