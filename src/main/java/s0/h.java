package s0;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends o {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2210c;

    public /* synthetic */ h(int i2, Object obj, Object obj2) {
        this.a = i2;
        this.f2210c = obj;
        this.f2209b = obj2;
    }

    @Override // s0.m
    public final void c(n nVar) {
        int i2 = this.a;
        Object obj = this.f2209b;
        switch (i2) {
            case 0:
                c cVar = u.a;
                ((View) obj).setTransitionAlpha(1.0f);
                nVar.u(this);
                break;
            case 1:
                ((ArrayList) ((j.b) obj).getOrDefault(((p) this.f2210c).f2239b, null)).remove(nVar);
                nVar.u(this);
                break;
            default:
                ((n) obj).w();
                nVar.u(this);
                break;
        }
    }
}
