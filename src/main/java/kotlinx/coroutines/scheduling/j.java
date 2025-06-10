package kotlinx.coroutines.scheduling;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f1520c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f1520c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1520c.run();
        } finally {
            this.f1519b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1520c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(runnable)));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f1519b);
        sb.append(']');
        return sb.toString();
    }
}
