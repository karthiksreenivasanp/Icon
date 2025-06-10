package g;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class z1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1266b;

    public /* synthetic */ z1(int i2, Object obj) {
        this.a = i2;
        this.f1266b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = this.a;
        Object obj = this.f1266b;
        switch (i10) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.f131x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f125r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean zA = d3.a(searchView);
                    int dimensionPixelSize = searchView.M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f123p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
        }
    }
}
