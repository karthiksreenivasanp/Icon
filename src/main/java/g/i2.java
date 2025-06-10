package g;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class i2 extends TouchDelegate {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1095b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1096c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1097d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1098e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1099f;

    public i2(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f1098e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f1095b = rect3;
        Rect rect4 = new Rect();
        this.f1097d = rect4;
        Rect rect5 = new Rect();
        this.f1096c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        float width;
        int height;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f1099f;
                if (z3 && !this.f1097d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f1099f;
                    this.f1099f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else if (this.f1095b.contains(x2, y2)) {
            this.f1099f = true;
            z2 = true;
        } else {
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        Rect rect = this.f1096c;
        View view = this.a;
        if (!z2 || rect.contains(x2, y2)) {
            width = x2 - rect.left;
            height = y2 - rect.top;
        } else {
            width = view.getWidth() / 2;
            height = view.getHeight() / 2;
        }
        motionEvent.setLocation(width, height);
        return view.dispatchTouchEvent(motionEvent);
    }
}
