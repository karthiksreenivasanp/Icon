package z1;

/* loaded from: classes.dex */
public final class i extends RuntimeException {
    public final p1.i a = p1.j.a;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
