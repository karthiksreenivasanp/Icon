package androidx.fragment.app;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f351b = new HashMap();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (s sVar : this.f351b.values()) {
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
        return arrayList;
    }
}
