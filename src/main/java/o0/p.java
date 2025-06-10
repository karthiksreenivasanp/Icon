package o0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends i0 implements o0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2059x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2060y = new int[0];
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f2061b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f2062c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2064e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f2065f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f2066g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2067h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2068i;

    /* renamed from: j, reason: collision with root package name */
    public float f2069j;
    public float k;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f2072n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f2079u;

    /* renamed from: v, reason: collision with root package name */
    public int f2080v;

    /* renamed from: w, reason: collision with root package name */
    public final l f2081w;

    /* renamed from: l, reason: collision with root package name */
    public int f2070l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2071m = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2073o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2074p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f2075q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2076r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f2077s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2078t = new int[2];

    public p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2079u = valueAnimatorOfFloat;
        this.f2080v = 0;
        l lVar = new l(0, this);
        this.f2081w = lVar;
        m mVar = new m(this);
        this.f2061b = stateListDrawable;
        this.f2062c = drawable;
        this.f2065f = stateListDrawable2;
        this.f2066g = drawable2;
        this.f2063d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f2064e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f2067h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f2068i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new n(this));
        valueAnimatorOfFloat.addUpdateListener(new o(this));
        RecyclerView recyclerView2 = this.f2072n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l0 l0Var = recyclerView2.f426j;
            if (l0Var != null) {
                l0Var.b("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.k;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.x();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2072n;
            recyclerView3.f428l.remove(this);
            if (recyclerView3.f429m == this) {
                recyclerView3.f429m = null;
            }
            ArrayList arrayList2 = this.f2072n.f411b0;
            if (arrayList2 != null) {
                arrayList2.remove(mVar);
            }
            this.f2072n.removeCallbacks(lVar);
        }
        this.f2072n = recyclerView;
        if (recyclerView != null) {
            l0 l0Var2 = recyclerView.f426j;
            if (l0Var2 != null) {
                l0Var2.b("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.k;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.x();
            recyclerView.requestLayout();
            this.f2072n.f428l.add(this);
            RecyclerView recyclerView4 = this.f2072n;
            if (recyclerView4.f411b0 == null) {
                recyclerView4.f411b0 = new ArrayList();
            }
            recyclerView4.f411b0.add(mVar);
        }
    }

    @Override // o0.i0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i2;
        if (this.f2070l != this.f2072n.getWidth() || this.f2071m != this.f2072n.getHeight()) {
            this.f2070l = this.f2072n.getWidth();
            this.f2071m = this.f2072n.getHeight();
            f(0);
            return;
        }
        if (this.f2080v != 0) {
            if (this.f2073o) {
                int i3 = this.f2070l;
                int i4 = this.f2063d;
                int i5 = i3 - i4;
                int i6 = 0 - (0 / 2);
                StateListDrawable stateListDrawable = this.f2061b;
                stateListDrawable.setBounds(0, 0, i4, 0);
                int i7 = this.f2071m;
                int i8 = this.f2064e;
                Drawable drawable = this.f2062c;
                drawable.setBounds(0, 0, i8, i7);
                RecyclerView recyclerView2 = this.f2072n;
                int[] iArr = b0.f0.a;
                if (b0.s.d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i4, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i2 = -i4;
                } else {
                    canvas.translate(i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    i2 = -i5;
                }
                canvas.translate(i2, -i6);
            }
            if (this.f2074p) {
                int i9 = this.f2071m;
                int i10 = this.f2067h;
                int i11 = i9 - i10;
                StateListDrawable stateListDrawable2 = this.f2065f;
                stateListDrawable2.setBounds(0, 0, 0, i10);
                int i12 = this.f2070l;
                int i13 = this.f2068i;
                Drawable drawable2 = this.f2066g;
                drawable2.setBounds(0, 0, i12, i13);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(0 - (0 / 2), 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r4, -i11);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        return f3 >= ((float) (this.f2071m - this.f2067h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2072n;
        int[] iArr = b0.f0.a;
        boolean z2 = b0.s.d(recyclerView) == 1;
        int i2 = this.f2063d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f2070l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    public final void e(int i2) {
        RecyclerView recyclerView = this.f2072n;
        l lVar = this.f2081w;
        recyclerView.removeCallbacks(lVar);
        this.f2072n.postDelayed(lVar, i2);
    }

    public final void f(int i2) {
        int i3;
        StateListDrawable stateListDrawable = this.f2061b;
        if (i2 == 2 && this.f2075q != 2) {
            stateListDrawable.setState(f2059x);
            this.f2072n.removeCallbacks(this.f2081w);
        }
        if (i2 == 0) {
            this.f2072n.invalidate();
        } else {
            g();
        }
        if (this.f2075q != 2 || i2 == 2) {
            i3 = i2 == 1 ? 1500 : 1200;
            this.f2075q = i2;
        }
        stateListDrawable.setState(f2060y);
        e(i3);
        this.f2075q = i2;
    }

    public final void g() {
        int i2 = this.f2080v;
        ValueAnimator valueAnimator = this.f2079u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2080v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
