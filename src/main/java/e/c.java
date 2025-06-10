package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class c extends ContextWrapper {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f781b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f782c;

    /* renamed from: d, reason: collision with root package name */
    public Resources f783d;

    public c(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public final void a() {
        if (this.f781b == null) {
            this.f781b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f781b.setTo(theme);
            }
        }
        this.f781b.applyStyle(this.a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f783d == null) {
            this.f783d = super.getResources();
        }
        return this.f783d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f782c == null) {
            this.f782c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f782c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f781b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f781b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            a();
        }
    }
}
