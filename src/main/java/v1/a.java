package v1;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends e {
    @Override // v1.e
    public final int a() {
        return b().nextInt();
    }

    public abstract Random b();
}
