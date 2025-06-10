package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public boolean f326b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f328d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f329e;

    /* renamed from: f, reason: collision with root package name */
    public int f330f;

    /* renamed from: g, reason: collision with root package name */
    public final n f331g;

    /* renamed from: h, reason: collision with root package name */
    public final m f332h;
    public final ArrayList a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final t f327c = new t();

    public p() {
        new i1.e();
        this.f328d = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        this.f329e = Collections.synchronizedMap(new HashMap());
        new androidx.activity.result.d(this);
        new CopyOnWriteArrayList();
        this.f330f = -1;
        this.f331g = new n(this);
        int i2 = 3;
        this.f332h = new m(this, i2);
        new ArrayDeque();
        new l(i2, this);
    }

    public static boolean f(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public final HashSet a() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f327c.a().iterator();
        if (!it.hasNext()) {
            return hashSet;
        }
        ((s) it.next()).getClass();
        throw null;
    }

    public final void b(int i2) {
        try {
            this.f326b = true;
            for (s sVar : this.f327c.f351b.values()) {
                if (sVar != null) {
                    sVar.getClass();
                }
            }
            g(i2, false);
            Iterator it = a().iterator();
            while (it.hasNext()) {
                ((a0) it.next()).a();
            }
            this.f326b = false;
            c();
            throw null;
        } catch (Throwable th) {
            this.f326b = false;
            throw th;
        }
    }

    public final void c() {
        if (!this.f326b) {
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final n d() {
        return this.f331g;
    }

    public final m e() {
        return this.f332h;
    }

    public final void g(int i2, boolean z2) {
        HashMap map;
        if (i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f330f) {
            this.f330f = i2;
            t tVar = this.f327c;
            Iterator it = tVar.a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = tVar.f351b;
                if (!zHasNext) {
                    break;
                }
                s sVar = (s) map.get(((k) it.next()).f317b);
                if (sVar != null) {
                    sVar.a();
                }
            }
            for (s sVar2 : map.values()) {
                if (sVar2 != null) {
                    sVar2.a();
                    sVar2.getClass();
                    throw null;
                }
            }
            h();
        }
    }

    public final void h() {
        Iterator it = this.f327c.a().iterator();
        if (it.hasNext()) {
            ((s) it.next()).getClass();
            throw null;
        }
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append("null");
        sb.append("}}");
        return sb.toString();
    }
}
