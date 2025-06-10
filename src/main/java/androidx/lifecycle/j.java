package androidx.lifecycle;

/* loaded from: classes.dex */
public enum j {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public final k a() {
        switch (i.f364b[ordinal()]) {
            case 1:
            case 2:
                return k.CREATED;
            case 3:
            case 4:
                return k.STARTED;
            case 5:
                return k.RESUMED;
            case 6:
                return k.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
