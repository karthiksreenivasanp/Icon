package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b0.c0;
import b0.f0;
import b0.s;
import b0.u;
import com.nothing.icon.R;
import e.f;
import f.l;
import f1.e;
import g.a0;
import g.a3;
import g.d3;
import g.f2;
import g.k;
import g.l0;
import g.p2;
import g.q2;
import g.r0;
import g.r2;
import g.t2;
import g.u1;
import g.u2;
import g.v2;
import g.w2;
import g.x2;
import g.y;
import g.z2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final f2 G;
    public ArrayList H;
    public final q2 I;
    public z2 J;
    public u2 K;
    public boolean L;
    public OnBackInvokedCallback M;
    public OnBackInvokedDispatcher N;
    public boolean O;
    public final d.a P;
    public ActionMenuView a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f138b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f139c;

    /* renamed from: d, reason: collision with root package name */
    public y f140d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f141e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f142f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f143g;

    /* renamed from: h, reason: collision with root package name */
    public y f144h;

    /* renamed from: i, reason: collision with root package name */
    public View f145i;

    /* renamed from: j, reason: collision with root package name */
    public Context f146j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f147l;

    /* renamed from: m, reason: collision with root package name */
    public int f148m;

    /* renamed from: n, reason: collision with root package name */
    public final int f149n;

    /* renamed from: o, reason: collision with root package name */
    public final int f150o;

    /* renamed from: p, reason: collision with root package name */
    public int f151p;

    /* renamed from: q, reason: collision with root package name */
    public int f152q;

    /* renamed from: r, reason: collision with root package name */
    public int f153r;

    /* renamed from: s, reason: collision with root package name */
    public int f154s;

    /* renamed from: t, reason: collision with root package name */
    public u1 f155t;

    /* renamed from: u, reason: collision with root package name */
    public int f156u;

    /* renamed from: v, reason: collision with root package name */
    public int f157v;

    /* renamed from: w, reason: collision with root package name */
    public final int f158w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f159x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f160y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f161z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static v2 f(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v2 ? new v2((v2) layoutParams) : layoutParams instanceof c.a ? new v2((c.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new v2((ViewGroup.MarginLayoutParams) layoutParams) : new v2(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new f(getContext());
    }

    public static int h(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return b0.f.b(marginLayoutParams) + b0.f.c(marginLayoutParams);
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        int[] iArr = f0.a;
        boolean z2 = s.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, s.d(this));
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                v2 v2Var = (v2) childAt.getLayoutParams();
                if (v2Var.f1241b == 0 && q(childAt)) {
                    int i4 = v2Var.a;
                    int[] iArr2 = f0.a;
                    int iD = s.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, iD) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = iD == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            v2 v2Var2 = (v2) childAt2.getLayoutParams();
            if (v2Var2.f1241b == 0 && q(childAt2)) {
                int i6 = v2Var2.a;
                int[] iArr3 = f0.a;
                int iD2 = s.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, iD2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = iD2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        v2 v2Var = layoutParams == null ? new v2() : !checkLayoutParams(layoutParams) ? f(layoutParams) : (v2) layoutParams;
        v2Var.f1241b = 1;
        if (!z2 || this.f145i == null) {
            addView(view, v2Var);
        } else {
            view.setLayoutParams(v2Var);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.f144h == null) {
            y yVar = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f144h = yVar;
            yVar.setImageDrawable(this.f142f);
            this.f144h.setContentDescription(this.f143g);
            v2 v2Var = new v2();
            v2Var.a = (this.f149n & 112) | 8388611;
            v2Var.f1241b = 2;
            this.f144h.setLayoutParams(v2Var);
            this.f144h.setOnClickListener(new r2(0, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof v2);
    }

    public final void d() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.a;
            q2 q2Var = new q2(this);
            actionMenuView2.f101t = null;
            actionMenuView2.f102u = q2Var;
            v2 v2Var = new v2();
            v2Var.a = (this.f149n & 112) | 8388613;
            this.a.setLayoutParams(v2Var);
            b(this.a, false);
        }
        ActionMenuView actionMenuView3 = this.a;
        if (actionMenuView3.f97p == null) {
            l lVar = (l) actionMenuView3.getMenu();
            if (this.K == null) {
                this.K = new u2(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            lVar.b(this.K, this.f146j);
            r();
        }
    }

    public final void e() {
        if (this.f140d == null) {
            this.f140d = new y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            v2 v2Var = new v2();
            v2Var.a = (this.f149n & 112) | 8388611;
            this.f140d.setLayoutParams(v2Var);
        }
    }

    public final int g(View view, int i2) {
        v2 v2Var = (v2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = v2Var.a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f158w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) v2Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) v2Var).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) v2Var).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new v2();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new v2(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        y yVar = this.f144h;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        y yVar = this.f144h;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        u1 u1Var = this.f155t;
        if (u1Var != null) {
            return u1Var.f1237g ? u1Var.a : u1Var.f1232b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f157v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        u1 u1Var = this.f155t;
        if (u1Var != null) {
            return u1Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        u1 u1Var = this.f155t;
        if (u1Var != null) {
            return u1Var.f1232b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        u1 u1Var = this.f155t;
        if (u1Var != null) {
            return u1Var.f1237g ? u1Var.f1232b : u1Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f156u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && (lVar = actionMenuView.f97p) != null && lVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f157v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        int[] iArr = f0.a;
        return s.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        int[] iArr = f0.a;
        return s.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f156u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        a0 a0Var = this.f141e;
        if (a0Var != null) {
            return a0Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        a0 a0Var = this.f141e;
        if (a0Var != null) {
            return a0Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.f140d;
    }

    public CharSequence getNavigationContentDescription() {
        y yVar = this.f140d;
        if (yVar != null) {
            return yVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        y yVar = this.f140d;
        if (yVar != null) {
            return yVar.getDrawable();
        }
        return null;
    }

    public k getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f146j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.f160y;
    }

    public final TextView getSubtitleTextView() {
        return this.f139c;
    }

    public CharSequence getTitle() {
        return this.f159x;
    }

    public int getTitleMarginBottom() {
        return this.f154s;
    }

    public int getTitleMarginEnd() {
        return this.f152q;
    }

    public int getTitleMarginStart() {
        return this.f151p;
    }

    public int getTitleMarginTop() {
        return this.f153r;
    }

    public final TextView getTitleTextView() {
        return this.f138b;
    }

    public r0 getWrapper() {
        if (this.J == null) {
            this.J = new z2(this);
        }
        return this.J;
    }

    public void j(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public final void k() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.G.f1077b).iterator();
        if (it2.hasNext()) {
            androidx.activity.result.a.d(it2.next());
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int m(View view, int i2, int i3, int[] iArr) {
        v2 v2Var = (v2) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) v2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int iG = g(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iG, iMax + measuredWidth, view.getMeasuredHeight() + iG);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) v2Var).rightMargin + iMax;
    }

    public final int n(View view, int i2, int i3, int[] iArr) {
        v2 v2Var = (v2) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) v2Var).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iG = g(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iG, iMax, view.getMeasuredHeight() + iG);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) v2Var).leftMargin);
    }

    public final int o(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
        r();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0288 A[LOOP:0: B:107:0x0286->B:108:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4 A[LOOP:1: B:110:0x02a2->B:111:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3 A[LOOP:2: B:113:0x02c1->B:114:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0311 A[LOOP:3: B:122:0x030f->B:123:0x0311, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int iH;
        int iMax;
        int iCombineMeasuredStates;
        int iH2;
        int i4;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z2;
        boolean zA = d3.a(this);
        int i5 = !zA ? 1 : 0;
        if (q(this.f140d)) {
            p(this.f140d, i2, 0, i3, this.f150o);
            iH = h(this.f140d) + this.f140d.getMeasuredWidth();
            iMax = Math.max(0, i(this.f140d) + this.f140d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f140d.getMeasuredState());
        } else {
            iH = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (q(this.f144h)) {
            p(this.f144h, i2, 0, i3, this.f150o);
            iH = h(this.f144h) + this.f144h.getMeasuredWidth();
            iMax = Math.max(iMax, i(this.f144h) + this.f144h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f144h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iH) + 0;
        int iMax4 = Math.max(0, currentContentInsetStart - iH);
        int[] iArr = this.F;
        iArr[zA ? 1 : 0] = iMax4;
        if (q(this.a)) {
            p(this.a, i2, iMax3, i3, this.f150o);
            iH2 = h(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, i(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iH2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iH2);
        iArr[i5] = Math.max(0, currentContentInsetEnd - iH2);
        if (q(this.f145i)) {
            iMax5 += o(this.f145i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, i(this.f145i) + this.f145i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f145i.getMeasuredState());
        }
        if (q(this.f141e)) {
            iMax5 += o(this.f141e, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, i(this.f141e) + this.f141e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f141e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((v2) childAt.getLayoutParams()).f1241b == 0 && q(childAt)) {
                iMax5 += o(childAt, i2, iMax5, i3, 0, iArr);
                iMax = Math.max(iMax, i(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i7 = this.f153r + this.f154s;
        int i8 = this.f151p + this.f152q;
        if (q(this.f138b)) {
            o(this.f138b, i2, iMax5 + i8, i3, i7, iArr);
            int iH3 = h(this.f138b) + this.f138b.getMeasuredWidth();
            i4 = i(this.f138b) + this.f138b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f138b.getMeasuredState());
            iMax2 = iH3;
        } else {
            i4 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (q(this.f139c)) {
            iMax2 = Math.max(iMax2, o(this.f139c, i2, iMax5 + i8, i3, i4 + i7, iArr));
            i4 += i(this.f139c) + this.f139c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f139c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.L) {
            z2 = false;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (q(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        setMeasuredDimension(iResolveSizeAndState, z2 ? 0 : iResolveSizeAndState2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof x2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x2 x2Var = (x2) parcelable;
        super.onRestoreInstanceState(x2Var.a);
        ActionMenuView actionMenuView = this.a;
        l lVar = actionMenuView != null ? actionMenuView.f97p : null;
        int i2 = x2Var.f1259c;
        if (i2 != 0 && this.K != null && lVar != null && (menuItemFindItem = lVar.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (x2Var.f1260d) {
            d.a aVar = this.P;
            removeCallbacks(aVar);
            post(aVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        int i3;
        super.onRtlPropertiesChanged(i2);
        if (this.f155t == null) {
            this.f155t = new u1();
        }
        u1 u1Var = this.f155t;
        boolean z2 = i2 == 1;
        if (z2 == u1Var.f1237g) {
            return;
        }
        u1Var.f1237g = z2;
        if (u1Var.f1238h) {
            if (z2) {
                int i4 = u1Var.f1234d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = u1Var.f1235e;
                }
                u1Var.a = i4;
                i3 = u1Var.f1233c;
                if (i3 == Integer.MIN_VALUE) {
                }
            } else {
                int i5 = u1Var.f1233c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = u1Var.f1235e;
                }
                u1Var.a = i5;
                i3 = u1Var.f1234d;
                if (i3 == Integer.MIN_VALUE) {
                }
            }
            u1Var.f1232b = i3;
        }
        u1Var.a = u1Var.f1235e;
        i3 = u1Var.f1236f;
        u1Var.f1232b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            g.x2 r0 = new g.x2
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            g.u2 r1 = r3.K
            if (r1 == 0) goto L15
            f.m r1 = r1.f1239b
            if (r1 == 0) goto L15
            int r1 = r1.a
            r0.f1259c = r1
        L15:
            androidx.appcompat.widget.ActionMenuView r3 = r3.a
            r1 = 0
            if (r3 == 0) goto L34
            g.k r3 = r3.f100s
            r2 = 1
            if (r3 == 0) goto L30
            g.f r3 = r3.f1120r
            if (r3 == 0) goto L2b
            boolean r3 = r3.b()
            if (r3 == 0) goto L2b
            r3 = r2
            goto L2c
        L2b:
            r3 = r1
        L2c:
            if (r3 == 0) goto L30
            r3 = r2
            goto L31
        L30:
            r3 = r1
        L31:
            if (r3 == 0) goto L34
            r1 = r2
        L34:
            r0.f1260d = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final void p(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void r() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcherA = t2.a(this);
        u2 u2Var = this.K;
        boolean z2 = false;
        int i2 = 1;
        if (((u2Var == null || u2Var.f1239b == null) ? false : true) && onBackInvokedDispatcherA != null) {
            int[] iArr = f0.a;
            if (u.b(this) && this.O) {
                z2 = true;
            }
        }
        if (z2 && this.N == null) {
            if (this.M == null) {
                this.M = t2.b(new p2(this, i2));
            }
            t2.c(onBackInvokedDispatcherA, this.M);
        } else {
            if (z2 || (onBackInvokedDispatcher = this.N) == null) {
                return;
            }
            t2.d(onBackInvokedDispatcher, this.M);
            onBackInvokedDispatcherA = null;
        }
        this.N = onBackInvokedDispatcherA;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.O != z2) {
            this.O = z2;
            r();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(e.M(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.L = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f157v) {
            this.f157v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f156u) {
            this.f156u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(e.M(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(e.M(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        e();
        this.f140d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(w2 w2Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.k != i2) {
            this.k = i2;
            if (i2 == 0) {
                this.f146j = getContext();
            } else {
                this.f146j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f154s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f152q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f151p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f153r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f158w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new f2(new p2(this, 0));
        this.H = new ArrayList();
        this.I = new q2(this);
        this.P = new d.a(2, this);
        Context context2 = getContext();
        int[] iArr = b.a.f475t;
        f2 f2VarM = f2.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        Object obj = f2VarM.f1077b;
        int[] iArr2 = f0.a;
        c0.c(this, context, iArr, attributeSet, (TypedArray) obj, R.attr.toolbarStyle, 0);
        this.f147l = f2VarM.h(28, 0);
        this.f148m = f2VarM.h(19, 0);
        this.f158w = ((TypedArray) obj).getInteger(0, 8388627);
        this.f149n = ((TypedArray) obj).getInteger(2, 48);
        int iC = f2VarM.c(22, 0);
        iC = f2VarM.k(27) ? f2VarM.c(27, iC) : iC;
        this.f154s = iC;
        this.f153r = iC;
        this.f152q = iC;
        this.f151p = iC;
        int iC2 = f2VarM.c(25, -1);
        if (iC2 >= 0) {
            this.f151p = iC2;
        }
        int iC3 = f2VarM.c(24, -1);
        if (iC3 >= 0) {
            this.f152q = iC3;
        }
        int iC4 = f2VarM.c(26, -1);
        if (iC4 >= 0) {
            this.f153r = iC4;
        }
        int iC5 = f2VarM.c(23, -1);
        if (iC5 >= 0) {
            this.f154s = iC5;
        }
        this.f150o = f2VarM.d(13, -1);
        int iC6 = f2VarM.c(9, Integer.MIN_VALUE);
        int iC7 = f2VarM.c(5, Integer.MIN_VALUE);
        int iD = f2VarM.d(7, 0);
        int iD2 = f2VarM.d(8, 0);
        if (this.f155t == null) {
            this.f155t = new u1();
        }
        u1 u1Var = this.f155t;
        u1Var.f1238h = false;
        if (iD != Integer.MIN_VALUE) {
            u1Var.f1235e = iD;
            u1Var.a = iD;
        }
        if (iD2 != Integer.MIN_VALUE) {
            u1Var.f1236f = iD2;
            u1Var.f1232b = iD2;
        }
        if (iC6 != Integer.MIN_VALUE || iC7 != Integer.MIN_VALUE) {
            u1Var.a(iC6, iC7);
        }
        this.f156u = f2VarM.c(10, Integer.MIN_VALUE);
        this.f157v = f2VarM.c(6, Integer.MIN_VALUE);
        this.f142f = f2VarM.e(4);
        this.f143g = f2VarM.j(3);
        CharSequence charSequenceJ = f2VarM.j(21);
        if (!TextUtils.isEmpty(charSequenceJ)) {
            setTitle(charSequenceJ);
        }
        CharSequence charSequenceJ2 = f2VarM.j(18);
        if (!TextUtils.isEmpty(charSequenceJ2)) {
            setSubtitle(charSequenceJ2);
        }
        this.f146j = getContext();
        setPopupTheme(f2VarM.h(17, 0));
        Drawable drawableE = f2VarM.e(16);
        if (drawableE != null) {
            setNavigationIcon(drawableE);
        }
        CharSequence charSequenceJ3 = f2VarM.j(15);
        if (!TextUtils.isEmpty(charSequenceJ3)) {
            setNavigationContentDescription(charSequenceJ3);
        }
        Drawable drawableE2 = f2VarM.e(11);
        if (drawableE2 != null) {
            setLogo(drawableE2);
        }
        CharSequence charSequenceJ4 = f2VarM.j(12);
        if (!TextUtils.isEmpty(charSequenceJ4)) {
            setLogoDescription(charSequenceJ4);
        }
        if (f2VarM.k(29)) {
            setTitleTextColor(f2VarM.b(29));
        }
        if (f2VarM.k(20)) {
            setSubtitleTextColor(f2VarM.b(20));
        }
        if (f2VarM.k(14)) {
            j(f2VarM.h(14, 0));
        }
        f2VarM.n();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        y yVar = this.f144h;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f144h.setImageDrawable(drawable);
        } else {
            y yVar = this.f144h;
            if (yVar != null) {
                yVar.setImageDrawable(this.f142f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f141e == null) {
                this.f141e = new a0(getContext(), 0);
            }
            if (!l(this.f141e)) {
                b(this.f141e, true);
            }
        } else {
            a0 a0Var = this.f141e;
            if (a0Var != null && l(a0Var)) {
                removeView(this.f141e);
                this.E.remove(this.f141e);
            }
        }
        a0 a0Var2 = this.f141e;
        if (a0Var2 != null) {
            a0Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f141e == null) {
            this.f141e = new a0(getContext(), 0);
        }
        a0 a0Var = this.f141e;
        if (a0Var != null) {
            a0Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        y yVar = this.f140d;
        if (yVar != null) {
            yVar.setContentDescription(charSequence);
            a3.a(this.f140d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            if (!l(this.f140d)) {
                b(this.f140d, true);
            }
        } else {
            y yVar = this.f140d;
            if (yVar != null && l(yVar)) {
                removeView(this.f140d);
                this.E.remove(this.f140d);
            }
        }
        y yVar2 = this.f140d;
        if (yVar2 != null) {
            yVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            l0 l0Var = this.f139c;
            if (l0Var != null && l(l0Var)) {
                removeView(this.f139c);
                this.E.remove(this.f139c);
            }
        } else {
            if (this.f139c == null) {
                Context context = getContext();
                l0 l0Var2 = new l0(context, null);
                this.f139c = l0Var2;
                l0Var2.setSingleLine();
                this.f139c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f148m;
                if (i2 != 0) {
                    this.f139c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f139c.setTextColor(colorStateList);
                }
            }
            if (!l(this.f139c)) {
                b(this.f139c, true);
            }
        }
        l0 l0Var3 = this.f139c;
        if (l0Var3 != null) {
            l0Var3.setText(charSequence);
        }
        this.f160y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        l0 l0Var = this.f139c;
        if (l0Var != null) {
            l0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            l0 l0Var = this.f138b;
            if (l0Var != null && l(l0Var)) {
                removeView(this.f138b);
                this.E.remove(this.f138b);
            }
        } else {
            if (this.f138b == null) {
                Context context = getContext();
                l0 l0Var2 = new l0(context, null);
                this.f138b = l0Var2;
                l0Var2.setSingleLine();
                this.f138b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f147l;
                if (i2 != 0) {
                    this.f138b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f161z;
                if (colorStateList != null) {
                    this.f138b.setTextColor(colorStateList);
                }
            }
            if (!l(this.f138b)) {
                b(this.f138b, true);
            }
        }
        l0 l0Var3 = this.f138b;
        if (l0Var3 != null) {
            l0Var3.setText(charSequence);
        }
        this.f159x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f161z = colorStateList;
        l0 l0Var = this.f138b;
        if (l0Var != null) {
            l0Var.setTextColor(colorStateList);
        }
    }
}
