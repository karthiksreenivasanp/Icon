package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import b0.f0;
import b0.x0;
import com.nothing.icon.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f289b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f290c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f291d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f291d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l0.a.a);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.f289b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof k ? (k) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof k ? (k) tag : null) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z2);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        x0 x0VarD;
        x0 x0VarD2 = x0.d(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f290c;
        if (onApplyWindowInsetsListener != null) {
            x0VarD = x0.d(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            int[] iArr = f0.a;
            WindowInsets windowInsetsC = x0VarD2.c();
            if (windowInsetsC != null) {
                WindowInsets windowInsetsB = b0.v.b(this, windowInsetsC);
                if (!windowInsetsB.equals(windowInsetsC)) {
                    x0VarD2 = x0.d(this, windowInsetsB);
                }
            }
            x0VarD = x0VarD2;
        }
        if (!x0VarD.a.j()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                int[] iArr2 = f0.a;
                WindowInsets windowInsetsC2 = x0VarD.c();
                if (windowInsetsC2 != null) {
                    WindowInsets windowInsetsA = b0.v.a(childAt, windowInsetsC2);
                    if (!windowInsetsA.equals(windowInsetsC2)) {
                        x0.d(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f291d && this.a != null) {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                super.drawChild(canvas, (View) this.a.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList arrayList;
        if (!this.f291d || (arrayList = this.a) == null || arrayList.size() <= 0 || !this.a.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f289b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f291d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        if (z2) {
            a(view);
        }
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z2) {
        this.f291d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f290c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f289b == null) {
                this.f289b = new ArrayList();
            }
            this.f289b.add(view);
        }
        super.startViewTransition(view);
    }
}
