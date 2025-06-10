package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import g.q0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f110b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f111c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f112d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f113e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f114f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f115g;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f115g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f113e == null) {
            this.f113e = new TypedValue();
        }
        return this.f113e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f114f == null) {
            this.f114f = new TypedValue();
        }
        return this.f114f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f111c == null) {
            this.f111c = new TypedValue();
        }
        return this.f111c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f112d == null) {
            this.f112d = new TypedValue();
        }
        return this.f112d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.a == null) {
            this.a = new TypedValue();
        }
        return this.a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f110b == null) {
            this.f110b = new TypedValue();
        }
        return this.f110b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(q0 q0Var) {
    }
}
