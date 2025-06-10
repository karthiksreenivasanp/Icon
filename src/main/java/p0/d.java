package p0;

import android.os.Bundle;
import androidx.lifecycle.h;
import i.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public Bundle f2154b;

    /* renamed from: c, reason: collision with root package name */
    public a f2155c;
    public final g a = new g();

    /* renamed from: d, reason: collision with root package name */
    public boolean f2156d = true;

    public final void a() throws NoSuchMethodException, SecurityException {
        if (!this.f2156d) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        a aVar = this.f2155c;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f2155c = aVar;
        try {
            h.class.getDeclaredConstructor(new Class[0]);
            a aVar2 = this.f2155c;
            if (aVar2 != null) {
                aVar2.a.add(h.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + h.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
