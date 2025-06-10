package f;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.x;

/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f874e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.a = i2;
        this.f874e = obj;
        this.f871b = obj2;
        this.f872c = obj3;
        this.f873d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        Object obj = this.f873d;
        Object obj2 = this.f872c;
        Object obj3 = this.f871b;
        switch (i2) {
            case 0:
                g gVar = (g) obj3;
                if (gVar != null) {
                    f fVar = (f) this.f874e;
                    ((h) fVar.f875b).A = true;
                    gVar.f876b.c(false);
                    ((h) fVar.f875b).A = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((l) obj).p(menuItem, null, 4);
                    break;
                }
                break;
            default:
                ((x) obj3).getClass();
                x.a((View) obj2, (Rect) obj);
                break;
        }
    }
}
