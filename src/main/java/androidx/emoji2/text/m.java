package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends f1.e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1.e f262s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f263t;

    public m(f1.e eVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f262s = eVar;
        this.f263t = threadPoolExecutor;
    }

    @Override // f1.e
    public final void h0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f263t;
        try {
            this.f262s.h0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // f1.e
    public final void l0(l.d dVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f263t;
        try {
            this.f262s.l0(dVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
