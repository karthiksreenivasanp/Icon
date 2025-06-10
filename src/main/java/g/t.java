package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class t {
    public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1222b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1223c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1224d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e, reason: collision with root package name */
    public final int[] f1225e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1226f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int iC = l2.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{l2.f1167b, l2.f1169d, l2.f1168c, l2.f1171f}, new int[]{l2.b(context, R.attr.colorButtonNormal), u.a.b(iC, i2), u.a.b(iC, i2), i2});
    }

    public static LayerDrawable c(s1 s1Var, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableE = s1Var.e(context, R.drawable.abc_star_black_48dp);
        Drawable drawableE2 = s1Var.e(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableE instanceof BitmapDrawable) && drawableE.getIntrinsicWidth() == dimensionPixelSize && drawableE.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableE;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableE.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableE2 instanceof BitmapDrawable) && drawableE2.getIntrinsicWidth() == dimensionPixelSize && drawableE2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableE2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableE2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        int i3 = s0.a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = u.f1227b;
        }
        drawableMutate.setColorFilter(u.c(i2, mode));
    }

    public final ColorStateList d(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return s.c.a(context, R.color.abc_tint_edittext);
        }
        if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            return s.c.a(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, l2.c(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return b(context, l2.c(context, R.attr.colorAccent));
            }
            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return s.c.a(context, R.color.abc_tint_spinner);
            }
            if (a(this.f1222b, i2)) {
                return l2.d(context, R.attr.colorControlNormal);
            }
            if (a(this.f1225e, i2)) {
                return s.c.a(context, R.color.abc_tint_default);
            }
            if (a(this.f1226f, i2)) {
                return s.c.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return s.c.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = l2.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = l2.f1167b;
            iArr2[0] = l2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = l2.f1170e;
            iArr2[1] = l2.c(context, R.attr.colorControlActivated);
            iArr[2] = l2.f1171f;
            iArr2[2] = l2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = l2.f1167b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = l2.f1170e;
            iArr2[1] = l2.c(context, R.attr.colorControlActivated);
            iArr[2] = l2.f1171f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
