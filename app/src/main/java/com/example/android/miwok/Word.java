package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslatoin;

    public Word(String mDefaultTranslation, String mMiwokTranslatoin){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslatoin = mMiwokTranslatoin;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslatoin;
    }
}
