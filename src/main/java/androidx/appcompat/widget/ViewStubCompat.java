package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.c3;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f162b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f163c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f164d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.f477v, 0, 0);
        this.f162b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f162b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f164d;
    }

    public int getLayoutResource() {
        return this.a;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f162b = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f164d = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.a = i2;
    }

    public void setOnInflateListener(c3 c3Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference weakReference = this.f163c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.a == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflaterFrom = this.f164d;
            if (layoutInflaterFrom == null) {
                layoutInflaterFrom = LayoutInflater.from(getContext());
            }
            View viewInflate = layoutInflaterFrom.inflate(this.a, viewGroup, false);
            int i3 = this.f162b;
            if (i3 != -1) {
                viewInflate.setId(i3);
            }
            int iIndexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
            } else {
                viewGroup.addView(viewInflate, iIndexOfChild);
            }
            this.f163c = new WeakReference(viewInflate);
        }
    }
}
