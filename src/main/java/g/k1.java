package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: classes.dex */
public abstract class k1 implements f.u {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f1126b;

    /* renamed from: c, reason: collision with root package name */
    public p1 f1127c;

    /* renamed from: e, reason: collision with root package name */
    public int f1129e;

    /* renamed from: f, reason: collision with root package name */
    public int f1130f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1131g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1132h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1133i;
    public h1 k;

    /* renamed from: l, reason: collision with root package name */
    public View f1135l;

    /* renamed from: m, reason: collision with root package name */
    public AdapterView.OnItemClickListener f1136m;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f1141r;

    /* renamed from: t, reason: collision with root package name */
    public Rect f1143t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1144u;

    /* renamed from: v, reason: collision with root package name */
    public final b0 f1145v;

    /* renamed from: d, reason: collision with root package name */
    public int f1128d = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f1134j = 0;

    /* renamed from: n, reason: collision with root package name */
    public final d1 f1137n = new d1(this, 2);

    /* renamed from: o, reason: collision with root package name */
    public final j1 f1138o = new j1(this);

    /* renamed from: p, reason: collision with root package name */
    public final i1 f1139p = new i1(this);

    /* renamed from: q, reason: collision with root package name */
    public final d1 f1140q = new d1(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1142s = new Rect();

    public k1(Context context, int i2, int i3) {
        this.a = context;
        this.f1141r = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, b.a.f467l, i2, i3);
        this.f1129e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1130f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1131g = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        b0 b0Var = new b0(context, i2, i3);
        this.f1145v = b0Var;
        b0Var.setInputMethodMode(1);
    }

    public final void a(f.i iVar) {
        h1 h1Var = this.k;
        if (h1Var == null) {
            this.k = new h1(0, this);
        } else {
            ListAdapter listAdapter = this.f1126b;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(h1Var);
            }
        }
        this.f1126b = iVar;
        if (iVar != null) {
            iVar.registerDataSetObserver(this.k);
        }
        p1 p1Var = this.f1127c;
        if (p1Var != null) {
            p1Var.setAdapter(this.f1126b);
        }
    }

    @Override // f.u
    public final boolean d() {
        return this.f1145v.isShowing();
    }

    @Override // f.u
    public final ListView e() {
        return this.f1127c;
    }

    @Override // f.u
    public final void f() {
        int i2;
        p1 p1Var;
        p1 p1Var2 = this.f1127c;
        b0 b0Var = this.f1145v;
        Context context = this.a;
        if (p1Var2 == null) {
            p1 p1Var3 = new p1(context, !this.f1144u);
            p1Var3.setHoverListener((q1) this);
            this.f1127c = p1Var3;
            p1Var3.setAdapter(this.f1126b);
            this.f1127c.setOnItemClickListener(this.f1136m);
            this.f1127c.setFocusable(true);
            this.f1127c.setFocusableInTouchMode(true);
            this.f1127c.setOnItemSelectedListener(new e1(i, this));
            this.f1127c.setOnScrollListener(this.f1139p);
            b0Var.setContentView(this.f1127c);
        }
        Drawable background = b0Var.getBackground();
        Rect rect = this.f1142s;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f1131g) {
                this.f1130f = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int iA = f1.a(b0Var, this.f1135l, this.f1130f, b0Var.getInputMethodMode() == 2);
        int i4 = this.f1128d;
        int iA2 = this.f1127c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA + 0);
        int paddingBottom = iA2 + (iA2 > 0 ? 0 + this.f1127c.getPaddingBottom() + this.f1127c.getPaddingTop() + i2 : 0);
        b0Var.getInputMethodMode();
        f0.n.d(b0Var, 1002);
        if (b0Var.isShowing()) {
            View view = this.f1135l;
            int[] iArr = b0.f0.a;
            if (b0.u.b(view)) {
                int width = this.f1128d;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f1135l.getWidth();
                }
                b0Var.setOutsideTouchable(true);
                b0Var.update(this.f1135l, this.f1129e, this.f1130f, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f1128d;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f1135l.getWidth();
        }
        b0Var.setWidth(width2);
        b0Var.setHeight(paddingBottom);
        g1.b(b0Var, true);
        b0Var.setOutsideTouchable(true);
        b0Var.setTouchInterceptor(this.f1138o);
        if (this.f1133i) {
            f0.n.c(b0Var, this.f1132h);
        }
        g1.a(b0Var, this.f1143t);
        f0.m.a(b0Var, this.f1135l, this.f1129e, this.f1130f, this.f1134j);
        this.f1127c.setSelection(-1);
        if ((!this.f1144u || this.f1127c.isInTouchMode()) && (p1Var = this.f1127c) != null) {
            p1Var.setListSelectionHidden(true);
            p1Var.requestLayout();
        }
        if (this.f1144u) {
            return;
        }
        this.f1141r.post(this.f1140q);
    }

    @Override // f.u
    public final void j() {
        b0 b0Var = this.f1145v;
        b0Var.dismiss();
        b0Var.setContentView(null);
        this.f1127c = null;
        this.f1141r.removeCallbacks(this.f1137n);
    }
}
