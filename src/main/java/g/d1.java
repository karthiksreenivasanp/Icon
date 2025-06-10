package g;

/* loaded from: classes.dex */
public final class d1 implements Runnable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f1073b;

    public /* synthetic */ d1(k1 k1Var, int i2) {
        this.a = i2;
        this.f1073b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.a;
        k1 k1Var = this.f1073b;
        switch (i2) {
            case 1:
                p1 p1Var = k1Var.f1127c;
                if (p1Var != null) {
                    p1Var.setListSelectionHidden(true);
                    p1Var.requestLayout();
                    break;
                }
                break;
            default:
                p1 p1Var2 = k1Var.f1127c;
                if (p1Var2 != null) {
                    int[] iArr = b0.f0.a;
                    if (b0.u.b(p1Var2) && k1Var.f1127c.getCount() > k1Var.f1127c.getChildCount() && k1Var.f1127c.getChildCount() <= Integer.MAX_VALUE) {
                        k1Var.f1145v.setInputMethodMode(2);
                        k1Var.f();
                        break;
                    }
                }
                break;
        }
    }
}
