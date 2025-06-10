package s0;

import android.view.ViewGroup;
import b0.f0;
import com.nothing.icon.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {
    public static final a a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2240b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2241c = new ArrayList();

    public static void a(ViewGroup viewGroup, n nVar) {
        ArrayList arrayList = f2241c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        int[] iArr = f0.a;
        if (b0.u.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (nVar == null) {
                nVar = a;
            }
            n nVarClone = nVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).t(viewGroup);
                }
            }
            if (nVarClone != null) {
                nVarClone.g(viewGroup, true);
            }
            androidx.activity.result.a.d(viewGroup.getTag(R.id.transition_current_scene));
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (nVarClone != null) {
                p pVar = new p(viewGroup, nVarClone);
                viewGroup.addOnAttachStateChangeListener(pVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(pVar);
            }
        }
    }

    public static j.b b() {
        j.b bVar;
        ThreadLocal threadLocal = f2240b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (j.b) weakReference.get()) != null) {
            return bVar;
        }
        j.b bVar2 = new j.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
