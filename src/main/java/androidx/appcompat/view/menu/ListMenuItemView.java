package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import b.a;
import b0.f0;
import b0.r;
import com.nothing.icon.R;
import f.m;
import f.t;
import g.f2;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements t, AbsListView.SelectionBoundsAdjuster {
    public m a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f41b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f42c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f43d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f44e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f45f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f46g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f47h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f48i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f49j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f50l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f51m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f52n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f53o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f54p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f55q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f2 f2VarM = f2.m(getContext(), attributeSet, a.f470o, R.attr.listMenuViewStyle);
        this.f49j = f2VarM.e(5);
        this.k = f2VarM.h(1, -1);
        this.f51m = f2VarM.a(7, false);
        this.f50l = context;
        this.f52n = f2VarM.e(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f53o = typedArrayObtainStyledAttributes.hasValue(0);
        f2VarM.n();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f54p == null) {
            this.f54p = LayoutInflater.from(getContext());
        }
        return this.f54p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f46g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f47h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f47h.getLayoutParams();
        rect.top = this.f47h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // f.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(f.m r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(f.m):void");
    }

    @Override // f.t
    public m getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int[] iArr = f0.a;
        r.q(this, this.f49j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f43d = textView;
        int i2 = this.k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f50l, i2);
        }
        this.f45f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f46g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f52n);
        }
        this.f47h = (ImageView) findViewById(R.id.group_divider);
        this.f48i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f41b != null && this.f51m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f41b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f42c == null && this.f44e == null) {
            return;
        }
        if ((this.a.f947x & 4) != 0) {
            if (this.f42c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f42c = radioButton;
                LinearLayout linearLayout = this.f48i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f42c;
            view = this.f44e;
        } else {
            if (this.f44e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f44e = checkBox;
                LinearLayout linearLayout2 = this.f48i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f44e;
            view = this.f42c;
        }
        if (z2) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f44e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f42c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.a.f947x & 4) != 0) {
            if (this.f42c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f42c = radioButton;
                LinearLayout linearLayout = this.f48i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f42c;
        } else {
            if (this.f44e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f44e = checkBox;
                LinearLayout linearLayout2 = this.f48i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f44e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f55q = z2;
        this.f51m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f47h;
        if (imageView != null) {
            imageView.setVisibility((this.f53o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.a.f937n.getClass();
        boolean z2 = this.f55q;
        if (z2 || this.f51m) {
            ImageView imageView = this.f41b;
            if (imageView == null && drawable == null && !this.f51m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f41b = imageView2;
                LinearLayout linearLayout = this.f48i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f51m) {
                this.f41b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f41b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f41b.getVisibility() != 0) {
                this.f41b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f43d.getVisibility() != 8) {
                this.f43d.setVisibility(8);
            }
        } else {
            this.f43d.setText(charSequence);
            if (this.f43d.getVisibility() != 0) {
                this.f43d.setVisibility(0);
            }
        }
    }
}
