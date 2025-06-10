package g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.nothing.icon.R;

/* loaded from: classes.dex */
public final class j extends a0 implements l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f1100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f1100d = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a3.a(this, getContentDescription());
        setOnTouchListener(new i(this, this));
    }

    @Override // g.l
    public final boolean a() {
        return false;
    }

    @Override // g.l
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f1100d.f();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            v.b.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
