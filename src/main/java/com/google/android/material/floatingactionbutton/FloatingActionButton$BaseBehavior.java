package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import q.a;
import q.d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // q.a
    public final boolean a(View view) {
        androidx.activity.result.a.h(view);
        throw null;
    }

    @Override // q.a
    public final void c(d dVar) {
        if (dVar.f2170h == 0) {
            dVar.f2170h = 80;
        }
    }

    @Override // q.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        androidx.activity.result.a.h(view);
        throw null;
    }

    @Override // q.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        androidx.activity.result.a.h(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2295f);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
