package p1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements i, Serializable {
    public final i a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2160b;

    public d(g gVar, i iVar) {
        f1.e.r(iVar, "left");
        f1.e.r(gVar, "element");
        this.a = iVar;
        this.f2160b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r6 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            if (r6 == r7) goto L6a
            boolean r0 = r7 instanceof p1.d
            r1 = 0
            if (r0 == 0) goto L6b
            p1.d r7 = (p1.d) r7
            r7.getClass()
            r0 = 2
            r2 = r7
            r3 = r0
        Lf:
            p1.i r2 = r2.a
            boolean r4 = r2 instanceof p1.d
            r5 = 0
            if (r4 == 0) goto L19
            p1.d r2 = (p1.d) r2
            goto L1a
        L19:
            r2 = r5
        L1a:
            if (r2 != 0) goto L67
            r2 = r6
        L1d:
            p1.i r2 = r2.a
            boolean r4 = r2 instanceof p1.d
            if (r4 == 0) goto L26
            p1.d r2 = (p1.d) r2
            goto L27
        L26:
            r2 = r5
        L27:
            if (r2 != 0) goto L64
            if (r3 != r0) goto L6b
        L2b:
            p1.g r0 = r6.f2160b
            p1.h r2 = r0.getKey()
            p1.g r2 = r7.get(r2)
            boolean r0 = f1.e.f(r2, r0)
            if (r0 != 0) goto L3d
            r6 = r1
            goto L56
        L3d:
            p1.i r6 = r6.a
            boolean r0 = r6 instanceof p1.d
            if (r0 == 0) goto L46
            p1.d r6 = (p1.d) r6
            goto L2b
        L46:
            if (r6 == 0) goto L59
            p1.g r6 = (p1.g) r6
            p1.h r0 = r6.getKey()
            p1.g r7 = r7.get(r0)
            boolean r6 = f1.e.f(r7, r6)
        L56:
            if (r6 == 0) goto L6b
            goto L6a
        L59:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            r6.<init>(r7)
            f1.e.A0(r6)
            throw r6
        L64:
            int r0 = r0 + 1
            goto L1d
        L67:
            int r3 = r3 + 1
            goto Lf
        L6a:
            r1 = 1
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.d.equals(java.lang.Object):boolean");
    }

    @Override // p1.i
    public final Object fold(Object obj, t1.b bVar) {
        return ((c) bVar).a(this.a.fold(obj, bVar), this.f2160b);
    }

    @Override // p1.i
    public final g get(h hVar) {
        f1.e.r(hVar, "key");
        while (true) {
            g gVar = this.f2160b.get(hVar);
            if (gVar != null) {
                return gVar;
            }
            i iVar = this.a;
            if (!(iVar instanceof d)) {
                return iVar.get(hVar);
            }
            this = (d) iVar;
        }
    }

    public final int hashCode() {
        return this.f2160b.hashCode() + this.a.hashCode();
    }

    @Override // p1.i
    public final i minusKey(h hVar) {
        f1.e.r(hVar, "key");
        g gVar = this.f2160b;
        g gVar2 = gVar.get(hVar);
        i iVar = this.a;
        if (gVar2 != null) {
            return iVar;
        }
        i iVarMinusKey = iVar.minusKey(hVar);
        return iVarMinusKey == iVar ? this : iVarMinusKey == j.a ? gVar : new d(gVar, iVarMinusKey);
    }

    public final String toString() {
        return "[" + ((String) fold("", c.f2158b)) + ']';
    }
}
