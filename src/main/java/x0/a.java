package x0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.h;
import c0.g;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes.dex */
public final class a extends b0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2321e;

    public /* synthetic */ a(int i2, Object obj) {
        this.f2320d = i2;
        this.f2321e = obj;
    }

    @Override // b0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2320d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f2321e).isChecked());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // b0.c
    public final void d(View view, g gVar) {
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.a;
        int i3 = this.f2320d;
        Object obj = this.f2321e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i3) {
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i4 = MaterialButtonToggleGroup.k;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    i2 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) != view) {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.d(i5)) {
                                i2++;
                            }
                        }
                    }
                    i2 = -1;
                } else {
                    i2 = -1;
                }
                gVar.f(h.a(0, 1, i2, 1, ((MaterialButton) view).isChecked()));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f668e);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).f672x);
                break;
        }
    }
}
