package us.bojie.earthquakebo.util;

import android.content.Context;

import us.bojie.earthquakebo.R;

/**
 * Created by bjiang on 8/8/16.
 */
public class TextSplitter {


    public static String[] splitLocation(Context context, String location) {
        if (location.matches(".*\\d+.*")) {
            return location.split("(?<=of)");
        } else {
            String[] parts = new String[2];
            parts[0] = context.getString(R.string.near_the);
            parts[1] = location;
            return parts;
        }
    }
}
