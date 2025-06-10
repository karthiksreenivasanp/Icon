package e1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {
    public CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f853b;

    /* renamed from: c, reason: collision with root package name */
    public final int f854c;

    /* renamed from: d, reason: collision with root package name */
    public int f855d;
    public boolean k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f856e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f857f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f858g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f859h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f860i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f861j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f862l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.a = charSequence;
        this.f853b = textPaint;
        this.f854c = i2;
        this.f855d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int iMax = Math.max(0, this.f854c);
        CharSequence charSequenceEllipsize = this.a;
        int i2 = this.f857f;
        TextPaint textPaint = this.f853b;
        if (i2 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f862l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f855d);
        this.f855d = iMin;
        if (this.k && this.f857f == 1) {
            this.f856e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f856e);
        builderObtain.setIncludePad(this.f861j);
        builderObtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f862l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f857f);
        float f2 = this.f858g;
        if (f2 != 0.0f || this.f859h != 1.0f) {
            builderObtain.setLineSpacing(f2, this.f859h);
        }
        if (this.f857f > 1) {
            builderObtain.setHyphenationFrequency(this.f860i);
        }
        return builderObtain.build();
    }
}
