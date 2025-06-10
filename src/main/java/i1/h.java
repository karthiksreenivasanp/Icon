package i1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements c {
    public final float a;

    public h(float f2) {
        this.a = f2;
    }

    @Override // i1.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
