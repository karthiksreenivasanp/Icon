package l1;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class v implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1683b;

    public /* synthetic */ v(TextInputLayout textInputLayout, int i2) {
        this.a = i2;
        this.f1683b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        TextInputLayout textInputLayout = this.f1683b;
        switch (i2) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.f703c.f1625g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                textInputLayout.f705d.requestLayout();
                break;
        }
    }
}
