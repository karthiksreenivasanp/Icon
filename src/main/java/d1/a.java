package d1;

import android.content.Context;
import android.util.TypedValue;
import com.nothing.icon.R;
import f1.e;
import s.b;
import s.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f776f = (int) Math.round(5.1000000000000005d);
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f777b;

    /* renamed from: c, reason: collision with root package name */
    public final int f778c;

    /* renamed from: d, reason: collision with root package name */
    public final int f779d;

    /* renamed from: e, reason: collision with root package name */
    public final float f780e;

    public a(Context context) {
        int iA;
        int iA2;
        TypedValue typedValueW0 = e.w0(context, R.attr.elevationOverlayEnabled);
        int iA3 = 0;
        boolean z2 = (typedValueW0 == null || typedValueW0.type != 18 || typedValueW0.data == 0) ? false : true;
        TypedValue typedValueW02 = e.w0(context, R.attr.elevationOverlayColor);
        if (typedValueW02 != null) {
            int i2 = typedValueW02.resourceId;
            if (i2 != 0) {
                Object obj = c.a;
                iA = b.a(context, i2);
            } else {
                iA = typedValueW02.data;
            }
        } else {
            iA = 0;
        }
        TypedValue typedValueW03 = e.w0(context, R.attr.elevationOverlayAccentColor);
        if (typedValueW03 != null) {
            int i3 = typedValueW03.resourceId;
            if (i3 != 0) {
                Object obj2 = c.a;
                iA2 = b.a(context, i3);
            } else {
                iA2 = typedValueW03.data;
            }
        } else {
            iA2 = 0;
        }
        TypedValue typedValueW04 = e.w0(context, R.attr.colorSurface);
        if (typedValueW04 != null) {
            int i4 = typedValueW04.resourceId;
            if (i4 != 0) {
                Object obj3 = c.a;
                iA3 = b.a(context, i4);
            } else {
                iA3 = typedValueW04.data;
            }
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = z2;
        this.f777b = iA;
        this.f778c = iA2;
        this.f779d = iA3;
        this.f780e = f2;
    }
}
