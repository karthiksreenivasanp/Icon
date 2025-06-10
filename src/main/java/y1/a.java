package y1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements b {
    public final AtomicReference a;

    public a(d dVar) {
        this.a = new AtomicReference(dVar);
    }

    @Override // y1.b
    public final Iterator iterator() {
        b bVar = (b) this.a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
