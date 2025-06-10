package o0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class e1 implements Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new androidx.activity.result.b(8);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1993b;

    /* renamed from: c, reason: collision with root package name */
    public int f1994c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1995d;

    /* renamed from: e, reason: collision with root package name */
    public int f1996e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1997f;

    /* renamed from: g, reason: collision with root package name */
    public List f1998g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1999h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2000i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2001j;

    public e1() {
    }

    public e1(Parcel parcel) {
        this.a = parcel.readInt();
        this.f1993b = parcel.readInt();
        int i2 = parcel.readInt();
        this.f1994c = i2;
        if (i2 > 0) {
            int[] iArr = new int[i2];
            this.f1995d = iArr;
            parcel.readIntArray(iArr);
        }
        int i3 = parcel.readInt();
        this.f1996e = i3;
        if (i3 > 0) {
            int[] iArr2 = new int[i3];
            this.f1997f = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.f1999h = parcel.readInt() == 1;
        this.f2000i = parcel.readInt() == 1;
        this.f2001j = parcel.readInt() == 1;
        this.f1998g = parcel.readArrayList(d1.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f1993b);
        parcel.writeInt(this.f1994c);
        if (this.f1994c > 0) {
            parcel.writeIntArray(this.f1995d);
        }
        parcel.writeInt(this.f1996e);
        if (this.f1996e > 0) {
            parcel.writeIntArray(this.f1997f);
        }
        parcel.writeInt(this.f1999h ? 1 : 0);
        parcel.writeInt(this.f2000i ? 1 : 0);
        parcel.writeInt(this.f2001j ? 1 : 0);
        parcel.writeList(this.f1998g);
    }

    public e1(e1 e1Var) {
        this.f1994c = e1Var.f1994c;
        this.a = e1Var.a;
        this.f1993b = e1Var.f1993b;
        this.f1995d = e1Var.f1995d;
        this.f1996e = e1Var.f1996e;
        this.f1997f = e1Var.f1997f;
        this.f1999h = e1Var.f1999h;
        this.f2000i = e1Var.f2000i;
        this.f2001j = e1Var.f2001j;
        this.f1998g = e1Var.f1998g;
    }
}
