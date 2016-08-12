package us.bojie.earthquakebo.model;

import java.util.Date;

/**
 * Created by bjiang on 8/4/16.
 */
public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private Date mTime;

    public Earthquake() {
    }

    public Earthquake(double mMagnitude, String mLocation, Date mTime) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTime = mTime;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(double magnitude) {
        mMagnitude = magnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public Date getTime() {
        return mTime;
    }

    public void setTime(Date time) {
        mTime = time;
    }
}
