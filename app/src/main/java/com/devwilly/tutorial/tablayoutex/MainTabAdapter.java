package com.devwilly.tutorial.tablayoutex;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Willy on 2017/2/14.
 */
public class MainTabAdapter extends FragmentPagerAdapter {

    private MovieType mTabLayoutTitle[] = new MovieType[]{MovieType.Week, MovieType.ComingSoon, MovieType.TOP};
    private Context mContext;

    public MainTabAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        return Fragment.instantiate(mContext, mTabLayoutTitle[position].getFragmentName());
    }

    @Override
    public int getCount() {
        return mTabLayoutTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabLayoutTitle[position].getTitle();
    }
}
