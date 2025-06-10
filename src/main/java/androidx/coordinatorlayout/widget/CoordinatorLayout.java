package androidx.coordinatorlayout.widget;

import a0.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b0.f0;
import b0.i;
import b0.j;
import b0.k;
import b0.r;
import b0.s;
import b0.v;
import b0.x;
import b0.x0;
import com.nothing.icon.R;
import f.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.d;
import p.a;
import q.b;
import q.e;
import q.g;
import q.h;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements i, j {

    /* renamed from: t, reason: collision with root package name */
    public static final String f183t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f184u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f185v;

    /* renamed from: w, reason: collision with root package name */
    public static final g f186w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f187x;
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final d f188b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f189c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f190d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f191e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f192f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f193g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f194h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f195i;

    /* renamed from: j, reason: collision with root package name */
    public View f196j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public e f197l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f198m;

    /* renamed from: n, reason: collision with root package name */
    public x0 f199n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f200o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f201p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f202q;

    /* renamed from: r, reason: collision with root package name */
    public f f203r;

    /* renamed from: s, reason: collision with root package name */
    public final k f204s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f183t = r0 != null ? r0.getName() : null;
        f186w = new g(0);
        f184u = new Class[]{Context.class, AttributeSet.class};
        f185v = new ThreadLocal();
        f187x = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.a = new ArrayList();
        this.f188b = new d(1);
        this.f189c = new ArrayList();
        this.f190d = new ArrayList();
        this.f191e = new int[2];
        this.f192f = new int[2];
        this.f204s = new k();
        int[] iArr = a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f195i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f195i[i2] = (int) (r3[i2] * f2);
            }
        }
        this.f201p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new q.c(this));
        int[] iArr2 = f0.a;
        if (r.c(this) == 0) {
            r.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f187x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i2, Rect rect, Rect rect2, q.d dVar, int i3, int i4) {
        int i5 = dVar.f2165c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = dVar.f2166d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int iWidth = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    public static q.d n(View view) {
        q.d dVar = (q.d) view.getLayoutParams();
        if (!dVar.f2164b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    q.a aVar = (q.a) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    q.a aVar2 = dVar.a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.a = aVar;
                        dVar.f2164b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            dVar.f2164b = true;
        }
        return dVar;
    }

    public static void u(View view, int i2) {
        q.d dVar = (q.d) view.getLayoutParams();
        int i3 = dVar.f2171i;
        if (i3 != i2) {
            int[] iArr = f0.a;
            view.offsetLeftAndRight(i2 - i3);
            dVar.f2171i = i2;
        }
    }

    public static void v(View view, int i2) {
        q.d dVar = (q.d) view.getLayoutParams();
        int i3 = dVar.f2172j;
        if (i3 != i2) {
            int[] iArr = f0.a;
            view.offsetTopAndBottom(i2 - i3);
            dVar.f2172j = i2;
        }
    }

    @Override // b0.i
    public final void a(View view, View view2, int i2, int i3) {
        k kVar = this.f204s;
        if (i3 == 1) {
            kVar.f488b = i2;
        } else {
            kVar.a = i2;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((q.d) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // b0.j
    public final void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        q.a aVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                q.d dVar = (q.d) childAt.getLayoutParams();
                if (dVar.a(i6) && (aVar = dVar.a) != null) {
                    int[] iArr2 = this.f191e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            p(1);
        }
    }

    @Override // b0.i
    public final void c(View view, int i2, int i3, int i4, int i5, int i6) {
        b(view, i2, i3, i4, i5, 0, this.f192f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // b0.i
    public final void d(View view, int i2) {
        k kVar = this.f204s;
        if (i2 == 1) {
            kVar.f488b = 0;
        } else {
            kVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            q.d dVar = (q.d) childAt.getLayoutParams();
            if (dVar.a(i2)) {
                q.a aVar = dVar.a;
                if (aVar != null) {
                    aVar.p(childAt, view, i2);
                }
                if (i2 == 0) {
                    dVar.f2175n = false;
                } else if (i2 == 1) {
                    dVar.f2176o = false;
                }
                dVar.getClass();
            }
        }
        this.k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        q.a aVar = ((q.d) view.getLayoutParams()).a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f201p;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // b0.i
    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
        q.a aVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                q.d dVar = (q.d) childAt.getLayoutParams();
                if (dVar.a(i4) && (aVar = dVar.a) != null) {
                    int[] iArr2 = this.f191e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(childAt, view, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            p(1);
        }
    }

    @Override // b0.i
    public final boolean f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                q.d dVar = (q.d) childAt.getLayoutParams();
                q.a aVar = dVar.a;
                if (aVar != null) {
                    boolean zO = aVar.o(childAt, i2, i3);
                    z2 |= zO;
                    if (i3 == 0) {
                        dVar.f2175n = zO;
                    } else if (i3 == 1) {
                        dVar.f2176o = zO;
                    }
                } else if (i3 == 0) {
                    dVar.f2175n = false;
                } else if (i3 == 1) {
                    dVar.f2176o = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new q.d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new q.d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.a);
    }

    public final x0 getLastWindowInsets() {
        return this.f199n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        k kVar = this.f204s;
        return kVar.f488b | kVar.a;
    }

    public Drawable getStatusBarBackground() {
        return this.f201p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(q.d dVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        j.k kVar = (j.k) this.f188b.f1546b;
        int i2 = kVar.f1463c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) kVar.j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.h(i3));
            }
        }
        ArrayList arrayList3 = this.f190d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = h.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.f2179b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i2) {
        StringBuilder sb;
        int[] iArr = this.f195i;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else {
            if (i2 >= 0 && i2 < iArr.length) {
                return iArr[i2];
            }
            sb = new StringBuilder("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final boolean o(View view, int i2, int i3) {
        c cVar = f187x;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i2, i3);
        } finally {
            rectG.setEmpty();
            cVar.b(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f198m) {
            if (this.f197l == null) {
                this.f197l = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f197l);
        }
        if (this.f199n == null) {
            int[] iArr = f0.a;
            if (r.b(this)) {
                v.c(this);
            }
        }
        this.f194h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f198m && this.f197l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f197l);
        }
        View view = this.k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f194h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f200o || this.f201p == null) {
            return;
        }
        x0 x0Var = this.f199n;
        int iB = x0Var != null ? x0Var.b() : 0;
        if (iB > 0) {
            this.f201p.setBounds(0, 0, getWidth(), iB);
            this.f201p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        q.a aVar;
        int[] iArr = f0.a;
        int iD = s.d(this);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((aVar = ((q.d) view.getLayoutParams()).a) == null || !aVar.g(this, view, iD))) {
                q(view, iD);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                q.d dVar = (q.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    q.a aVar = dVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        q.a aVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                q.d dVar = (q.d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.a) != null) {
                    zI |= aVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        e(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        c(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof q.f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q.f fVar = (q.f) parcelable;
        super.onRestoreInstanceState(fVar.a);
        SparseArray sparseArray = fVar.f2178c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            q.a aVar = n(childAt).a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        q.f fVar = new q.f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            q.a aVar = ((q.d) childAt.getLayoutParams()).a;
            if (id != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        fVar.f2178c = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r3
  0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f196j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f196j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            q.d r6 = (q.d) r6
            q.a r6 = r6.a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f196j
            boolean r6 = r6.q(r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f196j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c1 A[EDGE_INSN: B:130:0x02c1->B:119:0x02c1 BREAK  A[LOOP:2: B:113:0x02a5->B:118:0x02bc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r25) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i2) {
        Rect rectG;
        Rect rectG2;
        q.d dVar = (q.d) view.getLayoutParams();
        View view2 = dVar.k;
        int i3 = 0;
        if (view2 == null && dVar.f2168f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f187x;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                k(view2, rectG);
                q.d dVar2 = (q.d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i2, rectG, rectG2, dVar2, measuredWidth, measuredHeight);
                h(dVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                cVar.b(rectG);
                rectG2.setEmpty();
                cVar.b(rectG2);
            }
        }
        int i4 = dVar.f2167e;
        if (i4 < 0) {
            q.d dVar3 = (q.d) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.f199n != null) {
                int[] iArr = f0.a;
                if (r.b(this) && !r.b(view)) {
                    rectG.left = this.f199n.a.h().a + rectG.left;
                    rectG.top = this.f199n.b() + rectG.top;
                    rectG.right -= this.f199n.a.h().f2278c;
                    rectG.bottom -= this.f199n.a.h().f2279d;
                }
            }
            rectG2 = g();
            int i5 = dVar3.f2165c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            b0.e.b(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i2);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        q.d dVar4 = (q.d) view.getLayoutParams();
        int i6 = dVar4.f2165c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int iM = m(i4) - measuredWidth2;
        if (i7 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i7 == 5) {
            iM += measuredWidth2;
        }
        if (i8 == 16) {
            i3 = 0 + (measuredHeight2 / 2);
        } else if (i8 == 80) {
            i3 = measuredHeight2 + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i2) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f189c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        g gVar = f186w;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            q.d dVar = (q.d) view.getLayoutParams();
            q.a aVar = dVar.a;
            if (!(zF || z3) || actionMasked == 0) {
                if (!zF && aVar != null) {
                    if (i2 == 0) {
                        zF = aVar.f(this, view, motionEvent);
                    } else if (i2 == 1) {
                        zF = aVar.q(view, motionEvent);
                    }
                    if (zF) {
                        this.f196j = view;
                    }
                }
                if (dVar.a == null) {
                    dVar.f2174m = false;
                }
                boolean z4 = dVar.f2174m;
                if (z4) {
                    z2 = true;
                } else {
                    z2 = z4 | false;
                    dVar.f2174m = z2;
                }
                z3 = z2 && !z4;
                if (z2 && !z3) {
                    break;
                }
            } else if (aVar != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    aVar.f(this, view, motionEventObtain);
                } else if (i2 == 1) {
                    aVar.q(view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        q.a aVar = ((q.d) view.getLayoutParams()).a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f193g) {
            return;
        }
        t(false);
        this.f193g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f202q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f201p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f201p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f201p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f201p;
                int[] iArr = f0.a;
                v.c.b(drawable3, s.d(this));
                this.f201p.setVisible(getVisibility() == 0, false);
                this.f201p.setCallback(this);
            }
            int[] iArr2 = f0.a;
            r.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawableB;
        if (i2 != 0) {
            Context context = getContext();
            Object obj = s.c.a;
            drawableB = s.a.b(context, i2);
        } else {
            drawableB = null;
        }
        setStatusBarBackground(drawableB);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f201p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f201p.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            q.a aVar = ((q.d) childAt.getLayoutParams()).a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    aVar.f(this, childAt, motionEventObtain);
                } else {
                    aVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((q.d) getChildAt(i3).getLayoutParams()).f2174m = false;
        }
        this.f196j = null;
        this.f193g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f201p;
    }

    public final void w() {
        int[] iArr = f0.a;
        if (!r.b(this)) {
            x.u(this, null);
            return;
        }
        if (this.f203r == null) {
            this.f203r = new f(5, this);
        }
        x.u(this, this.f203r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q.d ? new q.d((q.d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q.d((ViewGroup.MarginLayoutParams) layoutParams) : new q.d(layoutParams);
    }
}
