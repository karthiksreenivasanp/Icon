package a2;

import android.os.Handler;
import android.os.Looper;
import b2.f;
import f1.e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.scheduling.c;
import p1.i;
import z1.h;
import z1.j;
import z1.n;

/* loaded from: classes.dex */
public final class a extends n implements h {
    private volatile a _immediate;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f24b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26d;

    /* renamed from: e, reason: collision with root package name */
    public final a f27e;

    public a(Handler handler) {
        this(handler, null, false);
    }

    @Override // z1.c
    public final void a(i iVar, Runnable runnable) {
        if (this.f24b.post(runnable)) {
            return;
        }
        c(iVar, runnable);
    }

    @Override // z1.c
    public final boolean b() {
        return (this.f26d && e.f(Looper.myLooper(), this.f24b.getLooper())) ? false : true;
    }

    public final void c(i iVar, Runnable runnable) {
        new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        androidx.activity.result.a.f(iVar.get(p1.e.f2163d));
        j.a.a(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f24b == this.f24b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f24b);
    }

    @Override // z1.c
    public final String toString() {
        a aVar;
        String str;
        c cVar = j.a;
        n nVar = f.a;
        if (this == nVar) {
            str = "Dispatchers.Main";
        } else {
            try {
                aVar = ((a) nVar).f27e;
            } catch (UnsupportedOperationException unused) {
                aVar = null;
            }
            str = this == aVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f25c;
        if (string == null) {
            string = this.f24b.toString();
        }
        return this.f26d ? e.F0(".immediate", string) : string;
    }

    public a(Handler handler, String str, boolean z2) {
        this.f24b = handler;
        this.f25c = str;
        this.f26d = z2;
        this._immediate = z2 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f27e = aVar;
    }
}
