package s0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import b0.f0;

/* loaded from: classes.dex */
public final class c extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Class cls, String str, int i2) {
        super(cls, str);
        this.a = i2;
    }

    public final Float a(View view) {
        switch (this.a) {
            case 5:
                c cVar = u.a;
                return Float.valueOf(view.getTransitionAlpha());
            case 6:
            default:
                int[] iArr = f0.a;
                return Float.valueOf(b0.s.e(view));
            case 7:
                return Float.valueOf(view.getLayoutParams().width);
            case 8:
                return Float.valueOf(view.getLayoutParams().height);
            case 9:
                int[] iArr2 = f0.a;
                return Float.valueOf(b0.s.f(view));
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.a) {
            case 2:
                int left = view.getLeft();
                int top = view.getTop();
                int iRound = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                c cVar = u.a;
                view.setLeftTopRightBottom(left, top, iRound, iRound2);
                break;
            case 3:
                int iRound3 = Math.round(pointF.x);
                int iRound4 = Math.round(pointF.y);
                int right = view.getRight();
                int bottom = view.getBottom();
                c cVar2 = u.a;
                view.setLeftTopRightBottom(iRound3, iRound4, right, bottom);
                break;
            default:
                int iRound5 = Math.round(pointF.x);
                int iRound6 = Math.round(pointF.y);
                int width = view.getWidth() + iRound5;
                int height = view.getHeight() + iRound6;
                c cVar3 = u.a;
                view.setLeftTopRightBottom(iRound5, iRound6, width, height);
                break;
        }
    }

    public final void c(View view, Float f2) {
        switch (this.a) {
            case 5:
                float fFloatValue = f2.floatValue();
                c cVar = u.a;
                view.setTransitionAlpha(fFloatValue);
                break;
            case 6:
            default:
                int[] iArr = f0.a;
                b0.s.k(view, b0.s.f(view), view.getPaddingTop(), f2.intValue(), view.getPaddingBottom());
                break;
            case 7:
                view.getLayoutParams().width = f2.intValue();
                view.requestLayout();
                break;
            case 8:
                view.getLayoutParams().height = f2.intValue();
                view.requestLayout();
                break;
            case 9:
                int iIntValue = f2.intValue();
                int paddingTop = view.getPaddingTop();
                int[] iArr2 = f0.a;
                b0.s.k(view, iIntValue, paddingTop, b0.s.e(view), view.getPaddingBottom());
                break;
        }
    }

    public final void d(f fVar, PointF pointF) {
        switch (this.a) {
            case 0:
                fVar.getClass();
                fVar.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                fVar.f2200b = iRound;
                int i2 = fVar.f2204f + 1;
                fVar.f2204f = i2;
                if (i2 == fVar.f2205g) {
                    u.a(fVar.f2203e, fVar.a, iRound, fVar.f2201c, fVar.f2202d);
                    fVar.f2204f = 0;
                    fVar.f2205g = 0;
                    break;
                }
                break;
            default:
                fVar.getClass();
                fVar.f2201c = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                fVar.f2202d = iRound2;
                int i3 = fVar.f2205g + 1;
                fVar.f2205g = i3;
                if (fVar.f2204f == i3) {
                    u.a(fVar.f2203e, fVar.a, fVar.f2200b, fVar.f2201c, iRound2);
                    fVar.f2204f = 0;
                    fVar.f2205g = 0;
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                int[] iArr = f0.a;
                break;
        }
        return a((View) obj);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                d((f) obj, (PointF) obj2);
                break;
            case 1:
                d((f) obj, (PointF) obj2);
                break;
            case 2:
                b((View) obj, (PointF) obj2);
                break;
            case 3:
                b((View) obj, (PointF) obj2);
                break;
            case 4:
                b((View) obj, (PointF) obj2);
                break;
            case 5:
                c((View) obj, (Float) obj2);
                break;
            case 6:
                int[] iArr = f0.a;
                b0.t.c((View) obj, (Rect) obj2);
                break;
            case 7:
                c((View) obj, (Float) obj2);
                break;
            case 8:
                c((View) obj, (Float) obj2);
                break;
            case 9:
                c((View) obj, (Float) obj2);
                break;
            default:
                c((View) obj, (Float) obj2);
                break;
        }
    }
}
