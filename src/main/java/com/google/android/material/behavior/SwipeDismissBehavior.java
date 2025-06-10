package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.f0;
import b0.r;
import c0.f;
import i0.d;
import q.a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {
    public d a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f580b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f581c;

    /* renamed from: d, reason: collision with root package name */
    public int f582d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f583e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f584f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f585g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final y0.a f586h = new y0.a(this);

    @Override // q.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f580b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f580b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f580b = false;
        }
        if (!zO) {
            return false;
        }
        if (this.a == null) {
            this.a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f586h);
        }
        return !this.f581c && this.a.r(motionEvent);
    }

    @Override // q.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int[] iArr = f0.a;
        if (r.c(view) == 0) {
            r.s(view, 1);
            f0.d(view, 1048576);
            f0.c(view, 0);
            if (r(view)) {
                f0.e(view, f.f522j, new f.f(24, this));
            }
        }
        return false;
    }

    @Override // q.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.f581c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.k(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
