package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.activity.result.d;
import androidx.recyclerview.widget.RecyclerView;
import b0.f0;
import b0.s;
import b1.a;
import b1.b;
import java.util.List;
import o0.l0;
import o0.m0;
import o0.s0;
import o0.w0;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends l0 {
    public int k;

    public CarouselLayoutManager() {
        new a();
        T();
    }

    public static float Z(float f2, d dVar) {
        b bVar = (b) dVar.f29b;
        bVar.getClass();
        b bVar2 = (b) dVar.f30c;
        bVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        return w0.a.a(0.0f, 0.0f, 0.0f, 0.0f, f2);
    }

    public static d a0(float f2, List list, boolean z2) {
        float f3 = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        float f4 = -3.4028235E38f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((b) list.get(i6)).getClass();
            float fAbs = Math.abs(0.0f - f2);
            if (0.0f <= f2 && fAbs <= f3) {
                i2 = i6;
                f3 = fAbs;
            }
            if (0.0f > f2 && fAbs <= f5) {
                i4 = i6;
                f5 = fAbs;
            }
            if (0.0f <= f6) {
                i3 = i6;
                f6 = 0.0f;
            }
            if (0.0f > f4) {
                i5 = i6;
                f4 = 0.0f;
            }
        }
        if (i2 == -1) {
            i2 = i3;
        }
        if (i4 == -1) {
            i4 = i5;
        }
        return new d((b) list.get(i2), (b) list.get(i4));
    }

    @Override // o0.l0
    public final void I(AccessibilityEvent accessibilityEvent) {
        super.I(accessibilityEvent);
        if (q() > 0) {
            accessibilityEvent.setFromIndex(l0.y(p(0)));
            accessibilityEvent.setToIndex(l0.y(p(q() - 1)));
        }
    }

    @Override // o0.l0
    public final boolean S(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // o0.l0
    public final int U(int i2, s0 s0Var, w0 w0Var) {
        if (q() == 0 || i2 == 0) {
            return 0;
        }
        int i3 = this.k;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 > 0) {
            i2 = 0 - i3;
        }
        this.k = i3 + i2;
        c0();
        throw null;
    }

    public final boolean b0() {
        RecyclerView recyclerView = this.f2046b;
        int[] iArr = f0.a;
        return s.d(recyclerView) == 1;
    }

    @Override // o0.l0
    public final boolean c() {
        return true;
    }

    public final void c0() {
        b0();
        throw null;
    }

    @Override // o0.l0
    public final int g(w0 w0Var) {
        throw null;
    }

    @Override // o0.l0
    public final int h(w0 w0Var) {
        return this.k;
    }

    @Override // o0.l0
    public final int i(w0 w0Var) {
        return 0 - 0;
    }

    @Override // o0.l0
    public final m0 m() {
        return new m0(-2, -2);
    }

    @Override // o0.l0
    public final void t(View view, Rect rect) {
        super.t(view, rect);
        rect.centerX();
        throw null;
    }
}
