package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b0.c0;
import b0.f0;
import b0.r;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f108b;

    /* renamed from: c, reason: collision with root package name */
    public int f109c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109c = -1;
        int[] iArr = b.a.f465i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        int[] iArr2 = f0.a;
        c0.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.a);
        }
    }

    private void setStacked(boolean z2) {
        if (this.f108b != z2) {
            if (!z2 || this.a) {
                this.f108b = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int i4;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i2);
        int measuredHeight = 0;
        if (this.a) {
            if (size > this.f109c && this.f108b) {
                setStacked(false);
            }
            this.f109c = size;
        }
        if (this.f108b || View.MeasureSpec.getMode(i2) != 1073741824) {
            iMakeMeasureSpec = i2;
            z2 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.a && !this.f108b) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            i4 = -1;
            if (i5 >= childCount) {
                i5 = -1;
                break;
            } else if (getChildAt(i5).getVisibility() == 0) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            View childAt = getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            measuredHeight = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f108b) {
                int i6 = i5 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i6 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i6).getVisibility() == 0) {
                        i4 = i6;
                        break;
                    }
                    i6++;
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            measuredHeight += paddingBottom;
        }
        int[] iArr = f0.a;
        if (r.d(this) != measuredHeight) {
            setMinimumHeight(measuredHeight);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.a != z2) {
            this.a = z2;
            if (!z2 && this.f108b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
