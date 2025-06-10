package u1;

import f1.e;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class a implements Serializable {
    public final String toString() {
        b.a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        e.q(string, "renderLambdaToString(this)");
        return string;
    }
}
