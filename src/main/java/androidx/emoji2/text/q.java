package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class q {
    public final i1.e a;

    /* renamed from: b, reason: collision with root package name */
    public final l.d f272b;

    /* renamed from: c, reason: collision with root package name */
    public final g f273c;

    public q(l.d dVar, i1.e eVar, c cVar) {
        this.a = eVar;
        this.f272b = dVar;
        this.f273c = cVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        w[] wVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
            for (w wVar : wVarArr) {
                int spanStart = editable.getSpanStart(wVar);
                int spanEnd = editable.getSpanEnd(wVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i2, int i3, o oVar) {
        if (oVar.f266c == 0) {
            g gVar = this.f273c;
            j0.a aVarC = oVar.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                aVarC.f1467b.getShort(iA + aVarC.a);
            }
            c cVar = (c) gVar;
            cVar.getClass();
            ThreadLocal threadLocal = c.f244b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = cVar.a;
            String string = sb.toString();
            int i4 = u.e.a;
            oVar.f266c = u.d.a(textPaint, string) ? 2 : 1;
        }
        return oVar.f266c == 2;
    }
}
