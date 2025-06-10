package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup.MarginLayoutParams {
    public int a;

    public a() {
        super(-2, -2);
        this.a = 8388627;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.f458b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public a(a aVar) {
        super((ViewGroup.MarginLayoutParams) aVar);
        this.a = 0;
        this.a = aVar.a;
    }
}
