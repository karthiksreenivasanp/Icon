package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.f0;
import b0.r;
import b0.u;
import b0.x;
import c0.t;
import com.nothing.icon.R;
import f.f;
import i0.d;
import i1.g;
import i1.k;
import j1.b;
import j1.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.a;
import z0.e;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {
    public f a;

    /* renamed from: b, reason: collision with root package name */
    public g f675b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f676c;

    /* renamed from: d, reason: collision with root package name */
    public final k f677d;

    /* renamed from: e, reason: collision with root package name */
    public final e f678e;

    /* renamed from: f, reason: collision with root package name */
    public final float f679f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f680g;

    /* renamed from: h, reason: collision with root package name */
    public int f681h;

    /* renamed from: i, reason: collision with root package name */
    public d f682i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f683j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public int f684l;

    /* renamed from: m, reason: collision with root package name */
    public int f685m;

    /* renamed from: n, reason: collision with root package name */
    public int f686n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f687o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f688p;

    /* renamed from: q, reason: collision with root package name */
    public int f689q;

    /* renamed from: r, reason: collision with root package name */
    public VelocityTracker f690r;

    /* renamed from: s, reason: collision with root package name */
    public int f691s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f692t;

    /* renamed from: u, reason: collision with root package name */
    public final b f693u;

    public SideSheetBehavior() {
        this.f678e = new e(this);
        this.f680g = true;
        this.f681h = 5;
        this.k = 0.1f;
        this.f689q = -1;
        this.f692t = new LinkedHashSet();
        this.f693u = new b(this);
    }

    @Override // q.a
    public final void c(q.d dVar) {
        this.f687o = null;
        this.f682i = null;
    }

    @Override // q.a
    public final void e() {
        this.f687o = null;
        this.f682i = null;
    }

    @Override // q.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar;
        VelocityTracker velocityTracker;
        if (!((view.isShown() || f0.a(view) != null) && this.f680g)) {
            this.f683j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f690r) != null) {
            velocityTracker.recycle();
            this.f690r = null;
        }
        if (this.f690r == null) {
            this.f690r = VelocityTracker.obtain();
        }
        this.f690r.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f691s = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f683j) {
            this.f683j = false;
            return false;
        }
        return (this.f683j || (dVar = this.f682i) == null || !dVar.r(motionEvent)) ? false : true;
    }

    @Override // q.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3;
        int i4;
        View viewFindViewById;
        int[] iArr = f0.a;
        if (r.b(coordinatorLayout) && !r.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.f687o == null) {
            this.f687o = new WeakReference(view);
            g gVar = this.f675b;
            if (gVar != null) {
                r.q(view, gVar);
                g gVar2 = this.f675b;
                float fI = this.f679f;
                if (fI == -1.0f) {
                    fI = x.i(view);
                }
                gVar2.i(fI);
            } else {
                ColorStateList colorStateList = this.f676c;
                if (colorStateList != null) {
                    x.q(view, colorStateList);
                }
            }
            int i5 = this.f681h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            t();
            if (r.c(view) == 0) {
                r.s(view, 1);
            }
            if (f0.a(view) == null) {
                f0.g(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f682i == null) {
            this.f682i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f693u);
        }
        f fVar = this.a;
        fVar.getClass();
        int left2 = view.getLeft() - ((SideSheetBehavior) fVar.f875b).f686n;
        coordinatorLayout.q(view, i2);
        this.f685m = coordinatorLayout.getWidth();
        this.f684l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            this.a.getClass();
            i3 = marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        this.f686n = i3;
        int i6 = this.f681h;
        if (i6 == 1 || i6 == 2) {
            f fVar2 = this.a;
            fVar2.getClass();
            left = left2 - (view.getLeft() - ((SideSheetBehavior) fVar2.f875b).f686n);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f681h);
            }
            left = this.a.n();
        }
        view.offsetLeftAndRight(left);
        if (this.f688p == null && (i4 = this.f689q) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f688p = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f692t.iterator();
        while (it.hasNext()) {
            androidx.activity.result.a.d(it.next());
        }
        return true;
    }

    @Override // q.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // q.a
    public final void m(View view, Parcelable parcelable) {
        int i2 = ((c) parcelable).f1472c;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f681h = i2;
    }

    @Override // q.a
    public final Parcelable n(View view) {
        return new c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // q.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z2 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f681h;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.f682i;
        if (dVar != null && (this.f680g || i2 == 1)) {
            dVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f690r) != null) {
            velocityTracker.recycle();
            this.f690r = null;
        }
        if (this.f690r == null) {
            this.f690r = VelocityTracker.obtain();
        }
        this.f690r.addMovement(motionEvent);
        d dVar2 = this.f682i;
        if ((dVar2 != null && (this.f680g || this.f681h == 1)) && actionMasked == 2 && !this.f683j) {
            if ((dVar2 != null && (this.f680g || this.f681h == 1)) && Math.abs(this.f691s - motionEvent.getX()) > this.f682i.f1315b) {
                z2 = true;
            }
            if (z2) {
                this.f682i.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f683j;
    }

    public final void r(int i2) {
        View view;
        if (this.f681h == i2) {
            return;
        }
        this.f681h = i2;
        WeakReference weakReference = this.f687o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = this.f681h == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
        Iterator it = this.f692t.iterator();
        if (it.hasNext()) {
            androidx.activity.result.a.d(it.next());
            throw null;
        }
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            f.f r0 = r3.a
            java.lang.Object r0 = r0.f875b
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            r1 = 3
            if (r5 == r1) goto L2a
            r1 = 5
            if (r5 != r1) goto L13
            f.f r1 = r0.a
            int r1 = r1.n()
            goto L30
        L13:
            r0.getClass()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid state to get outer edge offset: "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2a:
            f.f r1 = r0.a
            int r1 = r1.m()
        L30:
            i0.d r0 = r0.f682i
            r2 = 0
            if (r0 == 0) goto L5f
            if (r6 == 0) goto L42
            int r4 = r4.getTop()
            boolean r4 = r0.q(r1, r4)
            if (r4 == 0) goto L5f
            goto L5e
        L42:
            int r6 = r4.getTop()
            r0.f1330r = r4
            r4 = -1
            r0.f1316c = r4
            boolean r4 = r0.i(r1, r6, r2, r2)
            if (r4 != 0) goto L5c
            int r6 = r0.a
            if (r6 != 0) goto L5c
            android.view.View r6 = r0.f1330r
            if (r6 == 0) goto L5c
            r6 = 0
            r0.f1330r = r6
        L5c:
            if (r4 == 0) goto L5f
        L5e:
            r2 = 1
        L5f:
            if (r2 == 0) goto L6b
            r4 = 2
            r3.r(r4)
            z0.e r3 = r3.f678e
            r3.a(r5)
            goto L6e
        L6b:
            r3.r(r5)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.s(android.view.View, int, boolean):void");
    }

    public final void t() {
        View view;
        WeakReference weakReference = this.f687o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        f0.d(view, 262144);
        f0.c(view, 0);
        f0.d(view, 1048576);
        f0.c(view, 0);
        final int i2 = 5;
        if (this.f681h != 5) {
            f0.e(view, c0.f.f522j, new t() { // from class: j1.a
                /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
                @Override // c0.t
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean c(android.view.View r4) {
                    /*
                        r3 = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r4 = r3.a
                        r4.getClass()
                        r0 = 1
                        int r3 = r2
                        if (r3 == r0) goto L4b
                        r1 = 2
                        if (r3 != r1) goto Le
                        goto L4b
                    Le:
                        java.lang.ref.WeakReference r1 = r4.f687o
                        if (r1 == 0) goto L47
                        java.lang.Object r1 = r1.get()
                        if (r1 != 0) goto L19
                        goto L47
                    L19:
                        java.lang.ref.WeakReference r1 = r4.f687o
                        java.lang.Object r1 = r1.get()
                        android.view.View r1 = (android.view.View) r1
                        t.m r2 = new t.m
                        r2.<init>(r3, r0, r4)
                        android.view.ViewParent r3 = r1.getParent()
                        if (r3 == 0) goto L3c
                        boolean r3 = r3.isLayoutRequested()
                        if (r3 == 0) goto L3c
                        int[] r3 = b0.f0.a
                        boolean r3 = b0.u.b(r1)
                        if (r3 == 0) goto L3c
                        r3 = r0
                        goto L3d
                    L3c:
                        r3 = 0
                    L3d:
                        if (r3 == 0) goto L43
                        r1.post(r2)
                        goto L4a
                    L43:
                        r2.run()
                        goto L4a
                    L47:
                        r4.r(r3)
                    L4a:
                        return r0
                    L4b:
                        java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "STATE_"
                        r1.<init>(r2)
                        if (r3 != r0) goto L59
                        java.lang.String r3 = "DRAGGING"
                        goto L5b
                    L59:
                        java.lang.String r3 = "SETTLING"
                    L5b:
                        r1.append(r3)
                        java.lang.String r3 = " should not be set externally."
                        r1.append(r3)
                        java.lang.String r3 = r1.toString()
                        r4.<init>(r3)
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: j1.a.c(android.view.View):boolean");
                }
            });
        }
        final int i3 = 3;
        if (this.f681h != 3) {
            f0.e(view, c0.f.f520h, new t() { // from class: j1.a
                @Override // c0.t
                public final boolean c(View v2) {
                    /*
                        this = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r4 = r3.a
                        r4.getClass()
                        r0 = 1
                        int r3 = r2
                        if (r3 == r0) goto L4b
                        r1 = 2
                        if (r3 != r1) goto Le
                        goto L4b
                    Le:
                        java.lang.ref.WeakReference r1 = r4.f687o
                        if (r1 == 0) goto L47
                        java.lang.Object r1 = r1.get()
                        if (r1 != 0) goto L19
                        goto L47
                    L19:
                        java.lang.ref.WeakReference r1 = r4.f687o
                        java.lang.Object r1 = r1.get()
                        android.view.View r1 = (android.view.View) r1
                        t.m r2 = new t.m
                        r2.<init>(r3, r0, r4)
                        android.view.ViewParent r3 = r1.getParent()
                        if (r3 == 0) goto L3c
                        boolean r3 = r3.isLayoutRequested()
                        if (r3 == 0) goto L3c
                        int[] r3 = b0.f0.a
                        boolean r3 = b0.u.b(r1)
                        if (r3 == 0) goto L3c
                        r3 = r0
                        goto L3d
                    L3c:
                        r3 = 0
                    L3d:
                        if (r3 == 0) goto L43
                        r1.post(r2)
                        goto L4a
                    L43:
                        r2.run()
                        goto L4a
                    L47:
                        r4.r(r3)
                    L4a:
                        return r0
                    L4b:
                        java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "STATE_"
                        r1.<init>(r2)
                        if (r3 != r0) goto L59
                        java.lang.String r3 = "DRAGGING"
                        goto L5b
                    L59:
                        java.lang.String r3 = "SETTLING"
                    L5b:
                        r1.append(r3)
                        java.lang.String r3 = " should not be set externally."
                        r1.append(r3)
                        java.lang.String r3 = r1.toString()
                        r4.<init>(r3)
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: j1.a.c(android.view.View):boolean");
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f678e = new e(this);
        this.f680g = true;
        this.f681h = 5;
        this.k = 0.1f;
        this.f689q = -1;
        this.f692t = new LinkedHashSet();
        this.f693u = new b(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2304p);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f676c = f1.e.J(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f677d = new k(k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f689q = resourceId;
            WeakReference weakReference = this.f688p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f688p = null;
            WeakReference weakReference2 = this.f687o;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    int[] iArr = f0.a;
                    if (u.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f677d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f675b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f676c;
            if (colorStateList != null) {
                this.f675b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f675b.setTint(typedValue.data);
            }
        }
        this.f679f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f680g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.a == null) {
            this.a = new f(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
