package z0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.g2;

/* loaded from: classes.dex */
public final class d extends h0.b {
    public static final Parcelable.Creator<d> CREATOR = new g2(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f2385c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2386d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2387e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2388f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2389g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2385c = parcel.readInt();
        this.f2386d = parcel.readInt();
        this.f2387e = parcel.readInt() == 1;
        this.f2388f = parcel.readInt() == 1;
        this.f2389g = parcel.readInt() == 1;
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeInt(this.f2385c);
        parcel.writeInt(this.f2386d);
        parcel.writeInt(this.f2387e ? 1 : 0);
        parcel.writeInt(this.f2388f ? 1 : 0);
        parcel.writeInt(this.f2389g ? 1 : 0);
    }

    public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f2385c = bottomSheetBehavior.L;
        this.f2386d = bottomSheetBehavior.f594e;
        this.f2387e = bottomSheetBehavior.f588b;
        this.f2388f = bottomSheetBehavior.I;
        this.f2389g = bottomSheetBehavior.J;
    }
}
