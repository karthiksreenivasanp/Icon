package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class x implements Spannable {
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f288b;

    public x(Spannable spannable) {
        this.f288b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f288b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f288b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f288b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f288b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f288b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f288b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f288b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f288b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f288b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f288b;
        if (!this.a && (spannable instanceof PrecomputedText)) {
            this.f288b = new SpannableString(spannable);
        }
        this.a = true;
        this.f288b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        Spannable spannable = this.f288b;
        if (!this.a && (spannable instanceof PrecomputedText)) {
            this.f288b = new SpannableString(spannable);
        }
        this.a = true;
        this.f288b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f288b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f288b.toString();
    }

    public x(CharSequence charSequence) {
        this.f288b = new SpannableString(charSequence);
    }
}
