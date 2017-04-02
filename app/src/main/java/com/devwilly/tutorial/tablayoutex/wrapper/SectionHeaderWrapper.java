package com.devwilly.tutorial.tablayoutex.wrapper;

import com.devwilly.tutorial.tablayoutex.R;


/**
 * Created by Willy on 2017/4/3.
 */

public class SectionHeaderWrapper implements IMovieWrapper {

    @Override
    public int getImageRes() {
        return 0;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getDateRelease() {
        return "";
    }

    @Override
    public String getSubTitle() {
        return "";
    }

    @Override
    public int getType() {
        return R.layout.vh_section_header;
    }
}
