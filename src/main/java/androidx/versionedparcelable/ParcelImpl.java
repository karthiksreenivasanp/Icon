package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.b;
import java.lang.reflect.InvocationTargetException;
import u0.c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(9);
    public final c a;

    public ParcelImpl(Parcel parcel) {
        this.a = new u0.b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new u0.b(parcel).i(this.a);
    }
}
