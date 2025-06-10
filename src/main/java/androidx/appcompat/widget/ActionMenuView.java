package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import f.f;
import f.j;
import f.k;
import f.l;
import f.r;
import g.b1;
import g.c1;
import g.d3;
import g.m;
import g.n;
import i1.e;

/* loaded from: classes.dex */
public class ActionMenuView extends c1 implements k {

    /* renamed from: p, reason: collision with root package name */
    public l f97p;

    /* renamed from: q, reason: collision with root package name */
    public Context f98q;

    /* renamed from: r, reason: collision with root package name */
    public int f99r;

    /* renamed from: s, reason: collision with root package name */
    public g.k f100s;

    /* renamed from: t, reason: collision with root package name */
    public r f101t;

    /* renamed from: u, reason: collision with root package name */
    public j f102u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f103v;

    /* renamed from: w, reason: collision with root package name */
    public int f104w;

    /* renamed from: x, reason: collision with root package name */
    public final int f105x;

    /* renamed from: y, reason: collision with root package name */
    public final int f106y;

    /* renamed from: z, reason: collision with root package name */
    public n f107z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f105x = (int) (56.0f * f2);
        this.f106y = (int) (f2 * 4.0f);
        this.f98q = context;
        this.f99r = 0;
    }

    public static m i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            m mVar = new m();
            ((LinearLayout.LayoutParams) mVar).gravity = 16;
            return mVar;
        }
        m mVar2 = layoutParams instanceof m ? new m((m) layoutParams) : new m(layoutParams);
        if (((LinearLayout.LayoutParams) mVar2).gravity <= 0) {
            ((LinearLayout.LayoutParams) mVar2).gravity = 16;
        }
        return mVar2;
    }

    @Override // f.k
    public final boolean a(f.m mVar) {
        return this.f97p.p(mVar, null, 0);
    }

    @Override // g.c1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // g.c1
    /* renamed from: e */
    public final b1 generateDefaultLayoutParams() {
        m mVar = new m();
        ((LinearLayout.LayoutParams) mVar).gravity = 16;
        return mVar;
    }

    @Override // g.c1
    /* renamed from: f */
    public final b1 generateLayoutParams(AttributeSet attributeSet) {
        return new m(getContext(), attributeSet);
    }

    @Override // g.c1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ b1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // g.c1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = new m();
        ((LinearLayout.LayoutParams) mVar).gravity = 16;
        return mVar;
    }

    @Override // g.c1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f97p == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f97p = lVar;
            lVar.f911e = new f(3, this);
            g.k kVar = new g.k(context);
            this.f100s = kVar;
            kVar.k = true;
            kVar.f1114l = true;
            r eVar = this.f101t;
            if (eVar == null) {
                eVar = new e(3, null);
            }
            kVar.f1108e = eVar;
            this.f97p.b(kVar, this.f98q);
            g.k kVar2 = this.f100s;
            kVar2.f1110g = this;
            this.f97p = kVar2.f1106c;
        }
        return this.f97p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        g.k kVar = this.f100s;
        g.j jVar = kVar.f1111h;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (kVar.f1113j) {
            return kVar.f1112i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f99r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i2) {
        boolean zB = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof g.l)) {
            zB = false | ((g.l) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof g.l)) ? zB : zB | ((g.l) childAt2).a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g.k kVar = this.f100s;
        if (kVar != null) {
            kVar.b();
            g.f fVar = this.f100s.f1120r;
            if (fVar != null && fVar.b()) {
                this.f100s.e();
                this.f100s.f();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g.k kVar = this.f100s;
        if (kVar != null) {
            kVar.e();
            g.f fVar = kVar.f1121s;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f958j.j();
        }
    }

    @Override // g.c1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f103v) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zA = d3.a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                m mVar = (m) childAt.getLayoutParams();
                if (mVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) mVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) mVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) mVar).leftMargin) + ((LinearLayout.LayoutParams) mVar).rightMargin;
                    j(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                m mVar2 = (m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) mVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) mVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            m mVar3 = (m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.a) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) mVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) mVar3).rightMargin + iMax + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // g.c1, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        ?? r4;
        int i9;
        int i10;
        int i11;
        l lVar;
        boolean z4 = this.f103v;
        boolean z5 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f103v = z5;
        if (z4 != z5) {
            this.f104w = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f103v && (lVar = this.f97p) != null && size != this.f104w) {
            this.f104w = size;
            lVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f103v || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                m mVar = (m) getChildAt(i12).getLayoutParams();
                ((LinearLayout.LayoutParams) mVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) mVar).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i13 = size2 - paddingRight;
        int i14 = this.f105x;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i18 = 0;
        int iMax2 = 0;
        int i19 = 0;
        boolean z6 = false;
        int i20 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f106y;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = i13;
            if (childAt.getVisibility() == 8) {
                i9 = mode;
                i10 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i23 = i18 + 1;
                if (z7) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                m mVar2 = (m) childAt.getLayoutParams();
                mVar2.f1177f = false;
                mVar2.f1174c = 0;
                mVar2.f1173b = 0;
                mVar2.f1175d = false;
                ((LinearLayout.LayoutParams) mVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) mVar2).rightMargin = 0;
                mVar2.f1176e = z7 && ((ActionMenuItemView) childAt).p();
                int i24 = mVar2.a ? 1 : i15;
                m mVar3 = (m) childAt.getLayoutParams();
                i9 = mode;
                i10 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = actionMenuItemView != null && actionMenuItemView.p();
                if (i24 <= 0 || (z8 && i24 < 2)) {
                    i11 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i24 * i17, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i11 = measuredWidth / i17;
                    if (measuredWidth % i17 != 0) {
                        i11++;
                    }
                    if (z8 && i11 < 2) {
                        i11 = 2;
                    }
                }
                mVar3.f1175d = !mVar3.a && z8;
                mVar3.f1173b = i11;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i11, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i11);
                if (mVar2.f1175d) {
                    i20++;
                }
                if (mVar2.a) {
                    z6 = true;
                }
                i15 -= i11;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i11 == 1) {
                    j2 |= 1 << i19;
                }
                i18 = i23;
            }
            i19++;
            size3 = i21;
            i13 = i22;
            paddingBottom = i10;
            mode = i9;
        }
        int i25 = mode;
        int i26 = i13;
        int i27 = size3;
        boolean z9 = z6 && i18 == 2;
        boolean z10 = false;
        while (i20 > 0 && i15 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j3 = 0;
            while (i30 < childCount2) {
                m mVar4 = (m) getChildAt(i30).getLayoutParams();
                boolean z11 = z10;
                if (mVar4.f1175d) {
                    int i31 = mVar4.f1173b;
                    if (i31 < i28) {
                        j3 = 1 << i30;
                        i28 = i31;
                        i29 = 1;
                    } else if (i31 == i28) {
                        j3 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i29 > i15) {
                break;
            }
            int i32 = i28 + 1;
            int i33 = 0;
            while (i33 < childCount2) {
                View childAt2 = getChildAt(i33);
                m mVar5 = (m) childAt2.getLayoutParams();
                int i34 = iMax;
                int i35 = childMeasureSpec;
                int i36 = childCount2;
                long j4 = 1 << i33;
                if ((j3 & j4) != 0) {
                    if (z9 && mVar5.f1176e) {
                        r4 = 1;
                        r4 = 1;
                        if (i15 == 1) {
                            childAt2.setPadding(i4 + i17, 0, i4, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    mVar5.f1173b += r4;
                    mVar5.f1177f = r4;
                    i15--;
                } else if (mVar5.f1173b == i32) {
                    j2 |= j4;
                }
                i33++;
                childMeasureSpec = i35;
                iMax = i34;
                childCount2 = i36;
            }
            z10 = true;
        }
        z2 = z10;
        int i37 = iMax;
        int i38 = childMeasureSpec;
        int i39 = childCount2;
        boolean z12 = !z6 && i18 == 1;
        if (i15 <= 0 || j2 == 0 || (i15 >= i18 - 1 && !z12 && iMax2 <= 1)) {
            i5 = i39;
            z3 = z2;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((m) getChildAt(0).getLayoutParams()).f1176e) {
                    fBitCount -= 0.5f;
                }
                int i40 = i39 - 1;
                if ((j2 & (1 << i40)) != 0 && !((m) getChildAt(i40).getLayoutParams()).f1176e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i15 * i17) / fBitCount) : 0;
            boolean z13 = z2;
            i5 = i39;
            for (int i42 = 0; i42 < i5; i42++) {
                if ((j2 & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    m mVar6 = (m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mVar6.f1174c = i41;
                        mVar6.f1177f = true;
                        if (i42 == 0 && !mVar6.f1176e) {
                            ((LinearLayout.LayoutParams) mVar6).leftMargin = (-i41) / 2;
                        }
                        z13 = true;
                    } else {
                        if (mVar6.a) {
                            mVar6.f1174c = i41;
                            mVar6.f1177f = true;
                            ((LinearLayout.LayoutParams) mVar6).rightMargin = (-i41) / 2;
                            z13 = true;
                        } else {
                            if (i42 != 0) {
                                ((LinearLayout.LayoutParams) mVar6).leftMargin = i41 / 2;
                            }
                            if (i42 != i5 - 1) {
                                ((LinearLayout.LayoutParams) mVar6).rightMargin = i41 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i43 = 0;
            while (i43 < i5) {
                View childAt4 = getChildAt(i43);
                m mVar7 = (m) childAt4.getLayoutParams();
                if (mVar7.f1177f) {
                    i8 = i38;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar7.f1173b * i17) + mVar7.f1174c, 1073741824), i8);
                } else {
                    i8 = i38;
                }
                i43++;
                i38 = i8;
            }
        }
        if (i25 != 1073741824) {
            i7 = i26;
            i6 = i37;
        } else {
            i6 = i27;
            i7 = i26;
        }
        setMeasuredDimension(i7, i6);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f100s.f1118p = z2;
    }

    public void setOnMenuItemClickListener(n nVar) {
        this.f107z = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        g.k kVar = this.f100s;
        g.j jVar = kVar.f1111h;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
        } else {
            kVar.f1113j = true;
            kVar.f1112i = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
    }

    public void setPopupTheme(int i2) {
        if (this.f99r != i2) {
            this.f99r = i2;
            if (i2 == 0) {
                this.f98q = getContext();
            } else {
                this.f98q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(g.k kVar) {
        this.f100s = kVar;
        kVar.f1110g = this;
        this.f97p = kVar.f1106c;
    }

    @Override // g.c1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }
}
