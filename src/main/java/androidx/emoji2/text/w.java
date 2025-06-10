package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public final class w extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final o f286b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f287c = 1.0f;

    public w(o oVar) {
        if (oVar == null) {
            throw new NullPointerException("metadata cannot be null");
        }
        this.f286b = oVar;
    }

    @Override // android.text.style.ReplacementSpan
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        o oVar = this.f286b;
        this.f287c = fAbs / (oVar.c().a(14) != 0 ? r8.f1467b.getShort(r1 + r8.a) : (short) 0);
        j0.a aVarC = oVar.c();
        int iA = aVarC.a(14);
        if (iA != 0) {
            aVarC.f1467b.getShort(iA + aVarC.a);
        }
        short s2 = (short) ((oVar.c().a(12) != 0 ? r5.f1467b.getShort(r7 + r5.a) : (short) 0) * this.f287c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        j.a().getClass();
        o oVar = this.f286b;
        l.d dVar = oVar.f265b;
        Typeface typeface = (Typeface) dVar.f1548d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) dVar.f1546b, oVar.a * 2, 2, f2, i5, paint);
        paint.setTypeface(typeface2);
    }
}
