package k1;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            androidx.activity.result.a.d(message.obj);
            throw null;
        }
        if (i2 != 1) {
            return false;
        }
        androidx.activity.result.a.d(message.obj);
        throw null;
    }
}
