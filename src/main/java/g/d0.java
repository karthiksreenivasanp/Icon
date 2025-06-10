package g;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ TextView a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f1071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1072c;

    public d0(TextView textView, Typeface typeface, int i2) {
        this.a = textView;
        this.f1071b = typeface;
        this.f1072c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setTypeface(this.f1071b, this.f1072c);
    }
}
