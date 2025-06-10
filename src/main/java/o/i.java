package o;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1905b = new l();

    /* renamed from: c, reason: collision with root package name */
    public final k f1906c = new k();

    /* renamed from: d, reason: collision with root package name */
    public final j f1907d = new j();

    /* renamed from: e, reason: collision with root package name */
    public final m f1908e = new m();

    /* renamed from: f, reason: collision with root package name */
    public HashMap f1909f = new HashMap();

    public final void a(d dVar) {
        j jVar = this.f1907d;
        dVar.f1861d = jVar.f1922g;
        dVar.f1863e = jVar.f1924h;
        dVar.f1865f = jVar.f1926i;
        dVar.f1867g = jVar.f1928j;
        dVar.f1869h = jVar.k;
        dVar.f1871i = jVar.f1929l;
        dVar.f1873j = jVar.f1930m;
        dVar.k = jVar.f1931n;
        dVar.f1876l = jVar.f1932o;
        dVar.f1880p = jVar.f1933p;
        dVar.f1881q = jVar.f1934q;
        dVar.f1882r = jVar.f1935r;
        dVar.f1883s = jVar.f1936s;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = jVar.C;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = jVar.D;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = jVar.E;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = jVar.F;
        dVar.f1888x = jVar.N;
        dVar.f1889y = jVar.M;
        dVar.f1885u = jVar.J;
        dVar.f1887w = jVar.L;
        dVar.f1890z = jVar.f1937t;
        dVar.A = jVar.f1938u;
        dVar.f1877m = jVar.f1940w;
        dVar.f1878n = jVar.f1941x;
        dVar.f1879o = jVar.f1942y;
        dVar.B = jVar.f1939v;
        dVar.P = jVar.f1943z;
        dVar.Q = jVar.A;
        dVar.E = jVar.O;
        dVar.D = jVar.P;
        dVar.G = jVar.R;
        dVar.F = jVar.Q;
        dVar.S = jVar.f1923g0;
        dVar.T = jVar.f1925h0;
        dVar.H = jVar.S;
        dVar.I = jVar.T;
        dVar.L = jVar.U;
        dVar.M = jVar.V;
        dVar.J = jVar.W;
        dVar.K = jVar.X;
        dVar.N = jVar.Y;
        dVar.O = jVar.Z;
        dVar.R = jVar.B;
        dVar.f1859c = jVar.f1920f;
        dVar.a = jVar.f1916d;
        dVar.f1857b = jVar.f1918e;
        ((ViewGroup.MarginLayoutParams) dVar).width = jVar.f1912b;
        ((ViewGroup.MarginLayoutParams) dVar).height = jVar.f1914c;
        String str = jVar.f1921f0;
        if (str != null) {
            dVar.U = str;
        }
        dVar.setMarginStart(jVar.H);
        dVar.setMarginEnd(jVar.G);
        dVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f1907d;
        jVar.getClass();
        j jVar2 = this.f1907d;
        jVar.a = jVar2.a;
        jVar.f1912b = jVar2.f1912b;
        jVar.f1914c = jVar2.f1914c;
        jVar.f1916d = jVar2.f1916d;
        jVar.f1918e = jVar2.f1918e;
        jVar.f1920f = jVar2.f1920f;
        jVar.f1922g = jVar2.f1922g;
        jVar.f1924h = jVar2.f1924h;
        jVar.f1926i = jVar2.f1926i;
        jVar.f1928j = jVar2.f1928j;
        jVar.k = jVar2.k;
        jVar.f1929l = jVar2.f1929l;
        jVar.f1930m = jVar2.f1930m;
        jVar.f1931n = jVar2.f1931n;
        jVar.f1932o = jVar2.f1932o;
        jVar.f1933p = jVar2.f1933p;
        jVar.f1934q = jVar2.f1934q;
        jVar.f1935r = jVar2.f1935r;
        jVar.f1936s = jVar2.f1936s;
        jVar.f1937t = jVar2.f1937t;
        jVar.f1938u = jVar2.f1938u;
        jVar.f1939v = jVar2.f1939v;
        jVar.f1940w = jVar2.f1940w;
        jVar.f1941x = jVar2.f1941x;
        jVar.f1942y = jVar2.f1942y;
        jVar.f1943z = jVar2.f1943z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.f1911a0 = jVar2.f1911a0;
        jVar.f1913b0 = jVar2.f1913b0;
        jVar.f1915c0 = jVar2.f1915c0;
        jVar.f1921f0 = jVar2.f1921f0;
        int[] iArr = jVar2.f1917d0;
        if (iArr != null) {
            jVar.f1917d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            jVar.f1917d0 = null;
        }
        jVar.f1919e0 = jVar2.f1919e0;
        jVar.f1923g0 = jVar2.f1923g0;
        jVar.f1925h0 = jVar2.f1925h0;
        jVar.f1927i0 = jVar2.f1927i0;
        k kVar = iVar.f1906c;
        kVar.getClass();
        k kVar2 = this.f1906c;
        kVar2.getClass();
        kVar.a = kVar2.a;
        kVar.f1945b = kVar2.f1945b;
        kVar.f1947d = kVar2.f1947d;
        kVar.f1946c = kVar2.f1946c;
        l lVar = iVar.f1905b;
        lVar.getClass();
        l lVar2 = this.f1905b;
        lVar2.getClass();
        lVar.a = lVar2.a;
        lVar.f1949c = lVar2.f1949c;
        lVar.f1950d = lVar2.f1950d;
        lVar.f1948b = lVar2.f1948b;
        m mVar = iVar.f1908e;
        mVar.getClass();
        m mVar2 = this.f1908e;
        mVar2.getClass();
        mVar.a = mVar2.a;
        mVar.f1952b = mVar2.f1952b;
        mVar.f1953c = mVar2.f1953c;
        mVar.f1954d = mVar2.f1954d;
        mVar.f1955e = mVar2.f1955e;
        mVar.f1956f = mVar2.f1956f;
        mVar.f1957g = mVar2.f1957g;
        mVar.f1958h = mVar2.f1958h;
        mVar.f1959i = mVar2.f1959i;
        mVar.f1960j = mVar2.f1960j;
        mVar.k = mVar2.k;
        mVar.f1961l = mVar2.f1961l;
        iVar.a = this.a;
        return iVar;
    }
}
