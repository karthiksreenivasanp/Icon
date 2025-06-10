package c0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final g f515b;

    /* renamed from: c, reason: collision with root package name */
    public final int f516c;

    public a(int i2, g gVar, int i3) {
        this.a = i2;
        this.f515b = gVar;
        this.f516c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.f515b.a.performAction(this.f516c, bundle);
    }
}
