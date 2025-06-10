package androidx.emoji2.text;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f244b = new ThreadLocal();
    public final TextPaint a;

    public c() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
