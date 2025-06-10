package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class c1 extends ViewGroup {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f1058b;

    /* renamed from: c, reason: collision with root package name */
    public int f1059c;

    /* renamed from: d, reason: collision with root package name */
    public int f1060d;

    /* renamed from: e, reason: collision with root package name */
    public int f1061e;

    /* renamed from: f, reason: collision with root package name */
    public int f1062f;

    /* renamed from: g, reason: collision with root package name */
    public float f1063g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1064h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1065i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1066j;
    public Drawable k;

    /* renamed from: l, reason: collision with root package name */
    public int f1067l;

    /* renamed from: m, reason: collision with root package name */
    public int f1068m;

    /* renamed from: n, reason: collision with root package name */
    public int f1069n;

    /* renamed from: o, reason: collision with root package name */
    public int f1070o;

    public c1(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = true;
        this.f1058b = -1;
        this.f1059c = 0;
        this.f1061e = 8388659;
        int[] iArr = b.a.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        f2 f2Var = new f2(context, typedArrayObtainStyledAttributes);
        int[] iArr2 = b0.f0.a;
        b0.c0.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        int iG = f2Var.g(1, -1);
        if (iG >= 0) {
            setOrientation(iG);
        }
        int iG2 = f2Var.g(0, -1);
        if (iG2 >= 0) {
            setGravity(iG2);
        }
        boolean zA = f2Var.a(2, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f1063g = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.f1058b = f2Var.g(3, -1);
        this.f1064h = f2Var.a(7, false);
        setDividerDrawable(f2Var.e(5));
        this.f1069n = f2Var.g(8, 0);
        this.f1070o = f2Var.d(6, 0);
        f2Var.n();
    }

    public final void b(Canvas canvas, int i2) {
        this.k.setBounds(getPaddingLeft() + this.f1070o, i2, (getWidth() - getPaddingRight()) - this.f1070o, this.f1068m + i2);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b1;
    }

    public final void d(Canvas canvas, int i2) {
        this.k.setBounds(i2, getPaddingTop() + this.f1070o, this.f1067l + i2, (getHeight() - getPaddingBottom()) - this.f1070o);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b1 generateDefaultLayoutParams() {
        int i2 = this.f1060d;
        if (i2 == 0) {
            return new b1(-2);
        }
        if (i2 == 1) {
            return new b1(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b1 generateLayoutParams(AttributeSet attributeSet) {
        return new b1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f1058b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1058b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1058b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1059c;
        if (this.f1060d == 1 && (i2 = this.f1061e & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1062f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1062f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((b1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1058b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.f1070o;
    }

    public int getDividerWidth() {
        return this.f1067l;
    }

    public int getGravity() {
        return this.f1061e;
    }

    public int getOrientation() {
        return this.f1060d;
    }

    public int getShowDividers() {
        return this.f1069n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1063g;
    }

    public final boolean h(int i2) {
        if (i2 == 0) {
            return (this.f1069n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f1069n & 4) != 0;
        }
        if ((this.f1069n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        if (this.k == null) {
            return;
        }
        int i2 = 0;
        if (this.f1060d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((b1) childAt.getLayoutParams())).topMargin) - this.f1068m);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1068m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((b1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = d3.a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                b1 b1Var = (b1) childAt3.getLayoutParams();
                d(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) b1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) b1Var).leftMargin) - this.f1067l);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                b1 b1Var2 = (b1) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) b1Var2).leftMargin;
                    right = (left - paddingRight) - this.f1067l;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) b1Var2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f1067l;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f1058b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.f1067l = drawable.getIntrinsicWidth();
            this.f1068m = drawable.getIntrinsicHeight();
        } else {
            this.f1067l = 0;
            this.f1068m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f1070o = i2;
    }

    public void setGravity(int i2) {
        if (this.f1061e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1061e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1061e;
        if ((8388615 & i4) != i3) {
            this.f1061e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f1064h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f1060d != i2) {
            this.f1060d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f1069n) {
            requestLayout();
        }
        this.f1069n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f1061e;
        if ((i4 & 112) != i3) {
            this.f1061e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1063g = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
