package com.devwilly.tutorial.tablayoutex.data;

import com.devwilly.tutorial.tablayoutex.R;
import com.devwilly.tutorial.tablayoutex.wrapper.ComingSoonMovieWrapper;
import com.devwilly.tutorial.tablayoutex.wrapper.IMovieWrapper;
import com.devwilly.tutorial.tablayoutex.wrapper.TopMovieWrapper;
import com.devwilly.tutorial.tablayoutex.wrapper.WeekMovieWrapper;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;


/**
 * Created by Willy on 2017/2/14.
 */

public class MovieData {

    private Context mContext;

    public MovieData(Context context) {
        this.mContext = context;
    }

    public ArrayList<IMovieWrapper> getWeekMovieItemList() {
        ArrayList<IMovieWrapper> list = new ArrayList<>();

        Drawable d1 = getImage(R.drawable.color1);
        Drawable d2 = getImage(R.drawable.color2);
        Drawable d3 = getImage(R.drawable.color3);
        Drawable d4 = getImage(R.drawable.color4);
        Drawable d5 = getImage(R.drawable.color5);

        String tl1 = getTitle(R.string.week_1_title);
        String tl2 = getTitle(R.string.week_2_title);
        String tl3 = getTitle(R.string.week_3_title);
        String tl4 = getTitle(R.string.week_4_title);
        String tl5 = getTitle(R.string.week_5_title);

        String date1 = getDateRelease(R.string.week_1_date_release);
        String date2 = getDateRelease(R.string.week_2_date_release);
        String date3 = getDateRelease(R.string.week_3_date_release);
        String date4 = getDateRelease(R.string.week_4_date_release);
        String date5 = getDateRelease(R.string.week_5_date_release);

        String subTl1 = getSubTitle(R.string.week_1_sub_title);
        String subTl2 = getSubTitle(R.string.week_2_sub_title);
        String subTl3 = getSubTitle(R.string.week_3_sub_title);
        String subTl4 = getSubTitle(R.string.week_4_sub_title);
        String subTl5 = getSubTitle(R.string.week_5_sub_title);


        list.add(new WeekMovieWrapper(d1, tl1, date1, subTl1));
        list.add(new WeekMovieWrapper(d2, tl2, date2, subTl2));
        list.add(new WeekMovieWrapper(d3, tl3, date3, subTl3));
        list.add(new WeekMovieWrapper(d4, tl4, date4, subTl4));
        list.add(new WeekMovieWrapper(d5, tl5, date5, subTl5));

        return list;
    }

    public ArrayList<IMovieWrapper> getComingSoonMovieItemList() {
        ArrayList<IMovieWrapper> list = new ArrayList<>();

        Drawable d1 = getImage(R.drawable.color6);
        Drawable d2 = getImage(R.drawable.color7);
        Drawable d3 = getImage(R.drawable.color8);
        Drawable d4 = getImage(R.drawable.color9);
        Drawable d5 = getImage(R.drawable.color10);

        String tl1 = getTitle(R.string.coming_soon_1_title);
        String tl2 = getTitle(R.string.coming_soon_2_title);
        String tl3 = getTitle(R.string.coming_soon_3_title);
        String tl4 = getTitle(R.string.coming_soon_4_title);
        String tl5 = getTitle(R.string.coming_soon_5_title);

        String date1 = getDateRelease(R.string.coming_soon_1_date_release);
        String date2 = getDateRelease(R.string.coming_soon_2_date_release);
        String date3 = getDateRelease(R.string.coming_soon_3_date_release);
        String date4 = getDateRelease(R.string.coming_soon_4_date_release);
        String date5 = getDateRelease(R.string.coming_soon_5_date_release);

        String subTl1 = getSubTitle(R.string.coming_soon_1_sub_title);
        String subTl2 = getSubTitle(R.string.coming_soon_2_sub_title);
        String subTl3 = getSubTitle(R.string.coming_soon_3_sub_title);
        String subTl4 = getSubTitle(R.string.coming_soon_4_sub_title);
        String subTl5 = getSubTitle(R.string.coming_soon_5_sub_title);


        list.add(new ComingSoonMovieWrapper(d1, tl1, date1, subTl1));
        list.add(new ComingSoonMovieWrapper(d2, tl2, date2, subTl2));
        list.add(new ComingSoonMovieWrapper(d3, tl3, date3, subTl3));
        list.add(new ComingSoonMovieWrapper(d4, tl4, date4, subTl4));
        list.add(new ComingSoonMovieWrapper(d5, tl5, date5, subTl5));

        return list;
    }

    public ArrayList<IMovieWrapper> getTopMovieItemList() {
        ArrayList<IMovieWrapper> list = new ArrayList<>();

        Drawable d1 = getImage(R.drawable.color11);
        Drawable d2 = getImage(R.drawable.color12);
        Drawable d3 = getImage(R.drawable.color13);
        Drawable d4 = getImage(R.drawable.color14);
        Drawable d5 = getImage(R.drawable.color15);

        String tl1 = getTitle(R.string.top_1_title);
        String tl2 = getTitle(R.string.top_2_title);
        String tl3 = getTitle(R.string.top_3_title);
        String tl4 = getTitle(R.string.top_4_title);
        String tl5 = getTitle(R.string.top_5_title);

        String date1 = getDateRelease(R.string.top_1_date_release);
        String date2 = getDateRelease(R.string.top_2_date_release);
        String date3 = getDateRelease(R.string.top_3_date_release);
        String date4 = getDateRelease(R.string.top_4_date_release);
        String date5 = getDateRelease(R.string.top_5_date_release);

        String subTl1 = getSubTitle(R.string.coming_soon_1_sub_title);
        String subTl2 = getSubTitle(R.string.coming_soon_2_sub_title);
        String subTl3 = getSubTitle(R.string.coming_soon_3_sub_title);
        String subTl4 = getSubTitle(R.string.coming_soon_4_sub_title);
        String subTl5 = getSubTitle(R.string.coming_soon_5_sub_title);


        list.add(new TopMovieWrapper(d1, tl1, date1, subTl1));
        list.add(new TopMovieWrapper(d2, tl2, date2, subTl2));
        list.add(new TopMovieWrapper(d3, tl3, date3, subTl3));
        list.add(new TopMovieWrapper(d4, tl4, date4, subTl4));
        list.add(new TopMovieWrapper(d5, tl5, date5, subTl5));

        return list;
    }

    private Drawable getImage(int resId) {
        return mContext.getResources().getDrawable(resId);
    }

    private String getTitle(int resId) {
        return mContext.getResources().getString(resId);
    }

    private String getDateRelease(int resId) {
        return mContext.getResources().getString(resId);
    }

    private String getSubTitle(int resId) {
        return mContext.getResources().getString(resId);
    }

}
