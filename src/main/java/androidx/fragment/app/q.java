package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new androidx.activity.result.b(4);
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f333b;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f335d;

    /* renamed from: e, reason: collision with root package name */
    public final String f336e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f337f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f338g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f339h;

    public q(Parcel parcel) {
        this.f336e = null;
        this.f337f = new ArrayList();
        this.f338g = new ArrayList();
        this.a = parcel.createTypedArrayList(r.CREATOR);
        this.f333b = parcel.createStringArrayList();
        this.f334c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f335d = parcel.readInt();
        this.f336e = parcel.readString();
        this.f337f = parcel.createStringArrayList();
        this.f338g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f339h = parcel.createTypedArrayList(o.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.f333b);
        parcel.writeTypedArray(this.f334c, i2);
        parcel.writeInt(this.f335d);
        parcel.writeString(this.f336e);
        parcel.writeStringList(this.f337f);
        parcel.writeTypedList(this.f338g);
        parcel.writeTypedList(this.f339h);
    }
}
