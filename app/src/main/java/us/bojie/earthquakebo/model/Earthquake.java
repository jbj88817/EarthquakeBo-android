package us.bojie.earthquakebo.model;

import java.util.Date;

/**
 * Created by bjiang on 8/4/16.
 */
public class Earthquake {
    private float mMagnitude;
    private String mLocation;
    private Date mTime;

    public Earthquake(float mMagnitude, String mLocation, Date mTime) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTime = mTime;
    }

    public float getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(float mMagnitude) {
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
