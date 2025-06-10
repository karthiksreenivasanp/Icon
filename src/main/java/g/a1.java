package g;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class a1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1045c;

    /* renamed from: d, reason: collision with root package name */
    public final View f1046d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f1047e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f1048f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1049g;

    /* renamed from: h, reason: collision with root package name */
    public int f1050h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f1051i = new int[2];

    public a1(View view) {
        this.f1046d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1044b = tapTimeout;
        this.f1045c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        z0 z0Var = this.f1048f;
        View view = this.f1046d;
        if (z0Var != null) {
            view.removeCallbacks(z0Var);
        }
        z0 z0Var2 = this.f1047e;
        if (z0Var2 != null) {
            view.removeCallbacks(z0Var2);
        }
    }

    public abstract f.n b();

    public abstract boolean c();

    public boolean d() {
        f.n nVarB = b();
        if (nVarB == null || !nVarB.d()) {
            return true;
        }
        nVarB.j();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1049g = false;
        this.f1050h = -1;
        z0 z0Var = this.f1047e;
        if (z0Var != null) {
            this.f1046d.removeCallbacks(z0Var);
        }
    }
}
