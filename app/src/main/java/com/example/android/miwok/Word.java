package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslatoin;

    private int mImageResource;

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
}
