package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import b0.f0;
import b0.i;
import b0.j;
import b0.k;
import b0.o0;
import b0.r;
import b0.v;
import b0.v0;
import b0.x;
import b0.x0;
import com.nothing.icon.R;
import g.e;
import g.r0;
import g.z2;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements i, j {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f74y = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f75b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarContainer f76c;

    /* renamed from: d, reason: collision with root package name */
    public r0 f77d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f78e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f79f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f80g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f81h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f83j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f84l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f85m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f86n;

    /* renamed from: o, reason: collision with root package name */
    public x0 f87o;

    /* renamed from: p, reason: collision with root package name */
    public x0 f88p;

    /* renamed from: q, reason: collision with root package name */
    public x0 f89q;

    /* renamed from: r, reason: collision with root package name */
    public x0 f90r;

    /* renamed from: s, reason: collision with root package name */
    public OverScroller f91s;

    /* renamed from: t, reason: collision with root package name */
    public ViewPropertyAnimator f92t;

    /* renamed from: u, reason: collision with root package name */
    public final g.b f93u;

    /* renamed from: v, reason: collision with root package name */
    public final g.c f94v;

    /* renamed from: w, reason: collision with root package name */
    public final g.c f95w;

    /* renamed from: x, reason: collision with root package name */
    public final k f96x;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f84l = new Rect();
        this.f85m = new Rect();
        this.f86n = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        x0 x0Var = x0.f503b;
        this.f87o = x0Var;
        this.f88p = x0Var;
        this.f89q = x0Var;
        this.f90r = x0Var;
        this.f93u = new g.b(0, this);
        this.f94v = new g.c(this, 0);
        this.f95w = new g.c(this, 1);
        i(context);
        this.f96x = new k();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z2) {
        boolean z3;
        e eVar = (e) frameLayout.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // b0.i
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // b0.j
    public final void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c(view, i2, i3, i4, i5, i6);
    }

    @Override // b0.i
    public final void c(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // b0.i
    public final void d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f78e == null || this.f79f) {
            return;
        }
        if (this.f76c.getVisibility() == 0) {
            translationY = (int) (this.f76c.getTranslationY() + this.f76c.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f78e.setBounds(0, translationY, getWidth(), this.f78e.getIntrinsicHeight() + translationY);
        this.f78e.draw(canvas);
    }

    @Override // b0.i
    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // b0.i
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f76c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        k kVar = this.f96x;
        return kVar.f488b | kVar.a;
    }

    public CharSequence getTitle() {
        j();
        return ((z2) this.f77d).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f94v);
        removeCallbacks(this.f95w);
        ViewPropertyAnimator viewPropertyAnimator = this.f92t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f74y);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f78e = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f79f = context.getApplicationInfo().targetSdkVersion < 19;
        this.f91s = new OverScroller(context);
    }

    public final void j() {
        r0 wrapper;
        if (this.f75b == null) {
            this.f75b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f76c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof r0) {
                wrapper = (r0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f77d = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        x0 x0VarD = x0.d(this, windowInsets);
        v0 v0Var = x0VarD.a;
        boolean zG = g(this.f76c, new Rect(v0Var.h().a, x0VarD.b(), v0Var.h().f2278c, v0Var.h().f2279d), false);
        int[] iArr = f0.a;
        Rect rect = this.f84l;
        x.b(this, x0VarD, rect);
        x0 x0VarI = v0Var.i(rect.left, rect.top, rect.right, rect.bottom);
        this.f87o = x0VarI;
        boolean z2 = true;
        if (!this.f88p.equals(x0VarI)) {
            this.f88p = this.f87o;
            zG = true;
        }
        Rect rect2 = this.f85m;
        if (rect2.equals(rect)) {
            z2 = zG;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return v0Var.a().a.c().a.b().c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        int[] iArr = f0.a;
        v.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        x0 x0VarB;
        j();
        measureChildWithMargins(this.f76c, i2, 0, i3, 0);
        e eVar = (e) this.f76c.getLayoutParams();
        int iMax = Math.max(0, this.f76c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f76c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f76c.getMeasuredState());
        int[] iArr = f0.a;
        boolean z2 = (r.g(this) & 256) != 0;
        if (z2) {
            measuredHeight = this.a;
            if (this.f81h && this.f76c.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.f76c.getVisibility() != 8 ? this.f76c.getMeasuredHeight() : 0;
        }
        Rect rect = this.f84l;
        Rect rect2 = this.f86n;
        rect2.set(rect);
        x0 x0Var = this.f87o;
        this.f89q = x0Var;
        if (this.f80g || z2) {
            u.c cVarB = u.c.b(x0Var.a.h().a, this.f89q.b() + measuredHeight, this.f89q.a.h().f2278c, this.f89q.a.h().f2279d + 0);
            o0 o0Var = new o0(this.f89q);
            o0Var.f(cVarB);
            x0VarB = o0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            x0VarB = x0Var.a.i(0, measuredHeight, 0, 0);
        }
        this.f89q = x0VarB;
        g(this.f75b, rect2, true);
        if (!this.f90r.equals(this.f89q)) {
            x0 x0Var2 = this.f89q;
            this.f90r = x0Var2;
            ContentFrameLayout contentFrameLayout = this.f75b;
            WindowInsets windowInsetsC = x0Var2.c();
            if (windowInsetsC != null) {
                WindowInsets windowInsetsA = v.a(contentFrameLayout, windowInsetsC);
                if (!windowInsetsA.equals(windowInsetsC)) {
                    x0.d(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.f75b, i2, 0, i3, 0);
        e eVar2 = (e) this.f75b.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f75b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f75b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f75b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f82i || !z2) {
            return false;
        }
        this.f91s.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f91s.getFinalY() > this.f76c.getHeight()) {
            h();
            this.f95w.run();
        } else {
            h();
            this.f94v.run();
        }
        this.f83j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.k + i3;
        this.k = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f96x.a = i2;
        this.k = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f76c.getVisibility() != 0) {
            return false;
        }
        return this.f82i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f82i || this.f83j) {
            return;
        }
        if (this.k <= this.f76c.getHeight()) {
            h();
            postDelayed(this.f94v, 600L);
        } else {
            h();
            postDelayed(this.f95w, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f76c.setTranslationY(-Math.max(0, Math.min(i2, this.f76c.getHeight())));
    }

    public void setActionBarVisibilityCallback(g.d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f81h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f82i) {
            this.f82i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        j();
        z2 z2Var = (z2) this.f77d;
        z2Var.f1269d = i2 != 0 ? f1.e.M(z2Var.a.getContext(), i2) : null;
        z2Var.b();
    }

    public void setLogo(int i2) {
        j();
        z2 z2Var = (z2) this.f77d;
        z2Var.f1270e = i2 != 0 ? f1.e.M(z2Var.a.getContext(), i2) : null;
        z2Var.b();
    }

    public void setOverlayMode(boolean z2) {
        this.f80g = z2;
        this.f79f = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((z2) this.f77d).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        z2 z2Var = (z2) this.f77d;
        if (z2Var.f1272g) {
            return;
        }
        z2Var.f1273h = charSequence;
        if ((z2Var.f1267b & 8) != 0) {
            Toolbar toolbar = z2Var.a;
            toolbar.setTitle(charSequence);
            if (z2Var.f1272g) {
                f0.g(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        z2 z2Var = (z2) this.f77d;
        z2Var.f1269d = drawable;
        z2Var.b();
    }
}
