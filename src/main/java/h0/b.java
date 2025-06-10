package h0;

import android.os.Parcel;
import android.os.Parcelable;
import g.g2;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {
    public final Parcelable a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f1288b = new a();
    public static final Parcelable.Creator<b> CREATOR = new g2(3);

    public b() {
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.a = parcelable == null ? f1288b : parcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.a = parcelable == f1288b ? null : parcelable;
    }
}
