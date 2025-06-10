package g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.nothing.icon.R;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class x0 extends ListView {
    public final Rect a;

    /* renamed from: b, reason: collision with root package name */
    public int f1248b;

    /* renamed from: c, reason: collision with root package name */
    public int f1249c;

    /* renamed from: d, reason: collision with root package name */
    public int f1250d;

    /* renamed from: e, reason: collision with root package name */
    public int f1251e;

    /* renamed from: f, reason: collision with root package name */
    public int f1252f;

    /* renamed from: g, reason: collision with root package name */
    public w0 f1253g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1254h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1255i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1256j;
    public f0.g k;

    /* renamed from: l, reason: collision with root package name */
    public d.a f1257l;

    public x0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.a = new Rect();
        this.f1248b = 0;
        this.f1249c = 0;
        this.f1250d = 0;
        this.f1251e = 0;
        this.f1255i = z2;
        setCacheColorHint(0);
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.x0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1257l != null) {
            return;
        }
        super.drawableStateChanged();
        w0 w0Var = this.f1253g;
        if (w0Var != null) {
            w0Var.f1245b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f1256j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1255i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1255i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1255i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1255i && this.f1254h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1257l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 1;
        if (actionMasked == 10 && this.f1257l == null) {
            d.a aVar = new d.a(i2, this);
            this.f1257l = aVar;
            post(aVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (u0.f1231d) {
                        try {
                            u0.a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            u0.f1229b.invoke(this, Integer.valueOf(iPointToPosition));
                            u0.f1230c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f1256j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1252f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        d.a aVar = this.f1257l;
        if (aVar != null) {
            x0 x0Var = (x0) aVar.f775b;
            x0Var.f1257l = null;
            x0Var.removeCallbacks(aVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f1254h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        w0 w0Var = drawable != null ? new w0(drawable) : null;
        this.f1253g = w0Var;
        super.setSelector(w0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1248b = rect.left;
        this.f1249c = rect.top;
        this.f1250d = rect.right;
        this.f1251e = rect.bottom;
    }
}
