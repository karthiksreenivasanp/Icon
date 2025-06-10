package g;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g2 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ g2(int i2) {
        this.a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new h2(parcel, null);
            case 1:
                return new x2(parcel, null);
            case 2:
                return new q.f(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return h0.b.f1288b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new o0.u0(parcel, null);
            case 5:
                return new x0.b(parcel, null);
            case 6:
                return new z0.d(parcel, (ClassLoader) null);
            case 7:
                return new a1.b(parcel, null);
            case 8:
                return new e1.a(parcel, null);
            case 9:
                return new j1.c(parcel, (ClassLoader) null);
            default:
                return new l1.y(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.a) {
            case 0:
                return new h2[i2];
            case 1:
                return new x2[i2];
            case 2:
                return new q.f[i2];
            case 3:
                return new h0.b[i2];
            case 4:
                return new o0.u0[i2];
            case 5:
                return new x0.b[i2];
            case 6:
                return new z0.d[i2];
            case 7:
                return new a1.b[i2];
            case 8:
                return new e1.a[i2];
            case 9:
                return new j1.c[i2];
            default:
                return new l1.y[i2];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new h2(parcel, classLoader);
            case 1:
                return new x2(parcel, classLoader);
            case 2:
                return new q.f(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return h0.b.f1288b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new o0.u0(parcel, classLoader);
            case 5:
                return new x0.b(parcel, classLoader);
            case 6:
                return new z0.d(parcel, classLoader);
            case 7:
                return new a1.b(parcel, classLoader);
            case 8:
                return new e1.a(parcel, classLoader);
            case 9:
                return new j1.c(parcel, classLoader);
            default:
                return new l1.y(parcel, classLoader);
        }
    }
}
