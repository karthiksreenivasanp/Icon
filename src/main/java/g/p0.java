package g;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class p0 {
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1190b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f1191c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1192d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f1193e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1194f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f1195g = false;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f1196h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f1197i;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public p0(TextView textView) {
        this.f1196h = textView;
        this.f1197i = textView.getContext();
        new n0();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        if (d() && this.a == 1) {
            if (!this.f1195g || this.f1194f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1193e - this.f1192d) / this.f1191c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f1191c) + this.f1192d);
                }
                this.f1194f = a(iArr);
            }
            this.f1190b = true;
        } else {
            this.f1190b = false;
        }
        return this.f1190b;
    }

    public final boolean c() {
        boolean z2 = this.f1194f.length > 0;
        this.f1195g = z2;
        if (z2) {
            this.a = 1;
            this.f1192d = r0[0];
            this.f1193e = r0[r1 - 1];
            this.f1191c = -1.0f;
        }
        return z2;
    }

    public final boolean d() {
        return !(this.f1196h instanceof w);
    }

    public final void e(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.a = 1;
        this.f1192d = f2;
        this.f1193e = f3;
        this.f1191c = f4;
        this.f1195g = false;
    }
}
