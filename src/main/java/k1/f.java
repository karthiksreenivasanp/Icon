package k1;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class f implements Handler.Callback {
    public final /* synthetic */ l.d a;

    public f(l.d dVar) {
        this.a = dVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        l.d dVar = this.a;
        androidx.activity.result.a.d(message.obj);
        synchronized (dVar.a) {
            androidx.activity.result.a.d(dVar.f1547c);
            throw null;
        }
    }
}
