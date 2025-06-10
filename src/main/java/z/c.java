package z;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c {
    public final TextPaint a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f2375b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2376c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2377d;

    public c(PrecomputedText.Params params) {
        this.a = params.getTextPaint();
        this.f2375b = params.getTextDirection();
        this.f2376c = params.getBreakStrategy();
        this.f2377d = params.getHyphenationFrequency();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof z.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z.c r7 = (z.c) r7
            int r1 = r7.f2376c
            int r3 = r6.f2376c
            if (r3 == r1) goto L15
        L12:
            r1 = r2
            goto L9b
        L15:
            int r1 = r6.f2377d
            int r3 = r7.f2377d
            if (r1 == r3) goto L1c
            goto L12
        L1c:
            android.text.TextPaint r1 = r6.a
            float r3 = r1.getTextSize()
            android.text.TextPaint r4 = r7.a
            float r5 = r4.getTextSize()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L2d
            goto L12
        L2d:
            float r3 = r1.getTextScaleX()
            float r5 = r4.getTextScaleX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L3a
            goto L12
        L3a:
            float r3 = r1.getTextSkewX()
            float r5 = r4.getTextSkewX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L47
            goto L12
        L47:
            float r3 = r1.getLetterSpacing()
            float r5 = r4.getLetterSpacing()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L54
            goto L12
        L54:
            java.lang.String r3 = r1.getFontFeatureSettings()
            java.lang.String r5 = r4.getFontFeatureSettings()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 != 0) goto L63
            goto L12
        L63:
            int r3 = r1.getFlags()
            int r5 = r4.getFlags()
            if (r3 == r5) goto L6e
            goto L12
        L6e:
            android.os.LocaleList r3 = r1.getTextLocales()
            android.os.LocaleList r5 = r4.getTextLocales()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L7d
            goto L12
        L7d:
            android.graphics.Typeface r3 = r1.getTypeface()
            if (r3 != 0) goto L8a
            android.graphics.Typeface r1 = r4.getTypeface()
            if (r1 == 0) goto L9a
            goto L12
        L8a:
            android.graphics.Typeface r1 = r1.getTypeface()
            android.graphics.Typeface r3 = r4.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L9a
            goto L12
        L9a:
            r1 = r0
        L9b:
            if (r1 != 0) goto L9e
            return r2
        L9e:
            android.text.TextDirectionHeuristic r6 = r6.f2375b
            android.text.TextDirectionHeuristic r7 = r7.f2375b
            if (r6 == r7) goto La5
            return r2
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextPaint textPaint = this.a;
        return a0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f2375b, Integer.valueOf(this.f2376c), Integer.valueOf(this.f2377d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f2375b);
        sb.append(", breakStrategy=" + this.f2376c);
        sb.append(", hyphenationFrequency=" + this.f2377d);
        sb.append("}");
        return sb.toString();
    }
}
