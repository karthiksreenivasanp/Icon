package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import b0.f0;
import com.nothing.icon.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a0 {
    public final ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f295b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f296c = new ArrayList();

    public a0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static a0 b(ViewGroup viewGroup, m mVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof a0) {
            return (a0) tag;
        }
        mVar.getClass();
        e eVar = new e(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, eVar);
        return eVar;
    }

    public final void a() {
        String str;
        String str2;
        ViewGroup viewGroup = this.a;
        int[] iArr = f0.a;
        boolean zB = b0.u.b(viewGroup);
        synchronized (this.f295b) {
            c();
            Iterator it = this.f295b.iterator();
            while (it.hasNext()) {
                ((z) it.next()).c();
            }
            Iterator it2 = new ArrayList(this.f296c).iterator();
            while (it2.hasNext()) {
                z zVar = (z) it2.next();
                if (p.f(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (zB) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(zVar);
                    Log.v("FragmentManager", sb.toString());
                }
                zVar.a();
            }
            Iterator it3 = new ArrayList(this.f295b).iterator();
            while (it3.hasNext()) {
                z zVar2 = (z) it3.next();
                if (p.f(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (zB) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(zVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                zVar2.a();
            }
        }
    }

    public final void c() {
        Iterator it = this.f295b.iterator();
        while (it.hasNext()) {
            ((z) it.next()).getClass();
        }
    }
}
