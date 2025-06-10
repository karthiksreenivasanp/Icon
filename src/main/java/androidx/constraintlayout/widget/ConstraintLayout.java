package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import m.f;
import m.i;
import o.b;
import o.d;
import o.e;
import o.h;
import o.n;
import o.o;
import o.p;
import o.r;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f169p = 0;
    public final SparseArray a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f170b;

    /* renamed from: c, reason: collision with root package name */
    public final f f171c;

    /* renamed from: d, reason: collision with root package name */
    public int f172d;

    /* renamed from: e, reason: collision with root package name */
    public int f173e;

    /* renamed from: f, reason: collision with root package name */
    public int f174f;

    /* renamed from: g, reason: collision with root package name */
    public int f175g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f176h;

    /* renamed from: i, reason: collision with root package name */
    public int f177i;

    /* renamed from: j, reason: collision with root package name */
    public n f178j;
    public h k;

    /* renamed from: l, reason: collision with root package name */
    public int f179l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f180m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f181n;

    /* renamed from: o, reason: collision with root package name */
    public final e f182o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.f170b = new ArrayList(4);
        this.f171c = new f();
        this.f172d = 0;
        this.f173e = 0;
        this.f174f = Integer.MAX_VALUE;
        this.f175g = Integer.MAX_VALUE;
        this.f176h = true;
        this.f177i = 263;
        this.f178j = null;
        this.k = null;
        this.f179l = -1;
        this.f180m = new HashMap();
        this.f181n = new SparseArray();
        this.f182o = new e(this);
        b(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public final m.e a(View view) {
        if (view == this) {
            return this.f171c;
        }
        if (view == null) {
            return null;
        }
        return ((d) view.getLayoutParams()).f1875k0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    public final void b(AttributeSet attributeSet, int i2) {
        f fVar = this.f171c;
        fVar.U = this;
        e eVar = this.f182o;
        fVar.f1749g0 = eVar;
        fVar.f1748f0.f1821f = eVar;
        this.a.put(getId(), this);
        this.f178j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1966b, i2, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.f172d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f172d);
                } else if (index == 10) {
                    this.f173e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f173e);
                } else if (index == 7) {
                    this.f174f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f174f);
                } else if (index == 8) {
                    this.f175g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f175g);
                } else if (index == 89) {
                    this.f177i = typedArrayObtainStyledAttributes.getInt(index, this.f177i);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.k = new h(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f178j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f178j = null;
                    }
                    this.f179l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i4 = this.f177i;
        fVar.f1758p0 = i4;
        l.f.f1550p = (i4 & 256) == 256;
    }

    public final boolean c() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f180m == null) {
                this.f180m = new HashMap();
            }
            int iIndexOf = str.indexOf("/");
            if (iIndexOf != -1) {
                str = str.substring(iIndexOf + 1);
            }
            this.f180m.put(str, Integer.valueOf(num.intValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f170b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((b) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i7;
                        float f3 = i8;
                        float f4 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e():boolean");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f176h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f175g;
    }

    public int getMaxWidth() {
        return this.f174f;
    }

    public int getMinHeight() {
        return this.f173e;
    }

    public int getMinWidth() {
        return this.f172d;
    }

    public int getOptimizationLevel() {
        return this.f171c.f1758p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            d dVar = (d) childAt.getLayoutParams();
            m.e eVar = dVar.f1875k0;
            if (childAt.getVisibility() != 8 || dVar.Y || dVar.Z || zIsInEditMode) {
                int iM = eVar.m();
                int iN = eVar.n();
                childAt.layout(iM, iN, eVar.l() + iM, eVar.j() + iN);
            }
        }
        ArrayList arrayList = this.f170b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((b) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        m.e eVarA = a(view);
        if ((view instanceof p) && !(eVarA instanceof i)) {
            d dVar = (d) view.getLayoutParams();
            i iVar = new i();
            dVar.f1875k0 = iVar;
            dVar.Y = true;
            iVar.B(dVar.R);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.g();
            ((d) view.getLayoutParams()).Z = true;
            ArrayList arrayList = this.f170b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.a.put(view.getId(), view);
        this.f176h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        m.e eVarA = a(view);
        this.f171c.f1746d0.remove(eVarA);
        eVarA.I = null;
        this.f170b.remove(view);
        this.f176h = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f176h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f178j = nVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f175g) {
            return;
        }
        this.f175g = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f174f) {
            return;
        }
        this.f174f = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f173e) {
            return;
        }
        this.f173e = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f172d) {
            return;
        }
        this.f172d = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        h hVar = this.k;
        if (hVar != null) {
            hVar.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f177i = i2;
        this.f171c.f1758p0 = i2;
        l.f.f1550p = (i2 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new SparseArray();
        this.f170b = new ArrayList(4);
        this.f171c = new f();
        this.f172d = 0;
        this.f173e = 0;
        this.f174f = Integer.MAX_VALUE;
        this.f175g = Integer.MAX_VALUE;
        this.f176h = true;
        this.f177i = 263;
        this.f178j = null;
        this.k = null;
        this.f179l = -1;
        this.f180m = new HashMap();
        this.f181n = new SparseArray();
        this.f182o = new e(this);
        b(attributeSet, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }
}
