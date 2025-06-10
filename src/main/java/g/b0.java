package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class b0 extends PopupWindow {
    public b0(Context context, int i2, int i3) {
        int resourceId;
        super(context, (AttributeSet) null, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, b.a.f471p, i2, i3);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            f0.n.c(this, typedArrayObtainStyledAttributes.getBoolean(2, false));
        }
        setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : f1.e.M(context, resourceId));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i2, int i3) {
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i2, int i3, int i4, int i5) {
        super.update(view, i2, i3, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i2, int i3, int i4) {
        super.showAsDropDown(view, i2, i3, i4);
    }
}
