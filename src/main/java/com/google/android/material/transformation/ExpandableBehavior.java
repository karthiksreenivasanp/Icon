package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.f0;
import b0.u;
import java.util.ArrayList;
import q.a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // q.a
    public abstract void b(View view);

    @Override // q.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        androidx.activity.result.a.d(view2);
        throw null;
    }

    @Override // q.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int[] iArr = f0.a;
        if (!u.c(view)) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i3 = 0; i3 < size; i3++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
