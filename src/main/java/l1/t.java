package l1;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class t extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f1671e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1672f;

    /* renamed from: g, reason: collision with root package name */
    public final b f1673g;

    public t(o oVar, int i2) {
        super(oVar);
        this.f1671e = R.drawable.design_password_eye;
        this.f1673g = new b(this, 2);
        if (i2 != 0) {
            this.f1671e = i2;
        }
    }

    @Override // l1.p
    public final void b() {
        q();
    }

    @Override // l1.p
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // l1.p
    public final int d() {
        return this.f1671e;
    }

    @Override // l1.p
    public final View.OnClickListener f() {
        return this.f1673g;
    }

    @Override // l1.p
    public final boolean k() {
        return true;
    }

    @Override // l1.p
    public final boolean l() {
        EditText editText = this.f1672f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // l1.p
    public final void m(EditText editText) {
        this.f1672f = editText;
        q();
    }

    @Override // l1.p
    public final void r() {
        EditText editText = this.f1672f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f1672f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // l1.p
    public final void s() {
        EditText editText = this.f1672f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
