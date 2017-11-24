package com.androidapp.successemmanuel.earthquakeapp;

/**
 * Created by SuccessEmmanuel on 10/27/2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliSeconds;
    /** Website URL of the earthquake */
    private String mUrl;


    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliSeconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliSeconds = mTimeInMilliSeconds;
        mUrl = url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }


    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }
    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
