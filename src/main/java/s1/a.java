package s1;

/* loaded from: classes.dex */
public abstract class a {
    public static final Integer a;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null) {
            if (num2.intValue() > 0) {
                num = num2;
            }
        }
        a = num;
    }
}
