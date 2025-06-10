package g;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.nothing.icon.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k2 extends g0.b implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1146x = 0;

    /* renamed from: h, reason: collision with root package name */
    public final int f1147h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1148i;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f1149j;
    public final SearchView k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchableInfo f1150l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f1151m;

    /* renamed from: n, reason: collision with root package name */
    public final WeakHashMap f1152n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1153o;

    /* renamed from: p, reason: collision with root package name */
    public int f1154p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f1155q;

    /* renamed from: r, reason: collision with root package name */
    public int f1156r;

    /* renamed from: s, reason: collision with root package name */
    public int f1157s;

    /* renamed from: t, reason: collision with root package name */
    public int f1158t;

    /* renamed from: u, reason: collision with root package name */
    public int f1159u;

    /* renamed from: v, reason: collision with root package name */
    public int f1160v;

    /* renamed from: w, reason: collision with root package name */
    public int f1161w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context);
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1148i = suggestionRowLayout;
        this.f1147h = suggestionRowLayout;
        this.f1149j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f1154p = 1;
        this.f1156r = -1;
        this.f1157s = -1;
        this.f1158t = -1;
        this.f1159u = -1;
        this.f1160v = -1;
        this.f1161w = -1;
        this.k = searchView;
        this.f1150l = searchableInfo;
        this.f1153o = searchView.getSuggestionCommitIconResId();
        this.f1151m = context;
        this.f1152n = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g0.b
    public final void a(View view, Cursor cursor) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        Drawable drawableF;
        String string;
        Drawable drawable;
        ActivityInfo activityInfo;
        int iconResource;
        String strH;
        j2 j2Var = (j2) view.getTag();
        int i2 = this.f1161w;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = j2Var.a;
        if (textView != null) {
            String strH2 = h(cursor, this.f1156r);
            textView.setText(strH2);
            textView.setVisibility(TextUtils.isEmpty(strH2) ? 8 : 0);
        }
        Context context = this.f1151m;
        TextView textView2 = j2Var.f1101b;
        if (textView2 != null) {
            String strH3 = h(cursor, this.f1158t);
            if (strH3 != null) {
                if (this.f1155q == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f1155q = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strH3);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1155q, null), 0, strH3.length(), 33);
                strH = spannableString;
            } else {
                strH = h(cursor, this.f1157s);
            }
            if (TextUtils.isEmpty(strH)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(strH);
            textView2.setVisibility(TextUtils.isEmpty(strH) ? 8 : 0);
        }
        ImageView imageView = j2Var.f1102c;
        if (imageView != null) {
            int i4 = this.f1159u;
            if (i4 == -1) {
                drawableF = null;
            } else {
                drawableF = f(cursor.getString(i4));
                if (drawableF == null) {
                    ComponentName searchActivity = this.f1150l.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f1152n;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableF = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e2) {
                            string = e2.toString();
                        }
                        if (iconResource != 0) {
                            drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                string = "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString();
                                Log.w("SuggestionsAdapter", string);
                                drawable = null;
                            }
                        } else {
                            drawable = null;
                        }
                        weakHashMap.put(strFlattenToShortString, drawable == null ? null : drawable.getConstantState());
                        drawableF = drawable;
                    }
                    if (drawableF == null) {
                        drawableF = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableF);
            if (drawableF == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableF.setVisible(false, false);
                drawableF.setVisible(true, false);
            }
        }
        ImageView imageView2 = j2Var.f1103d;
        if (imageView2 != null) {
            int i5 = this.f1160v;
            Drawable drawableF2 = i5 == -1 ? null : f(cursor.getString(i5));
            imageView2.setImageDrawable(drawableF2);
            if (drawableF2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawableF2.setVisible(false, false);
                drawableF2.setVisible(true, false);
            }
        }
        int i6 = this.f1154p;
        ImageView imageView3 = j2Var.f1104e;
        if (i6 != 2 && (i6 != 1 || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // g0.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f1156r = cursor.getColumnIndex("suggest_text_1");
                this.f1157s = cursor.getColumnIndex("suggest_text_2");
                this.f1158t = cursor.getColumnIndex("suggest_text_2_url");
                this.f1159u = cursor.getColumnIndex("suggest_icon_1");
                this.f1160v = cursor.getColumnIndex("suggest_icon_2");
                this.f1161w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // g0.b
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f1150l;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // g0.b
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f1149j.inflate(this.f1147h, viewGroup, false);
        viewInflate.setTag(new j2(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f1153o);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1151m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable f(String str) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        WeakHashMap weakHashMap = this.f1152n;
        Context context = this.f1151m;
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i2 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i2;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Object obj = s.c.a;
                Drawable drawableB = s.a.b(context, i2);
                if (drawableB != null) {
                    weakHashMap.put(str2, drawableB.getConstantState());
                }
                return drawableB;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            drawableE = Drawable.createFromStream(inputStreamOpenInputStream, null);
                        } finally {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                }
                if (drawableE != null) {
                    weakHashMap.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1151m.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // g0.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewInflate = this.f1149j.inflate(this.f1148i, viewGroup, false);
            if (viewInflate != null) {
                ((j2) viewInflate.getTag()).a.setText(e2.toString());
            }
            return viewInflate;
        }
    }

    @Override // g0.b, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewD = this.d(viewGroup);
            ((j2) viewD.getTag()).a.setText(e2.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1280c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1280c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.k.n((CharSequence) tag);
        }
    }
}
