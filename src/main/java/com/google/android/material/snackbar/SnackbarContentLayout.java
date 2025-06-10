package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.f0;
import b0.s;
import com.nothing.icon.R;
import f1.e;
import w0.a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView a;

    /* renamed from: b, reason: collision with root package name */
    public Button f695b;

    /* renamed from: c, reason: collision with root package name */
    public int f696c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e.y0(context, R.attr.motionEasingEmphasizedInterpolator, a.f2312b);
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.a.getPaddingTop() == i3 && this.a.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.a;
        int[] iArr = f0.a;
        if (s.g(textView)) {
            s.k(textView, s.f(textView), i3, s.e(textView), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f695b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.f695b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131099783(0x7f060087, float:1.7811929E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131099782(0x7f060086, float:1.7811927E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.f696c
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.f695b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f696c
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f696c = i2;
    }
}
