package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements q0.b {
    @Override // q0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // q0.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean b(Context context) {
        Object objB;
        k kVar = new k(context);
        if (j.f251j == null) {
            synchronized (j.f250i) {
                if (j.f251j == null) {
                    j.f251j = new j(kVar);
                }
            }
        }
        q0.a aVarC = q0.a.c(context);
        aVarC.getClass();
        synchronized (q0.a.f2181e) {
            try {
                objB = aVarC.a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final androidx.lifecycle.r rVarC = ((androidx.lifecycle.p) objB).c();
        rVarC.d(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public final void a() {
                EmojiCompatInitializer.this.getClass();
                b.a(Looper.getMainLooper()).postDelayed(new n(), 500L);
                rVarC.c(this);
            }
        });
        return Boolean.TRUE;
    }
}
