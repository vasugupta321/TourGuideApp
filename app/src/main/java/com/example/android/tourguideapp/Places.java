package com.example.android.tourguideapp;

public class Places {

    /** String resource ID for the default translation of the word */
    private int mNameId;

    private int mDetailsId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Places(int nameId, int DetailsId) {
        mNameId = nameId;
        mDetailsId = DetailsId;
    }


    public Places(int nameId, int detailsId, int imageResourceId) {
        mNameId= nameId;
        mDetailsId = detailsId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getNameId() {
        return mNameId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getDetailsId() {
        return mDetailsId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
