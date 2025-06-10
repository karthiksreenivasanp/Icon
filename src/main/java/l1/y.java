package l1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g.g2;

/* loaded from: classes.dex */
public final class y extends h0.b {
    public static final Parcelable.Creator<y> CREATOR = new g2(10);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1685c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1686d;

    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1685c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1686d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1685c) + "}";
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        TextUtils.writeToParcel(this.f1685c, parcel, i2);
        parcel.writeInt(this.f1686d ? 1 : 0);
    }

    public y(Parcelable parcelable) {
        super(parcelable);
    }
}
