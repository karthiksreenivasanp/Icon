package x1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2338b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2339c;

    /* renamed from: d, reason: collision with root package name */
    public int f2340d;

    public b(int i2, int i3, int i4) {
        this.a = i4;
        this.f2338b = i3;
        boolean z2 = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z2 = false;
        }
        this.f2339c = z2;
        this.f2340d = z2 ? i2 : i3;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        int i2 = this.f2340d;
        if (i2 != this.f2338b) {
            this.f2340d = this.a + i2;
        } else {
            if (!this.f2339c) {
                throw new NoSuchElementException();
            }
            this.f2339c = false;
        }
        return Integer.valueOf(i2);
    }

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2339c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
