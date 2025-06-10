package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.a;
import o.b;
import o.r;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: g, reason: collision with root package name */
    public int f166g;

    /* renamed from: h, reason: collision with root package name */
    public int f167h;

    /* renamed from: i, reason: collision with root package name */
    public a f168i;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // o.b
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f168i = new a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1966b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 15) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f168i.f1688g0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f168i.f1689h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f1853d = this.f168i;
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (r0 == 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r0 == 6) goto L9;
     */
    @Override // o.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(m.e r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f166g
            r3.f167h = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L14
        Lb:
            if (r0 != r1) goto L17
            goto L10
        Le:
            if (r0 != r2) goto L12
        L10:
            r5 = 0
            goto L15
        L12:
            if (r0 != r1) goto L17
        L14:
            r5 = 1
        L15:
            r3.f167h = r5
        L17:
            boolean r5 = r4 instanceof m.a
            if (r5 == 0) goto L21
            m.a r4 = (m.a) r4
            int r3 = r3.f167h
            r4.f1687f0 = r3
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.f(m.e, boolean):void");
    }

    public int getMargin() {
        return this.f168i.f1689h0;
    }

    public int getType() {
        return this.f166g;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f168i.f1688g0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f168i.f1689h0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f168i.f1689h0 = i2;
    }

    public void setType(int i2) {
        this.f166g = i2;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
