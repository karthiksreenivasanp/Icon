package i1;

/* loaded from: classes.dex */
public final class i extends f1.e {
    @Override // f1.e
    public final void L(float f2, float f3, u uVar) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(0.0f, 0.0f, f4, f4);
        qVar.f1416f = 180.0f;
        qVar.f1417g = 90.0f;
        uVar.f1426g.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f1427h.add(oVar);
        uVar.f1424e = 270.0f;
        float f5 = (f4 + 0.0f) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        uVar.f1422c = (((float) Math.cos(Math.toRadians(d2))) * f6) + f5;
        uVar.f1423d = (f6 * ((float) Math.sin(Math.toRadians(d2)))) + f5;
    }
}
