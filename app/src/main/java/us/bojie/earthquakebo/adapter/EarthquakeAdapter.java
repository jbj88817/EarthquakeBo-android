package us.bojie.earthquakebo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import us.bojie.earthquakebo.R;
import us.bojie.earthquakebo.model.Earthquake;
import us.bojie.earthquakebo.util.DateFormatter;

/**
 * Created by bjiang on 8/4/16.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        Earthquake currentEarthquake = getItem(position);

        // Binding data to TextView

        TextView MagnitudeTextView = (TextView) listItemView.findViewById(R.id.tv_mag);
        MagnitudeTextView.setText(String.valueOf(currentEarthquake.getmMagnitude()));

        TextView LocationTextView = (TextView) listItemView.findViewById(R.id.tv_location);
        LocationTextView.setText(currentEarthquake.getmLocation());

        TextView DateTextView = (TextView) listItemView.findViewById(R.id.tv_date);
        DateTextView.setText(DateFormatter.DateToStrMdY(currentEarthquake.getmTime()));

        TextView TimeTextView = (TextView) listItemView.findViewById(R.id.tv_time);
        TimeTextView.setText(DateFormatter.DateToStrHMA(currentEarthquake.getmTime()));

        return listItemView;
    }
}
