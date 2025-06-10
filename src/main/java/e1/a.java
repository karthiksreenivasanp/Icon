package e1;

import android.os.Parcel;
import android.os.Parcelable;
import g.g2;

/* loaded from: classes.dex */
public final class a extends h0.b {
    public static final Parcelable.Creator<a> CREATOR = new g2(8);

    /* renamed from: c, reason: collision with root package name */
    public boolean f815c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f815c = parcel.readInt() == 1;
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeInt(this.f815c ? 1 : 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
    }
}
