package o0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new androidx.activity.result.b(6);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2136b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2137c;

    public y() {
    }

    public y(Parcel parcel) {
        this.a = parcel.readInt();
        this.f2136b = parcel.readInt();
        this.f2137c = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f2136b);
        parcel.writeInt(this.f2137c ? 1 : 0);
    }

    public y(y yVar) {
        this.a = yVar.a;
        this.f2136b = yVar.f2136b;
        this.f2137c = yVar.f2137c;
    }
}
