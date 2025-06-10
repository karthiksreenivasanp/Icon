package k0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class a extends i1.e {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f1474b;

    /* renamed from: c, reason: collision with root package name */
    public final k f1475c;

    public a(EditText editText) {
        super(12, null);
        this.f1474b = editText;
        k kVar = new k(editText);
        this.f1475c = kVar;
        editText.addTextChangedListener(kVar);
        if (c.f1476b == null) {
            synchronized (c.a) {
                if (c.f1476b == null) {
                    c.f1476b = new c();
                }
            }
        }
        editText.setEditableFactory(c.f1476b);
    }

    @Override // i1.e
    public final void h(boolean z2) {
        k kVar = this.f1475c;
        if (kVar.f1488d != z2) {
            if (kVar.f1487c != null) {
                androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
                j jVar = kVar.f1487c;
                jVarA.getClass();
                f1.e.p(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f252b.remove(jVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kVar.f1488d = z2;
            if (z2) {
                k.a(kVar.a, androidx.emoji2.text.j.a().b());
            }
        }
    }

    public final KeyListener i(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new g(keyListener);
    }

    public final InputConnection j(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f1474b, inputConnection, editorInfo);
    }
}
