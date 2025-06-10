package u;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d2, double d3, double d4) {
        double d5 = (((-0.4986d) * d4) + (((-1.5372d) * d3) + (3.2406d * d2))) / 100.0d;
        double d6 = ((0.0415d * d4) + ((1.8758d * d3) + ((-0.9689d) * d2))) / 100.0d;
        double d7 = ((1.057d * d4) + (((-0.204d) * d3) + (0.0557d * d2))) / 100.0d;
        double dPow = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double dPow2 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        double dPow3 = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static int b(int i2, int i3) {
        int i4;
        int i5;
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i2);
        int i6 = 255 - iAlpha2;
        int i7 = 255 - (((255 - iAlpha) * i6) / 255);
        int iRed = Color.red(i2);
        int iRed2 = Color.red(i3);
        int i8 = 0;
        if (i7 == 0) {
            i4 = 0;
        } else {
            i4 = (((iRed2 * iAlpha) * i6) + ((iRed * 255) * iAlpha2)) / (i7 * 255);
        }
        int iGreen = Color.green(i2);
        int iGreen2 = Color.green(i3);
        if (i7 == 0) {
            i5 = 0;
        } else {
            i5 = (((iGreen2 * iAlpha) * i6) + ((iGreen * 255) * iAlpha2)) / (i7 * 255);
        }
        int iBlue = Color.blue(i2);
        int iBlue2 = Color.blue(i3);
        if (i7 != 0) {
            i8 = (((iBlue2 * iAlpha) * i6) + ((iBlue * 255) * iAlpha2)) / (i7 * 255);
        }
        return Color.argb(i7, i4, i5, i8);
    }

    public static int c(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
