package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class p {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1184b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1185c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1186d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1187e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1188f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1189g;

    public p(View view) {
        this.a = 0;
        this.f1184b = -1;
        this.f1185c = view;
        this.f1186d = u.a();
    }

    public final void a() {
        View view = (View) this.f1185c;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z2 = false;
            if (((n2) this.f1187e) != null) {
                if (((n2) this.f1189g) == null) {
                    this.f1189g = new n2(0);
                }
                n2 n2Var = (n2) this.f1189g;
                n2Var.f1179c = null;
                n2Var.f1178b = false;
                n2Var.f1180d = null;
                n2Var.a = false;
                int[] iArr = b0.f0.a;
                ColorStateList colorStateListG = b0.x.g(view);
                if (colorStateListG != null) {
                    n2Var.f1178b = true;
                    n2Var.f1179c = colorStateListG;
                }
                PorterDuff.Mode modeH = b0.x.h(view);
                if (modeH != null) {
                    n2Var.a = true;
                    n2Var.f1180d = modeH;
                }
                if (n2Var.f1178b || n2Var.a) {
                    u.e(background, n2Var, view.getDrawableState());
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            n2 n2Var2 = (n2) this.f1188f;
            if (n2Var2 != null) {
                u.e(background, n2Var2, view.getDrawableState());
                return;
            }
            n2 n2Var3 = (n2) this.f1187e;
            if (n2Var3 != null) {
                u.e(background, n2Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        Object obj = this.f1188f;
        if (((n2) obj) != null) {
            return (ColorStateList) ((n2) obj).f1179c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        Object obj = this.f1188f;
        if (((n2) obj) != null) {
            return (PorterDuff.Mode) ((n2) obj).f1180d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListH;
        Object obj = this.f1185c;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = b.a.f476u;
        f2 f2VarM = f2.m(context, attributeSet, iArr, i2);
        Context context2 = view.getContext();
        TypedArray typedArray = (TypedArray) f2VarM.f1077b;
        int[] iArr2 = b0.f0.a;
        b0.c0.c(view, context2, iArr, attributeSet, typedArray, i2, 0);
        try {
            if (f2VarM.k(0)) {
                this.f1184b = f2VarM.h(0, -1);
                u uVar = (u) this.f1186d;
                Context context3 = ((View) obj).getContext();
                int i3 = this.f1184b;
                synchronized (uVar) {
                    colorStateListH = uVar.a.h(context3, i3);
                }
                if (colorStateListH != null) {
                    g(colorStateListH);
                }
            }
            if (f2VarM.k(1)) {
                b0.x.q((View) obj, f2VarM.b(1));
            }
            if (f2VarM.k(2)) {
                b0.x.r((View) obj, s0.a(f2VarM.g(2, -1), null));
            }
        } finally {
            f2VarM.n();
        }
    }

    public final void e() {
        this.f1184b = -1;
        g(null);
        a();
    }

    public final void f(int i2) {
        ColorStateList colorStateListH;
        this.f1184b = i2;
        u uVar = (u) this.f1186d;
        if (uVar != null) {
            Context context = ((View) this.f1185c).getContext();
            synchronized (uVar) {
                colorStateListH = uVar.a.h(context, i2);
            }
        } else {
            colorStateListH = null;
        }
        g(colorStateListH);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((n2) this.f1187e) == null) {
                this.f1187e = new n2(0);
            }
            Object obj = this.f1187e;
            ((n2) obj).f1179c = colorStateList;
            ((n2) obj).f1178b = true;
        } else {
            this.f1187e = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (((n2) this.f1188f) == null) {
            this.f1188f = new n2(0);
        }
        n2 n2Var = (n2) this.f1188f;
        n2Var.f1179c = colorStateList;
        n2Var.f1178b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (((n2) this.f1188f) == null) {
            this.f1188f = new n2(0);
        }
        n2 n2Var = (n2) this.f1188f;
        n2Var.f1180d = mode;
        n2Var.a = true;
        a();
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f1185c) + ", mProviderPackage: " + ((String) this.f1186d) + ", mQuery: " + ((String) this.f1187e) + ", mCertificates:");
                for (int i2 = 0; i2 < ((List) this.f1188f).size(); i2++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f1188f).get(i2);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f1184b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public p(String str, String str2, String str3, List list) {
        this.a = 1;
        str.getClass();
        this.f1185c = str;
        str2.getClass();
        this.f1186d = str2;
        this.f1187e = str3;
        list.getClass();
        this.f1188f = list;
        this.f1184b = 0;
        this.f1189g = str + "-" + str2 + "-" + str3;
    }
}
