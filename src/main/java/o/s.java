package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class s extends b {

    /* renamed from: g, reason: collision with root package name */
    public boolean f1974g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1975h;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.b
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1966b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f1974g = true;
                } else if (index == 13) {
                    this.f1975h = true;
                }
            }
        }
    }

    public abstract void h(m.h hVar, int i2, int i3);

    @Override // o.b, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1974g || this.f1975h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f1851b; i2++) {
                View view = (View) constraintLayout.a.get(this.a[i2]);
                if (view != null) {
                    if (this.f1974g) {
                        view.setVisibility(visibility);
                    }
                    if (this.f1975h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        c();
    }
}
