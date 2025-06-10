package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.f0;
import b0.r;
import b0.s;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public abstract class f extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public final e f769q;

    /* renamed from: r, reason: collision with root package name */
    public int f770r;

    /* renamed from: s, reason: collision with root package name */
    public i1.g f771s;

    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.material.timepicker.e] */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        i1.g gVar = new i1.g();
        this.f771s = gVar;
        i1.h hVar = new i1.h(0.5f);
        i1.k kVar = gVar.a.a;
        kVar.getClass();
        i1.j jVar = new i1.j(kVar);
        jVar.f1378e = hVar;
        jVar.f1379f = hVar;
        jVar.f1380g = hVar;
        jVar.f1381h = hVar;
        gVar.setShapeAppearanceModel(new i1.k(jVar));
        this.f771s.j(ColorStateList.valueOf(-1));
        i1.g gVar2 = this.f771s;
        int[] iArr = f0.a;
        r.q(this, gVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2301m, R.attr.materialClockStyle, 0);
        this.f770r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f769q = new Runnable() { // from class: com.google.android.material.timepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            int[] iArr = f0.a;
            view.setId(s.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f769q;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public abstract void f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f769q;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f771s.j(ColorStateList.valueOf(i2));
    }
}
