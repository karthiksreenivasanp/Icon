package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1962d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f1963e;
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1964b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1965c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1963e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f180m) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f180m.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet) {
        StringBuilder sb;
        i iVar = new i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            l lVar = iVar.f1905b;
            k kVar = iVar.f1906c;
            m mVar = iVar.f1908e;
            j jVar = iVar.f1907d;
            if (index != 1 && 23 != index && 24 != index) {
                kVar.getClass();
                jVar.getClass();
                lVar.getClass();
                mVar.getClass();
            }
            SparseIntArray sparseIntArray = f1963e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    jVar.f1932o = f(typedArrayObtainStyledAttributes, index, jVar.f1932o);
                    break;
                case 2:
                    jVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.F);
                    break;
                case 3:
                    jVar.f1931n = f(typedArrayObtainStyledAttributes, index, jVar.f1931n);
                    break;
                case 4:
                    jVar.f1930m = f(typedArrayObtainStyledAttributes, index, jVar.f1930m);
                    break;
                case 5:
                    jVar.f1939v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    jVar.f1943z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f1943z);
                    break;
                case 7:
                    jVar.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.A);
                    break;
                case 8:
                    jVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.G);
                    break;
                case 9:
                    jVar.f1936s = f(typedArrayObtainStyledAttributes, index, jVar.f1936s);
                    break;
                case 10:
                    jVar.f1935r = f(typedArrayObtainStyledAttributes, index, jVar.f1935r);
                    break;
                case 11:
                    jVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.L);
                    break;
                case 12:
                    jVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.M);
                    break;
                case 13:
                    jVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.I);
                    break;
                case 14:
                    jVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.K);
                    break;
                case 15:
                    jVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.N);
                    break;
                case 16:
                    jVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.J);
                    break;
                case 17:
                    jVar.f1916d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f1916d);
                    break;
                case 18:
                    jVar.f1918e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f1918e);
                    break;
                case 19:
                    jVar.f1920f = typedArrayObtainStyledAttributes.getFloat(index, jVar.f1920f);
                    break;
                case 20:
                    jVar.f1937t = typedArrayObtainStyledAttributes.getFloat(index, jVar.f1937t);
                    break;
                case 21:
                    jVar.f1914c = typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f1914c);
                    break;
                case 22:
                    lVar.a = f1962d[typedArrayObtainStyledAttributes.getInt(index, lVar.a)];
                    break;
                case 23:
                    jVar.f1912b = typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f1912b);
                    break;
                case 24:
                    jVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.C);
                    break;
                case 25:
                    jVar.f1922g = f(typedArrayObtainStyledAttributes, index, jVar.f1922g);
                    break;
                case 26:
                    jVar.f1924h = f(typedArrayObtainStyledAttributes, index, jVar.f1924h);
                    break;
                case 27:
                    jVar.B = typedArrayObtainStyledAttributes.getInt(index, jVar.B);
                    break;
                case 28:
                    jVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.D);
                    break;
                case 29:
                    jVar.f1926i = f(typedArrayObtainStyledAttributes, index, jVar.f1926i);
                    break;
                case 30:
                    jVar.f1928j = f(typedArrayObtainStyledAttributes, index, jVar.f1928j);
                    break;
                case 31:
                    jVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.H);
                    break;
                case 32:
                    jVar.f1933p = f(typedArrayObtainStyledAttributes, index, jVar.f1933p);
                    break;
                case 33:
                    jVar.f1934q = f(typedArrayObtainStyledAttributes, index, jVar.f1934q);
                    break;
                case 34:
                    jVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.E);
                    break;
                case 35:
                    jVar.f1929l = f(typedArrayObtainStyledAttributes, index, jVar.f1929l);
                    break;
                case 36:
                    jVar.k = f(typedArrayObtainStyledAttributes, index, jVar.k);
                    break;
                case 37:
                    jVar.f1938u = typedArrayObtainStyledAttributes.getFloat(index, jVar.f1938u);
                    break;
                case 38:
                    iVar.a = typedArrayObtainStyledAttributes.getResourceId(index, iVar.a);
                    break;
                case 39:
                    jVar.P = typedArrayObtainStyledAttributes.getFloat(index, jVar.P);
                    break;
                case 40:
                    jVar.O = typedArrayObtainStyledAttributes.getFloat(index, jVar.O);
                    break;
                case 41:
                    jVar.Q = typedArrayObtainStyledAttributes.getInt(index, jVar.Q);
                    break;
                case 42:
                    jVar.R = typedArrayObtainStyledAttributes.getInt(index, jVar.R);
                    break;
                case 43:
                    lVar.f1949c = typedArrayObtainStyledAttributes.getFloat(index, lVar.f1949c);
                    break;
                case 44:
                    mVar.k = true;
                    mVar.f1961l = typedArrayObtainStyledAttributes.getDimension(index, mVar.f1961l);
                    break;
                case 45:
                    mVar.f1952b = typedArrayObtainStyledAttributes.getFloat(index, mVar.f1952b);
                    break;
                case 46:
                    mVar.f1953c = typedArrayObtainStyledAttributes.getFloat(index, mVar.f1953c);
                    break;
                case 47:
                    mVar.f1954d = typedArrayObtainStyledAttributes.getFloat(index, mVar.f1954d);
                    break;
                case 48:
                    mVar.f1955e = typedArrayObtainStyledAttributes.getFloat(index, mVar.f1955e);
                    break;
                case 49:
                    mVar.f1956f = typedArrayObtainStyledAttributes.getDimension(index, mVar.f1956f);
                    break;
                case 50:
                    mVar.f1957g = typedArrayObtainStyledAttributes.getDimension(index, mVar.f1957g);
                    break;
                case 51:
                    mVar.f1958h = typedArrayObtainStyledAttributes.getDimension(index, mVar.f1958h);
                    break;
                case 52:
                    mVar.f1959i = typedArrayObtainStyledAttributes.getDimension(index, mVar.f1959i);
                    break;
                case 53:
                    mVar.f1960j = typedArrayObtainStyledAttributes.getDimension(index, mVar.f1960j);
                    break;
                case 54:
                    jVar.S = typedArrayObtainStyledAttributes.getInt(index, jVar.S);
                    break;
                case 55:
                    jVar.T = typedArrayObtainStyledAttributes.getInt(index, jVar.T);
                    break;
                case 56:
                    jVar.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.U);
                    break;
                case 57:
                    jVar.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.V);
                    break;
                case 58:
                    jVar.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.W);
                    break;
                case 59:
                    jVar.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.X);
                    break;
                case 60:
                    mVar.a = typedArrayObtainStyledAttributes.getFloat(index, mVar.a);
                    break;
                case 61:
                    jVar.f1940w = f(typedArrayObtainStyledAttributes, index, jVar.f1940w);
                    break;
                case 62:
                    jVar.f1941x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f1941x);
                    break;
                case 63:
                    jVar.f1942y = typedArrayObtainStyledAttributes.getFloat(index, jVar.f1942y);
                    break;
                case 64:
                    kVar.a = f(typedArrayObtainStyledAttributes, index, kVar.a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = f1.e.f1032h[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    kVar.getClass();
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    kVar.getClass();
                    break;
                case 67:
                    kVar.f1947d = typedArrayObtainStyledAttributes.getFloat(index, kVar.f1947d);
                    break;
                case 68:
                    lVar.f1950d = typedArrayObtainStyledAttributes.getFloat(index, lVar.f1950d);
                    break;
                case 69:
                    jVar.Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    jVar.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    jVar.f1911a0 = typedArrayObtainStyledAttributes.getInt(index, jVar.f1911a0);
                    break;
                case 73:
                    jVar.f1913b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f1913b0);
                    break;
                case 74:
                    jVar.f1919e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    jVar.f1927i0 = typedArrayObtainStyledAttributes.getBoolean(index, jVar.f1927i0);
                    break;
                case 76:
                    kVar.f1945b = typedArrayObtainStyledAttributes.getInt(index, kVar.f1945b);
                    break;
                case 77:
                    jVar.f1921f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    lVar.f1948b = typedArrayObtainStyledAttributes.getInt(index, lVar.f1948b);
                    break;
                case 79:
                    kVar.f1946c = typedArrayObtainStyledAttributes.getFloat(index, kVar.f1946c);
                    break;
                case 80:
                    jVar.f1923g0 = typedArrayObtainStyledAttributes.getBoolean(index, jVar.f1923g0);
                    break;
                case 81:
                    jVar.f1925h0 = typedArrayObtainStyledAttributes.getBoolean(index, jVar.f1925h0);
                    break;
                case 82:
                    sb = new StringBuilder("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(sparseIntArray.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                default:
                    sb = new StringBuilder("Unknown attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(sparseIntArray.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    public final void a(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i2;
        HashMap map;
        StringBuilder sb;
        String resourceEntryName;
        n nVar = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nVar.f1965c;
        HashSet hashSet = new HashSet(map2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout2.getChildAt(i3);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (nVar.f1964b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        i iVar = (i) map2.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            iVar.f1907d.f1915c0 = 1;
                        }
                        int i4 = iVar.f1907d.f1915c0;
                        if (i4 != -1 && i4 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            j jVar = iVar.f1907d;
                            barrier.setType(jVar.f1911a0);
                            barrier.setMargin(jVar.f1913b0);
                            barrier.setAllowsGoneWidget(jVar.f1927i0);
                            int[] iArr = jVar.f1917d0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = jVar.f1919e0;
                                if (str != null) {
                                    int[] iArrC = c(barrier, str);
                                    jVar.f1917d0 = iArrC;
                                    barrier.setReferencedIds(iArrC);
                                }
                            }
                        }
                        d dVar = (d) childAt.getLayoutParams();
                        dVar.a();
                        iVar.a(dVar);
                        HashMap map3 = iVar.f1909f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map3.keySet()) {
                            a aVar = (a) map3.get(str2);
                            int i5 = childCount;
                            String str3 = "set" + str2;
                            try {
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                map = map3;
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                map = map3;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                map = map3;
                            }
                            switch (l.k.a(aVar.a)) {
                                case 0:
                                    map = map3;
                                    Class<?>[] clsArr = new Class[1];
                                    try {
                                        clsArr[0] = Integer.TYPE;
                                        cls.getMethod(str3, clsArr).invoke(childAt, Integer.valueOf(aVar.f1846b));
                                    } catch (IllegalAccessException e5) {
                                        e = e5;
                                        sb = new StringBuilder(" Custom Attribute \"");
                                        sb.append(str2);
                                        sb.append("\" not found on ");
                                        sb.append(cls.getName());
                                        Log.e("TransitionLayout", sb.toString());
                                        e.printStackTrace();
                                        childCount = i5;
                                        map3 = map;
                                    } catch (NoSuchMethodException e6) {
                                        e = e6;
                                        Log.e("TransitionLayout", e.getMessage());
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str3);
                                        childCount = i5;
                                        map3 = map;
                                    } catch (InvocationTargetException e7) {
                                        e = e7;
                                        sb = new StringBuilder(" Custom Attribute \"");
                                        sb.append(str2);
                                        sb.append("\" not found on ");
                                        sb.append(cls.getName());
                                        Log.e("TransitionLayout", sb.toString());
                                        e.printStackTrace();
                                        childCount = i5;
                                        map3 = map;
                                    }
                                    childCount = i5;
                                    map3 = map;
                                case 1:
                                    map = map3;
                                    cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f1847c));
                                    childCount = i5;
                                    map3 = map;
                                    break;
                                case 2:
                                    map = map3;
                                    cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f1850f));
                                    childCount = i5;
                                    map3 = map;
                                    break;
                                case 3:
                                    map = map3;
                                    Method method = cls.getMethod(str3, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(aVar.f1850f);
                                    method.invoke(childAt, colorDrawable);
                                    childCount = i5;
                                    map3 = map;
                                    break;
                                case 4:
                                    map = map3;
                                    cls.getMethod(str3, CharSequence.class).invoke(childAt, aVar.f1848d);
                                    childCount = i5;
                                    map3 = map;
                                    break;
                                case 5:
                                    map = map3;
                                    cls.getMethod(str3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f1849e));
                                    childCount = i5;
                                    map3 = map;
                                    break;
                                case 6:
                                    map = map3;
                                    try {
                                        cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f1847c));
                                    } catch (IllegalAccessException e8) {
                                        e = e8;
                                        sb = new StringBuilder(" Custom Attribute \"");
                                        sb.append(str2);
                                        sb.append("\" not found on ");
                                        sb.append(cls.getName());
                                        Log.e("TransitionLayout", sb.toString());
                                        e.printStackTrace();
                                        childCount = i5;
                                        map3 = map;
                                    } catch (NoSuchMethodException e9) {
                                        e = e9;
                                        Log.e("TransitionLayout", e.getMessage());
                                        Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str3);
                                        childCount = i5;
                                        map3 = map;
                                    } catch (InvocationTargetException e10) {
                                        e = e10;
                                        sb = new StringBuilder(" Custom Attribute \"");
                                        sb.append(str2);
                                        sb.append("\" not found on ");
                                        sb.append(cls.getName());
                                        Log.e("TransitionLayout", sb.toString());
                                        e.printStackTrace();
                                        childCount = i5;
                                        map3 = map;
                                    }
                                    childCount = i5;
                                    map3 = map;
                                default:
                                    childCount = i5;
                                    break;
                            }
                        }
                        i2 = childCount;
                        childAt.setLayoutParams(dVar);
                        l lVar = iVar.f1905b;
                        if (lVar.f1948b == 0) {
                            childAt.setVisibility(lVar.a);
                        }
                        childAt.setAlpha(lVar.f1949c);
                        m mVar = iVar.f1908e;
                        childAt.setRotation(mVar.a);
                        childAt.setRotationX(mVar.f1952b);
                        childAt.setRotationY(mVar.f1953c);
                        childAt.setScaleX(mVar.f1954d);
                        childAt.setScaleY(mVar.f1955e);
                        if (!Float.isNaN(mVar.f1956f)) {
                            childAt.setPivotX(mVar.f1956f);
                        }
                        if (!Float.isNaN(mVar.f1957g)) {
                            childAt.setPivotY(mVar.f1957g);
                        }
                        childAt.setTranslationX(mVar.f1958h);
                        childAt.setTranslationY(mVar.f1959i);
                        childAt.setTranslationZ(mVar.f1960j);
                        if (mVar.k) {
                            childAt.setElevation(mVar.f1961l);
                        }
                    } else {
                        i2 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i3++;
                nVar = this;
                constraintLayout2 = constraintLayout;
                childCount = i2;
            }
            i2 = childCount;
            i3++;
            nVar = this;
            constraintLayout2 = constraintLayout;
            childCount = i2;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) map2.get(num);
            j jVar2 = iVar2.f1907d;
            int i6 = jVar2.f1915c0;
            if (i6 == -1 || i6 != 1) {
                viewGroup = constraintLayout;
            } else {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = jVar2.f1917d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str4 = jVar2.f1919e0;
                    if (str4 != null) {
                        int[] iArrC2 = c(barrier2, str4);
                        jVar2.f1917d0 = iArrC2;
                        barrier2.setReferencedIds(iArrC2);
                    }
                }
                barrier2.setType(jVar2.f1911a0);
                barrier2.setMargin(jVar2.f1913b0);
                int i7 = ConstraintLayout.f169p;
                d dVar2 = new d();
                barrier2.g();
                iVar2.a(dVar2);
                viewGroup = constraintLayout;
                viewGroup.addView(barrier2, dVar2);
            }
            if (jVar2.a) {
                p pVar = new p(constraintLayout.getContext());
                pVar.setId(num.intValue());
                int i8 = ConstraintLayout.f169p;
                d dVar3 = new d();
                iVar2.a(dVar3);
                viewGroup.addView(pVar, dVar3);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i2;
        a aVar;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = nVar.f1965c;
        map.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f1964b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) map.get(Integer.valueOf(id));
            HashMap map2 = nVar.a;
            HashMap map3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                a aVar2 = (a) map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        aVar = new a(aVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        i2 = childCount;
                    } else {
                        i2 = childCount;
                        try {
                            aVar = new a(aVar2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                            e = e2;
                            e.printStackTrace();
                            childCount = i2;
                        }
                    }
                    map3.put(str, aVar);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    e = e3;
                    i2 = childCount;
                }
                childCount = i2;
            }
            int i4 = childCount;
            iVar.f1909f = map3;
            iVar.a = id;
            int i5 = dVar.f1861d;
            j jVar = iVar.f1907d;
            jVar.f1922g = i5;
            jVar.f1924h = dVar.f1863e;
            jVar.f1926i = dVar.f1865f;
            jVar.f1928j = dVar.f1867g;
            jVar.k = dVar.f1869h;
            jVar.f1929l = dVar.f1871i;
            jVar.f1930m = dVar.f1873j;
            jVar.f1931n = dVar.k;
            jVar.f1932o = dVar.f1876l;
            jVar.f1933p = dVar.f1880p;
            jVar.f1934q = dVar.f1881q;
            jVar.f1935r = dVar.f1882r;
            jVar.f1936s = dVar.f1883s;
            jVar.f1937t = dVar.f1890z;
            jVar.f1938u = dVar.A;
            jVar.f1939v = dVar.B;
            jVar.f1940w = dVar.f1877m;
            jVar.f1941x = dVar.f1878n;
            jVar.f1942y = dVar.f1879o;
            jVar.f1943z = dVar.P;
            jVar.A = dVar.Q;
            jVar.B = dVar.R;
            jVar.f1920f = dVar.f1859c;
            jVar.f1916d = dVar.a;
            jVar.f1918e = dVar.f1857b;
            jVar.f1912b = ((ViewGroup.MarginLayoutParams) dVar).width;
            jVar.f1914c = ((ViewGroup.MarginLayoutParams) dVar).height;
            jVar.C = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            jVar.D = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
            jVar.E = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
            jVar.F = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            jVar.O = dVar.E;
            jVar.P = dVar.D;
            jVar.R = dVar.G;
            jVar.Q = dVar.F;
            jVar.f1923g0 = dVar.S;
            jVar.f1925h0 = dVar.T;
            jVar.S = dVar.H;
            jVar.T = dVar.I;
            jVar.U = dVar.L;
            jVar.V = dVar.M;
            jVar.W = dVar.J;
            jVar.X = dVar.K;
            jVar.Y = dVar.N;
            jVar.Z = dVar.O;
            jVar.f1921f0 = dVar.U;
            jVar.J = dVar.f1885u;
            jVar.L = dVar.f1887w;
            jVar.I = dVar.f1884t;
            jVar.K = dVar.f1886v;
            jVar.N = dVar.f1888x;
            jVar.M = dVar.f1889y;
            jVar.G = dVar.getMarginEnd();
            jVar.H = dVar.getMarginStart();
            int visibility = childAt.getVisibility();
            l lVar = iVar.f1905b;
            lVar.a = visibility;
            lVar.f1949c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            m mVar = iVar.f1908e;
            mVar.a = rotation;
            mVar.f1952b = childAt.getRotationX();
            mVar.f1953c = childAt.getRotationY();
            mVar.f1954d = childAt.getScaleX();
            mVar.f1955e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                mVar.f1956f = pivotX;
                mVar.f1957g = pivotY;
            }
            mVar.f1958h = childAt.getTranslationX();
            mVar.f1959i = childAt.getTranslationY();
            mVar.f1960j = childAt.getTranslationZ();
            if (mVar.k) {
                mVar.f1961l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                jVar.f1927i0 = barrier.f168i.f1688g0;
                jVar.f1917d0 = barrier.getReferencedIds();
                jVar.f1911a0 = barrier.getType();
                jVar.f1913b0 = barrier.getMargin();
            }
            i3++;
            nVar = this;
            childCount = i4;
        }
    }

    public final void e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i iVarD = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        iVarD.f1907d.a = true;
                    }
                    this.f1965c.put(Integer.valueOf(iVarD.a), iVarD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
