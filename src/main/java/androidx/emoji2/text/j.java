package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f250i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile j f251j;
    public final ReentrantReadWriteLock a;

    /* renamed from: b, reason: collision with root package name */
    public final j.c f252b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f253c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f254d;

    /* renamed from: e, reason: collision with root package name */
    public final e f255e;

    /* renamed from: f, reason: collision with root package name */
    public final i f256f;

    /* renamed from: g, reason: collision with root package name */
    public final int f257g;

    /* renamed from: h, reason: collision with root package name */
    public final c f258h;

    public j(k kVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.f253c = 3;
        this.f256f = kVar.a;
        int i2 = kVar.f248b;
        this.f257g = i2;
        this.f258h = kVar.f249c;
        this.f254d = new Handler(Looper.getMainLooper());
        this.f252b = new j.c();
        e eVar = new e(this);
        this.f255e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f253c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                this.f256f.a(new d(eVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f250i) {
            jVar = f251j;
            if (!(jVar != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return jVar;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.f253c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f257g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.f253c == 0) {
                return;
            }
            this.f253c = 0;
            this.a.writeLock().unlock();
            e eVar = this.f255e;
            Object obj = eVar.f875b;
            try {
                ((j) obj).f256f.a(new d(eVar));
            } catch (Throwable th) {
                ((j) obj).d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.f253c = 2;
            arrayList.addAll(this.f252b);
            this.f252b.clear();
            this.a.writeLock().unlock();
            this.f254d.post(new y.b(arrayList, this.f253c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.f253c = 1;
            arrayList.addAll(this.f252b);
            this.f252b.clear();
            this.a.writeLock().unlock();
            this.f254d.post(new y.b(this.f253c, arrayList));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(int i2, int i3, CharSequence charSequence) {
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        f1.e.m("start should be <= than end", i2 <= i3);
        if (charSequence == null) {
            return null;
        }
        f1.e.m("start should be < than charSequence length", i2 <= charSequence.length());
        f1.e.m("end should be < than charSequence length", i3 <= charSequence.length());
        return (charSequence.length() == 0 || i2 == i3) ? charSequence : this.f255e.r(charSequence, i2, i3, false);
    }

    public final void g(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.a.writeLock().lock();
        try {
            if (this.f253c == 1 || this.f253c == 2) {
                this.f254d.post(new y.b(hVar, this.f253c));
            } else {
                this.f252b.add(hVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
