package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f324b;

    public /* synthetic */ l(int i2, Object obj) {
        this.a = i2;
        this.f324b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        Object obj = this.f324b;
        switch (i2) {
            case 0:
                ((c) obj).getClass();
                throw null;
            case 1:
                c cVar = (c) obj;
                cVar.getClass();
                cVar.getClass();
                throw null;
            case 2:
                i iVar = (i) obj;
                g gVar = iVar.k;
                iVar.getClass();
                gVar.onDismiss(null);
                return;
            case 3:
                ((p) obj).c();
                throw null;
            default:
                v.a((ArrayList) obj, 4);
                return;
        }
    }
}
