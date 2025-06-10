package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.e;
import m.h;
import o.r;
import o.s;

/* loaded from: classes.dex */
public class Flow extends s {

    /* renamed from: i, reason: collision with root package name */
    public h f165i;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.s, o.b
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f165i = new h();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1966b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f165i.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar = this.f165i;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar.f1776f0 = dimensionPixelSize;
                    hVar.f1777g0 = dimensionPixelSize;
                    hVar.f1778h0 = dimensionPixelSize;
                    hVar.f1779i0 = dimensionPixelSize;
                } else if (index == 11) {
                    h hVar2 = this.f165i;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f1778h0 = dimensionPixelSize2;
                    hVar2.f1780j0 = dimensionPixelSize2;
                    hVar2.f1781k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f165i.f1779i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f165i.f1780j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f165i.f1776f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f165i.f1781k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f165i.f1777g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f165i.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f165i.f1787q0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f165i.r0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f165i.f1788s0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f165i.f1790u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f165i.f1789t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f165i.f1791v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f165i.f1792w0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f165i.f1794y0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f165i.A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f165i.f1795z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f165i.B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f165i.f1793x0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f165i.E0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f165i.F0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f165i.C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f165i.D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f165i.H0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f1853d = this.f165i;
        g();
    }

    @Override // o.b
    public final void f(e eVar, boolean z2) {
        h hVar = this.f165i;
        int i2 = hVar.f1778h0;
        if (i2 > 0 || hVar.f1779i0 > 0) {
            if (z2) {
                hVar.f1780j0 = hVar.f1779i0;
            } else {
                hVar.f1780j0 = i2;
                i2 = hVar.f1779i0;
            }
            hVar.f1781k0 = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x00de A[EDGE_INSN: B:394:0x00de->B:69:0x00de BREAK  A[LOOP:1: B:63:0x00ca->B:68:0x00da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x02ad -> B:199:0x02c0). Please report as a decompilation issue!!! */
    @Override // o.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(m.h r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.h(m.h, int, int):void");
    }

    @Override // o.b, android.view.View
    public final void onMeasure(int i2, int i3) {
        h(this.f165i, i2, i3);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f165i.f1794y0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f165i.f1788s0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f165i.f1795z0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f165i.f1789t0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f165i.E0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f165i.f1792w0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f165i.C0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f165i.f1787q0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f165i.H0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f165i.I0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        h hVar = this.f165i;
        hVar.f1776f0 = i2;
        hVar.f1777g0 = i2;
        hVar.f1778h0 = i2;
        hVar.f1779i0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f165i.f1777g0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f165i.f1780j0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f165i.f1781k0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f165i.f1776f0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f165i.F0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f165i.f1793x0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f165i.D0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f165i.r0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f165i.G0 = i2;
        requestLayout();
    }
}
