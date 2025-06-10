package l1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import b0.f0;
import com.google.android.material.textfield.TextInputLayout;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f1606e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1607f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1608g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f1609h;

    /* renamed from: i, reason: collision with root package name */
    public final b f1610i;

    /* renamed from: j, reason: collision with root package name */
    public final c f1611j;
    public final e0.a k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1612l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1613m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1614n;

    /* renamed from: o, reason: collision with root package name */
    public long f1615o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1616p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1617q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1618r;

    public l(o oVar) {
        super(oVar);
        this.f1610i = new b(this, 1);
        this.f1611j = new c(this, 1);
        this.k = new e0.a(this);
        this.f1615o = Long.MAX_VALUE;
        this.f1607f = f1.e.x0(oVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f1606e = f1.e.x0(oVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f1608g = f1.e.y0(oVar.getContext(), R.attr.motionEasingLinearInterpolator, w0.a.a);
    }

    @Override // l1.p
    public final void a() {
        if (this.f1616p.isTouchExplorationEnabled()) {
            if ((this.f1609h.getInputType() != 0) && !this.f1642d.hasFocus()) {
                this.f1609h.dismissDropDown();
            }
        }
        this.f1609h.post(new j1.d(2, this));
    }

    @Override // l1.p
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // l1.p
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // l1.p
    public final View.OnFocusChangeListener e() {
        return this.f1611j;
    }

    @Override // l1.p
    public final View.OnClickListener f() {
        return this.f1610i;
    }

    @Override // l1.p
    public final c0.d h() {
        return this.k;
    }

    @Override // l1.p
    public final boolean i(int i2) {
        return i2 != 0;
    }

    @Override // l1.p
    public final boolean j() {
        return this.f1612l;
    }

    @Override // l1.p
    public final boolean l() {
        return this.f1614n;
    }

    @Override // l1.p
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1609h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: l1.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = this.a;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - lVar.f1615o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        lVar.f1613m = false;
                    }
                    lVar.u();
                    lVar.f1613m = true;
                    lVar.f1615o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f1609h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: l1.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = this.a;
                lVar.f1613m = true;
                lVar.f1615o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.f1609h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!(editText.getInputType() != 0) && this.f1616p.isTouchExplorationEnabled()) {
            int[] iArr = f0.a;
            b0.r.s(this.f1642d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // l1.p
    public final void n(c0.g gVar) {
        boolean z2 = this.f1609h.getInputType() != 0;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.a;
        if (!z2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // l1.p
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (this.f1616p.isEnabled()) {
            boolean z2 = false;
            if (this.f1609h.getInputType() != 0) {
                return;
            }
            if (accessibilityEvent.getEventType() == 32768 && this.f1614n && !this.f1609h.isPopupShowing()) {
                z2 = true;
            }
            if (accessibilityEvent.getEventType() == 1 || z2) {
                u();
                this.f1613m = true;
                this.f1615o = System.currentTimeMillis();
            }
        }
    }

    @Override // l1.p
    public final void r() {
        int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1608g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f1607f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, i2));
        this.f1618r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f1606e);
        valueAnimatorOfFloat2.addUpdateListener(new a(this, i2));
        this.f1617q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new g.b(5, this));
        this.f1616p = (AccessibilityManager) this.f1641c.getSystemService("accessibility");
    }

    @Override // l1.p
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f1609h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1609h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f1614n != z2) {
            this.f1614n = z2;
            this.f1618r.cancel();
            this.f1617q.start();
        }
    }

    public final void u() {
        if (this.f1609h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f1615o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f1613m = false;
        }
        if (this.f1613m) {
            this.f1613m = false;
            return;
        }
        t(!this.f1614n);
        if (!this.f1614n) {
            this.f1609h.dismissDropDown();
        } else {
            this.f1609h.requestFocus();
            this.f1609h.showDropDown();
        }
    }
}
