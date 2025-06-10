package u;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class f {
    public char a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f2280b;

    public f(char c2, float[] fArr) {
        this.a = c2;
        this.f2280b = fArr;
    }

    public static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
        double d2;
        double d3;
        double radians = Math.toRadians(f8);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d4 = f2;
        double d5 = f3;
        double d6 = (d5 * dSin) + (d4 * dCos);
        double d7 = d4;
        double d8 = f6;
        double d9 = d6 / d8;
        double d10 = f7;
        double d11 = ((d5 * dCos) + ((-f2) * dSin)) / d10;
        double d12 = d5;
        double d13 = f5;
        double d14 = ((d13 * dSin) + (f4 * dCos)) / d8;
        double d15 = ((d13 * dCos) + ((-f4) * dSin)) / d10;
        double d16 = d9 - d14;
        double d17 = d11 - d15;
        double d18 = (d9 + d14) / 2.0d;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d20);
            float fSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            a(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z2, z3);
            return;
        }
        double dSqrt = Math.sqrt(d21);
        double d22 = d16 * dSqrt;
        double d23 = dSqrt * d17;
        if (z2 == z3) {
            d2 = d18 - d23;
            d3 = d19 + d22;
        } else {
            d2 = d18 + d23;
            d3 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d11 - d3, d9 - d2);
        double dAtan22 = Math.atan2(d15 - d3, d14 - d2) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d2 * d8;
        double d25 = d3 * d10;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d8;
        double d29 = d28 * dCos2;
        double d30 = d10 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d10 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = d33;
        double d36 = dAtan22 / iCeil;
        int i2 = 0;
        while (i2 < iCeil) {
            double d37 = dAtan2 + d36;
            double dSin4 = Math.sin(d37);
            double dCos4 = Math.cos(d37);
            double d38 = d36;
            double d39 = (((d8 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d40 = d35;
            double d41 = d26;
            double d42 = (d40 * dSin4) + (d8 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d40) + (dSin4 * d32);
            double d45 = d37 - dAtan2;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d31 * dSqrt2) + d7), (float) ((d34 * dSqrt2) + d12), (float) (d39 - (dSqrt2 * d43)), (float) (d42 - (dSqrt2 * d44)), (float) d39, (float) d42);
            i2++;
            dAtan2 = d37;
            d32 = d32;
            dCos2 = dCos2;
            iCeil = iCeil;
            d34 = d44;
            d8 = d8;
            d31 = d43;
            d7 = d39;
            d12 = d42;
            d26 = d41;
            d36 = d38;
            d35 = d40;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i2;
        int i3;
        char c2;
        f fVar;
        int i4;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        f[] fVarArr2 = fVarArr;
        int i5 = 6;
        float[] fArr = new float[6];
        char c3 = 'm';
        int i6 = 0;
        char c4 = 'm';
        int i7 = 0;
        while (i7 < fVarArr2.length) {
            f fVar2 = fVarArr2[i7];
            char c5 = fVar2.a;
            float f23 = fArr[i6];
            float f24 = fArr[1];
            float f25 = fArr[2];
            float f26 = fArr[3];
            float f27 = fArr[4];
            float f28 = fArr[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = i5;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f27, f28);
                    f23 = f27;
                    f25 = f23;
                    f24 = f28;
                    f26 = f24;
                default:
                    i2 = 2;
                    break;
            }
            float f29 = f27;
            float f30 = f28;
            float f31 = f23;
            float f32 = f24;
            int i8 = i6;
            while (true) {
                float[] fArr2 = fVar2.f2280b;
                if (i8 < fArr2.length) {
                    if (c5 != 'A') {
                        if (c5 != 'C') {
                            if (c5 == 'H') {
                                i3 = i8;
                                c2 = c5;
                                fVar = fVar2;
                                i4 = i7;
                                int i9 = i3 + 0;
                                path.lineTo(fArr2[i9], f32);
                                f31 = fArr2[i9];
                            } else if (c5 == 'Q') {
                                i3 = i8;
                                c2 = c5;
                                fVar = fVar2;
                                i4 = i7;
                                int i10 = i3 + 0;
                                int i11 = i3 + 1;
                                int i12 = i3 + 2;
                                int i13 = i3 + 3;
                                path.quadTo(fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                                f2 = fArr2[i10];
                                f3 = fArr2[i11];
                                f31 = fArr2[i12];
                                f32 = fArr2[i13];
                            } else if (c5 == 'V') {
                                i3 = i8;
                                c2 = c5;
                                fVar = fVar2;
                                i4 = i7;
                                int i14 = i3 + 0;
                                path.lineTo(f31, fArr2[i14]);
                                f32 = fArr2[i14];
                            } else if (c5 != 'a') {
                                if (c5 != 'c') {
                                    if (c5 == 'h') {
                                        i3 = i8;
                                        int i15 = i3 + 0;
                                        path.rLineTo(fArr2[i15], 0.0f);
                                        f31 += fArr2[i15];
                                    } else if (c5 != 'q') {
                                        if (c5 != 'v') {
                                            if (c5 != 'L') {
                                                if (c5 == 'M') {
                                                    i3 = i8;
                                                    f13 = fArr2[i3 + 0];
                                                    f14 = fArr2[i3 + 1];
                                                    if (i3 > 0) {
                                                        path.lineTo(f13, f14);
                                                    } else {
                                                        path.moveTo(f13, f14);
                                                        f29 = f13;
                                                        f30 = f14;
                                                    }
                                                } else if (c5 == 'S') {
                                                    i3 = i8;
                                                    float f33 = f32;
                                                    float f34 = f31;
                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                        f15 = (f33 * 2.0f) - f26;
                                                        f16 = (f34 * 2.0f) - f25;
                                                    } else {
                                                        f16 = f34;
                                                        f15 = f33;
                                                    }
                                                    int i16 = i3 + 0;
                                                    int i17 = i3 + 1;
                                                    int i18 = i3 + 2;
                                                    int i19 = i3 + 3;
                                                    path.cubicTo(f16, f15, fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                    float f35 = fArr2[i16];
                                                    float f36 = fArr2[i17];
                                                    f10 = fArr2[i18];
                                                    f9 = fArr2[i19];
                                                    f25 = f35;
                                                    f26 = f36;
                                                    f31 = f10;
                                                    f32 = f9;
                                                } else if (c5 == 'T') {
                                                    i3 = i8;
                                                    float f37 = f32;
                                                    float f38 = f31;
                                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                        f17 = (f38 * 2.0f) - f25;
                                                        f18 = (f37 * 2.0f) - f26;
                                                    } else {
                                                        f17 = f38;
                                                        f18 = f37;
                                                    }
                                                    int i20 = i3 + 0;
                                                    int i21 = i3 + 1;
                                                    path.quadTo(f17, f18, fArr2[i20], fArr2[i21]);
                                                    f26 = f18;
                                                    f25 = f17;
                                                    c2 = c5;
                                                    fVar = fVar2;
                                                    i4 = i7;
                                                    f31 = fArr2[i20];
                                                    f32 = fArr2[i21];
                                                } else if (c5 == 'l') {
                                                    i3 = i8;
                                                    f11 = f32;
                                                    int i22 = i3 + 0;
                                                    float f39 = fArr2[i22];
                                                    int i23 = i3 + 1;
                                                    path.rLineTo(f39, fArr2[i23]);
                                                    f31 += fArr2[i22];
                                                    f12 = fArr2[i23];
                                                } else if (c5 == c3) {
                                                    i3 = i8;
                                                    float f40 = fArr2[i3 + 0];
                                                    f31 += f40;
                                                    float f41 = fArr2[i3 + 1];
                                                    f32 += f41;
                                                    if (i3 > 0) {
                                                        path.rLineTo(f40, f41);
                                                    } else {
                                                        path.rMoveTo(f40, f41);
                                                        f30 = f32;
                                                        f29 = f31;
                                                    }
                                                } else if (c5 != 's') {
                                                    if (c5 == 't') {
                                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                            f21 = f31 - f25;
                                                            f22 = f32 - f26;
                                                        } else {
                                                            f22 = 0.0f;
                                                            f21 = 0.0f;
                                                        }
                                                        int i24 = i8 + 0;
                                                        int i25 = i8 + 1;
                                                        path.rQuadTo(f21, f22, fArr2[i24], fArr2[i25]);
                                                        float f42 = f21 + f31;
                                                        float f43 = f22 + f32;
                                                        f31 += fArr2[i24];
                                                        f32 += fArr2[i25];
                                                        f26 = f43;
                                                        f25 = f42;
                                                    }
                                                    i3 = i8;
                                                } else {
                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                        float f44 = f31 - f25;
                                                        f19 = f32 - f26;
                                                        f20 = f44;
                                                    } else {
                                                        f19 = 0.0f;
                                                        f20 = 0.0f;
                                                    }
                                                    int i26 = i8 + 0;
                                                    int i27 = i8 + 1;
                                                    int i28 = i8 + 2;
                                                    int i29 = i8 + 3;
                                                    i3 = i8;
                                                    f4 = f32;
                                                    float f45 = f31;
                                                    path.rCubicTo(f20, f19, fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                                                    f5 = fArr2[i26] + f45;
                                                    f6 = fArr2[i27] + f4;
                                                    f7 = f45 + fArr2[i28];
                                                    f8 = fArr2[i29];
                                                }
                                                f31 = f29;
                                                f32 = f30;
                                            } else {
                                                i3 = i8;
                                                int i30 = i3 + 0;
                                                int i31 = i3 + 1;
                                                path.lineTo(fArr2[i30], fArr2[i31]);
                                                f13 = fArr2[i30];
                                                f14 = fArr2[i31];
                                            }
                                            f31 = f13;
                                            f32 = f14;
                                        } else {
                                            i3 = i8;
                                            f11 = f32;
                                            int i32 = i3 + 0;
                                            path.rLineTo(0.0f, fArr2[i32]);
                                            f12 = fArr2[i32];
                                        }
                                        f32 = f11 + f12;
                                    } else {
                                        i3 = i8;
                                        f4 = f32;
                                        float f46 = f31;
                                        int i33 = i3 + 0;
                                        float f47 = fArr2[i33];
                                        int i34 = i3 + 1;
                                        int i35 = i3 + 2;
                                        int i36 = i3 + 3;
                                        path.rQuadTo(f47, fArr2[i34], fArr2[i35], fArr2[i36]);
                                        f5 = fArr2[i33] + f46;
                                        f6 = fArr2[i34] + f4;
                                        float f48 = f46 + fArr2[i35];
                                        float f49 = fArr2[i36];
                                        f7 = f48;
                                        f8 = f49;
                                    }
                                    c2 = c5;
                                    fVar = fVar2;
                                    i4 = i7;
                                } else {
                                    i3 = i8;
                                    f4 = f32;
                                    float f50 = f31;
                                    int i37 = i3 + 2;
                                    int i38 = i3 + 3;
                                    int i39 = i3 + 4;
                                    int i40 = i3 + 5;
                                    path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                    f5 = fArr2[i37] + f50;
                                    f6 = fArr2[i38] + f4;
                                    f7 = f50 + fArr2[i39];
                                    f8 = fArr2[i40];
                                }
                                f9 = f4 + f8;
                                f25 = f5;
                                f26 = f6;
                                f10 = f7;
                                f31 = f10;
                                f32 = f9;
                                c2 = c5;
                                fVar = fVar2;
                                i4 = i7;
                            } else {
                                i3 = i8;
                                float f51 = f32;
                                float f52 = f31;
                                int i41 = i3 + 5;
                                int i42 = i3 + 6;
                                c2 = c5;
                                fVar = fVar2;
                                i4 = i7;
                                a(path, f52, f51, fArr2[i41] + f52, fArr2[i42] + f51, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                                f31 = f52 + fArr2[i41];
                                f32 = f51 + fArr2[i42];
                            }
                            i8 = i3 + i2;
                            fVar2 = fVar;
                            c4 = c2;
                            c5 = c4;
                            i7 = i4;
                            c3 = 'm';
                            i6 = 0;
                        } else {
                            i3 = i8;
                            c2 = c5;
                            fVar = fVar2;
                            i4 = i7;
                            int i43 = i3 + 2;
                            int i44 = i3 + 3;
                            int i45 = i3 + 4;
                            int i46 = i3 + 5;
                            path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i43], fArr2[i44], fArr2[i45], fArr2[i46]);
                            float f53 = fArr2[i45];
                            float f54 = fArr2[i46];
                            f2 = fArr2[i43];
                            f31 = f53;
                            f32 = f54;
                            f3 = fArr2[i44];
                        }
                        f25 = f2;
                        f26 = f3;
                        i8 = i3 + i2;
                        fVar2 = fVar;
                        c4 = c2;
                        c5 = c4;
                        i7 = i4;
                        c3 = 'm';
                        i6 = 0;
                    } else {
                        i3 = i8;
                        c2 = c5;
                        fVar = fVar2;
                        i4 = i7;
                        int i47 = i3 + 5;
                        int i48 = i3 + 6;
                        a(path, f31, f32, fArr2[i47], fArr2[i48], fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f31 = fArr2[i47];
                        f32 = fArr2[i48];
                    }
                    f26 = f32;
                    f25 = f31;
                    i8 = i3 + i2;
                    fVar2 = fVar;
                    c4 = c2;
                    c5 = c4;
                    i7 = i4;
                    c3 = 'm';
                    i6 = 0;
                }
            }
            int i49 = i7;
            int i50 = i6;
            fArr[i50] = f31;
            fArr[1] = f32;
            fArr[2] = f25;
            fArr[3] = f26;
            fArr[4] = f29;
            fArr[5] = f30;
            i7 = i49 + 1;
            i5 = 6;
            c3 = 'm';
            i6 = i50;
            c4 = fVarArr[i49].a;
            fVarArr2 = fVarArr;
        }
    }
}
