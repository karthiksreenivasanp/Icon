package s0;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.nothing.icon.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a0 extends o {
    public final /* synthetic */ ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f2188d;

    public a0(i iVar, ViewGroup viewGroup, View view, View view2) {
        this.f2188d = iVar;
        this.a = viewGroup;
        this.f2186b = view;
        this.f2187c = view2;
    }

    @Override // s0.o, s0.m
    public final void b() {
        this.a.getOverlay().remove(this.f2186b);
    }

    @Override // s0.m
    public final void c(n nVar) {
        this.f2187c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.f2186b);
        nVar.u(this);
    }

    @Override // s0.o, s0.m
    public final void e() {
        View view = this.f2186b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
            return;
        }
        i iVar = this.f2188d;
        ArrayList arrayList = iVar.f2231m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((Animator) arrayList.get(size)).cancel();
            }
        }
        ArrayList arrayList2 = iVar.f2235q;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) iVar.f2235q.clone();
        int size2 = arrayList3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((m) arrayList3.get(i2)).a();
        }
    }
}
