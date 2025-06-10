package l1;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class p {
    public final TextInputLayout a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1640b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1641c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1642d;

    public p(o oVar) {
        this.a = oVar.a;
        this.f1640b = oVar;
        this.f1641c = oVar.getContext();
        this.f1642d = oVar.f1625g;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public c0.d h() {
        return null;
    }

    public boolean i(int i2) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof l;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(c0.g gVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z2) {
    }

    public final void q() {
        this.f1640b.e(false);
    }

    public abstract void r();

    public void s() {
    }
}
