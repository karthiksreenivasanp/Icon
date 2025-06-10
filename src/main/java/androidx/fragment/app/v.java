package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v {
    static {
        new w();
        try {
        } catch (Exception unused) {
        }
    }

    public static void a(ArrayList arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i2);
        }
    }
}
