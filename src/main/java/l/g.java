package l;

/* loaded from: classes.dex */
public class g {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1563b;

    /* renamed from: c, reason: collision with root package name */
    public int f1564c;

    public g(int i2, int i3) {
        this.a = i3;
        if (i3 != 1) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f1563b = new Object[i2];
        } else {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f1563b = new Object[i2];
        }
    }

    public Object a() {
        int i2 = this.a;
        Object[] objArr = this.f1563b;
        switch (i2) {
            case 0:
                int i3 = this.f1564c;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object obj = objArr[i4];
                objArr[i4] = null;
                this.f1564c = i4;
                return obj;
            default:
                int i5 = this.f1564c;
                if (i5 <= 0) {
                    return null;
                }
                int i6 = i5 - 1;
                Object obj2 = objArr[i6];
                objArr[i6] = null;
                this.f1564c = i6;
                return obj2;
        }
    }

    public boolean b(Object obj) {
        int i2;
        boolean z2;
        int i3 = this.a;
        Object[] objArr = this.f1563b;
        switch (i3) {
            case 0:
                int i4 = this.f1564c;
                if (i4 >= objArr.length) {
                    return false;
                }
                objArr[i4] = obj;
                this.f1564c = i4 + 1;
                return true;
            default:
                int i5 = 0;
                while (true) {
                    i2 = this.f1564c;
                    if (i5 >= i2) {
                        z2 = false;
                    } else if (objArr[i5] == obj) {
                        z2 = true;
                    } else {
                        i5++;
                    }
                }
                if (z2) {
                    throw new IllegalStateException("Already in the pool!");
                }
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f1564c = i2 + 1;
                return true;
        }
    }
}
