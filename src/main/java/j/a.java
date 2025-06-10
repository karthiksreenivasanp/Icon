package j;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1429e;

    public /* synthetic */ a(int i2, Object obj) {
        this.f1428d = i2;
        this.f1429e = obj;
    }

    @Override // j.j
    public final void a() {
        int i2 = this.f1428d;
        Object obj = this.f1429e;
        switch (i2) {
            case 0:
                ((b) obj).clear();
                break;
            default:
                ((c) obj).clear();
                break;
        }
    }

    @Override // j.j
    public final Object b(int i2, int i3) {
        int i4 = this.f1428d;
        Object obj = this.f1429e;
        switch (i4) {
            case 0:
                return ((b) obj).f1462b[(i2 << 1) + i3];
            default:
                return ((c) obj).f1437b[i2];
        }
    }

    @Override // j.j
    public final b c() {
        switch (this.f1428d) {
            case 0:
                return (b) this.f1429e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // j.j
    public final int d() {
        int i2 = this.f1428d;
        Object obj = this.f1429e;
        switch (i2) {
            case 0:
                return ((b) obj).f1463c;
            default:
                return ((c) obj).f1438c;
        }
    }

    @Override // j.j
    public final int e(Object obj) {
        int i2 = this.f1428d;
        Object obj2 = this.f1429e;
        switch (i2) {
            case 0:
                return ((b) obj2).e(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // j.j
    public final void f(int i2) {
        int i3 = this.f1428d;
        Object obj = this.f1429e;
        switch (i3) {
            case 0:
                ((b) obj).i(i2);
                break;
            default:
                ((c) obj).e(i2);
                break;
        }
    }
}
