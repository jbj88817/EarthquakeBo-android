package us.bojie.earthquakebo.model;

import java.util.Date;

/**
 * Created by bjiang on 8/4/16.
 */
public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private Date mTime;

    public Earthquake(double mMagnitude, String mLocation, Date mTime) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTime = mTime;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }
}
