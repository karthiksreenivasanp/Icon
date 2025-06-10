package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class g implements Comparable, Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new androidx.activity.result.b(11);
    public final Calendar a;

    /* renamed from: b, reason: collision with root package name */
    public final int f663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f664c;

    /* renamed from: d, reason: collision with root package name */
    public final int f665d;

    public g(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = j.a(calendar);
        this.a = calendarA;
        this.f663b = calendarA.get(2);
        this.f664c = calendarA.get(1);
        calendarA.getMaximum(7);
        this.f665d = calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((g) obj).a);
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
        return this.f663b == gVar.f663b && this.f664c == gVar.f664c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f663b), Integer.valueOf(this.f664c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f664c);
        parcel.writeInt(this.f663b);
    }
}
