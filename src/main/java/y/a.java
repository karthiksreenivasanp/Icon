package y;

import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2341b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2342c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2343d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.f2343d = obj;
        this.f2341b = obj2;
        this.f2342c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        Object objCall;
        int i2 = this.a;
        Object obj = this.f2343d;
        Object obj2 = this.f2342c;
        Object obj3 = this.f2341b;
        switch (i2) {
            case 0:
                Typeface typeface = (Typeface) obj2;
                f1.e eVar = (f1.e) ((f.f) obj3).f875b;
                if (eVar != null) {
                    eVar.j0(typeface);
                    break;
                }
                break;
            case 1:
                ((f) ((a0.a) obj3)).a(obj2);
                break;
            case 2:
                try {
                    objCall = ((Callable) obj3).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) obj).post(new a(this, (a0.a) obj2, objCall, 1));
                break;
            default:
                if (((View) obj2) != null) {
                    ((x0.c) obj).getClass();
                    break;
                }
                break;
        }
    }
}
