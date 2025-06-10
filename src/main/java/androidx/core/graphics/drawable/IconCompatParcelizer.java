package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import u0.a;
import u0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f2285e.readInt();
        }
        iconCompat.a = i2;
        byte[] bArr = iconCompat.f211c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f2285e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f211c = bArr;
        iconCompat.f212d = aVar.f(iconCompat.f212d, 3);
        int i4 = iconCompat.f213e;
        if (aVar.e(4)) {
            i4 = ((b) aVar).f2285e.readInt();
        }
        iconCompat.f213e = i4;
        int i5 = iconCompat.f214f;
        if (aVar.e(5)) {
            i5 = ((b) aVar).f2285e.readInt();
        }
        iconCompat.f214f = i5;
        iconCompat.f215g = (ColorStateList) aVar.f(iconCompat.f215g, 6);
        String string = iconCompat.f217i;
        if (aVar.e(7)) {
            string = ((b) aVar).f2285e.readString();
        }
        iconCompat.f217i = string;
        String string2 = iconCompat.f218j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f2285e.readString();
        }
        iconCompat.f218j = string2;
        iconCompat.f216h = PorterDuff.Mode.valueOf(iconCompat.f217i);
        switch (iconCompat.a) {
            case -1:
                parcelable = iconCompat.f212d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f210b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f212d;
                if (parcelable != null) {
                    iconCompat.f210b = parcelable;
                } else {
                    byte[] bArr3 = iconCompat.f211c;
                    iconCompat.f210b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.f213e = 0;
                    iconCompat.f214f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f211c, Charset.forName("UTF-16"));
                iconCompat.f210b = str;
                if (iconCompat.a == 2 && iconCompat.f218j == null) {
                    iconCompat.f218j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f210b = iconCompat.f211c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f217i = iconCompat.f216h.name();
        switch (iconCompat.a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f212d = (Parcelable) iconCompat.f210b;
                break;
            case 2:
                iconCompat.f211c = ((String) iconCompat.f210b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f211c = (byte[]) iconCompat.f210b;
                break;
            case 4:
            case 6:
                iconCompat.f211c = iconCompat.f210b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f2285e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f211c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f2285e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f212d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f2285e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f213e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f2285e.writeInt(i3);
        }
        int i4 = iconCompat.f214f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f2285e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f215g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f2285e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f217i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f2285e.writeString(str);
        }
        String str2 = iconCompat.f218j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f2285e.writeString(str2);
        }
    }
}
