package f1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b0.f0;
import b0.q;
import b0.r;
import b0.s;
import b0.x;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nothing.icon.R;
import g.f2;
import g.p;
import g.s1;
import i1.f;
import i1.i;
import i1.u;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o0.b0;
import o0.l0;
import o0.w0;
import org.xmlpull.v1.XmlPullParserException;
import q.g;
import t.m;

/* loaded from: classes.dex */
public abstract class e {
    public static long a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1026b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1027c = {R.attr.colorPrimary};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1028d = {R.attr.colorPrimaryVariant};

    /* renamed from: e, reason: collision with root package name */
    public static final g f1029e = new g(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1030f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f1031g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f1032h = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: i, reason: collision with root package name */
    public static final boolean[] f1033i = new boolean[3];

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f1034j = {android.R.attr.theme, R.attr.theme};
    public static final int[] k = {R.attr.materialThemeOverlay};

    /* renamed from: l, reason: collision with root package name */
    public static final float[][] f1035l = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: m, reason: collision with root package name */
    public static final float[][] f1036m = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: n, reason: collision with root package name */
    public static final float[] f1037n = {95.047f, 100.0f, 108.883f};

    /* renamed from: o, reason: collision with root package name */
    public static final float[][] f1038o = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: p, reason: collision with root package name */
    public static final Object[] f1039p = new Object[0];

    /* renamed from: q, reason: collision with root package name */
    public static final y.c f1040q = new Comparator() { // from class: y.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b3 = bArr[i2];
                byte b4 = bArr2[i2];
                if (b3 != b4) {
                    return b3 - b4;
                }
            }
            return 0;
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public static final k1.b f1041r = new k1.b("CLOSED_EMPTY");

    public static int A(w0 w0Var, b0 b0Var, View view, View view2, l0 l0Var, boolean z2) {
        if (l0Var.q() == 0 || w0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return w0Var.a();
        }
        return (int) (((b0Var.b(view2) - b0Var.d(view)) / (Math.abs(l0.y(view) - l0.y(view2)) + 1)) * w0Var.a());
    }

    public static void A0(NullPointerException nullPointerException) {
        String name = e.class.getName();
        StackTraceElement[] stackTrace = nullPointerException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (name.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        nullPointerException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static ImageView.ScaleType B(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void B0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        int[] iArr = f0.a;
        boolean zA = q.a(checkableImageButton);
        boolean z2 = onLongClickListener != null;
        boolean z3 = zA || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zA);
        checkableImageButton.setPressable(zA);
        checkableImageButton.setLongClickable(z2);
        r.s(checkableImageButton, z3 ? 1 : 2);
    }

    public static float[] C(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - 0;
        int iMin = Math.min(i3, length - 0);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static void C0(View view, i1.g gVar) {
        d1.a aVar = gVar.a.f1335b;
        if (aVar != null && aVar.a) {
            float fI = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                int[] iArr = f0.a;
                fI += x.i((View) parent);
            }
            f fVar = gVar.a;
            if (fVar.f1345m != fI) {
                fVar.f1345m = fI;
                gVar.m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a A[EDGE_INSN: B:33:0x003a->B:16:0x003a BREAK  A[LOOP:0: B:3:0x0019->B:36:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:0: B:3:0x0019->B:36:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.emoji2.text.k D(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            p(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L35
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L35
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L35
            goto L36
        L35:
            r6 = r2
        L36:
            if (r6 == 0) goto L19
            goto L3a
        L39:
            r3 = r4
        L3a:
            if (r3 != 0) goto L3d
            goto L6f
        L3d:
            java.lang.String r1 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
        L4f:
            if (r2 >= r6) goto L5d
            r7 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r5.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            int r2 = r2 + 1
            goto L4f
        L5d:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            g.p r2 = new g.p     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>(r1, r3, r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L70
        L69:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L6f:
            r2 = r4
        L70:
            if (r2 != 0) goto L73
            goto L78
        L73:
            androidx.emoji2.text.k r4 = new androidx.emoji2.text.k
            r4.<init>(r8, r2)
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.D(android.content.Context):androidx.emoji2.text.k");
    }

    public static boolean D0(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z2 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }

    public static e E(int i2) {
        if (i2 != 0 && i2 == 1) {
            return new i1.d();
        }
        return new i();
    }

    public static void E0(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static i1.e F() {
        return new i1.e(0, null);
    }

    public static String F0(Serializable serializable, String str) {
        return str + serializable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (r16 == 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[PHI: r13
  0x008f: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v6 int) binds: [B:32:0x0078, B:35:0x007e, B:41:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095 A[Catch: NumberFormatException -> 0x00b7, LOOP:3: B:29:0x006c->B:47:0x0095, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b7, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:47:0x0095, B:49:0x009b, B:52:0x00ab, B:54:0x00b0), top: B:69:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b A[Catch: NumberFormatException -> 0x00b7, TryCatch #0 {NumberFormatException -> 0x00b7, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:47:0x0095, B:49:0x009b, B:52:0x00ab, B:54:0x00b0), top: B:69:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab A[Catch: NumberFormatException -> 0x00b7, TryCatch #0 {NumberFormatException -> 0x00b7, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:47:0x0095, B:49:0x009b, B:52:0x00ab, B:54:0x00b0), top: B:69:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u.f[] G(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.G(java.lang.String):u.f[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long G0(java.lang.String r23, long r24, long r26, long r28) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.G0(java.lang.String, long, long, long):long");
    }

    public static Path H(String str) {
        Path path = new Path();
        u.f[] fVarArrG = G(str);
        if (fVarArrG == null) {
            return null;
        }
        try {
            u.f.b(fVarArrG, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + str, e2);
        }
    }

    public static int H0(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) G0(str, i2, i3, i4);
    }

    public static int I(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueZ0 = z0(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = typedValueZ0.resourceId;
        if (i3 == 0) {
            return typedValueZ0.data;
        }
        Object obj = s.c.a;
        return s.b.a(context, i3);
    }

    public static final Object[] I0(Collection collection) {
        r(collection, "collection");
        int size = collection.size();
        Object[] objArr = f1039p;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                q(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                q(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static ColorStateList J(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListA = s.c.a(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListA;
    }

    public static final Object[] J0(Collection collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        r(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            if (objNewInstance == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                A0(nullPointerException);
                throw nullPointerException;
            }
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                q(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                q(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static ColorStateList K(Context context, f2 f2Var, int i2) {
        int iH;
        ColorStateList colorStateListA;
        return (!f2Var.k(i2) || (iH = f2Var.h(i2, 0)) == 0 || (colorStateListA = s.c.a(context, iH)) == null) ? f2Var.b(i2) : colorStateListA;
    }

    public static Context L0(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z2 = (context instanceof e.c) && ((e.c) context).a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        e.c cVar = new e.c(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1034j);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }

    public static Drawable M(Context context, int i2) {
        return s1.c().e(context, i2);
    }

    public static float M0() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static Drawable N(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableM;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableM = M(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableM;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[LOOP:1: B:14:0x0054->B:29:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009b A[EDGE_INSN: B:80:0x009b->B:31:0x009b BREAK  A[LOOP:1: B:14:0x0054->B:29:0x0097], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o0.j0 O(android.content.Context r20, g.p r21) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.O(android.content.Context, g.p):o0.j0");
    }

    public static float P(String[] strArr, int i2) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static ArrayList Q(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static int T(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
    }

    public static boolean U(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static boolean V(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean W(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }

    public static boolean X(View view) {
        int[] iArr = f0.a;
        return s.d(view) == 1;
    }

    public static boolean Y(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int Z(int i2, int i3, float f2) {
        return u.a.b(u.a.c(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static float a0(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static int b0(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static final void c(Throwable th, Throwable th2) {
        r(th, "<this>");
        r(th2, "exception");
        if (th != th2) {
            q1.c.a.a(th, th2);
        }
    }

    public static Typeface c0(Configuration configuration, Typeface typeface) {
        int i2 = configuration.fontWeightAdjustment;
        if (i2 == Integer.MAX_VALUE || i2 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, u(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0702 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(m.f r37, l.f r38, int r39) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.d(m.f, l.f, int):void");
    }

    public static int d0(int i2, Rect rect, Rect rect2) {
        int iHeight;
        int i3;
        int iHeight2;
        if (i2 == 17) {
            iHeight = (rect.height() / 2) + rect.top;
            i3 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = (rect.height() / 2) + rect.top;
                i3 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = (rect.width() / 2) + rect.left;
            i3 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - ((iHeight2 / 2) + i3));
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                v.b.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                v.b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                v.b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static MappedByteBuffer e0(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorA = u.i.a(context.getContentResolver(), uri, "r", null);
            if (parcelFileDescriptorA == null) {
                if (parcelFileDescriptorA != null) {
                    parcelFileDescriptorA.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorA.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorA.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static TypedArray f0(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        o(context, attributeSet, i2, i3);
        s(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = h(r9, r10, r11)
            boolean r1 = h(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = r6
            goto L46
        L45:
            r7 = r2
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = b0(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = r6
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.g(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static void g0(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static boolean h(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static int i(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static int j(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void m(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void n(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void o(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2309u, i2, i3);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                t(context, f1028d, "Theme.MaterialComponents");
            }
        }
        t(context, f1027c, "Theme.AppCompat");
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        A0(nullPointerException);
        throw nullPointerException;
    }

    public static t.d q0(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), r.a.f2184b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    E0(xmlResourceParser);
                }
                return new t.g(new p(string, string2, string3, u0(resourceId, resources)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), r.a.f2185c);
                        int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i5);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            E0(xmlResourceParser);
                        }
                        arrayList.add(new t.f(i2, i4, resourceId2, string6, string5, z2));
                    } else {
                        E0(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new t.e((t.f[]) arrayList.toArray(new t.f[0]));
            }
        } else {
            E0(xmlResourceParser);
        }
        return null;
    }

    public static void r(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = e.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            A0(nullPointerException);
            throw nullPointerException;
        }
    }

    public static PorterDuff.Mode r0(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void s(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.a.f2309u, i2, i3);
        boolean z2 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z2 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z2 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z2) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void s0(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void t(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                typedArrayObtainStyledAttributes.recycle();
                z2 = true;
                break;
            } else {
                if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                    typedArrayObtainStyledAttributes.recycle();
                    break;
                }
                i2++;
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static j0.b t0(MappedByteBuffer mappedByteBuffer) throws IOException {
        Object obj;
        long jP;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        f.f fVar = new f.f(byteBufferDuplicate);
        fVar.q(4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        fVar.q(6);
        int i3 = 0;
        while (true) {
            obj = fVar.f875b;
            if (i3 >= i2) {
                jP = -1;
                break;
            }
            int i4 = ((ByteBuffer) obj).getInt();
            fVar.q(4);
            jP = fVar.p();
            fVar.q(4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (jP != -1) {
            fVar.q((int) (jP - byteBufferDuplicate.position()));
            fVar.q(12);
            long jP2 = fVar.p();
            for (int i5 = 0; i5 < jP2; i5++) {
                int i6 = ((ByteBuffer) obj).getInt();
                long jP3 = fVar.p();
                fVar.p();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (jP3 + jP));
                    j0.b bVar = new j0.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f1467b = byteBufferDuplicate;
                    bVar.a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f1468c = i7;
                    bVar.f1469d = bVar.f1467b.getShort(i7);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static int u(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static List u0(int i2, Resources resources) throws Resources.NotFoundException {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (t.c.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void v0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        v.b.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static TypedValue w0(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int x0(Context context, int i2, int i3) {
        TypedValue typedValueW0 = w0(context, i2);
        return (typedValueW0 == null || typedValueW0.type != 16) ? i3 : typedValueW0.data;
    }

    public static int y(w0 w0Var, b0 b0Var, View view, View view2, l0 l0Var, boolean z2) {
        if (l0Var.q() == 0 || w0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(l0.y(view) - l0.y(view2)) + 1;
        }
        return Math.min(b0Var.i(), b0Var.b(view2) - b0Var.d(view));
    }

    public static TimeInterpolator y0(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!(Y(strValueOf, "cubic-bezier") || Y(strValueOf, "path"))) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!Y(strValueOf, "cubic-bezier")) {
            if (Y(strValueOf, "path")) {
                return d0.a.c(H(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return d0.a.b(P(strArrSplit, 0), P(strArrSplit, 1), P(strArrSplit, 2), P(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static int z(w0 w0Var, b0 b0Var, View view, View view2, l0 l0Var, boolean z2, boolean z3) {
        if (l0Var.q() == 0 || w0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (w0Var.a() - Math.max(l0.y(view), l0.y(view2))) - 1) : Math.max(0, Math.min(l0.y(view), l0.y(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(b0Var.b(view2) - b0Var.d(view)) / (Math.abs(l0.y(view) - l0.y(view2)) + 1))) + (b0Var.h() - b0Var.d(view)));
        }
        return iMax;
    }

    public static TypedValue z0(Context context, int i2, String str) {
        TypedValue typedValueW0 = w0(context, i2);
        if (typedValueW0 != null) {
            return typedValueW0;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public abstract boolean K0(View view, int i2);

    public abstract void L(float f2, float f3, u uVar);

    public int R(View view) {
        return 0;
    }

    public int S() {
        return 0;
    }

    public abstract void h0(Throwable th);

    public abstract void i0(int i2);

    public abstract void j0(Typeface typeface);

    public void k(int i2) {
        new Handler(Looper.getMainLooper()).post(new m(i2, 0, this));
    }

    public abstract void k0(Typeface typeface, boolean z2);

    public void l(final Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: t.l
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j0(typeface);
            }
        });
    }

    public abstract void l0(l.d dVar);

    public void m0(View view, int i2) {
    }

    public abstract void n0(int i2);

    public abstract void o0(View view, int i2, int i3);

    public abstract void p0(View view, float f2, float f3);

    public abstract int v(View view, int i2);

    public abstract int w(View view, int i2);

    public abstract void x();
}
