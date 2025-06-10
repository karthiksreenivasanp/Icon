package g;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f1053b;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.a = i2;
        this.f1053b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1053b;
        switch (i2) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f92t = actionBarOverlayLayout.f76c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f93u);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f92t = actionBarOverlayLayout.f76c.animate().translationY(-actionBarOverlayLayout.f76c.getHeight()).setListener(actionBarOverlayLayout.f93u);
                break;
        }
    }
}
