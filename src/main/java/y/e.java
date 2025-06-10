package y;

import android.content.Context;
import g.p;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f2349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2350e;

    public /* synthetic */ e(String str, Context context, p pVar, int i2, int i3) {
        this.a = i3;
        this.f2347b = str;
        this.f2348c = context;
        this.f2349d = pVar;
        this.f2350e = i2;
    }

    public final g a() {
        int i2 = this.a;
        Context context = this.f2348c;
        String str = this.f2347b;
        int i3 = this.f2350e;
        p pVar = this.f2349d;
        switch (i2) {
            case 0:
                return h.a(str, context, pVar, i3);
            default:
                try {
                    return h.a(str, context, pVar, i3);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.a) {
        }
        return a();
    }
}
