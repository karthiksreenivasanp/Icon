package c1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class c extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public c(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        f fVar = this.a.f642e;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
