package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.b0;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class k implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.p, b0, p0.f {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f316i = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f319d;

    /* renamed from: e, reason: collision with root package name */
    public j f320e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.r f322g;

    /* renamed from: h, reason: collision with root package name */
    public p0.e f323h;
    public int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public String f317b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    public p f318c = new p();

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.k f321f = androidx.lifecycle.k.RESUMED;

    public k() {
        new androidx.lifecycle.t();
        new AtomicInteger();
        new ArrayList();
        this.f322g = new androidx.lifecycle.r(this);
        this.f323h = new p0.e(this);
    }

    @Override // p0.f
    public final p0.d a() {
        return this.f323h.a;
    }

    @Override // androidx.lifecycle.b0
    public final f1.e b() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.p
    public final androidx.lifecycle.r c() {
        return this.f322g;
    }

    public final j d() {
        if (this.f320e == null) {
            this.f320e = new j();
        }
        return this.f320e;
    }

    public final int e() {
        androidx.lifecycle.k kVar = this.f321f;
        androidx.lifecycle.k kVar2 = androidx.lifecycle.k.INITIALIZED;
        return kVar.ordinal();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final p f() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void g() {
        this.f318c.b(1);
        throw null;
    }

    public final View h() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f317b);
        sb.append(")");
        return sb.toString();
    }
}
