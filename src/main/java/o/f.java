package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.x0;
import g.f2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements b0.l {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1897b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1898c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1899d;

    public f(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f1898c = new ArrayList();
        this.f1897b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f1971g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 1) {
                this.f1897b = typedArrayObtainStyledAttributes.getResourceId(index, this.f1897b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f1897b);
                context.getResources().getResourceName(this.f1897b);
                if ("layout".equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f1899d = nVar;
                    nVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f1897b, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // b0.l
    public final x0 g(View view, x0 x0Var) {
        int i2 = x0Var.a(7).f2277b;
        int i3 = this.a;
        Object obj = this.f1898c;
        if (i3 >= 0) {
            View view2 = (View) obj;
            view2.getLayoutParams().height = this.a + i2;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) obj;
        view3.setPadding(view3.getPaddingLeft(), this.f1897b + i2, view3.getPaddingRight(), view3.getPaddingBottom());
        return x0Var;
    }

    public f(l1.o oVar, f2 f2Var) {
        this.f1898c = new SparseArray();
        this.f1899d = oVar;
        this.a = f2Var.h(26, 0);
        this.f1897b = f2Var.h(50, 0);
    }
}
