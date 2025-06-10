package androidx.activity.result;

import android.content.res.TypedArray;
import android.os.Handler;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.fragment.app.p;
import b0.l;
import f.f;
import java.util.concurrent.CopyOnWriteArrayList;
import y.g;

/* loaded from: classes.dex */
public final class d implements l {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30c;

    public /* synthetic */ d(int i2, Object obj, Object obj2) {
        this.a = i2;
        this.f29b = obj;
        this.f30c = obj2;
    }

    public final KeyListener a(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((k0.b) this.f30c).a.i(keyListener) : keyListener;
    }

    public final void b(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f29b).getContext().obtainStyledAttributes(attributeSet, b.a.f463g, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((k0.b) this.f30c).a.h(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(g gVar) {
        int i2 = gVar.f2352b;
        int i3 = 0;
        if (i2 == 0) {
            ((Handler) this.f30c).post(new y.a(this, (f) this.f29b, gVar.a, i3));
        } else {
            ((Handler) this.f30c).post(new y.b(this, (f) this.f29b, i2, i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    @Override // b0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b0.x0 g(android.view.View r14, b0.x0 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f29b
            z0.b r0 = (z0.b) r0
            java.lang.Object r13 = r13.f30c
            o0.q r13 = (o0.q) r13
            int r1 = r13.a
            int r2 = r13.f2082b
            int r13 = r13.f2083c
            r0.getClass()
            r3 = 7
            u.c r3 = r15.a(r3)
            r4 = 32
            u.c r4 = r15.a(r4)
            int r5 = r3.f2277b
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = r0.f2383b
            r6.f611w = r5
            boolean r5 = f1.e.X(r14)
            int r7 = r14.getPaddingBottom()
            int r8 = r14.getPaddingLeft()
            int r9 = r14.getPaddingRight()
            boolean r10 = r6.f603o
            if (r10 == 0) goto L41
            b0.v0 r7 = r15.a
            u.c r7 = r7.h()
            int r7 = r7.f2279d
            r6.f610v = r7
            int r7 = r7 + r13
        L41:
            boolean r13 = r6.f604p
            int r11 = r3.a
            if (r13 == 0) goto L4e
            if (r5 == 0) goto L4b
            r13 = r2
            goto L4c
        L4b:
            r13 = r1
        L4c:
            int r8 = r13 + r11
        L4e:
            boolean r13 = r6.f605q
            int r12 = r3.f2278c
            if (r13 == 0) goto L5a
            if (r5 == 0) goto L57
            goto L58
        L57:
            r1 = r2
        L58:
            int r9 = r1 + r12
        L5a:
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r1 = r6.f607s
            r2 = 1
            if (r1 == 0) goto L6d
            int r1 = r13.leftMargin
            if (r1 == r11) goto L6d
            r13.leftMargin = r11
            r1 = r2
            goto L6e
        L6d:
            r1 = 0
        L6e:
            boolean r5 = r6.f608t
            if (r5 == 0) goto L79
            int r5 = r13.rightMargin
            if (r5 == r12) goto L79
            r13.rightMargin = r12
            r1 = r2
        L79:
            boolean r5 = r6.f609u
            if (r5 == 0) goto L86
            int r5 = r13.topMargin
            int r3 = r3.f2277b
            if (r5 == r3) goto L86
            r13.topMargin = r3
            goto L87
        L86:
            r2 = r1
        L87:
            if (r2 == 0) goto L8c
            r14.setLayoutParams(r13)
        L8c:
            int r13 = r14.getPaddingTop()
            r14.setPadding(r8, r13, r9, r7)
            boolean r13 = r0.a
            if (r13 == 0) goto L9b
            int r14 = r4.f2279d
            r6.f601m = r14
        L9b:
            if (r10 != 0) goto L9f
            if (r13 == 0) goto La2
        L9f:
            r6.I()
        La2:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.d.g(android.view.View, b0.x0):b0.x0");
    }

    public final String toString() {
        switch (this.a) {
            case 5:
                return "Bounds{lower=" + ((u.c) this.f29b) + " upper=" + ((u.c) this.f30c) + "}";
            default:
                return super.toString();
        }
    }

    public d(EditText editText) {
        this.a = 1;
        this.f29b = editText;
        this.f30c = new k0.b(editText);
    }

    public d(p pVar) {
        this.a = 7;
        this.f29b = new CopyOnWriteArrayList();
        this.f30c = pVar;
    }

    public d(b1.b bVar, b1.b bVar2) {
        this.a = 8;
        bVar.getClass();
        bVar2.getClass();
        if (!(0.0f <= 0.0f)) {
            throw new IllegalArgumentException();
        }
        this.f29b = bVar;
        this.f30c = bVar2;
    }
}
