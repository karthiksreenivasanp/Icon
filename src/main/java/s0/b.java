package s0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public final class b extends Property {
    public final Rect a;

    public b() {
        super(PointF.class, "boundsOrigin");
        this.a = new Rect();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.a);
        return new PointF(r1.left, r1.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.a;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}
