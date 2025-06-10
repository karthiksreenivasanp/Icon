package androidx.emoji2.text;

/* loaded from: classes.dex */
public final class d extends f1.e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f245s;

    public d(e eVar) {
        this.f245s = eVar;
    }

    @Override // f1.e
    public final void h0(Throwable th) {
        ((j) this.f245s.f875b).d(th);
    }

    @Override // f1.e
    public final void l0(l.d dVar) {
        e eVar = this.f245s;
        eVar.f247d = dVar;
        l.d dVar2 = eVar.f247d;
        i1.e eVar2 = new i1.e(8, null);
        Object obj = eVar.f875b;
        c cVar = ((j) obj).f258h;
        ((j) obj).getClass();
        eVar.f246c = new q(dVar2, eVar2, cVar);
        ((j) eVar.f875b).e();
    }
}
