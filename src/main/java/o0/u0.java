package o0;

import android.os.Parcel;
import android.os.Parcelable;
import g.g2;

/* loaded from: classes.dex */
public final class u0 extends h0.b {
    public static final Parcelable.Creator<u0> CREATOR = new g2(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2112c;

    public u0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2112c = parcel.readParcelable(classLoader == null ? l0.class.getClassLoader() : classLoader);
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeParcelable(this.f2112c, 0);
    }

    public u0(Parcelable parcelable) {
        super(parcelable);
    }
}
