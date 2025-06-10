package w1;

import f1.e;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends v1.a {
    @Override // v1.a
    public final Random b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        e.q(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
