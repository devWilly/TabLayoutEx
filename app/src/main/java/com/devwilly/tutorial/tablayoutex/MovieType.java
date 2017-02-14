package com.devwilly.tutorial.tablayoutex;

/**
 * Created by Willy on 2017/2/14.
 */

public enum MovieType {
    Week("本週新片", WeekMovieListFragment.class.getName()),
    ComingSoon("即將上映", ComingSoonMovieListFragment.class.getName()),
    TOP("排行榜", TopMovieListFragment.class.getName());

    private String mTitle;
    private String mFragmentName;

    MovieType(String title, String fragmentName) {
        this.mTitle = title;
        this.mFragmentName = fragmentName;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getFragmentName() {
        return mFragmentName;
    }
}
