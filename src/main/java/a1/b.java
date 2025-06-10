package a1;

import android.os.Parcel;
import android.os.Parcelable;
import g.g2;

/* loaded from: classes.dex */
public final class b extends h0.b {
    public static final Parcelable.Creator<b> CREATOR = new g2(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f1c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f1c = parcel.readInt() == 1;
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeInt(this.f1c ? 1 : 0);
    }

    public b(Parcelable parcelable) {
        super(parcelable);
    }
}
