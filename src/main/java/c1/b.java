package c1;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import e1.h;
import e1.i;

/* loaded from: classes.dex */
public final class b extends f1.e {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f529s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f530t;

    public /* synthetic */ b(int i2, Object obj) {
        this.f529s = i2;
        this.f530t = obj;
    }

    @Override // f1.e
    public final void i0(int i2) {
        switch (this.f529s) {
            case 0:
                break;
            default:
                i iVar = (i) this.f530t;
                iVar.f865d = true;
                h hVar = (h) iVar.f866e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // f1.e
    public final void k0(Typeface typeface, boolean z2) {
        int i2 = this.f529s;
        Object obj = this.f530t;
        switch (i2) {
            case 0:
                Chip chip = (Chip) obj;
                f fVar = chip.f642e;
                chip.setText(fVar.D0 ? fVar.E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    i iVar = (i) obj;
                    iVar.f865d = true;
                    h hVar = (h) iVar.f866e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
