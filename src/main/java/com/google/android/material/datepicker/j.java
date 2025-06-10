package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class j {
    static {
        new AtomicReference();
    }

    public static Calendar a(Calendar calendar) {
        Calendar calendarB = b(calendar);
        Calendar calendarB2 = b(null);
        calendarB2.set(calendarB.get(1), calendarB.get(2), calendarB.get(5));
        return calendarB2;
    }

    public static Calendar b(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
