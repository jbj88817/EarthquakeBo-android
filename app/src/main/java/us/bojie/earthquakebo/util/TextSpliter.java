package us.bojie.earthquakebo.util;

/**
 * Created by bjiang on 8/8/16.
 */
public class TextSpliter {


    public static String[] splitLocation(String location) {
        if (location.matches(".*\\d+.*")) {
            return location.split("(?<=of)");
        } else {
            String[] parts = new String[2];
            parts[0] = "Near the";
            parts[1] = location;
            return parts;
        }
    }
}
