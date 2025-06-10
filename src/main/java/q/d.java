package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public a a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2164b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2165c;

    /* renamed from: d, reason: collision with root package name */
    public int f2166d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2167e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2168f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2169g;

    /* renamed from: h, reason: collision with root package name */
    public int f2170h;

    /* renamed from: i, reason: collision with root package name */
    public int f2171i;

    /* renamed from: j, reason: collision with root package name */
    public int f2172j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public View f2173l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2174m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2175n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2176o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f2177p;

    public d() {
        super(-2, -2);
        this.f2164b = false;
        this.f2165c = 0;
        this.f2166d = 0;
        this.f2167e = -1;
        this.f2168f = -1;
        this.f2169g = 0;
        this.f2170h = 0;
        this.f2177p = new Rect();
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.f2175n;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f2176o;
    }

    public d(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        a aVar;
        super(context, attributeSet);
        this.f2164b = false;
        this.f2165c = 0;
        this.f2166d = 0;
        this.f2167e = -1;
        this.f2168f = -1;
        this.f2169g = 0;
        this.f2170h = 0;
        this.f2177p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.a.f2153b);
        this.f2165c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f2168f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f2166d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f2167e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f2169g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f2170h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f2164b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f183t;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f183t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f185v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f184u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.a = aVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2164b = false;
        this.f2165c = 0;
        this.f2166d = 0;
        this.f2167e = -1;
        this.f2168f = -1;
        this.f2169g = 0;
        this.f2170h = 0;
        this.f2177p = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2164b = false;
        this.f2165c = 0;
        this.f2166d = 0;
        this.f2167e = -1;
        this.f2168f = -1;
        this.f2169g = 0;
        this.f2170h = 0;
        this.f2177p = new Rect();
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f2164b = false;
        this.f2165c = 0;
        this.f2166d = 0;
        this.f2167e = -1;
        this.f2168f = -1;
        this.f2169g = 0;
        this.f2170h = 0;
        this.f2177p = new Rect();
    }
}
