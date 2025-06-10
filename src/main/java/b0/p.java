package b0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public abstract class p {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f495b;

    /* renamed from: c, reason: collision with root package name */
    public final int f496c;

    /* renamed from: d, reason: collision with root package name */
    public final int f497d;

    public p(int i2, Class cls, int i3, int i4) {
        this.a = i2;
        this.f495b = cls;
        this.f497d = i3;
        this.f496c = i4;
    }

    public static boolean a(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    public final Object b(View view) {
        if (!(Build.VERSION.SDK_INT >= this.f496c)) {
            Object tag = view.getTag(this.a);
            if (this.f495b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        n nVar = (n) this;
        int i2 = nVar.f493e;
        switch (i2) {
            case 0:
                return nVar.d(view);
            case 1:
                switch (i2) {
                    case 1:
                        return b0.b(view);
                    default:
                        return d0.a(view);
                }
            case 2:
                switch (i2) {
                    case 1:
                        return b0.b(view);
                    default:
                        return d0.a(view);
                }
            default:
                return nVar.d(view);
        }
    }

    public final void c(View view, Object obj) {
        boolean zA;
        if (Build.VERSION.SDK_INT >= this.f496c) {
            int i2 = ((n) this).f493e;
            switch (i2) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i2) {
                        case 0:
                            b0.i(view, bool.booleanValue());
                            break;
                        default:
                            b0.g(view, bool.booleanValue());
                            break;
                    }
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i2) {
                        case 1:
                            b0.h(view, charSequence);
                            break;
                        default:
                            d0.b(view, charSequence);
                            break;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i2) {
                        case 1:
                            b0.h(view, charSequence2);
                            break;
                        default:
                            d0.b(view, charSequence2);
                            break;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i2) {
                        case 0:
                            b0.i(view, bool2.booleanValue());
                            break;
                        default:
                            b0.g(view, bool2.booleanValue());
                            break;
                    }
            }
        }
        Object objB = b(view);
        int i3 = ((n) this).f493e;
        switch (i3) {
            case 0:
                Boolean bool3 = (Boolean) objB;
                Boolean bool4 = (Boolean) obj;
                switch (i3) {
                    case 0:
                        zA = a(bool3, bool4);
                        break;
                    default:
                        zA = a(bool3, bool4);
                        break;
                }
            case 1:
                CharSequence charSequence3 = (CharSequence) objB;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i3) {
                    case 1:
                        zA = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        zA = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
            case 2:
                CharSequence charSequence5 = (CharSequence) objB;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i3) {
                    case 1:
                        zA = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        zA = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
            default:
                Boolean bool5 = (Boolean) objB;
                Boolean bool6 = (Boolean) obj;
                switch (i3) {
                    case 0:
                        zA = a(bool5, bool6);
                        break;
                    default:
                        zA = a(bool5, bool6);
                        break;
                }
        }
        if (!zA) {
            int[] iArr = f0.a;
            View.AccessibilityDelegate accessibilityDelegateA = c0.a(view);
            c cVar = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof a ? ((a) accessibilityDelegateA).a : new c(accessibilityDelegateA);
            if (cVar == null) {
                cVar = new c();
            }
            f0.f(view, cVar);
            view.setTag(this.a, obj);
            f0.c(view, this.f497d);
        }
    }
}
