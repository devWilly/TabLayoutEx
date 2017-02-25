package com.devwilly.tutorial.tablayoutex.widget;

import com.devwilly.tutorial.tablayoutex.R;
import com.devwilly.tutorial.tablayoutex.data.MovieData;
import com.devwilly.tutorial.tablayoutex.wrapper.IMovieWrapper;

import android.content.Context;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;

import java.util.ArrayList;


/**
 * Created by Willy on 2017/2/25.
 */

public class MovieAppWidgetFactory implements RemoteViewsFactory {

    private Context mContext;
    private ArrayList<IMovieWrapper> mList = new ArrayList<>();

    public MovieAppWidgetFactory(Context context) {
        this.mContext = context;

        MovieData data = new MovieData(context);
        mList = data.getTopMovieItemList();

    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDataSetChanged() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public RemoteViews getViewAt(int position) {
        RemoteViews rv = new RemoteViews(mContext.getPackageName(), R.layout.app_widget_item);
        rv.setImageViewResource(R.id.widget_item_pic, mList.get(position).getImageRes());
        return rv;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
}
