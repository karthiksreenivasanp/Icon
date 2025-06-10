package o0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class m0 extends ViewGroup.MarginLayoutParams {
    public final Rect a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2055b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2056c;

    public m0(int i2, int i3) {
        super(i2, i3);
        this.a = new Rect();
        this.f2055b = true;
        this.f2056c = false;
    }

    public final int a() {
        throw null;
    }

    public final boolean b() {
        throw null;
    }

    public final boolean c() {
        throw null;
    }

    public m0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.f2055b = true;
        this.f2056c = false;
    }

    public m0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = new Rect();
        this.f2055b = true;
        this.f2056c = false;
    }

    public m0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = new Rect();
        this.f2055b = true;
        this.f2056c = false;
    }

    public m0(m0 m0Var) {
        super((ViewGroup.LayoutParams) m0Var);
        this.a = new Rect();
        this.f2055b = true;
        this.f2056c = false;
    }
}
