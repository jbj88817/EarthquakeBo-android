package us.bojie.earthquakebo.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

import us.bojie.earthquakebo.R;
import us.bojie.earthquakebo.model.Earthquake;
import us.bojie.earthquakebo.util.DateFormatter;
import us.bojie.earthquakebo.util.TextSplitter;

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

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.tv_mag);

        // Set the proper background color on the magnitude circle.
        // Fetch the background from the TextView, which is a GradientDrawable.
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeTextView.getBackground();

        // Get the appropriate background color based on the current earthquake magnitude
        int magnitudeColor = getMagnitudeColor(currentEarthquake.getMagnitude());

        // Set the color on the magnitude circle
        magnitudeCircle.setColor(magnitudeColor);

        // Format decimal
        double mag = currentEarthquake.getMagnitude();
        DecimalFormat formatter = new DecimalFormat("0.0");
        magnitudeTextView.setText(formatter.format(mag));


        TextView direLocationTextView = (TextView) listItemView.findViewById(R.id.tv_dire_location);
        direLocationTextView.setText(TextSplitter.splitLocation(getContext(),
                currentEarthquake.getLocation())[0]);

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.tv_location);
        locationTextView.setText(TextSplitter.splitLocation(getContext(),
                currentEarthquake.getLocation())[1]);

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.tv_date);
        dateTextView.setText(DateFormatter.DateToStrMdY(currentEarthquake.getTime()));

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.tv_time);
        timeTextView.setText(DateFormatter.DateToStrHMA(currentEarthquake.getTime()));

        return listItemView;
    }

    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
