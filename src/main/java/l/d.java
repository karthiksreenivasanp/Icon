package l;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.emoji2.text.o;
import androidx.emoji2.text.t;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static d f1545e;
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1546b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1547c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1548d;

    public d(int i2) {
        if (i2 == 1) {
            this.a = new g(10, 1);
            this.f1546b = new j.k();
            this.f1547c = new ArrayList();
            this.f1548d = new HashSet();
            return;
        }
        if (i2 == 4) {
            this.a = new j.b();
            this.f1546b = new SparseArray();
            this.f1547c = new j.d();
            this.f1548d = new j.b();
            return;
        }
        if (i2 == 5) {
            this.a = new Object();
            this.f1546b = new Handler(Looper.getMainLooper(), new k1.f(this));
        } else {
            this.a = new g(256, 0);
            this.f1546b = new g(256, 0);
            this.f1547c = new g(256, 0);
            this.f1548d = new l[32];
        }
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((j.k) this.f1546b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                a(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public d(Typeface typeface, j0.b bVar) {
        int i2;
        int i3;
        this.f1548d = typeface;
        this.a = bVar;
        this.f1547c = new t(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i4 = iA + bVar.a;
            i2 = bVar.f1467b.getInt(bVar.f1467b.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        this.f1546b = new char[i2 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i5 = iA2 + bVar.a;
            i3 = bVar.f1467b.getInt(bVar.f1467b.getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            o oVar = new o(this, i6);
            j0.a aVarC = oVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? aVarC.f1467b.getInt(iA3 + aVarC.a) : 0, (char[]) this.f1546b, i6 * 2);
            f1.e.m("invalid metadata codepoint length", oVar.b() > 0);
            ((t) this.f1547c).a(oVar, 0, oVar.b() - 1);
        }
    }
}
