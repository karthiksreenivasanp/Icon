package j1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import g.g2;

/* loaded from: classes.dex */
public final class c extends h0.b {
    public static final Parcelable.Creator<c> CREATOR = new g2(9);

    /* renamed from: c, reason: collision with root package name */
    public final int f1472c;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1472c = parcel.readInt();
    }

    @Override // h0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.a, i2);
        parcel.writeInt(this.f1472c);
    }

    public c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f1472c = sideSheetBehavior.f681h;
    }
}
