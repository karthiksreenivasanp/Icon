package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f1951m;
    public float a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f1952b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f1953c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1954d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f1955e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1956f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f1957g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f1958h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f1959i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f1960j = 0.0f;
    public boolean k = false;

    /* renamed from: l, reason: collision with root package name */
    public float f1961l = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1951m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1972h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            switch (f1951m.get(index)) {
                case 1:
                    this.a = typedArrayObtainStyledAttributes.getFloat(index, this.a);
                    break;
                case 2:
                    this.f1952b = typedArrayObtainStyledAttributes.getFloat(index, this.f1952b);
                    break;
                case 3:
                    this.f1953c = typedArrayObtainStyledAttributes.getFloat(index, this.f1953c);
                    break;
                case 4:
                    this.f1954d = typedArrayObtainStyledAttributes.getFloat(index, this.f1954d);
                    break;
                case 5:
                    this.f1955e = typedArrayObtainStyledAttributes.getFloat(index, this.f1955e);
                    break;
                case 6:
                    this.f1956f = typedArrayObtainStyledAttributes.getDimension(index, this.f1956f);
                    break;
                case 7:
                    this.f1957g = typedArrayObtainStyledAttributes.getDimension(index, this.f1957g);
                    break;
                case 8:
                    this.f1958h = typedArrayObtainStyledAttributes.getDimension(index, this.f1958h);
                    break;
                case 9:
                    this.f1959i = typedArrayObtainStyledAttributes.getDimension(index, this.f1959i);
                    break;
                case 10:
                    this.f1960j = typedArrayObtainStyledAttributes.getDimension(index, this.f1960j);
                    break;
                case 11:
                    this.k = true;
                    this.f1961l = typedArrayObtainStyledAttributes.getDimension(index, this.f1961l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
