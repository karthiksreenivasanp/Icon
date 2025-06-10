package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class z2 implements r0 {
    public final Toolbar a;

    /* renamed from: b, reason: collision with root package name */
    public int f1267b;

    /* renamed from: c, reason: collision with root package name */
    public View f1268c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f1269d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1270e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1271f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1272g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f1273h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f1274i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1275j;
    public Window.Callback k;

    /* renamed from: l, reason: collision with root package name */
    public int f1276l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f1277m;

    public z2(Toolbar toolbar) {
        Drawable drawable;
        this.f1276l = 0;
        this.a = toolbar;
        this.f1273h = toolbar.getTitle();
        this.f1274i = toolbar.getSubtitle();
        this.f1272g = this.f1273h != null;
        this.f1271f = toolbar.getNavigationIcon();
        f2 f2VarM = f2.m(toolbar.getContext(), null, b.a.a, R.attr.actionBarStyle);
        this.f1277m = f2VarM.e(15);
        CharSequence charSequenceJ = f2VarM.j(27);
        if (!TextUtils.isEmpty(charSequenceJ)) {
            this.f1272g = true;
            this.f1273h = charSequenceJ;
            if ((this.f1267b & 8) != 0) {
                toolbar.setTitle(charSequenceJ);
                if (this.f1272g) {
                    b0.f0.g(toolbar.getRootView(), charSequenceJ);
                }
            }
        }
        CharSequence charSequenceJ2 = f2VarM.j(25);
        if (!TextUtils.isEmpty(charSequenceJ2)) {
            this.f1274i = charSequenceJ2;
            if ((this.f1267b & 8) != 0) {
                toolbar.setSubtitle(charSequenceJ2);
            }
        }
        Drawable drawableE = f2VarM.e(20);
        if (drawableE != null) {
            this.f1270e = drawableE;
            b();
        }
        Drawable drawableE2 = f2VarM.e(17);
        if (drawableE2 != null) {
            this.f1269d = drawableE2;
            b();
        }
        if (this.f1271f == null && (drawable = this.f1277m) != null) {
            this.f1271f = drawable;
            if ((this.f1267b & 4) != 0) {
                toolbar.setNavigationIcon(drawable);
            } else {
                toolbar.setNavigationIcon((Drawable) null);
            }
        }
        a(f2VarM.g(10, 0));
        int iH = f2VarM.h(9, 0);
        if (iH != 0) {
            View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iH, (ViewGroup) toolbar, false);
            View view = this.f1268c;
            if (view != null && (this.f1267b & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f1268c = viewInflate;
            if (viewInflate != null && (this.f1267b & 16) != 0) {
                toolbar.addView(viewInflate);
            }
            a(this.f1267b | 16);
        }
        int layoutDimension = ((TypedArray) f2VarM.f1077b).getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int iC = f2VarM.c(7, -1);
        int iC2 = f2VarM.c(3, -1);
        if (iC >= 0 || iC2 >= 0) {
            int iMax = Math.max(iC, 0);
            int iMax2 = Math.max(iC2, 0);
            if (toolbar.f155t == null) {
                toolbar.f155t = new u1();
            }
            toolbar.f155t.a(iMax, iMax2);
        }
        int iH2 = f2VarM.h(28, 0);
        if (iH2 != 0) {
            Context context = toolbar.getContext();
            toolbar.f147l = iH2;
            l0 l0Var = toolbar.f138b;
            if (l0Var != null) {
                l0Var.setTextAppearance(context, iH2);
            }
        }
        int iH3 = f2VarM.h(26, 0);
        if (iH3 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.f148m = iH3;
            l0 l0Var2 = toolbar.f139c;
            if (l0Var2 != null) {
                l0Var2.setTextAppearance(context2, iH3);
            }
        }
        int iH4 = f2VarM.h(22, 0);
        if (iH4 != 0) {
            toolbar.setPopupTheme(iH4);
        }
        f2VarM.n();
        if (R.string.abc_action_bar_up_description != this.f1276l) {
            this.f1276l = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.f1276l;
                String string = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                this.f1275j = string;
                if ((this.f1267b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f1276l);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1275j);
                    }
                }
            }
        }
        this.f1275j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new y2(this));
    }

    public final void a(int i2) {
        View view;
        int i3 = this.f1267b ^ i2;
        this.f1267b = i2;
        if (i3 != 0) {
            int i4 = i3 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.a;
            if (i4 != 0) {
                if ((i2 & 4) != 0 && (i2 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f1275j)) {
                        toolbar.setNavigationContentDescription(this.f1276l);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1275j);
                    }
                }
                if ((this.f1267b & 4) != 0) {
                    Drawable drawable = this.f1271f;
                    if (drawable == null) {
                        drawable = this.f1277m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                b();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    toolbar.setTitle(this.f1273h);
                    charSequence = this.f1274i;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) == 0 || (view = this.f1268c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Drawable drawable;
        int i2 = this.f1267b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f1270e) == null) {
            drawable = this.f1269d;
        }
        this.a.setLogo(drawable);
    }
}
