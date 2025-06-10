package y;

import android.os.Process;

/* loaded from: classes.dex */
public final class j extends Thread {
    public final int a;

    public j(Runnable runnable, String str, int i2) {
        super(runnable, str);
        this.a = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
