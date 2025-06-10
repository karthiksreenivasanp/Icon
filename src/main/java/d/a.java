package d;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.j;
import androidx.lifecycle.x;
import b0.f0;
import b0.r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.g;
import f0.h;
import g.k;
import g.x0;
import i0.d;
import z0.e;

/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f775b;

    public /* synthetic */ a(int i2, Object obj) {
        this.a = i2;
        this.f775b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar;
        Object obj = this.f775b;
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                bVar.a(true);
                bVar.invalidateSelf();
                return;
            case 1:
                x0 x0Var = (x0) obj;
                x0Var.f1257l = null;
                x0Var.drawableStateChanged();
                return;
            case 2:
                ActionMenuView actionMenuView = ((Toolbar) obj).a;
                if (actionMenuView == null || (kVar = actionMenuView.f100s) == null) {
                    return;
                }
                kVar.f();
                return;
            case 3:
                g gVar = (g) obj;
                if (gVar.f1002o) {
                    boolean z2 = gVar.f1000m;
                    f0.a aVar = gVar.a;
                    if (z2) {
                        gVar.f1000m = false;
                        aVar.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f984e = jCurrentAnimationTimeMillis;
                        aVar.f986g = -1L;
                        aVar.f985f = jCurrentAnimationTimeMillis;
                        aVar.f987h = 0.5f;
                    }
                    if ((aVar.f986g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f986g + ((long) aVar.f988i)) || !gVar.f()) {
                        gVar.f1002o = false;
                        return;
                    }
                    boolean z3 = gVar.f1001n;
                    View view = gVar.f991c;
                    if (z3) {
                        gVar.f1001n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f985f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - aVar.f985f;
                    aVar.f985f = jCurrentAnimationTimeMillis2;
                    h.b(gVar.f1004q, (int) (j2 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f983d));
                    int[] iArr = f0.a;
                    r.m(view, this);
                    return;
                }
                return;
            case 4:
                ((d) obj).p(0);
                return;
            case 5:
            default:
                View view2 = (View) obj;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 1);
                return;
            case 6:
                x xVar = (x) obj;
                int i2 = xVar.f384b;
                androidx.lifecycle.r rVar = xVar.f388f;
                if (i2 == 0) {
                    xVar.f385c = true;
                    rVar.g(j.ON_PAUSE);
                }
                if (xVar.a == 0 && xVar.f385c) {
                    rVar.g(j.ON_STOP);
                    xVar.f386d = true;
                    return;
                }
                return;
            case 7:
                e eVar = (e) obj;
                eVar.f2391c = false;
                q.a aVar2 = eVar.f2393e;
                d dVar = ((BottomSheetBehavior) aVar2).M;
                if (dVar != null && dVar.g()) {
                    eVar.a(eVar.f2390b);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar2;
                if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.C(eVar.f2390b);
                    return;
                }
                return;
        }
    }
}
