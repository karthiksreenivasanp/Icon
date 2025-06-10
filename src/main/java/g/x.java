package g;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class x {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public final f.f f1247b;

    public x(TextView textView) {
        this.a = textView;
        this.f1247b = new f.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, b.a.f463g, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((i1.e) this.f1247b.f875b).h(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
