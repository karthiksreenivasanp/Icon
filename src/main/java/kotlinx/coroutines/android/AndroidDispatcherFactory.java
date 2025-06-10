package kotlinx.coroutines.android;

import a2.a;
import a2.b;
import android.os.Looper;
import b2.e;
import java.util.List;
import z1.n;

/* loaded from: classes.dex */
public final class AndroidDispatcherFactory implements e {
    @Override // b2.e
    public n createDispatcher(List<? extends e> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new a(b.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // b2.e
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // b2.e
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
