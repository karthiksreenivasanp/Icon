package o0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d1 implements Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new androidx.activity.result.b(7);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1988b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1989c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1990d;

    public d1(Parcel parcel) {
        this.a = parcel.readInt();
        this.f1988b = parcel.readInt();
        this.f1990d = parcel.readInt() == 1;
        int i2 = parcel.readInt();
        if (i2 > 0) {
            int[] iArr = new int[i2];
            this.f1989c = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.f1988b + ", mHasUnwantedGapAfter=" + this.f1990d + ", mGapPerSpan=" + Arrays.toString(this.f1989c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f1988b);
        parcel.writeInt(this.f1990d ? 1 : 0);
        int[] iArr = this.f1989c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1989c);
        }
    }
}
