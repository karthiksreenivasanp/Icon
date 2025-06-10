package t;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class j {
    public final ColorStateList a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f2259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2260c;

    public j(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.f2259b = configuration;
        this.f2260c = theme == null ? 0 : theme.hashCode();
    }
}
