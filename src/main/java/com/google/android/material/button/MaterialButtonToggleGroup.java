package com.google.android.material.button;

import a1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import b0.f0;
import b0.r;
import b0.s;
import com.nothing.icon.R;
import f.f;
import f1.e;
import i1.j;
import i1.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import l.h;
import v0.a;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int k = 0;
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final f f630b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f631c;

    /* renamed from: d, reason: collision with root package name */
    public final h f632d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f633e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f634f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f635g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f636h;

    /* renamed from: i, reason: collision with root package name */
    public final int f637i;

    /* renamed from: j, reason: collision with root package name */
    public HashSet f638j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(e.L0(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.a = new ArrayList();
        this.f630b = new f(this);
        this.f631c = new LinkedHashSet();
        this.f632d = new h(1, this);
        this.f634f = false;
        this.f638j = new HashSet();
        TypedArray typedArrayF0 = e.f0(getContext(), attributeSet, a.f2298i, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayF0.getBoolean(3, false));
        this.f637i = typedArrayF0.getResourceId(1, -1);
        this.f636h = typedArrayF0.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayF0.getBoolean(0, true));
        typedArrayF0.recycle();
        int[] iArr = f0.a;
        r.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (d(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && d(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            int[] iArr = f0.a;
            materialButton.setId(s.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f630b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonC = c(i2);
            int iMin = Math.min(materialButtonC.getStrokeWidth(), c(i2 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButtonC.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                b0.f.g(layoutParams2, 0);
                b0.f.h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                b0.f.h(layoutParams2, 0);
            }
            materialButtonC.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            b0.f.g(layoutParams3, 0);
            b0.f.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.a.add(new d(shapeAppearanceModel.f1388e, shapeAppearanceModel.f1391h, shapeAppearanceModel.f1389f, shapeAppearanceModel.f1390g));
        materialButton.setEnabled(isEnabled());
        f0.f(materialButton, new x0.a(1, this));
    }

    public final void b(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f638j);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f635g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f636h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        e(hashSet);
    }

    public final MaterialButton c(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean d(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f632d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(c(i2), Integer.valueOf(i2));
        }
        this.f633e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set set) {
        HashSet hashSet = this.f638j;
        this.f638j = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = c(i2).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f634f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f634f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f631c.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.h) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButtonC = c(i2);
            if (materialButtonC.getVisibility() != 8) {
                k shapeAppearanceModel = materialButtonC.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                j jVar = new j(shapeAppearanceModel);
                d dVar2 = (d) this.a.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    i1.a aVar = d.f20e;
                    if (i2 == firstVisibleChildIndex) {
                        dVar = z2 ? e.X(this) ? new d(aVar, aVar, dVar2.f21b, dVar2.f22c) : new d(dVar2.a, dVar2.f23d, aVar, aVar) : new d(dVar2.a, aVar, dVar2.f21b, aVar);
                    } else if (i2 == lastVisibleChildIndex) {
                        dVar = z2 ? e.X(this) ? new d(dVar2.a, dVar2.f23d, aVar, aVar) : new d(aVar, aVar, dVar2.f21b, dVar2.f22c) : new d(aVar, dVar2.f23d, aVar, dVar2.f22c);
                    } else {
                        dVar2 = null;
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    jVar.f1378e = new i1.a(0.0f);
                    jVar.f1379f = new i1.a(0.0f);
                    jVar.f1380g = new i1.a(0.0f);
                    jVar.f1381h = new i1.a(0.0f);
                } else {
                    jVar.f1378e = dVar2.a;
                    jVar.f1381h = dVar2.f23d;
                    jVar.f1379f = dVar2.f21b;
                    jVar.f1380g = dVar2.f22c;
                }
                materialButtonC.setShapeAppearanceModel(new k(jVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f635g || this.f638j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f638j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = c(i2).getId();
            if (this.f638j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f633e;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f637i;
        if (i2 != -1) {
            e(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f635g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        f();
        a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            c(i2).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f636h = z2;
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z2) {
        if (this.f635g != z2) {
            this.f635g = z2;
            e(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            c(i2).setA11yClassName((this.f635g ? RadioButton.class : ToggleButton.class).getName());
        }
    }
}
