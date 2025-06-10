package u0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2284d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2285e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2286f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2287g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2288h;

    /* renamed from: i, reason: collision with root package name */
    public int f2289i;

    /* renamed from: j, reason: collision with root package name */
    public int f2290j;
    public int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j.b(), new j.b(), new j.b());
    }

    @Override // u0.a
    public final b a() {
        Parcel parcel = this.f2285e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f2290j;
        if (i2 == this.f2286f) {
            i2 = this.f2287g;
        }
        return new b(parcel, iDataPosition, i2, this.f2288h + "  ", this.a, this.f2282b, this.f2283c);
    }

    @Override // u0.a
    public final boolean e(int i2) {
        while (this.f2290j < this.f2287g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f2290j;
            Parcel parcel = this.f2285e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.k = parcel.readInt();
            this.f2290j += i5;
        }
        return this.k == i2;
    }

    @Override // u0.a
    public final void h(int i2) {
        int i3 = this.f2289i;
        SparseIntArray sparseIntArray = this.f2284d;
        Parcel parcel = this.f2285e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f2289i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, j.b bVar, j.b bVar2, j.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f2284d = new SparseIntArray();
        this.f2289i = -1;
        this.k = -1;
        this.f2285e = parcel;
        this.f2286f = i2;
        this.f2287g = i3;
        this.f2290j = i2;
        this.f2288h = str;
    }
}
