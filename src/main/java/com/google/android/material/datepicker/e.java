package com.google.android.material.datepicker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.nothing.icon.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class e<S> extends androidx.fragment.app.i {

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f661o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f662p;

    public e() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f661o = new LinkedHashSet();
        this.f662p = new LinkedHashSet();
    }

    public static boolean j(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f1.e.z0(context, R.attr.materialCalendarStyle, c.class.getCanonicalName()).data, new int[]{i2});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f661o.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f662p.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
