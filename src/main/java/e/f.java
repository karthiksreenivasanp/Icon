package e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f810e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f811f;
    public final Object[] a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f812b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f813c;

    /* renamed from: d, reason: collision with root package name */
    public Object f814d;

    static {
        Class[] clsArr = {Context.class};
        f810e = clsArr;
        f811f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f813c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.f812b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6 A[PHI: r9
  0x00d6: PHI (r9v2 boolean) = 
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v4 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
 binds: [B:35:0x0095, B:39:0x00a5, B:17:0x0047, B:33:0x0091, B:34:0x0093, B:30:0x0079, B:31:0x007b, B:26:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.res.XmlResourceParser r17, android.util.AttributeSet r18, android.view.Menu r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.b(android.content.res.XmlResourceParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof w.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f813c.getResources().getLayout(i2);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
