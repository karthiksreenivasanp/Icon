package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.f0;
import f1.e;
import java.util.ArrayList;
import q.a;
import x0.d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends d {

    /* renamed from: c, reason: collision with root package name */
    public int f572c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    @Override // q.a
    public final void b(View view) {
    }

    @Override // q.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a aVar = ((q.d) view2.getLayoutParams()).a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i2 = bottom + 0 + 0;
            int i3 = this.f572c;
            int iU = i2 - (i3 == 0 ? 0 : e.u((int) (i3 * 0.0f), 0, i3));
            int[] iArr = f0.a;
            view.offsetTopAndBottom(iU);
        }
        return false;
    }

    @Override // q.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // q.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // x0.d
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2302n);
        this.f572c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
