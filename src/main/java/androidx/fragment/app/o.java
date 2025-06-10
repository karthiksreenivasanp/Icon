package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new androidx.activity.result.b(3);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f325b;

    public o(Parcel parcel) {
        this.a = parcel.readString();
        this.f325b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeInt(this.f325b);
    }
}
