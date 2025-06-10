package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b0.f0;
import b0.r;
import com.nothing.icon.R;
import g.v1;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public View f56b;

    /* renamed from: c, reason: collision with root package name */
    public View f57c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f58d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f59e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f60f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f61g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f62h;

    /* renamed from: i, reason: collision with root package name */
    public final int f63i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.a aVar = new g.a(this);
        int[] iArr = f0.a;
        r.q(this, aVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.a);
        boolean z2 = false;
        this.f58d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f59e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f63i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f61g = true;
            this.f60f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f61g ? !(this.f58d != null || this.f59e != null) : this.f60f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f58d;
        if (drawable != null && drawable.isStateful()) {
            this.f58d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f59e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f59e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f60f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f60f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f58d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f59e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f60f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f56b = findViewById(R.id.action_bar);
        this.f57c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f61g) {
            Drawable drawable2 = this.f60f;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f58d != null) {
                if (this.f56b.getVisibility() == 0) {
                    drawable = this.f58d;
                    left = this.f56b.getLeft();
                    top = this.f56b.getTop();
                    right = this.f56b.getRight();
                    view = this.f56b;
                } else {
                    View view2 = this.f57c;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f58d.setBounds(0, 0, 0, 0);
                    } else {
                        drawable = this.f58d;
                        left = this.f57c.getLeft();
                        top = this.f57c.getTop();
                        right = this.f57c.getRight();
                        view = this.f57c;
                    }
                }
                drawable.setBounds(left, top, right, view.getBottom());
            } else {
                z3 = false;
            }
            this.f62h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f56b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f63i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f56b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f58d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f58d);
        }
        this.f58d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f56b;
            if (view != null) {
                this.f58d.setBounds(view.getLeft(), this.f56b.getTop(), this.f56b.getRight(), this.f56b.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f61g ? this.f58d != null || this.f59e != null : this.f60f != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f60f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f60f);
        }
        this.f60f = drawable;
        boolean z2 = this.f61g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f60f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f58d != null || this.f59e != null) : this.f60f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f59e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f59e);
        }
        this.f59e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f62h && this.f59e != null) {
                throw null;
            }
        }
        setWillNotDraw(!this.f61g ? !(this.f58d == null && this.f59e == null) : this.f60f != null);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(v1 v1Var) {
    }

    public void setTransitioning(boolean z2) {
        this.a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f58d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f59e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f60f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f58d;
        boolean z2 = this.f61g;
        return (drawable == drawable2 && !z2) || (drawable == this.f59e && this.f62h) || ((drawable == this.f60f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }
}
