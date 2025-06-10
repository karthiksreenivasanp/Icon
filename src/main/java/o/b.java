package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f1851b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1852c;

    /* renamed from: d, reason: collision with root package name */
    public m.k f1853d;

    /* renamed from: e, reason: collision with root package name */
    public String f1854e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1855f;

    public b(Context context) {
        super(context);
        this.a = new int[32];
        this.f1855f = new HashMap();
        this.f1852c = context;
        e(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto La7
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La7
        La:
            android.content.Context r0 = r5.f1852c
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f180m
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f180m
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.d(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<o.q> r1 = o.q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8f
            java.util.HashMap r0 = r5.f1855f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
            goto La7
        L8f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintHelper"
            android.util.Log.w(r6, r5)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.a(java.lang.String):void");
    }

    public final void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f1851b + 1;
        int[] iArr = this.a;
        if (i3 > iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i4 = this.f1851b;
        iArr2[i4] = i2;
        this.f1851b = i4 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f1851b; i2++) {
            View view = (View) constraintLayout.a.get(this.a[i2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f1852c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1966b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1854e = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(m.e eVar, boolean z2);

    public final void g() {
        if (this.f1853d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof d) {
            ((d) layoutParams).f1875k0 = this.f1853d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.f1851b);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1854e;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1854e = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f1851b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1854e = null;
        this.f1851b = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.f1855f = new HashMap();
        this.f1852c = context;
        e(attributeSet);
    }
}
