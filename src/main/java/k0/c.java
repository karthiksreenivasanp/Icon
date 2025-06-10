package k0;

import android.text.Editable;
import androidx.emoji2.text.v;

/* loaded from: classes.dex */
public final class c extends Editable.Factory {
    public static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f1476b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f1477c;

    public c() {
        try {
            f1477c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1477c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
