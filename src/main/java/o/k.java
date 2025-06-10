package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f1944e;
    public int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1945b = -1;

    /* renamed from: c, reason: collision with root package name */
    public float f1946c = Float.NaN;

    /* renamed from: d, reason: collision with root package name */
    public float f1947d = Float.NaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1944e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1969e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f1944e.get(index)) {
                case 1:
                    this.f1947d = typedArrayObtainStyledAttributes.getFloat(index, this.f1947d);
                    break;
                case 2:
                    this.f1945b = typedArrayObtainStyledAttributes.getInt(index, this.f1945b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = f1.e.f1032h[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.a = n.f(typedArrayObtainStyledAttributes, index, this.a);
                    break;
                case 6:
                    this.f1946c = typedArrayObtainStyledAttributes.getFloat(index, this.f1946c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
