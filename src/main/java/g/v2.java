package g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class v2 extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public int f1241b;

    public v2() {
        this.f1241b = 0;
        this.a = 8388627;
    }

    public v2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1241b = 0;
    }

    public v2(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1241b = 0;
    }

    public v2(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1241b = 0;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
    }

    public v2(c.a aVar) {
        super(aVar);
        this.f1241b = 0;
    }

    public v2(v2 v2Var) {
        super((c.a) v2Var);
        this.f1241b = 0;
        this.f1241b = v2Var.f1241b;
    }
}
