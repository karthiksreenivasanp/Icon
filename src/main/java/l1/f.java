package l1;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(o oVar, int i2) {
        super(oVar);
        this.f1602e = i2;
    }

    @Override // l1.p
    public final void r() {
        switch (this.f1602e) {
            case 0:
                o oVar = this.f1640b;
                oVar.f1632o = null;
                CheckableImageButton checkableImageButton = oVar.f1625g;
                checkableImageButton.setOnLongClickListener(null);
                f1.e.B0(checkableImageButton, null);
                break;
        }
    }
}
