package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import u0.a;
import u0.b;
import u0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.a;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f205b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2285e);
        }
        remoteActionCompat.f205b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f206c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2285e);
        }
        remoteActionCompat.f206c = charSequence2;
        remoteActionCompat.f207d = (PendingIntent) aVar.f(remoteActionCompat.f207d, 4);
        boolean z2 = remoteActionCompat.f208e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).f2285e.readInt() != 0;
        }
        remoteActionCompat.f208e = z2;
        boolean z3 = remoteActionCompat.f209f;
        if (aVar.e(6)) {
            z3 = ((b) aVar).f2285e.readInt() != 0;
        }
        remoteActionCompat.f209f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f205b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f2285e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f206c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f207d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f208e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f209f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
