package q;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import g.g2;

/* loaded from: classes.dex */
public final class f extends h0.b {
    public static final Parcelable.Creator<f> CREATOR = new g2(2);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f2178c;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i2 = parcel.readInt();
        int[] iArr = new int[i2];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f2178c = new SparseArray(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2178c.append(iArr[i3], parcelableArray[i3]);
        }
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        SparseArray sparseArray = this.f2178c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.f2178c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f2178c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }

    public f(Parcelable parcelable) {
        super(parcelable);
    }
}
