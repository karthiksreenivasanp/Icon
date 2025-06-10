package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1900b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1901c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1902d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1903e;

    public g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.a = Float.NaN;
        this.f1900b = Float.NaN;
        this.f1901c = Float.NaN;
        this.f1902d = Float.NaN;
        this.f1903e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f1973i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1903e);
                this.f1903e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f1902d = typedArrayObtainStyledAttributes.getDimension(index, this.f1902d);
            } else if (index == 2) {
                this.f1900b = typedArrayObtainStyledAttributes.getDimension(index, this.f1900b);
            } else if (index == 3) {
                this.f1901c = typedArrayObtainStyledAttributes.getDimension(index, this.f1901c);
            } else if (index == 4) {
                this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
