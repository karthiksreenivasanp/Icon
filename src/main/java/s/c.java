package s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import t.i;
import t.j;
import t.k;
import t.n;

/* loaded from: classes.dex */
public abstract class c {
    public static final Object a = new Object();

    public static ColorStateList a(Context context, int i2) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        j jVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        k kVar = new k(resources, theme);
        synchronized (n.f2266c) {
            SparseArray sparseArray = (SparseArray) n.f2265b.get(kVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (jVar = (j) sparseArray.get(i2)) == null) {
                colorStateList = null;
            } else if (!jVar.f2259b.equals(resources.getConfiguration()) || (!(theme == null && jVar.f2260c == 0) && (theme == null || jVar.f2260c != theme.hashCode()))) {
                sparseArray.remove(i2);
                colorStateList = null;
            } else {
                colorStateList = jVar.a;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = n.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (!(i3 >= 28 && i3 <= 31)) {
            try {
                colorStateListA = t.b.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return i.b(resources, i2, theme);
        }
        synchronized (n.f2266c) {
            WeakHashMap weakHashMap = n.f2265b;
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(kVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(kVar, sparseArray2);
            }
            sparseArray2.append(i2, new j(colorStateListA, kVar.a.getConfiguration(), theme));
        }
        return colorStateListA;
    }
}
