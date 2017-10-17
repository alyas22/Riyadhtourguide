package com.example.android.riyadhtourguide;

/**
 * Created by Toshiba on 08/08/17.
 */

public class Guide {

    private int mNameId;
    private int mDescriptionId;
    private int mImageResourceId;


    public Guide(int nameId,int descriptionId, int imageResourceId) {
        mNameId = nameId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    public int getNameId() {
        return mNameId;
    }

    public int getDescriptionId () { return mDescriptionId;}

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
