package g;

import android.transition.Transition;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class m1 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
