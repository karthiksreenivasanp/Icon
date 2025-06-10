package androidx.fragment.app;

import android.content.DialogInterface;
import android.util.Log;

/* loaded from: classes.dex */
public class i extends k implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: j, reason: collision with root package name */
    public final l f309j = new l(2, this);
    public final g k;

    /* renamed from: l, reason: collision with root package name */
    public int f310l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f311m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f312n;

    public i() {
        new f(this);
        this.k = new g(this);
        this.f310l = -1;
        new h(0, this);
    }

    public final void i(boolean z2, boolean z3) {
        if (this.f312n) {
            return;
        }
        this.f312n = true;
        this.f311m = true;
        if (this.f310l < 0) {
            a aVar = new a(f());
            aVar.a(new u(3, this));
            if (z2) {
                aVar.b(true);
                return;
            } else {
                aVar.b(false);
                return;
            }
        }
        p pVarF = f();
        int i2 = this.f310l;
        if (i2 >= 0) {
            pVarF.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f311m) {
            return;
        }
        if (p.f(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        i(true, true);
    }
}
