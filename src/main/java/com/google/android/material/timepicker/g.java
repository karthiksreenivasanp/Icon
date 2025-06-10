package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new androidx.activity.result.b(12);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f772b;

    /* renamed from: c, reason: collision with root package name */
    public final int f773c;

    /* renamed from: d, reason: collision with root package name */
    public final int f774d;

    public g(Parcel parcel) {
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        int i4 = parcel.readInt();
        int i5 = parcel.readInt();
        this.f772b = i2;
        this.f773c = i3;
        this.f774d = i4;
        this.a = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f772b == gVar.f772b && this.f773c == gVar.f773c && this.a == gVar.a && this.f774d == gVar.f774d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.f772b), Integer.valueOf(this.f773c), Integer.valueOf(this.f774d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f772b);
        parcel.writeInt(this.f773c);
        parcel.writeInt(this.f774d);
        parcel.writeInt(this.a);
    }
}
