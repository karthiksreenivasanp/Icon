package k0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.q;

/* loaded from: classes.dex */
public final class g implements KeyListener {
    public final KeyListener a;

    /* renamed from: b, reason: collision with root package name */
    public final i1.e f1481b;

    public g(KeyListener keyListener) {
        i1.e eVar = new i1.e(14, null);
        this.a = keyListener;
        this.f1481b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z2;
        this.f1481b.getClass();
        Object obj = androidx.emoji2.text.j.f250i;
        if (i2 != 67 ? i2 != 112 ? false : q.a(editable, keyEvent, true) : q.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.a.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i2, keyEvent);
    }
}
