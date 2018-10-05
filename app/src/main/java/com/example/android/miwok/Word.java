package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslatoin;

    private int mImageResource = NO_IMAGE_PROVIDED;

    private int mSoundID;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslatoin, int mSoundID){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslatoin = mMiwokTranslatoin;
        this.mSoundID = mSoundID;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslatoin, int mImageResource, int mSoundID){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslatoin = mMiwokTranslatoin;
        this.mImageResource = mImageResource;
        this.mSoundID = mSoundID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslatoin;
    }

    public int getImageResourceId(){
        return mImageResource;
    }

    public boolean hasImage(){
        if(mImageResource == NO_IMAGE_PROVIDED){
            return false;
        }
        else{
            return true;
        }
    }

    public int getmSoundID(){
        return mSoundID;
    }
}
