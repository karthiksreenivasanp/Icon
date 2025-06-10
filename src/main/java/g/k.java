package g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuView;
import com.nothing.icon.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements f.s {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public Context f1105b;

    /* renamed from: c, reason: collision with root package name */
    public f.l f1106c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f1107d;

    /* renamed from: e, reason: collision with root package name */
    public f.r f1108e;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f1110g;

    /* renamed from: h, reason: collision with root package name */
    public j f1111h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1112i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1113j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1114l;

    /* renamed from: m, reason: collision with root package name */
    public int f1115m;

    /* renamed from: n, reason: collision with root package name */
    public int f1116n;

    /* renamed from: o, reason: collision with root package name */
    public int f1117o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1118p;

    /* renamed from: r, reason: collision with root package name */
    public f f1120r;

    /* renamed from: s, reason: collision with root package name */
    public f f1121s;

    /* renamed from: t, reason: collision with root package name */
    public h f1122t;

    /* renamed from: u, reason: collision with root package name */
    public g f1123u;

    /* renamed from: f, reason: collision with root package name */
    public final int f1109f = R.layout.abc_action_menu_item_layout;

    /* renamed from: q, reason: collision with root package name */
    public final SparseBooleanArray f1119q = new SparseBooleanArray();

    /* renamed from: v, reason: collision with root package name */
    public final f.f f1124v = new f.f(2, this);

    public k(Context context) {
        this.a = context;
        this.f1107d = LayoutInflater.from(context);
    }

    @Override // f.s
    public final void a(f.l lVar, boolean z2) {
        e();
        f fVar = this.f1121s;
        if (fVar != null && fVar.b()) {
            fVar.f958j.j();
        }
        f.r rVar = this.f1108e;
        if (rVar != null) {
            rVar.a(lVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.s
    public final void b() {
        int i2;
        boolean z2;
        ViewGroup viewGroup = this.f1110g;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            f.l lVar = this.f1106c;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListK = this.f1106c.k();
                int size = arrayListK.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    f.m mVar = (f.m) arrayListK.get(i3);
                    if (mVar.c()) {
                        View childAt = viewGroup.getChildAt(i2);
                        f.m itemData = childAt instanceof f.t ? ((f.t) childAt).getItemData() : null;
                        View viewD = d(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            viewD.setPressed(false);
                            viewD.jumpDrawablesToCurrentState();
                        }
                        if (viewD != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewD.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewD);
                            }
                            this.f1110g.addView(viewD, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f1111h) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z2 = true;
                }
                if (!z2) {
                    i2++;
                }
            }
        }
        this.f1110g.requestLayout();
        f.l lVar2 = this.f1106c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f915i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((f.m) arrayList2.get(i4)).getClass();
            }
        }
        f.l lVar3 = this.f1106c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f916j;
        }
        if (this.k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((f.m) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        j jVar = this.f1111h;
        if (z3) {
            if (jVar == null) {
                this.f1111h = new j(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1111h.getParent();
            if (viewGroup3 != this.f1110g) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1111h);
                }
                ActionMenuView actionMenuView = this.f1110g;
                j jVar2 = this.f1111h;
                actionMenuView.getClass();
                m mVar2 = new m();
                ((LinearLayout.LayoutParams) mVar2).gravity = 16;
                mVar2.a = true;
                actionMenuView.addView(jVar2, mVar2);
            }
        } else if (jVar != null) {
            ViewParent parent = jVar.getParent();
            ActionMenuView actionMenuView2 = this.f1110g;
            if (parent == actionMenuView2) {
                actionMenuView2.removeView(this.f1111h);
            }
        }
        this.f1110g.setOverflowReserved(this.k);
    }

    @Override // f.s
    public final /* bridge */ /* synthetic */ boolean c(f.m mVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v4, types: [f.t] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View d(f.m r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.view.View r0 = r5.getActionView()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L17
            int r3 = r5.f948y
            r3 = r3 & r1
            if (r3 == 0) goto L14
            android.view.View r3 = r5.f949z
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = r2
        L15:
            if (r3 == 0) goto L46
        L17:
            boolean r0 = r6 instanceof f.t
            if (r0 == 0) goto L1e
            f.t r6 = (f.t) r6
            goto L28
        L1e:
            android.view.LayoutInflater r6 = r4.f1107d
            int r0 = r4.f1109f
            android.view.View r6 = r6.inflate(r0, r7, r2)
            f.t r6 = (f.t) r6
        L28:
            r6.c(r5)
            androidx.appcompat.widget.ActionMenuView r0 = r4.f1110g
            r3 = r6
            androidx.appcompat.view.menu.ActionMenuItemView r3 = (androidx.appcompat.view.menu.ActionMenuItemView) r3
            r3.setItemInvoker(r0)
            g.g r0 = r4.f1123u
            if (r0 != 0) goto L3e
            g.g r0 = new g.g
            r0.<init>(r4)
            r4.f1123u = r0
        L3e:
            g.g r4 = r4.f1123u
            r3.setPopupCallback(r4)
            r0 = r6
            android.view.View r0 = (android.view.View) r0
        L46:
            boolean r4 = r5.B
            if (r4 == 0) goto L4b
            goto L4c
        L4b:
            r1 = r2
        L4c:
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionMenuView r7 = (androidx.appcompat.widget.ActionMenuView) r7
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            boolean r5 = r7.checkLayoutParams(r4)
            if (r5 != 0) goto L62
            g.m r4 = androidx.appcompat.widget.ActionMenuView.i(r4)
            r0.setLayoutParams(r4)
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.d(f.m, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean e() {
        ActionMenuView actionMenuView;
        h hVar = this.f1122t;
        if (hVar != null && (actionMenuView = this.f1110g) != null) {
            actionMenuView.removeCallbacks(hVar);
            this.f1122t = null;
            return true;
        }
        f fVar = this.f1120r;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.f958j.j();
        }
        return true;
    }

    public final boolean f() {
        f.l lVar;
        int i2 = 0;
        if (this.k) {
            f fVar = this.f1120r;
            if (!(fVar != null && fVar.b()) && (lVar = this.f1106c) != null && this.f1110g != null && this.f1122t == null) {
                lVar.i();
                if (!lVar.f916j.isEmpty()) {
                    h hVar = new h(i2, this, new f(this, this.f1105b, this.f1106c, this.f1111h));
                    this.f1122t = hVar;
                    this.f1110g.post(hVar);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f.s
    public final boolean g() {
        int size;
        ArrayList arrayListK;
        int i2;
        boolean z2;
        f.l lVar = this.f1106c;
        if (lVar != null) {
            arrayListK = lVar.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i3 = this.f1117o;
        int i4 = this.f1116n;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f1110g;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= size) {
                break;
            }
            f.m mVar = (f.m) arrayListK.get(i5);
            int i8 = mVar.f948y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f1118p && mVar.B) {
                i3 = 0;
            }
            i5++;
        }
        if (this.k && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f1119q;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            f.m mVar2 = (f.m) arrayListK.get(i10);
            int i12 = mVar2.f948y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = mVar2.f926b;
            if (z4) {
                View viewD = d(mVar2, null, actionMenuView);
                viewD.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewD.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                mVar2.d(z2);
            } else if ((i12 & 1) == z2 ? z2 : false) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View viewD2 = d(mVar2, null, actionMenuView);
                    viewD2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewD2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        f.m mVar3 = (f.m) arrayListK.get(i14);
                        if (mVar3.f926b == i13) {
                            if (mVar3.c()) {
                                i9++;
                            }
                            mVar3.d(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                mVar2.d(z6);
            } else {
                mVar2.d(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    @Override // f.s
    public final void h(Context context, f.l lVar) {
        this.f1105b = context;
        LayoutInflater.from(context);
        this.f1106c = lVar;
        Resources resources = context.getResources();
        if (!this.f1114l) {
            this.k = true;
        }
        int i2 = 2;
        this.f1115m = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f1117o = i2;
        int measuredWidth = this.f1115m;
        if (this.k) {
            if (this.f1111h == null) {
                j jVar = new j(this, this.a);
                this.f1111h = jVar;
                if (this.f1113j) {
                    jVar.setImageDrawable(this.f1112i);
                    this.f1112i = null;
                    this.f1113j = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1111h.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1111h.getMeasuredWidth();
        } else {
            this.f1111h = null;
        }
        this.f1116n = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // f.s
    public final /* bridge */ /* synthetic */ boolean i(f.m mVar) {
        return false;
    }

    @Override // f.s
    public final void k(f.r rVar) {
        this.f1108e = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.s
    public final boolean l(f.w wVar) {
        View childAt;
        boolean z2;
        boolean z3 = false;
        if (!wVar.hasVisibleItems()) {
            return false;
        }
        f.w wVar2 = wVar;
        while (true) {
            f.l lVar = wVar2.f979v;
            if (lVar == this.f1106c) {
                break;
            }
            wVar2 = (f.w) lVar;
        }
        ActionMenuView actionMenuView = this.f1110g;
        if (actionMenuView == null) {
            childAt = 0;
        } else {
            int childCount = actionMenuView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                childAt = actionMenuView.getChildAt(i2);
                if ((childAt instanceof f.t) && ((f.t) childAt).getItemData() == wVar2.f980w) {
                    break;
                }
            }
            childAt = 0;
        }
        if (childAt == 0) {
            return false;
        }
        wVar.f980w.getClass();
        int size = wVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = wVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        f fVar = new f(this, this.f1105b, wVar, childAt);
        this.f1121s = fVar;
        fVar.f956h = z2;
        f.n nVar = fVar.f958j;
        if (nVar != null) {
            nVar.p(z2);
        }
        f fVar2 = this.f1121s;
        if (fVar2.b()) {
            z3 = true;
        } else if (fVar2.f954f != null) {
            fVar2.d(0, 0, false, false);
            z3 = true;
        }
        if (!z3) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        f.r rVar = this.f1108e;
        if (rVar != null) {
            rVar.d(wVar);
        }
        return true;
    }
}
