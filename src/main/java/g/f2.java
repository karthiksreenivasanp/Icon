package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class f2 {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1077b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1078c;

    public f2(Context context, TypedArray typedArray) {
        this.a = context;
        this.f1077b = typedArray;
    }

    public static f2 m(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new f2(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public final boolean a(int i2, boolean z2) {
        return ((TypedArray) this.f1077b).getBoolean(i2, z2);
    }

    public final ColorStateList b(int i2) {
        int resourceId;
        ColorStateList colorStateListA;
        Object obj = this.f1077b;
        return (!((TypedArray) obj).hasValue(i2) || (resourceId = ((TypedArray) obj).getResourceId(i2, 0)) == 0 || (colorStateListA = s.c.a((Context) this.a, resourceId)) == null) ? ((TypedArray) obj).getColorStateList(i2) : colorStateListA;
    }

    public final int c(int i2, int i3) {
        return ((TypedArray) this.f1077b).getDimensionPixelOffset(i2, i3);
    }

    public final int d(int i2, int i3) {
        return ((TypedArray) this.f1077b).getDimensionPixelSize(i2, i3);
    }

    public final Drawable e(int i2) {
        int resourceId;
        Object obj = this.f1077b;
        return (!((TypedArray) obj).hasValue(i2) || (resourceId = ((TypedArray) obj).getResourceId(i2, 0)) == 0) ? ((TypedArray) obj).getDrawable(i2) : f1.e.M((Context) this.a, resourceId);
    }

    public final Typeface f(int i2, int i3, c0 c0Var) {
        int resourceId = ((TypedArray) this.f1077b).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f1078c) == null) {
            this.f1078c = new TypedValue();
        }
        Context context = (Context) this.a;
        TypedValue typedValue = (TypedValue) this.f1078c;
        ThreadLocal threadLocal = t.n.a;
        if (context.isRestricted()) {
            return null;
        }
        return t.n.b(context, resourceId, typedValue, i3, c0Var, true, false);
    }

    public final int g(int i2, int i3) {
        return ((TypedArray) this.f1077b).getInt(i2, i3);
    }

    public final int h(int i2, int i3) {
        return ((TypedArray) this.f1077b).getResourceId(i2, i3);
    }

    public final String i(int i2) {
        return ((TypedArray) this.f1077b).getString(i2);
    }

    public final CharSequence j(int i2) {
        return ((TypedArray) this.f1077b).getText(i2);
    }

    public final boolean k(int i2) {
        return ((TypedArray) this.f1077b).hasValue(i2);
    }

    public final boolean l(o.e eVar, m.e eVar2, boolean z2) {
        n.b bVar = (n.b) this.f1077b;
        int[] iArr = eVar2.f1723c0;
        bVar.a = iArr[0];
        bVar.f1807b = iArr[1];
        bVar.f1808c = eVar2.l();
        bVar.f1809d = eVar2.j();
        bVar.f1814i = false;
        bVar.f1815j = z2;
        boolean z3 = bVar.a == 3;
        boolean z4 = bVar.f1807b == 3;
        boolean z5 = z3 && eVar2.L > 0.0f;
        boolean z6 = z4 && eVar2.L > 0.0f;
        int[] iArr2 = eVar2.f1731l;
        if (z5 && iArr2[0] == 4) {
            bVar.a = 1;
        }
        if (z6 && iArr2[1] == 4) {
            bVar.f1807b = 1;
        }
        eVar.a(eVar2, bVar);
        eVar2.y(bVar.f1810e);
        eVar2.v(bVar.f1811f);
        eVar2.f1742w = bVar.f1813h;
        int i2 = bVar.f1812g;
        eVar2.P = i2;
        eVar2.f1742w = i2 > 0;
        bVar.f1815j = false;
        return bVar.f1814i;
    }

    public final void n() {
        ((TypedArray) this.f1077b).recycle();
    }

    public final void o(m.f fVar, int i2, int i3) {
        int i4 = fVar.Q;
        int i5 = fVar.R;
        fVar.Q = 0;
        fVar.R = 0;
        fVar.y(i2);
        fVar.v(i3);
        if (i4 < 0) {
            i4 = 0;
        }
        fVar.Q = i4;
        if (i5 < 0) {
            i5 = 0;
        }
        fVar.R = i5;
        ((m.f) this.f1078c).E();
    }

    public f2(p2 p2Var) {
        this.f1077b = new CopyOnWriteArrayList();
        this.f1078c = new HashMap();
        this.a = p2Var;
    }

    public f2(m.f fVar) {
        this.a = new ArrayList();
        this.f1077b = new n.b();
        this.f1078c = fVar;
    }
}
