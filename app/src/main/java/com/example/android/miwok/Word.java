package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation ;
    private String mMiwokTranslation;
    private int mImgeResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation= miwokTranslation;

    }

    public Word(String defaultTranslation,String miwokTranslation,int ImgResourceId){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImgeResourceId=ImgResourceId;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmImgResourceId(){
        return mImgeResourceId;
    }
    public boolean hasImage() {
        return mImgeResourceId != NO_IMAGE_PROVIDED;
    }

}
