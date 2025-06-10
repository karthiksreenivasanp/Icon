package g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public final class s {
    public final CompoundButton a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1210b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1211c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1212d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1213e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1214f;

    public s(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.a;
        Drawable drawableA = f0.c.a(compoundButton);
        if (drawableA != null) {
            if (this.f1212d || this.f1213e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f1212d) {
                    v.b.h(drawableMutate, this.f1210b);
                }
                if (this.f1213e) {
                    v.b.i(drawableMutate, this.f1211c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }
}
