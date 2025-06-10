package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final p f292b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f293c;

    /* renamed from: d, reason: collision with root package name */
    public int f294d;

    public a(p pVar) {
        pVar.d();
        this.a = new ArrayList();
        this.f294d = -1;
        this.f292b = pVar;
    }

    public final void a(u uVar) {
        this.a.add(uVar);
        uVar.f353c = 0;
        uVar.f354d = 0;
        uVar.f355e = 0;
        uVar.f356f = 0;
    }

    public final int b(boolean z2) {
        if (this.f293c) {
            throw new IllegalStateException("commit already called");
        }
        if (p.f(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new y());
            c(printWriter, true);
            printWriter.close();
        }
        this.f293c = true;
        p pVar = this.f292b;
        this.f294d = -1;
        if (!z2) {
            pVar.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (pVar.a) {
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f294d;
    }

    public final void c(PrintWriter printWriter, boolean z2) {
        String str;
        if (z2) {
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f294d);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f293c);
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print("  ");
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = (u) arrayList.get(i2);
            switch (uVar.a) {
                case 0:
                    str = "NULL";
                    break;
                case 1:
                    str = "ADD";
                    break;
                case 2:
                    str = "REPLACE";
                    break;
                case 3:
                    str = "REMOVE";
                    break;
                case 4:
                    str = "HIDE";
                    break;
                case 5:
                    str = "SHOW";
                    break;
                case 6:
                    str = "DETACH";
                    break;
                case 7:
                    str = "ATTACH";
                    break;
                case 8:
                    str = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str = "cmd=" + uVar.a;
                    break;
            }
            printWriter.print("  ");
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str);
            printWriter.print(" ");
            printWriter.println(uVar.f352b);
            if (z2) {
                if (uVar.f353c != 0 || uVar.f354d != 0) {
                    printWriter.print("  ");
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(uVar.f353c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(uVar.f354d));
                }
                if (uVar.f355e != 0 || uVar.f356f != 0) {
                    printWriter.print("  ");
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(uVar.f355e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(uVar.f356f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f294d >= 0) {
            sb.append(" #");
            sb.append(this.f294d);
        }
        sb.append("}");
        return sb.toString();
    }
}
