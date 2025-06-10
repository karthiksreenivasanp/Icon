package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import b0.f0;
import b0.r;
import com.nothing.icon.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class ClockHandView extends View {
    public final ValueAnimator a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f755b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f756c;

    /* renamed from: d, reason: collision with root package name */
    public final int f757d;

    /* renamed from: e, reason: collision with root package name */
    public final float f758e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f759f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f760g;

    /* renamed from: h, reason: collision with root package name */
    public final int f761h;

    /* renamed from: i, reason: collision with root package name */
    public float f762i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f763j;
    public double k;

    /* renamed from: l, reason: collision with root package name */
    public int f764l;

    /* renamed from: m, reason: collision with root package name */
    public int f765m;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.a = new ValueAnimator();
        this.f756c = new ArrayList();
        Paint paint = new Paint();
        this.f759f = paint;
        this.f760g = new RectF();
        this.f765m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2293d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        f1.e.x0(context, R.attr.motionDurationLong2, 200);
        f1.e.y0(context, R.attr.motionEasingEmphasizedInterpolator, w0.a.f2312b);
        this.f764l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f757d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f761h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f758e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        int[] iArr = f0.a;
        r.s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(float f2) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        b(f2);
    }

    public final void b(float f2) {
        float f3 = f2 % 360.0f;
        this.f762i = f3;
        this.k = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i2 = this.f765m;
        int iRound = this.f764l;
        if (i2 == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f4 = width;
        float f5 = iRound;
        float fCos = (((float) Math.cos(this.k)) * f5) + f4;
        float fSin = (f5 * ((float) Math.sin(this.k))) + height;
        float f6 = this.f757d;
        this.f760g.set(fCos - f6, fSin - f6, fCos + f6, fSin + f6);
        Iterator it = this.f756c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.G - f3) > 0.001f) {
                clockFaceView.G = f3;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i2 = this.f765m;
        int iRound = this.f764l;
        if (i2 == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f2 = width;
        float f3 = iRound;
        float fCos = (((float) Math.cos(this.k)) * f3) + f2;
        float f4 = height;
        float fSin = (f3 * ((float) Math.sin(this.k))) + f4;
        Paint paint = this.f759f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f757d, paint);
        double dSin = Math.sin(this.k);
        paint.setStrokeWidth(this.f761h);
        canvas.drawLine(f2, f4, width + ((int) (Math.cos(this.k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f2, f4, this.f758e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.a.isRunning()) {
            return;
        }
        a(this.f762i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.f763j = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.f763j;
            if (this.f755b) {
                this.f765m = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y2 - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.f764l) * 0.66f)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.f763j;
        int degrees = ((int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f2 = degrees;
        boolean z6 = this.f762i != f2;
        if (z2 && z6) {
            z4 = true;
        } else if (z6 || z3) {
            a(f2);
            z4 = true;
        }
        this.f763j = z5 | z4;
        return true;
    }
}
