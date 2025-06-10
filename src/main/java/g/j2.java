package g;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class j2 {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f1101b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f1102c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f1103d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f1104e;

    public j2(View view) {
        this.a = (TextView) view.findViewById(R.id.text1);
        this.f1101b = (TextView) view.findViewById(R.id.text2);
        this.f1102c = (ImageView) view.findViewById(R.id.icon1);
        this.f1103d = (ImageView) view.findViewById(R.id.icon2);
        this.f1104e = (ImageView) view.findViewById(com.nothing.icon.R.id.edit_query);
    }
}
