package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v extends SpannableStringBuilder {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f285b;

    public v(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f285b = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.a = cls;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f285b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i2)).f284b.incrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    public final void b() {
        e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f285b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    public final u c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f285b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            u uVar = (u) arrayList.get(i2);
            if (uVar.a == obj) {
                return uVar;
            }
            i2++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f285b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i2)).f284b.decrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (!(this.a == cls)) {
            return super.getSpans(i2, i3, cls);
        }
        u[] uVarArr = (u[]) super.getSpans(i2, i3, u.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, uVarArr.length);
        for (int i4 = 0; i4 < uVarArr.length; i4++) {
            objArr[i4] = uVarArr[i4].a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000b  */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class r0 = r1.a
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<androidx.emoji2.text.u> r4 = androidx.emoji2.text.u.class
        Ld:
            int r1 = super.nextSpanTransition(r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.v.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        u uVarC;
        if (d(obj)) {
            uVarC = c(obj);
            if (uVarC != null) {
                obj = uVarC;
            }
        } else {
            uVarC = null;
        }
        super.removeSpan(obj);
        if (uVarC != null) {
            this.f285b.remove(uVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence) {
        replace(i2, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (d(obj)) {
            u uVar = new u(obj);
            this.f285b.add(uVar);
            obj = uVar;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new v(this.a, this, i2, i3);
    }

    public v(Class cls, CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        this.f285b = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        replace(i2, i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        a();
        super.replace(i2, i3, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        a();
        super.replace(i2, i3, charSequence, i4, i5);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }
}
