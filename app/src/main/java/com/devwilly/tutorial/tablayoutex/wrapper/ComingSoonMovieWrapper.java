package com.devwilly.tutorial.tablayoutex.wrapper;

import com.devwilly.tutorial.tablayoutex.R;

import android.graphics.drawable.Drawable;


/**
 * Created by Willy on 2017/2/14.
 */

public class ComingSoonMovieWrapper implements IMovieWrapper {

    private int mImageRes;
    private String mTitle;
    private String mDate;
    private String mSubTitle;

    public ComingSoonMovieWrapper(int imageRes, String title, String date, String subTitle) {
        this.mImageRes = imageRes;
        this.mTitle = title;
        this.mDate = date;
        this.mSubTitle = subTitle;
    }

    @Override
    public int getImageRes() {
        return mImageRes;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }

    @Override
    public String getDateRelease() {
        return mDate;
    }

    @Override
    public String getSubTitle() {
        return mSubTitle;
    }

    @Override
    public int getType() {
        return R.layout.vh_item_coming_soon;
    }
}
