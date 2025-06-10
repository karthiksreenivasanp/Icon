package x0;

import android.os.Parcel;
import android.os.Parcelable;
import g.g2;

/* loaded from: classes.dex */
public final class b extends h0.b {
    public static final Parcelable.Creator<b> CREATOR = new g2(5);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2323d;

    /* renamed from: e, reason: collision with root package name */
    public int f2324e;

    /* renamed from: f, reason: collision with root package name */
    public float f2325f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2326g;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2322c = parcel.readByte() != 0;
        this.f2323d = parcel.readByte() != 0;
        this.f2324e = parcel.readInt();
        this.f2325f = parcel.readFloat();
        this.f2326g = parcel.readByte() != 0;
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeByte(this.f2322c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2323d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f2324e);
        parcel.writeFloat(this.f2325f);
        parcel.writeByte(this.f2326g ? (byte) 1 : (byte) 0);
    }
}
