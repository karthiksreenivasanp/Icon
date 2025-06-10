package b0;

import android.view.View;

/* loaded from: classes.dex */
public abstract class d0 {
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    public static void b(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
