package g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class l2 {
    public static final ThreadLocal a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1167b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1168c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1169d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1170e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1171f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1172g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(b.a.f464h);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList colorStateListD = d(context, i2);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f1167b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return u.a.c(c(context, i2), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(Context context, int i2) {
        int[] iArr = f1172g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1172g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = s.c.a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
