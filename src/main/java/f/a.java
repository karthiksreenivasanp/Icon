package f;

import androidx.appcompat.view.menu.ActionMenuItemView;
import g.a1;

/* loaded from: classes.dex */
public final class a extends a1 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f868j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f868j = actionMenuItemView;
    }

    @Override // g.a1
    public final n b() {
        g.f fVar;
        b bVar = this.f868j.f35l;
        if (bVar == null || (fVar = ((g.g) bVar).a.f1121s) == null) {
            return null;
        }
        return fVar.a();
    }

    @Override // g.a1
    public final boolean c() {
        n nVarB;
        ActionMenuItemView actionMenuItemView = this.f868j;
        k kVar = actionMenuItemView.f34j;
        return kVar != null && kVar.a(actionMenuItemView.f31g) && (nVarB = b()) != null && nVarB.d();
    }
}
