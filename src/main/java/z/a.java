package z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2365e = new byte[1792];
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2366b;

    /* renamed from: c, reason: collision with root package name */
    public int f2367c;

    /* renamed from: d, reason: collision with root package name */
    public char f2368d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f2365e[i2] = Character.getDirectionality(i2);
        }
    }

    public a(CharSequence charSequence) {
        this.a = charSequence;
        this.f2366b = charSequence.length();
    }

    public final byte a() {
        int i2 = this.f2367c - 1;
        CharSequence charSequence = this.a;
        char cCharAt = charSequence.charAt(i2);
        this.f2368d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f2367c);
            this.f2367c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f2367c--;
        char c2 = this.f2368d;
        return c2 < 1792 ? f2365e[c2] : Character.getDirectionality(c2);
    }
}
