package g;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h2 extends h0.b {
    public static final Parcelable.Creator<h2> CREATOR = new g2(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f1082c;

    public h2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1082c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1082c + "}";
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeValue(Boolean.valueOf(this.f1082c));
    }

    public h2(Parcelable parcelable) {
        super(parcelable);
    }
}
