package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new androidx.activity.result.b(2);
    public final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f297b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f298c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f299d;

    /* renamed from: e, reason: collision with root package name */
    public final int f300e;

    /* renamed from: f, reason: collision with root package name */
    public final String f301f;

    /* renamed from: g, reason: collision with root package name */
    public final int f302g;

    /* renamed from: h, reason: collision with root package name */
    public final int f303h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f304i;

    /* renamed from: j, reason: collision with root package name */
    public final int f305j;
    public final CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f306l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f307m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f308n;

    public b(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.f297b = parcel.createStringArrayList();
        this.f298c = parcel.createIntArray();
        this.f299d = parcel.createIntArray();
        this.f300e = parcel.readInt();
        this.f301f = parcel.readString();
        this.f302g = parcel.readInt();
        this.f303h = parcel.readInt();
        this.f304i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f305j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f306l = parcel.createStringArrayList();
        this.f307m = parcel.createStringArrayList();
        this.f308n = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.f297b);
        parcel.writeIntArray(this.f298c);
        parcel.writeIntArray(this.f299d);
        parcel.writeInt(this.f300e);
        parcel.writeString(this.f301f);
        parcel.writeInt(this.f302g);
        parcel.writeInt(this.f303h);
        TextUtils.writeToParcel(this.f304i, parcel, 0);
        parcel.writeInt(this.f305j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.f306l);
        parcel.writeStringList(this.f307m);
        parcel.writeInt(this.f308n ? 1 : 0);
    }
}
