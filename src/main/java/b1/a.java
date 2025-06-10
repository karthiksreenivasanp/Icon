package b1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.nothing.icon.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.i0;

/* loaded from: classes.dex */
public final class a extends i0 {
    public final Paint a;

    /* renamed from: b, reason: collision with root package name */
    public List f504b;

    public a() {
        Paint paint = new Paint();
        this.a = paint;
        this.f504b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // o0.i0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (b bVar : this.f504b) {
            bVar.getClass();
            int i2 = u.a.a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            bVar.getClass();
            float fX = ((CarouselLayoutManager) recyclerView.getLayoutManager()).x();
            bVar.getClass();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            canvas.drawLine(0.0f, fX, 0.0f, carouselLayoutManager.f2054j - carouselLayoutManager.u(), paint);
        }
    }
}
