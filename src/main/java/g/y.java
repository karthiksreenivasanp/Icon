package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class y extends ImageButton {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final z f1261b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m2.a(context);
        this.f1262c = false;
        l2.a(this, getContext());
        p pVar = new p(this);
        this.a = pVar;
        pVar.d(attributeSet, i2);
        z zVar = new z(this);
        this.f1261b = zVar;
        zVar.b(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.a;
        if (pVar != null) {
            pVar.a();
        }
        z zVar = this.f1261b;
        if (zVar != null) {
            zVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        n2 n2Var;
        z zVar = this.f1261b;
        if (zVar == null || (n2Var = (n2) zVar.f1264c) == null) {
            return null;
        }
        return (ColorStateList) n2Var.f1179c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        n2 n2Var;
        z zVar = this.f1261b;
        if (zVar == null || (n2Var = (n2) zVar.f1264c) == null) {
            return null;
        }
        return (PorterDuff.Mode) n2Var.f1180d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f1261b.f1263b).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.a;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        p pVar = this.a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        z zVar = this.f1261b;
        if (zVar != null) {
            zVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        z zVar = this.f1261b;
        if (zVar != null && drawable != null && !this.f1262c) {
            zVar.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (zVar != null) {
            zVar.a();
            if (this.f1262c) {
                return;
            }
            ImageView imageView = (ImageView) zVar.f1263b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(zVar.a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f1262c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f1261b.d(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        z zVar = this.f1261b;
        if (zVar != null) {
            zVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        z zVar = this.f1261b;
        if (zVar != null) {
            zVar.e(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1261b;
        if (zVar != null) {
            zVar.f(mode);
        }
    }
}
