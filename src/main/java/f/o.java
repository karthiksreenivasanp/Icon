package f;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class o implements PopupWindow.OnDismissListener {
    public final /* synthetic */ q a;

    public o(q qVar) {
        this.a = qVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
