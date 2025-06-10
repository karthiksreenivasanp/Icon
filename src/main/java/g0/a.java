package g0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.emoji2.text.s;

/* loaded from: classes.dex */
public final class a extends ContentObserver {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(new Handler());
        this.f1278b = bVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                b bVar = (b) this.f1278b;
                if (bVar.f1279b && (cursor = bVar.f1280c) != null && !cursor.isClosed()) {
                    bVar.a = bVar.f1280c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z2);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2, Uri uri) {
        switch (this.a) {
            case 1:
                ((s) this.f1278b).c();
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }
}
