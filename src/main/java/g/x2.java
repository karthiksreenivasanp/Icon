package g;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x2 extends h0.b {
    public static final Parcelable.Creator<x2> CREATOR = new g2(1);

    /* renamed from: c, reason: collision with root package name */
    public int f1259c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1260d;

    public x2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1259c = parcel.readInt();
        this.f1260d = parcel.readInt() != 0;
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeInt(this.f1259c);
        parcel.writeInt(this.f1260d ? 1 : 0);
    }

    public x2(Parcelable parcelable) {
        super(parcelable);
    }
}
