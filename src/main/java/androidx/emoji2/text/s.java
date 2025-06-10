package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0.j0;

/* loaded from: classes.dex */
public final class s implements i {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final g.p f275b;

    /* renamed from: c, reason: collision with root package name */
    public final i1.e f276c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f277d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f278e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f279f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f280g;

    /* renamed from: h, reason: collision with root package name */
    public f1.e f281h;

    /* renamed from: i, reason: collision with root package name */
    public g0.a f282i;

    public s(Context context, g.p pVar) {
        i1.e eVar = k.f259d;
        this.f277d = new Object();
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        this.a = context.getApplicationContext();
        this.f275b = pVar;
        this.f276c = eVar;
    }

    @Override // androidx.emoji2.text.i
    public final void a(f1.e eVar) {
        synchronized (this.f277d) {
            this.f281h = eVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f277d) {
            this.f281h = null;
            g0.a aVar = this.f282i;
            if (aVar != null) {
                i1.e eVar = this.f276c;
                Context context = this.a;
                eVar.getClass();
                context.getContentResolver().unregisterContentObserver(aVar);
                this.f282i = null;
            }
            Handler handler = this.f278e;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f278e = null;
            ThreadPoolExecutor threadPoolExecutor = this.f280g;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f279f = null;
            this.f280g = null;
        }
    }

    public final void c() {
        synchronized (this.f277d) {
            if (this.f281h == null) {
                return;
            }
            if (this.f279f == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.f280g = threadPoolExecutor;
                this.f279f = threadPoolExecutor;
            }
            final int i2 = 0;
            this.f279f.execute(new Runnable(this) { // from class: androidx.emoji2.text.r

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s f274b;

                {
                    this.f274b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            s sVar = this.f274b;
                            synchronized (sVar.f277d) {
                                if (sVar.f281h == null) {
                                    return;
                                }
                                try {
                                    y.i iVarD = sVar.d();
                                    int i3 = iVarD.f2359e;
                                    if (i3 == 2) {
                                        synchronized (sVar.f277d) {
                                        }
                                    }
                                    if (i3 != 0) {
                                        throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                                    }
                                    try {
                                        x.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                        i1.e eVar = sVar.f276c;
                                        Context context = sVar.a;
                                        eVar.getClass();
                                        Typeface typefaceR = u.g.a.r(context, new y.i[]{iVarD}, 0);
                                        MappedByteBuffer mappedByteBufferE0 = f1.e.e0(sVar.a, iVarD.a);
                                        if (mappedByteBufferE0 == null || typefaceR == null) {
                                            throw new RuntimeException("Unable to open file.");
                                        }
                                        try {
                                            x.a.a("EmojiCompat.MetadataRepo.create");
                                            l.d dVar = new l.d(typefaceR, f1.e.t0(mappedByteBufferE0));
                                            x.a.b();
                                            synchronized (sVar.f277d) {
                                                f1.e eVar2 = sVar.f281h;
                                                if (eVar2 != null) {
                                                    eVar2.l0(dVar);
                                                }
                                            }
                                            sVar.b();
                                            return;
                                        } finally {
                                            x.a.b();
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    synchronized (sVar.f277d) {
                                        f1.e eVar3 = sVar.f281h;
                                        if (eVar3 != null) {
                                            eVar3.h0(th2);
                                        }
                                        sVar.b();
                                        return;
                                    }
                                }
                            }
                        default:
                            this.f274b.c();
                            return;
                    }
                }
            });
        }
    }

    public final y.i d() throws Resources.NotFoundException {
        try {
            i1.e eVar = this.f276c;
            Context context = this.a;
            g.p pVar = this.f275b;
            eVar.getClass();
            j0 j0VarO = f1.e.O(context, pVar);
            int i2 = j0VarO.a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            y.i[] iVarArr = (y.i[]) j0VarO.f2028b;
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }
}
