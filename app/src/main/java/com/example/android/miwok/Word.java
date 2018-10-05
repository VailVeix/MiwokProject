package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslatoin;

    private int mImageResource = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslatoin){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslatoin = mMiwokTranslatoin;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslatoin, int mImageResource){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslatoin = mMiwokTranslatoin;
        this.mImageResource = mImageResource;
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
}
