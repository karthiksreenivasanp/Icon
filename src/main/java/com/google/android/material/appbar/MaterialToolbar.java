package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b0.f0;
import b0.r;
import b0.x;
import com.nothing.icon.R;
import f.l;
import f1.e;
import i1.g;
import java.util.ArrayList;
import java.util.Collections;
import v.b;
import v0.a;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] V = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer Q;
    public boolean R;
    public boolean S;
    public ImageView.ScaleType T;
    public Boolean U;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(e.L0(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayF0 = e.f0(context2, attributeSet, a.f2300l, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayF0.hasValue(2)) {
            setNavigationIconTint(typedArrayF0.getColor(2, -1));
        }
        this.R = typedArrayF0.getBoolean(4, false);
        this.S = typedArrayF0.getBoolean(3, false);
        int i2 = typedArrayF0.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = V;
            if (i2 < scaleTypeArr.length) {
                this.T = scaleTypeArr[i2];
            }
        }
        if (typedArrayF0.hasValue(0)) {
            this.U = Boolean.valueOf(typedArrayF0.getBoolean(0, false));
        }
        typedArrayF0.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.h(context2);
            int[] iArr = f0.a;
            gVar.i(x.i(this));
            r.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.T;
    }

    public Integer getNavigationIconTint() {
        return this.Q;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void j(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof l;
        if (z2) {
            ((l) menu).s();
        }
        super.j(i2);
        if (z2) {
            ((l) menu).r();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            e.C0(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.R || this.S) {
            ArrayList arrayListQ = e.Q(this, getTitle());
            boolean zIsEmpty = arrayListQ.isEmpty();
            q.g gVar = e.f1029e;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListQ, gVar);
            ArrayList arrayListQ2 = e.Q(this, getSubtitle());
            TextView textView2 = arrayListQ2.isEmpty() ? null : (TextView) Collections.max(arrayListQ2, gVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.R && textView != null) {
                    s(textView, pair);
                }
                if (this.S && textView2 != null) {
                    s(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.U;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.T;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public final void s(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i2 += iMax;
            i3 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i3, textView.getBottom());
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.U;
        if (bool == null || bool.booleanValue() != z2) {
            this.U = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.T != scaleType) {
            this.T = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.Q != null) {
            drawable = drawable.mutate();
            b.g(drawable, this.Q.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.Q = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.S != z2) {
            this.S = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.R != z2) {
            this.R = z2;
            requestLayout();
        }
    }
}
