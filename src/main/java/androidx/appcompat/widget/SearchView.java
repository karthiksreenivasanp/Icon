package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import b0.c0;
import b0.f0;
import b0.r;
import com.nothing.icon.R;
import g.a2;
import g.a3;
import g.b2;
import g.c1;
import g.c2;
import g.d2;
import g.e1;
import g.e2;
import g.f2;
import g.h2;
import g.i2;
import g.k2;
import g.o;
import g.w1;
import g.x1;
import g.y1;
import g.z1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends c1 implements e.b {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f116g0 = 0;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public g0.b O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public CharSequence V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public int f117a0;

    /* renamed from: b0, reason: collision with root package name */
    public SearchableInfo f118b0;

    /* renamed from: c0, reason: collision with root package name */
    public Bundle f119c0;

    /* renamed from: d0, reason: collision with root package name */
    public final x1 f120d0;

    /* renamed from: e0, reason: collision with root package name */
    public final x1 f121e0;

    /* renamed from: f0, reason: collision with root package name */
    public final WeakHashMap f122f0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f123p;

    /* renamed from: q, reason: collision with root package name */
    public final View f124q;

    /* renamed from: r, reason: collision with root package name */
    public final View f125r;

    /* renamed from: s, reason: collision with root package name */
    public final View f126s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f127t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f128u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f129v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f130w;

    /* renamed from: x, reason: collision with root package name */
    public final View f131x;

    /* renamed from: y, reason: collision with root package name */
    public i2 f132y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f133z;

    public static class SearchAutoComplete extends o {

        /* renamed from: e, reason: collision with root package name */
        public int f134e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f135f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f136g;

        /* renamed from: h, reason: collision with root package name */
        public final d f137h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f137h = new d(this);
            this.f134e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f134e <= 0 || super.enoughToFilter();
        }

        @Override // g.o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f136g) {
                d dVar = this.f137h;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f135f;
            searchView.u(searchView.N);
            searchView.post(searchView.f120d0);
            SearchAutoComplete searchAutoComplete = searchView.f123p;
            if (searchAutoComplete.hasFocus()) {
                c.a(searchAutoComplete);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f135f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f135f.hasFocus() && getVisibility() == 0) {
                this.f136g = true;
                Context context = getContext();
                int i2 = SearchView.f116g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    c.b(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f137h;
            if (!z2) {
                this.f136g = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f136g = true;
                    return;
                }
                this.f136g = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f135f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f134e = i2;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f123p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f123p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.S = false;
    }

    public int getImeOptions() {
        return this.f123p.getImeOptions();
    }

    public int getInputType() {
        return this.f123p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f123p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f118b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f118b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public g0.b getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f119c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f118b0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f119c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f123p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i2) {
        int position;
        String strH;
        Cursor cursor = this.O.f1280c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intentI = null;
            try {
                int i3 = k2.f1146x;
                String strH2 = k2.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f118b0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = k2.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f118b0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = k2.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentI = i(strH2, strH3 == null ? null : Uri.parse(strH3), k2.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), k2.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            }
            if (intentI != null) {
                try {
                    getContext().startActivity(intentI);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intentI, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f123p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i2) {
        String strC;
        Editable text = this.f123p.getText();
        Cursor cursor = this.O.f1280c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2) || (strC = this.O.c(cursor)) == null) {
            setQuery(text);
        } else {
            setQuery(strC);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f123p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f118b0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f120d0);
        post(this.f121e0);
        super.onDetachedFromWindow();
    }

    @Override // g.c1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.f123p;
            int[] iArr = this.B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f133z;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.A;
            rect2.set(i8, 0, i9, i10);
            i2 i2Var = this.f132y;
            if (i2Var == null) {
                i2 i2Var2 = new i2(rect2, rect, searchAutoComplete);
                this.f132y = i2Var2;
                setTouchDelegate(i2Var2);
            } else {
                i2Var.f1095b.set(rect2);
                Rect rect3 = i2Var.f1097d;
                rect3.set(rect2);
                int i11 = -i2Var.f1098e;
                rect3.inset(i11, i11);
                i2Var.f1096c.set(rect);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // g.c1, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.N
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.T
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.T
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.T
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h2 h2Var = (h2) parcelable;
        super.onRestoreInstanceState(h2Var.a);
        u(h2Var.f1082c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h2 h2Var = new h2(super.onSaveInstanceState());
        h2Var.f1082c = this.N;
        return h2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f120d0);
    }

    public final void p() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f123p.getText());
        if (!z3 && (!this.M || this.W)) {
            z2 = false;
        }
        int i2 = z2 ? 0 : 8;
        ImageView imageView = this.f129v;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f123p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f125r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f126s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z2 = this.M;
        SearchAutoComplete searchAutoComplete = this.f123p;
        if (z2 && (drawable = this.E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (this.N) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f123p.requestFocus(i2, rect);
        if (zRequestFocus) {
            u(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int i2 = 0;
        if (!((this.P || this.U) && !this.N) || (this.f128u.getVisibility() != 0 && this.f130w.getVisibility() != 0)) {
            i2 = 8;
        }
        this.f126s.setVisibility(i2);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f119c0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f123p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.M == z2) {
            return;
        }
        this.M = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i2) {
        this.f123p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f123p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.T = i2;
        requestLayout();
    }

    public void setOnCloseListener(c2 c2Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(d2 d2Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(e2 e2Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.R = z2;
        g0.b bVar = this.O;
        if (bVar instanceof k2) {
            ((k2) bVar).f1154p = z2 ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f118b0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f123p
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f118b0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f118b0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f118b0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            g0.b r8 = r7.O
            if (r8 == 0) goto L3e
            r8.b(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f118b0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            g.k2 r8 = new g.k2
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f118b0
            java.util.WeakHashMap r6 = r7.f122f0
            r8.<init>(r4, r7, r5, r6)
            r7.O = r8
            r0.setAdapter(r8)
            g0.b r8 = r7.O
            g.k2 r8 = (g.k2) r8
            boolean r4 = r7.R
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.f1154p = r4
        L65:
            r7.r()
        L68:
            android.app.SearchableInfo r8 = r7.f118b0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f118b0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.H
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f118b0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.I
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.U = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.N
            r7.u(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.P = z2;
        u(this.N);
    }

    public void setSuggestionsAdapter(g0.b bVar) {
        this.O = bVar;
        this.f123p.setAdapter(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.P
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.U
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.N
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.U
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r2 = r2.f128u
            r2.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.t(boolean):void");
    }

    public final void u(boolean z2) {
        this.N = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f123p.getText());
        this.f127t.setVisibility(i3);
        t(z3);
        this.f124q.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.D;
        imageView.setVisibility((imageView.getDrawable() == null || this.M) ? 8 : 0);
        p();
        boolean z4 = !z3;
        if (this.U && !this.N && z4) {
            this.f128u.setVisibility(8);
        } else {
            i2 = 8;
        }
        this.f130w.setVisibility(i2);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f133z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f120d0 = new x1(this, 0);
        int i3 = 1;
        this.f121e0 = new x1(this, i3);
        this.f122f0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        a2 a2Var = new a2(this);
        b2 b2Var = new b2(this);
        e1 e1Var = new e1(i3, this);
        w1 w1Var = new w1(this, 0);
        int[] iArr = b.a.f473r;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        f2 f2Var = new f2(context, typedArrayObtainStyledAttributes);
        int[] iArr2 = f0.a;
        c0.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        LayoutInflater.from(context).inflate(f2Var.h(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f123p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f124q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f125r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f126s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f127t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f128u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f129v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f130w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        r.q(viewFindViewById, f2Var.e(18));
        r.q(viewFindViewById2, f2Var.e(23));
        imageView.setImageDrawable(f2Var.e(21));
        imageView2.setImageDrawable(f2Var.e(13));
        imageView3.setImageDrawable(f2Var.e(10));
        imageView4.setImageDrawable(f2Var.e(26));
        imageView5.setImageDrawable(f2Var.e(21));
        this.E = f2Var.e(20);
        a3.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = f2Var.h(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = f2Var.h(11, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(w1Var);
        searchAutoComplete.setOnEditorActionListener(a2Var);
        searchAutoComplete.setOnItemClickListener(b2Var);
        searchAutoComplete.setOnItemSelectedListener(e1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new y1(this));
        setIconifiedByDefault(f2Var.a(16, true));
        int iD = f2Var.d(2, -1);
        if (iD != -1) {
            setMaxWidth(iD);
        }
        this.J = f2Var.j(12);
        this.Q = f2Var.j(19);
        int iG = f2Var.g(6, -1);
        if (iG != -1) {
            setImeOptions(iG);
        }
        int iG2 = f2Var.g(5, -1);
        if (iG2 != -1) {
            setInputType(iG2);
        }
        setFocusable(f2Var.a(1, true));
        f2Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f131x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new z1(0, this));
        }
        u(this.M);
        r();
    }
}
