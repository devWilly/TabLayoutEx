package com.devwilly.tutorial.tablayoutex.wrapper;

import com.devwilly.tutorial.tablayoutex.R;

import android.graphics.drawable.Drawable;

/**
 * Created by Willy on 2017/2/14.
 */

public class WeekMovieWrapper implements IMovieWrapper {

    private Drawable mDrawable;
    private String mTitle;
    private String mDate;
    private String mSubTitle;

    public WeekMovieWrapper(Drawable d1, String tl1, String date1, String subTl1) {
        this.mDrawable = d1;
        this.mTitle = tl1;
        this.mDate = date1;
        this.mSubTitle = subTl1;
    }

    public Drawable getImage() {
        return mDrawable;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDateRelease() {
        return mDate;
    }

    public String getSubTitle() {
        return mSubTitle;
    }

    @Override
    public int getType() {
        return R.layout.vh_item_week;
    }
}