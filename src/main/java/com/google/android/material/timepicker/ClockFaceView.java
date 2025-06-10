package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import b0.f0;
import com.nothing.icon.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.n;

/* loaded from: classes.dex */
class ClockFaceView extends f implements d {
    public final float[] A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public String[] F;
    public float G;
    public final ColorStateList H;

    /* renamed from: t, reason: collision with root package name */
    public final ClockHandView f748t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f749u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f750v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f751w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f752x;

    /* renamed from: y, reason: collision with root package name */
    public final c f753y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f754z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f749u = new Rect();
        this.f750v = new RectF();
        this.f751w = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f752x = sparseArray;
        this.A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2292c, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListJ = f1.e.J(context, typedArrayObtainStyledAttributes, 1);
        this.H = colorStateListJ;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f748t = clockHandView;
        this.B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListJ.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListJ.getDefaultColor());
        this.f754z = new int[]{colorForState, colorForState, colorStateListJ.getDefaultColor()};
        clockHandView.f756c.add(this);
        int defaultColor = s.c.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListJ2 = f1.e.J(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListJ2 != null ? colorStateListJ2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f753y = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.F = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < Math.max(this.F.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.F.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.F[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z2 = i3 > 1 ? true : z2;
                f0.f(textView, this.f753y);
                textView.setTextColor(this.H);
            }
        }
        ClockHandView clockHandView2 = this.f748t;
        if (clockHandView2.f755b && !z2) {
            clockHandView2.f765m = 1;
        }
        clockHandView2.f755b = z2;
        clockHandView2.invalidate();
        this.C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.f
    public final void f() {
        n nVar = new n();
        nVar.b(this);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iRound = this.f770r;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = nVar.f1965c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new o.i());
                }
                o.j jVar = ((o.i) map2.get(Integer.valueOf(id))).f1907d;
                jVar.f1940w = R.id.circle_center;
                jVar.f1941x = iRound;
                jVar.f1942y = size;
                size += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f752x;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f748t.f760g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.f752x;
            int size = sparseArray.size();
            rectF = this.f750v;
            rect = this.f749u;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f2) {
                    textView = textView2;
                    f2 = fHeight;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f751w);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f754z, this.A, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.E / Math.max(Math.max(this.C / displayMetrics.heightPixels, this.D / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
