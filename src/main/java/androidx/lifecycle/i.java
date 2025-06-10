package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f364b;

    static {
        int[] iArr = new int[j.values().length];
        f364b = iArr;
        try {
            iArr[j.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f364b[j.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f364b[j.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f364b[j.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f364b[j.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f364b[j.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f364b[j.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[k.values().length];
        a = iArr2;
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[3] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[4] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[0] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[1] = 5;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
