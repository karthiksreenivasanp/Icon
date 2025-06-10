package b0;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends WindowInsetsAnimation.Callback {
    public final z0.f a;

    /* renamed from: b, reason: collision with root package name */
    public List f485b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f486c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f487d;

    public j0(z0.f fVar) {
        super(0);
        this.f487d = new HashMap();
        this.a = fVar;
    }

    public final l0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f487d;
        l0 l0Var = (l0) map.get(windowInsetsAnimation);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(windowInsetsAnimation);
        map.put(windowInsetsAnimation, l0Var2);
        return l0Var2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.a.setTranslationY(0.0f);
        this.f487d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        z0.f fVar = this.a;
        View view = fVar.a;
        int[] iArr = fVar.f2396d;
        view.getLocationOnScreen(iArr);
        fVar.f2394b = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f486c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f486c = arrayList2;
            this.f485b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                x0 x0VarD = x0.d(null, windowInsets);
                this.a.a(x0VarD, this.f485b);
                return x0VarD.c();
            }
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            l0 l0VarA = a(windowInsetsAnimation);
            l0VarA.a.P0(windowInsetsAnimation.getFraction());
            this.f486c.add(l0VarA);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        u.c cVarC = u.c.c(bounds.getLowerBound());
        u.c cVarC2 = u.c.c(bounds.getUpperBound());
        z0.f fVar = this.a;
        View view = fVar.a;
        int[] iArr = fVar.f2396d;
        view.getLocationOnScreen(iArr);
        int i2 = fVar.f2394b - iArr[1];
        fVar.f2395c = i2;
        view.setTranslationY(i2);
        return new WindowInsetsAnimation.Bounds(cVarC.d(), cVarC2.d());
    }
}
