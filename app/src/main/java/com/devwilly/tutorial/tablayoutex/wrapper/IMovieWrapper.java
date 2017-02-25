package com.devwilly.tutorial.tablayoutex.wrapper;

import android.graphics.drawable.Drawable;


/**
 * Created by Willy on 2017/2/14.
 */

public interface IMovieWrapper {

    Drawable getImage();

    String getTitle();

    String getDateRelease();

    String getSubTitle();

    int getType();
}
