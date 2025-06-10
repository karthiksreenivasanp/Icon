package i0;

import android.graphics.Rect;
import c0.g;
import i1.e;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class b implements Comparator {
    public final Rect a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1311b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1312c;

    /* renamed from: d, reason: collision with root package name */
    public final e f1313d;

    public b(boolean z2, e eVar) {
        this.f1312c = z2;
        this.f1313d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1313d.getClass();
        Rect rect = this.a;
        ((g) obj).d(rect);
        Rect rect2 = this.f1311b;
        ((g) obj2).d(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        boolean z2 = this.f1312c;
        if (i4 < i5) {
            return z2 ? 1 : -1;
        }
        if (i4 > i5) {
            return z2 ? -1 : 1;
        }
        int i6 = rect.bottom;
        int i7 = rect2.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if (i8 < i9) {
            return z2 ? 1 : -1;
        }
        if (i8 > i9) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
