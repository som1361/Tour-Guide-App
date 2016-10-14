package com.example.somayyeh.tourguide;

import android.location.Address;

import java.io.Serializable;

/**
 * Created by somayyeh on 7/31/16.
 */
public class thing implements Serializable
{
    private int mImageResourceId;
    private String mThingName;
    private int mThingDesc;
    private String mRating;
    private String mAddress;

    public thing (int imageResourceId, String thingName, int thingDesc, String rating, String address)
    {
      mImageResourceId = imageResourceId;
        mThingName = thingName;
        mThingDesc = thingDesc;
        mRating = rating;
        mAddress = address;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;

    }
    public String getThingName()
    {
        return mThingName;
    }
    public int getThingDesc()
    {
        return mThingDesc;
    }
    public String getThingAddress()
    {
        return mAddress;
    }
    public String getThingRating()
    {
        return mRating;
    }

}
