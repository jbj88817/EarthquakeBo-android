package us.bojie.earthquakebo.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by bjiang on 8/5/16.
 */
public class DateFormatter {

    public static String DateToStrMdY(Date date) {
        SimpleDateFormat dt = new SimpleDateFormat("MMM d, yyyy", Locale.US);
        return dt.format(date);
    }

    public static String DateToStrHMA(Date date) {
        SimpleDateFormat dt = new SimpleDateFormat("h:mm a", Locale.US);
        return dt.format(date);
    }
}
