package y;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2344b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2345c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2346d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i2, ArrayList arrayList) {
        this(arrayList, i2, null);
        this.a = 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        int i3 = 0;
        int i4 = this.f2344b;
        Object obj = this.f2345c;
        switch (i2) {
            case 0:
                f1.e eVar = (f1.e) ((f.f) obj).f875b;
                if (eVar != null) {
                    eVar.i0(i4);
                    break;
                }
                break;
            case 1:
                List list = (List) obj;
                int size = list.size();
                if (i4 == 1) {
                    while (i3 < size) {
                        ((androidx.emoji2.text.h) list.get(i3)).a();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((androidx.emoji2.text.h) list.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            default:
                ((BottomSheetBehavior) this.f2346d).E((View) obj, i4, false);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(androidx.emoji2.text.h hVar, int i2) {
        this.a = 1;
        androidx.emoji2.text.h[] hVarArr = new androidx.emoji2.text.h[1];
        if (hVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        hVarArr[0] = hVar;
        this(Arrays.asList(hVarArr), i2, null);
    }

    public /* synthetic */ b(Object obj, Object obj2, int i2, int i3) {
        this.a = i3;
        this.f2346d = obj;
        this.f2345c = obj2;
        this.f2344b = i2;
    }

    public b(List list, int i2, Throwable th) {
        this.a = 1;
        if (list == null) {
            throw new NullPointerException("initCallbacks cannot be null");
        }
        this.f2345c = new ArrayList(list);
        this.f2344b = i2;
        this.f2346d = th;
    }
}
