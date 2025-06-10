package o0;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j1 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2029b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2030c;

    public j1(int i2) {
        this.a = i2;
        if (i2 != 1) {
            this.f2029b = new j.k();
            this.f2030c = new j.d();
        }
    }

    public final void a(z0 z0Var) {
        i1 i1VarA = (i1) ((j.k) this.f2029b).getOrDefault(z0Var, null);
        if (i1VarA == null) {
            i1VarA = i1.a();
            ((j.k) this.f2029b).put(z0Var, i1VarA);
        }
        i1VarA.a |= 1;
    }

    public final void b(z0 z0Var, q qVar) {
        i1 i1VarA = (i1) ((j.k) this.f2029b).getOrDefault(z0Var, null);
        if (i1VarA == null) {
            i1VarA = i1.a();
            ((j.k) this.f2029b).put(z0Var, i1VarA);
        }
        i1VarA.getClass();
        i1VarA.a |= 4;
    }

    public final void c() {
        switch (this.a) {
            case 0:
                ((j.k) this.f2029b).clear();
                ((j.d) this.f2030c).a();
                break;
            default:
                int[] iArr = (int[]) this.f2029b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f2030c = null;
                break;
        }
    }

    public final void d(int i2) {
        Object obj = this.f2029b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i2, 10) + 1];
            this.f2029b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i2 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f2029b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f2029b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public final View e(int i2, int i3, int i4, int i5) {
        int iX;
        View viewP;
        j0 j0Var = (j0) ((h1) this.f2029b);
        int i6 = j0Var.a;
        Object obj = j0Var.f2028b;
        switch (i6) {
            case 0:
                iX = ((l0) obj).v();
                break;
            default:
                iX = ((l0) obj).x();
                break;
        }
        int iD = ((j0) ((h1) this.f2029b)).d();
        int i7 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            j0 j0Var2 = (j0) ((h1) this.f2029b);
            int i8 = j0Var2.a;
            Object obj2 = j0Var2.f2028b;
            switch (i8) {
                case 0:
                    viewP = ((l0) obj2).p(i2);
                    break;
                default:
                    viewP = ((l0) obj2).p(i2);
                    break;
            }
            int iB = ((j0) ((h1) this.f2029b)).b(viewP);
            int iA = ((j0) ((h1) this.f2029b)).a(viewP);
            Object obj3 = this.f2030c;
            g1 g1Var = (g1) obj3;
            g1Var.f2015b = iX;
            g1Var.f2016c = iD;
            g1Var.f2017d = iB;
            g1Var.f2018e = iA;
            if (i4 != 0) {
                ((g1) obj3).a = i4 | 0;
                if (((g1) obj3).a()) {
                    return viewP;
                }
            }
            if (i5 != 0) {
                Object obj4 = this.f2030c;
                ((g1) obj4).a = i5 | 0;
                if (((g1) obj4).a()) {
                    view = viewP;
                }
            }
            i2 += i7;
        }
        return view;
    }

    public final void f(z0 z0Var) {
        i1 i1Var = (i1) ((j.k) this.f2029b).getOrDefault(z0Var, null);
        if (i1Var == null) {
            return;
        }
        i1Var.a &= -2;
    }

    public final void g(z0 z0Var) {
        j.d dVar = (j.d) this.f2030c;
        if (dVar.a) {
            dVar.c();
        }
        int i2 = dVar.f1443d - 1;
        while (true) {
            if (i2 < 0) {
                break;
            }
            if (z0Var == ((j.d) this.f2030c).f(i2)) {
                j.d dVar2 = (j.d) this.f2030c;
                Object[] objArr = dVar2.f1442c;
                Object obj = objArr[i2];
                Object obj2 = j.d.f1440e;
                if (obj != obj2) {
                    objArr[i2] = obj2;
                    dVar2.a = true;
                }
            } else {
                i2--;
            }
        }
        i1 i1Var = (i1) ((j.k) this.f2029b).remove(z0Var);
        if (i1Var != null) {
            i1Var.a = 0;
            i1Var.getClass();
            i1Var.getClass();
            i1.f2027b.b(i1Var);
        }
    }

    public j1(j0 j0Var) {
        this.a = 2;
        this.f2029b = j0Var;
        this.f2030c = new g1();
    }
}
