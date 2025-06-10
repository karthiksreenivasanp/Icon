package j;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterator {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1448b;

    /* renamed from: c, reason: collision with root package name */
    public int f1449c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1450d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f1451e;

    public f(j jVar, int i2) {
        this.f1451e = jVar;
        this.a = i2;
        this.f1448b = jVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1449c < this.f1448b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objB = this.f1451e.b(this.f1449c, this.a);
        this.f1449c++;
        this.f1450d = true;
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1450d) {
            throw new IllegalStateException();
        }
        int i2 = this.f1449c - 1;
        this.f1449c = i2;
        this.f1448b--;
        this.f1450d = false;
        this.f1451e.f(i2);
    }
}
