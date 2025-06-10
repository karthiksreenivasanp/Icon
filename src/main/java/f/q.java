package f;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import b0.f0;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public class q {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final l f950b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f951c;

    /* renamed from: d, reason: collision with root package name */
    public final int f952d;

    /* renamed from: e, reason: collision with root package name */
    public final int f953e;

    /* renamed from: f, reason: collision with root package name */
    public View f954f;

    /* renamed from: g, reason: collision with root package name */
    public int f955g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f956h;

    /* renamed from: i, reason: collision with root package name */
    public r f957i;

    /* renamed from: j, reason: collision with root package name */
    public n f958j;
    public PopupWindow.OnDismissListener k;

    /* renamed from: l, reason: collision with root package name */
    public final o f959l;

    public q(int i2, int i3, Context context, View view, l lVar, boolean z2) {
        this.f955g = 8388611;
        this.f959l = new o(this);
        this.a = context;
        this.f950b = lVar;
        this.f954f = view;
        this.f951c = z2;
        this.f952d = i2;
        this.f953e = i3;
    }

    public final n a() {
        n vVar;
        if (this.f958j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            p.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                vVar = new h(this.a, this.f954f, this.f952d, this.f953e, this.f951c);
            } else {
                vVar = new v(this.f952d, this.f953e, this.a, this.f954f, this.f950b, this.f951c);
            }
            vVar.m(this.f950b);
            vVar.s(this.f959l);
            vVar.o(this.f954f);
            vVar.k(this.f957i);
            vVar.p(this.f956h);
            vVar.q(this.f955g);
            this.f958j = vVar;
        }
        return this.f958j;
    }

    public final boolean b() {
        n nVar = this.f958j;
        return nVar != null && nVar.d();
    }

    public void c() {
        this.f958j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        n nVarA = a();
        nVarA.t(z3);
        if (z2) {
            int i4 = this.f955g;
            View view = this.f954f;
            int[] iArr = f0.a;
            if ((Gravity.getAbsoluteGravity(i4, b0.s.d(view)) & 7) == 5) {
                i2 -= this.f954f.getWidth();
            }
            nVarA.r(i2);
            nVarA.u(i3);
            int i5 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            nVarA.a = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        nVarA.f();
    }

    public q(Context context, l lVar, View view, boolean z2) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, lVar, z2);
    }
}
