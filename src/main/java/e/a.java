package e;

import android.content.Context;
import androidx.emoji2.text.i;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements i {
    public final Context a;

    public a(Context context, int i2) {
        if (i2 != 1) {
            this.a = context;
        } else {
            this.a = context.getApplicationContext();
        }
    }

    @Override // androidx.emoji2.text.i
    public final void a(final f1.e eVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.l
            @Override // java.lang.Runnable
            public final void run() {
                e.a aVar = this.a;
                f1.e eVar2 = eVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                aVar.getClass();
                try {
                    k kVarD = f1.e.D(aVar.a);
                    if (kVarD == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) kVarD.a;
                    synchronized (sVar.f277d) {
                        sVar.f279f = threadPoolExecutor2;
                    }
                    kVarD.a.a(new m(eVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    eVar2.h0(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }
}
