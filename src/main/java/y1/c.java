package y1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends e {
    public static final List N0(b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        int size = arrayList.size();
        if (size == 0) {
            return o1.b.a;
        }
        if (size != 1) {
            return arrayList;
        }
        List listSingletonList = Collections.singletonList(arrayList.get(0));
        f1.e.q(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
