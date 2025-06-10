package b0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class h {
    public ViewParent a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f481b;

    /* renamed from: c, reason: collision with root package name */
    public final View f482c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f483d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f484e;

    public h(View view) {
        this.f482c = view;
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent viewParentF;
        if (!this.f483d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return i0.a(viewParentF, this.f482c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent viewParentF;
        if (!this.f483d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return i0.b(viewParentF, this.f482c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public final boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentF;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f483d || (viewParentF = f(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f482c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            int i7 = iArr2[0];
            i6 = iArr2[1];
            i5 = i7;
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f484e == null) {
                this.f484e = new int[2];
            }
            iArr3 = this.f484e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f482c;
        if (viewParentF instanceof i) {
            ((i) viewParentF).e(view2, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                i0.c(viewParentF, view2, i2, i3, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i2, int i3, int i4, int[] iArr) {
        e(0, i2, 0, i3, null, i4, iArr);
    }

    public final boolean e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentF;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f483d || (viewParentF = f(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f482c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f484e == null) {
                this.f484e = new int[2];
            }
            int[] iArr4 = this.f484e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f482c;
        if (viewParentF instanceof j) {
            ((j) viewParentF).b(view2, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (viewParentF instanceof i) {
                ((i) viewParentF).c(view2, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    i0.d(viewParentF, view2, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent f(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f481b;
    }

    public final boolean g(int i2, int i3) {
        boolean zF;
        if (f(i3) != null) {
            return true;
        }
        if (this.f483d) {
            View view = this.f482c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof i;
                if (z2) {
                    zF = ((i) parent).f(view2, view, i2, i3);
                } else if (i3 == 0) {
                    try {
                        zF = i0.f(parent, view2, view, i2);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i3 == 0) {
                        this.a = parent;
                    } else if (i3 == 1) {
                        this.f481b = parent;
                    }
                    if (z2) {
                        ((i) parent).a(view2, view, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            i0.e(parent, view2, view, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void h(int i2) {
        ViewParent viewParentF = f(i2);
        if (viewParentF != null) {
            boolean z2 = viewParentF instanceof i;
            View view = this.f482c;
            if (z2) {
                ((i) viewParentF).d(view, i2);
            } else if (i2 == 0) {
                try {
                    i0.g(viewParentF, view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentF + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f481b = null;
            }
        }
    }
}
