package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.nothing.icon.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: g, reason: collision with root package name */
    public static s1 f1216g;
    public WeakHashMap a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1218b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1219c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1220d;

    /* renamed from: e, reason: collision with root package name */
    public t f1221e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f1215f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final r1 f1217h = new r1();

    public static synchronized s1 c() {
        if (f1216g == null) {
            f1216g = new s1();
        }
        return f1216g;
    }

    public static synchronized PorterDuffColorFilter g(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        r1 r1Var = f1217h;
        r1Var.getClass();
        int i3 = (i2 + 31) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) r1Var.a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            r1Var.getClass();
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            j.d dVar = (j.d) this.f1218b.get(context);
            if (dVar == null) {
                dVar = new j.d();
                this.f1218b.put(context, dVar);
            }
            dVar.e(j2, new WeakReference(constantState));
        }
    }

    public final Drawable b(Context context, int i2) throws Resources.NotFoundException {
        LayerDrawable layerDrawableC;
        int i3;
        if (this.f1219c == null) {
            this.f1219c = new TypedValue();
        }
        TypedValue typedValue = this.f1219c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableD = d(context, j2);
        if (drawableD != null) {
            return drawableD;
        }
        if (this.f1221e == null) {
            layerDrawableC = null;
        } else if (i2 == R.drawable.abc_cab_background_top_material) {
            layerDrawableC = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        } else {
            if (i2 == R.drawable.abc_ratingbar_material) {
                i3 = R.dimen.abc_star_big;
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                i3 = R.dimen.abc_star_medium;
            } else {
                if (i2 == R.drawable.abc_ratingbar_small_material) {
                    i3 = R.dimen.abc_star_small;
                }
                layerDrawableC = null;
            }
            layerDrawableC = t.c(this, context, i3);
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, layerDrawableC);
        }
        return layerDrawableC;
    }

    public final synchronized Drawable d(Context context, long j2) {
        j.d dVar = (j.d) this.f1218b.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) dVar.d(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iJ = f1.e.j(dVar.f1441b, dVar.f1443d, j2);
            if (iJ >= 0) {
                Object[] objArr = dVar.f1442c;
                Object obj = objArr[iJ];
                Object obj2 = j.d.f1440e;
                if (obj != obj2) {
                    objArr[iJ] = obj2;
                    dVar.a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i2) {
        return f(context, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (((r0 instanceof t0.b) || "android.graphics.drawable.VectorDrawable".equals(r0.getClass().getName())) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0033, B:20:0x003b, B:22:0x0041, B:30:0x005a, B:27:0x0054, B:34:0x0064, B:38:0x007b, B:45:0x00b1, B:49:0x00db, B:51:0x00e0, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:54:0x00e4, B:55:0x00ed), top: B:58:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r11, int r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.s1.f(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList h(Context context, int i2) {
        ColorStateList colorStateList;
        j.l lVar;
        try {
            WeakHashMap weakHashMap = this.a;
            ColorStateList colorStateListD = null;
            colorStateList = (weakHashMap == null || (lVar = (j.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.c(i2, null);
            if (colorStateList == null) {
                t tVar = this.f1221e;
                if (tVar != null) {
                    colorStateListD = tVar.d(context, i2);
                }
                if (colorStateListD != null) {
                    if (this.a == null) {
                        this.a = new WeakHashMap();
                    }
                    j.l lVar2 = (j.l) this.a.get(context);
                    if (lVar2 == null) {
                        lVar2 = new j.l();
                        this.a.put(context, lVar2);
                    }
                    lVar2.a(i2, colorStateListD);
                }
                colorStateList = colorStateListD;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            r5 = this;
            g.t r5 = r5.f1221e
            r0 = 0
            if (r5 == 0) goto L6e
            android.graphics.PorterDuff$Mode r1 = g.u.f1227b
            int[] r2 = r5.a
            boolean r2 = g.t.a(r2, r7)
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L15
            r5 = 2130903260(0x7f0300dc, float:1.7413333E38)
            goto L48
        L15:
            int[] r2 = r5.f1223c
            boolean r2 = g.t.a(r2, r7)
            if (r2 == 0) goto L21
            r5 = 2130903258(0x7f0300da, float:1.7413329E38)
            goto L48
        L21:
            int[] r5 = r5.f1224d
            boolean r5 = g.t.a(r5, r7)
            if (r5 == 0) goto L2c
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L45
        L2c:
            r5 = 2131165261(0x7f07004d, float:1.7944734E38)
            if (r7 != r5) goto L40
            r5 = 1109603123(0x42233333, float:40.8)
            int r5 = java.lang.Math.round(r5)
            r7 = 16842800(0x1010030, float:2.3693693E-38)
            r2 = r1
            r1 = r7
            r7 = r5
            r5 = r3
            goto L50
        L40:
            r5 = 2131165243(0x7f07003b, float:1.7944698E38)
            if (r7 != r5) goto L4b
        L45:
            r5 = 16842801(0x1010031, float:2.3693695E-38)
        L48:
            r7 = r5
            r5 = r3
            goto L4d
        L4b:
            r5 = r0
            r7 = r5
        L4d:
            r2 = r1
            r1 = r7
            r7 = r4
        L50:
            if (r5 == 0) goto L6a
            int r5 = g.s0.a
            android.graphics.drawable.Drawable r5 = r8.mutate()
            int r6 = g.l2.c(r6, r1)
            android.graphics.PorterDuffColorFilter r6 = g.u.c(r6, r2)
            r5.setColorFilter(r6)
            if (r7 == r4) goto L68
            r5.setAlpha(r7)
        L68:
            r5 = r3
            goto L6b
        L6a:
            r5 = r0
        L6b:
            if (r5 == 0) goto L6e
            r0 = r3
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.s1.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
