package f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.nothing.icon.R;
import g.b0;
import g.p1;
import g.q1;

/* loaded from: classes.dex */
public final class v extends n implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f960b;

    /* renamed from: c, reason: collision with root package name */
    public final l f961c;

    /* renamed from: d, reason: collision with root package name */
    public final i f962d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f963e;

    /* renamed from: f, reason: collision with root package name */
    public final int f964f;

    /* renamed from: g, reason: collision with root package name */
    public final int f965g;

    /* renamed from: h, reason: collision with root package name */
    public final int f966h;

    /* renamed from: i, reason: collision with root package name */
    public final q1 f967i;

    /* renamed from: j, reason: collision with root package name */
    public final c f968j;
    public final d k;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f969l;

    /* renamed from: m, reason: collision with root package name */
    public View f970m;

    /* renamed from: n, reason: collision with root package name */
    public View f971n;

    /* renamed from: o, reason: collision with root package name */
    public r f972o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f973p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f974q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f975r;

    /* renamed from: s, reason: collision with root package name */
    public int f976s;

    /* renamed from: t, reason: collision with root package name */
    public int f977t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f978u;

    public v(int i2, int i3, Context context, View view, l lVar, boolean z2) {
        int i4 = 1;
        this.f968j = new c(this, i4);
        this.k = new d(i4, this);
        this.f960b = context;
        this.f961c = lVar;
        this.f963e = z2;
        this.f962d = new i(lVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f965g = i2;
        this.f966h = i3;
        Resources resources = context.getResources();
        this.f964f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f970m = view;
        this.f967i = new q1(context, i2, i3);
        lVar.b(this, context);
    }

    @Override // f.s
    public final void a(l lVar, boolean z2) {
        if (lVar != this.f961c) {
            return;
        }
        j();
        r rVar = this.f972o;
        if (rVar != null) {
            rVar.a(lVar, z2);
        }
    }

    @Override // f.s
    public final void b() {
        this.f975r = false;
        i iVar = this.f962d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // f.u
    public final boolean d() {
        return !this.f974q && this.f967i.d();
    }

    @Override // f.u
    public final ListView e() {
        return this.f967i.f1127c;
    }

    @Override // f.u
    public final void f() {
        View view;
        boolean z2 = true;
        if (!d()) {
            if (this.f974q || (view = this.f970m) == null) {
                z2 = false;
            } else {
                this.f971n = view;
                q1 q1Var = this.f967i;
                q1Var.f1145v.setOnDismissListener(this);
                q1Var.f1136m = this;
                q1Var.f1144u = true;
                b0 b0Var = q1Var.f1145v;
                b0Var.setFocusable(true);
                View view2 = this.f971n;
                boolean z3 = this.f973p == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f973p = viewTreeObserver;
                if (z3) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f968j);
                }
                view2.addOnAttachStateChangeListener(this.k);
                q1Var.f1135l = view2;
                q1Var.f1134j = this.f977t;
                boolean z4 = this.f975r;
                Context context = this.f960b;
                i iVar = this.f962d;
                if (!z4) {
                    this.f976s = n.n(iVar, context, this.f964f);
                    this.f975r = true;
                }
                int i2 = this.f976s;
                Drawable background = b0Var.getBackground();
                if (background != null) {
                    Rect rect = q1Var.f1142s;
                    background.getPadding(rect);
                    q1Var.f1128d = rect.left + rect.right + i2;
                } else {
                    q1Var.f1128d = i2;
                }
                b0Var.setInputMethodMode(2);
                Rect rect2 = this.a;
                q1Var.f1143t = rect2 != null ? new Rect(rect2) : null;
                q1Var.f();
                p1 p1Var = q1Var.f1127c;
                p1Var.setOnKeyListener(this);
                if (this.f978u) {
                    l lVar = this.f961c;
                    if (lVar.f917l != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p1Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(lVar.f917l);
                        }
                        frameLayout.setEnabled(false);
                        p1Var.addHeaderView(frameLayout, null, false);
                    }
                }
                q1Var.a(iVar);
                q1Var.f();
            }
        }
        if (!z2) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // f.s
    public final boolean g() {
        return false;
    }

    @Override // f.u
    public final void j() {
        if (d()) {
            this.f967i.j();
        }
    }

    @Override // f.s
    public final void k(r rVar) {
        this.f972o = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    @Override // f.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(f.w r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7e
            f.q r0 = new f.q
            android.content.Context r5 = r9.f960b
            android.view.View r6 = r9.f971n
            boolean r8 = r9.f963e
            int r3 = r9.f965g
            int r4 = r9.f966h
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            f.r r2 = r9.f972o
            r0.f957i = r2
            f.n r3 = r0.f958j
            if (r3 == 0) goto L23
            r3.k(r2)
        L23:
            boolean r2 = f.n.v(r10)
            r0.f956h = r2
            f.n r3 = r0.f958j
            if (r3 == 0) goto L30
            r3.p(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f969l
            r0.k = r2
            r2 = 0
            r9.f969l = r2
            f.l r2 = r9.f961c
            r2.c(r1)
            g.q1 r2 = r9.f967i
            int r3 = r2.f1129e
            boolean r4 = r2.f1131g
            if (r4 != 0) goto L46
            r2 = r1
            goto L48
        L46:
            int r2 = r2.f1130f
        L48:
            int r4 = r9.f977t
            android.view.View r5 = r9.f970m
            int[] r6 = b0.f0.a
            int r5 = b0.s.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L62
            android.view.View r4 = r9.f970m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L62:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L6a
            goto L73
        L6a:
            android.view.View r4 = r0.f954f
            if (r4 != 0) goto L70
            r0 = r1
            goto L74
        L70:
            r0.d(r3, r2, r5, r5)
        L73:
            r0 = r5
        L74:
            if (r0 == 0) goto L7e
            f.r r9 = r9.f972o
            if (r9 == 0) goto L7d
            r9.d(r10)
        L7d:
            return r5
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.v.l(f.w):boolean");
    }

    @Override // f.n
    public final void m(l lVar) {
    }

    @Override // f.n
    public final void o(View view) {
        this.f970m = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f974q = true;
        this.f961c.c(true);
        ViewTreeObserver viewTreeObserver = this.f973p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f973p = this.f971n.getViewTreeObserver();
            }
            this.f973p.removeGlobalOnLayoutListener(this.f968j);
            this.f973p = null;
        }
        this.f971n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.f969l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        j();
        return true;
    }

    @Override // f.n
    public final void p(boolean z2) {
        this.f962d.f903c = z2;
    }

    @Override // f.n
    public final void q(int i2) {
        this.f977t = i2;
    }

    @Override // f.n
    public final void r(int i2) {
        this.f967i.f1129e = i2;
    }

    @Override // f.n
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f969l = onDismissListener;
    }

    @Override // f.n
    public final void t(boolean z2) {
        this.f978u = z2;
    }

    @Override // f.n
    public final void u(int i2) {
        q1 q1Var = this.f967i;
        q1Var.f1130f = i2;
        q1Var.f1131g = true;
    }
}
