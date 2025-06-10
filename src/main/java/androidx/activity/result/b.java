package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.o;
import androidx.fragment.app.q;
import androidx.fragment.app.r;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.g;
import com.google.android.material.datepicker.j;
import f0.l;
import java.util.Calendar;
import java.util.Objects;
import o0.d1;
import o0.e1;
import o0.y;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new c(parcel);
            case 1:
                return new l(parcel);
            case 2:
                return new androidx.fragment.app.b(parcel);
            case 3:
                return new o(parcel);
            case 4:
                return new q(parcel);
            case 5:
                return new r(parcel);
            case 6:
                return new y(parcel);
            case 7:
                return new d1(parcel);
            case 8:
                return new e1(parcel);
            case 9:
                return new ParcelImpl(parcel);
            case 10:
                g gVar = (g) parcel.readParcelable(g.class.getClassLoader());
                g gVar2 = (g) parcel.readParcelable(g.class.getClassLoader());
                a.c(parcel.readParcelable(com.google.android.material.datepicker.a.class.getClassLoader()));
                parcel.readInt();
                Objects.requireNonNull(gVar, "start cannot be null");
                Objects.requireNonNull(gVar2, "end cannot be null");
                Objects.requireNonNull((Object) null, "validator cannot be null");
                throw null;
            case 11:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                Calendar calendarB = j.b(null);
                calendarB.set(1, i2);
                calendarB.set(2, i3);
                return new g(calendarB);
            default:
                return new com.google.android.material.timepicker.g(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.a) {
            case 0:
                return new c[i2];
            case 1:
                return new l[i2];
            case 2:
                return new androidx.fragment.app.b[i2];
            case 3:
                return new o[i2];
            case 4:
                return new q[i2];
            case 5:
                return new r[i2];
            case 6:
                return new y[i2];
            case 7:
                return new d1[i2];
            case 8:
                return new e1[i2];
            case 9:
                return new ParcelImpl[i2];
            case 10:
                return new com.google.android.material.datepicker.b[i2];
            case 11:
                return new g[i2];
            default:
                return new com.google.android.material.timepicker.g[i2];
        }
    }
}
