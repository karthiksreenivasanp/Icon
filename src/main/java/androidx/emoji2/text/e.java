package androidx.emoji2.text;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public final class e extends f.f {

    /* renamed from: c, reason: collision with root package name */
    public volatile q f246c;

    /* renamed from: d, reason: collision with root package name */
    public volatile l.d f247d;

    public e(j jVar) {
        super(17, jVar);
    }

    public final CharSequence r(CharSequence charSequence, int i2, int i3, boolean z2) {
        x xVar;
        int iCharCount;
        w[] wVarArr;
        q qVar = this.f246c;
        qVar.getClass();
        boolean z3 = charSequence instanceof v;
        if (z3) {
            ((v) charSequence).a();
        }
        if (!z3) {
            try {
                xVar = charSequence instanceof Spannable ? new x((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i2 + (-1), i3 + 1, w.class) > i3) ? null : new x(charSequence);
            } finally {
                if (z3) {
                    ((v) charSequence).b();
                }
            }
        }
        boolean z4 = false;
        if (xVar != null && (wVarArr = (w[]) xVar.getSpans(i2, i3, w.class)) != null && wVarArr.length > 0) {
            for (w wVar : wVarArr) {
                int spanStart = xVar.getSpanStart(wVar);
                int spanEnd = xVar.getSpanEnd(wVar);
                if (spanStart != i3) {
                    xVar.removeSpan(wVar);
                }
                i2 = Math.min(spanStart, i2);
                i3 = Math.max(spanEnd, i3);
            }
        }
        if (i2 != i3 && i2 < charSequence.length()) {
            p pVar = new p((t) qVar.f272b.f1547c);
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            int i4 = 0;
            loop1: while (true) {
                int iCodePointAt2 = iCodePointAt;
                iCharCount = i2;
                while (i2 < i3 && i4 < Integer.MAX_VALUE) {
                    int iA = pVar.a(iCodePointAt2);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i3) {
                            iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                        }
                        i2 = iCharCount;
                    } else if (iA == 2) {
                        i2 += Character.charCount(iCodePointAt2);
                        if (i2 < i3) {
                            iCodePointAt2 = Character.codePointAt(charSequence, i2);
                        }
                    } else if (iA == 3) {
                        if (z2 || !qVar.b(charSequence, iCharCount, i2, pVar.f269d.f283b)) {
                            if (xVar == null) {
                                xVar = new x((Spannable) new SpannableString(charSequence));
                            }
                            o oVar = pVar.f269d.f283b;
                            qVar.a.getClass();
                            xVar.setSpan(new w(oVar), iCharCount, i2, 33);
                            i4++;
                        }
                        iCodePointAt = iCodePointAt2;
                    }
                }
                break loop1;
            }
            if (pVar.a == 2 && pVar.f268c.f283b != null && (pVar.f271f > 1 || pVar.c())) {
                z4 = true;
            }
            if (z4 && i4 < Integer.MAX_VALUE && (z2 || !qVar.b(charSequence, iCharCount, i2, pVar.f268c.f283b))) {
                if (xVar == null) {
                    xVar = new x(charSequence);
                }
                o oVar2 = pVar.f268c.f283b;
                qVar.a.getClass();
                xVar.setSpan(new w(oVar2), iCharCount, i2, 33);
            }
            if (xVar != null) {
                Spannable spannable = xVar.f288b;
                if (z3) {
                    ((v) charSequence).b();
                }
                return spannable;
            }
            if (!z3) {
                return charSequence;
            }
        } else if (!z3) {
            return charSequence;
        }
        return charSequence;
    }

    public final void s(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        j0.b bVar = (j0.b) this.f247d.a;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f1467b.getInt(iA + bVar.a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((j) this.f875b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
