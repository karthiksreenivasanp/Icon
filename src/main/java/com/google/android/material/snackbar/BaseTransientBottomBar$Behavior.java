package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.activity.result.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import k1.b;
import l.d;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i, reason: collision with root package name */
    public final b f694i = new b(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, q.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b bVar = this.f694i;
        bVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (d.f1545e == null) {
                    d.f1545e = new d(5);
                }
                d dVar = d.f1545e;
                a.e(bVar.f1489b);
                synchronized (dVar.a) {
                    a.d(dVar.f1547c);
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (d.f1545e == null) {
                d.f1545e = new d(5);
            }
            d dVar2 = d.f1545e;
            a.e(bVar.f1489b);
            synchronized (dVar2.a) {
                a.d(dVar2.f1547c);
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f694i.getClass();
        return view instanceof k1.d;
    }
}
