package o0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class y0 implements Runnable {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2138b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2139c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f2140d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2141e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2143g;

    public y0(RecyclerView recyclerView) {
        this.f2143g = recyclerView;
        i0.c cVar = RecyclerView.f408m0;
        this.f2140d = cVar;
        this.f2141e = false;
        this.f2142f = false;
        this.f2139c = new OverScroller(recyclerView.getContext(), cVar);
    }

    public final void a() {
        if (this.f2141e) {
            this.f2142f = true;
            return;
        }
        RecyclerView recyclerView = this.f2143g;
        recyclerView.removeCallbacks(this);
        int[] iArr = b0.f0.a;
        b0.r.m(recyclerView, this);
    }

    public final void b(int i2, int i3, int i4, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f2143g;
        if (i4 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z2 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i3 * i3) + (i2 * i2));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f2 = width;
            float f3 = i5;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
            }
            i4 = Math.min(iRound, 2000);
        }
        int i6 = i4;
        if (interpolator == null) {
            interpolator = RecyclerView.f408m0;
        }
        if (this.f2140d != interpolator) {
            this.f2140d = interpolator;
            this.f2139c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2138b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.f2139c.startScroll(0, 0, i2, i3, i6);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f2143g;
        if (recyclerView.f426j == null) {
            recyclerView.removeCallbacks(this);
            this.f2139c.abortAnimation();
            return;
        }
        this.f2142f = false;
        this.f2141e = true;
        recyclerView.g();
        OverScroller overScroller = this.f2139c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.a;
            int i3 = currY - this.f2138b;
            this.a = currX;
            this.f2138b = currY;
            int[] iArr = recyclerView.f423h0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zJ = recyclerView.j(i2, i3, iArr, null, 1);
            int[] iArr2 = recyclerView.f423h0;
            if (zJ) {
                i2 -= iArr2[0];
                i3 -= iArr2[1];
            }
            int i4 = i2;
            int i5 = i3;
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.f(i4, i5);
            }
            if (!recyclerView.k.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f423h0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.k(0, 0, i4, i5, null, 1, iArr3);
            int i6 = i4 - iArr2[0];
            int i7 = i5 - iArr2[1];
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
            recyclerView.f426j.getClass();
            if (z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    if (i8 < 0) {
                        recyclerView.m();
                        if (recyclerView.B.isFinished()) {
                            recyclerView.B.onAbsorb(-i8);
                        }
                    } else if (i8 > 0) {
                        recyclerView.n();
                        if (recyclerView.D.isFinished()) {
                            recyclerView.D.onAbsorb(i8);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.o();
                        if (recyclerView.C.isFinished()) {
                            recyclerView.C.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.l();
                        if (recyclerView.E.isFinished()) {
                            recyclerView.E.onAbsorb(currVelocity);
                        }
                    }
                    if (i8 != 0 || currVelocity != 0) {
                        int[] iArr4 = b0.f0.a;
                        b0.r.k(recyclerView);
                    }
                }
                q qVar = recyclerView.V;
                qVar.getClass();
                qVar.f2083c = 0;
            } else {
                a();
                s sVar = recyclerView.U;
                if (sVar != null) {
                    sVar.a(recyclerView, 0, 0);
                }
            }
        }
        recyclerView.f426j.getClass();
        this.f2141e = false;
        if (!this.f2142f) {
            recyclerView.setScrollState(0);
            recyclerView.K(1);
        } else {
            recyclerView.removeCallbacks(this);
            int[] iArr5 = b0.f0.a;
            b0.r.m(recyclerView, this);
        }
    }
}
