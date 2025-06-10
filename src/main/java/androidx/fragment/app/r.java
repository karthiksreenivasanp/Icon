package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new androidx.activity.result.b(5);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f340b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f341c;

    /* renamed from: d, reason: collision with root package name */
    public final int f342d;

    /* renamed from: e, reason: collision with root package name */
    public final int f343e;

    /* renamed from: f, reason: collision with root package name */
    public final String f344f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f345g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f346h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f347i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f348j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f349l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f350m;

    public r(Parcel parcel) {
        this.a = parcel.readString();
        this.f340b = parcel.readString();
        this.f341c = parcel.readInt() != 0;
        this.f342d = parcel.readInt();
        this.f343e = parcel.readInt();
        this.f344f = parcel.readString();
        this.f345g = parcel.readInt() != 0;
        this.f346h = parcel.readInt() != 0;
        this.f347i = parcel.readInt() != 0;
        this.f348j = parcel.readBundle();
        this.k = parcel.readInt() != 0;
        this.f350m = parcel.readBundle();
        this.f349l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.f340b);
        sb.append(")}:");
        if (this.f341c) {
            sb.append(" fromLayout");
        }
        int i2 = this.f343e;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f344f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f345g) {
            sb.append(" retainInstance");
        }
        if (this.f346h) {
            sb.append(" removing");
        }
        if (this.f347i) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.f340b);
        parcel.writeInt(this.f341c ? 1 : 0);
        parcel.writeInt(this.f342d);
        parcel.writeInt(this.f343e);
        parcel.writeString(this.f344f);
        parcel.writeInt(this.f345g ? 1 : 0);
        parcel.writeInt(this.f346h ? 1 : 0);
        parcel.writeInt(this.f347i ? 1 : 0);
        parcel.writeBundle(this.f348j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.f350m);
        parcel.writeInt(this.f349l);
    }
}
