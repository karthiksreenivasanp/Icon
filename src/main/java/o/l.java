package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1948b = 0;

    /* renamed from: c, reason: collision with root package name */
    public float f1949c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1950d = Float.NaN;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1970f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f1949c = typedArrayObtainStyledAttributes.getFloat(index, this.f1949c);
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.a);
                this.a = i3;
                this.a = n.f1962d[i3];
            } else if (index == 4) {
                this.f1948b = typedArrayObtainStyledAttributes.getInt(index, this.f1948b);
            } else if (index == 3) {
                this.f1950d = typedArrayObtainStyledAttributes.getFloat(index, this.f1950d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
