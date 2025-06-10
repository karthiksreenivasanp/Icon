package i1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1334b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).a;
            f2 += ((b) cVar).f1334b;
        }
        this.a = cVar;
        this.f1334b = f2;
    }

    @Override // i1.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.f1334b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.f1334b == bVar.f1334b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.f1334b)});
    }
}
