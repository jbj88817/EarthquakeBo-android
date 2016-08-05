package us.bojie.earthquakebo.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import us.bojie.earthquakebo.model.Earthquake;

/**
 * Created by bjiang on 8/4/16.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }


}
